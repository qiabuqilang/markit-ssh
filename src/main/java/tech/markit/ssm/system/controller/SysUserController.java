package tech.markit.ssm.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class SysUserController {
    @RequestMapping(value = "/list")
    public String list(){

        return "user/list";
    }
}
