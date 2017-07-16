package io.github.lizhangqu.lesson3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by lizhangqu on 2017/7/14.
 */
@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping(value = "/")
    @ResponseBody
    public String index() {
        return "welcome";
    }

}
