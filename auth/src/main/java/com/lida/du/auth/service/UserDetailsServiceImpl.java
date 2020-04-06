package com.lida.du.auth.service;

import com.lida.du.api.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author: 杜利达
 * @date: 2020/4/5 0:00
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Reference(version = "0.0.1")
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
