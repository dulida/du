package com.lida.du.service;

import com.lida.du.api.IUserService;
import com.lida.du.domain.Register;
import com.lida.du.domain.User;
import com.lida.du.enums.ReCode;
import com.lida.du.exception.ServiceException;
import com.lida.du.mapper.UserMapper;
import com.lida.du.utils.IDWorker;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

/**
 * @author: 杜利达
 * @date: 2020/4/6 20:06
 */
@Service(version = "0.0.1")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private IDWorker idWorker;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public User register(Register register) {
        User user0 = userMapper.selectByUsername(register.getUsername());
        if(user0 != null) {
            throw new ServiceException(ReCode.FAIL);
        }
        User user = new User();
        user.setId(idWorker.nextId());
        user.setCreateTime(LocalDateTime.now());
        user.setUsername(register.getUsername());
        user.setPassword(passwordEncoder.encode(register.getPassword()));
        int i = userMapper.insert(user);
        if (i != 1) {
            throw new ServiceException(ReCode.FAIL);
        }
        return user;
    }

    @Override
    public User getByUsername(String username) {
        User user = userMapper.selectByUsername(username);
        if(user == null) {
            throw new ServiceException(ReCode.FAIL);
        }
        return user;
    }
}
