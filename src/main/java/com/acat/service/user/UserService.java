package com.acat.service.user;

import com.acat.response.SendResponse;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2019-10-31
 */
public interface UserService {

    SendResponse getUserEntityByClass(String remote_user_class);

}
