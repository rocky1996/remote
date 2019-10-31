package com.acat.service.impl;

import com.acat.dao.UserDao;
import com.acat.entity.UserEntity;
import com.acat.response.SendResult;
import com.acat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-10-31
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public SendResult getUserEntityByClass(String remote_user_class) {

        List<UserEntity> list = userDao.getUserEntityByClass(remote_user_class);

        Map<String,Object> map = new HashMap<>();
        map.put("list",list);
        return SendResult.ok(map);
    }
}
