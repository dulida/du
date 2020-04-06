package com.lida.du.api;

import com.lida.du.domain.Register;
import com.lida.du.domain.User;

/**
 * @author: 杜利达
 * @date: 2020/4/5 0:05
 */
public interface IUserService {

    /**
     * 注册
     * @param register
     */
    User register(Register register);

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    User getByUsername(String username);


}
