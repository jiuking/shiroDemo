package com.hjc.shirodemo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bravowhale on 2016/12/28.
 */
@Controller
public class IndexContoller {

    @RequestMapping(value = "index")
    public String index() {
        return "index";
    }
}
