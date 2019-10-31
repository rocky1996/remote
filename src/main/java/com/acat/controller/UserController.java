package com.acat.controller;

import com.acat.enums.GlobalCode;
import com.acat.response.RestResult;
import com.acat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-10-31
 */
@RestController
@RequestMapping("/get")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/v1/getUser")
    public RestResult getUser(String remote_user_class){
        if("".equals(remote_user_class)){
            return RestResult.failure(GlobalCode.ERROR_1.getCode(), "参数不能为空");
        }
        return userService.getUserEntityByClass(remote_user_class);
    }
}
