package com.acat.service;

import com.acat.response.RestResult;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-10-31
 */
public interface UserService {

    RestResult getUserEntityByClass(String remote_user_class);

}
