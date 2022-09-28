package tech.markit.ssm.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.markit.ssm.common.ServerResponse;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/list")
    public ServerResponse<PageInfo> list(){
        return ServerResponse.createBySuccess();
    }
}
