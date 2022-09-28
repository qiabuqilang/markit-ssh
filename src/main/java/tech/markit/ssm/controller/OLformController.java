package tech.markit.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/onlineform")
public class OLformController {
    @RequestMapping(value = "/list")
    public String list(ModelAndView modelAndView){
        return "onlineform/list";
    }
}
