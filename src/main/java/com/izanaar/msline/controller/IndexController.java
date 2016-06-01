package com.izanaar.msline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("")
    public void getIndex(HttpServletResponse response) throws IOException {
        response.getOutputStream().write("Hello".getBytes());
    }

}
