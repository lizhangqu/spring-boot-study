package io.github.lizhangqu.lesson4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;


/**
 * Created by lizhangqu on 2017/7/14.
 */
@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("name", "IndexController");
        return "index";
    }

}
