package io.github.lizhangqu.lesson2;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

/**
 * Created by lizhangqu on 2017/7/14.
 */
@Controller
public class FileController {

    private Logger logger = LoggerFactory.getLogger(FileController.class);

    @Value("#{servletContext.getRealPath('upload')}")
    private String path;

    @GetMapping(value = "/uploadFile")
    public String uploadFile() {
        return "/uploadFile";
    }

    @ResponseBody
    @PostMapping(value = "/uploadFile")
    public String uploadFile(@RequestParam(value = "file", required = true) MultipartFile file, String desc) {
        String fileName = file.getOriginalFilename();
        File targetFile = new File(path, fileName);
        logger.error(fileName);
        logger.error(desc);
        logger.error(targetFile.getAbsolutePath());
        try {
            FileUtils.deleteQuietly(targetFile);
            FileUtils.forceMkdir(targetFile.getParentFile());
            FileUtils.copyInputStreamToFile(file.getInputStream(), targetFile);
            return "文件上传成功";
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return "文件上传失败";
    }

    @RequestMapping("/downloadFile")
    public ResponseEntity<byte[]> downloadFile(String name) throws IOException {
        logger.error(name);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", name);
        byte[] bytes = "just a test".getBytes();
        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
    }


}
