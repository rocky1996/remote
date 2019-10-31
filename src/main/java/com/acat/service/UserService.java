package com.acat.service;

import com.acat.response.SendResult;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-10-31
 */
public interface UserService {

    SendResult getUserEntityByClass(String remote_user_class);

}
