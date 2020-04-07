package com.lida.du.auth.service;

import com.google.common.collect.Lists;
import com.lida.du.api.IUserService;
import com.lida.du.domain.User;
import com.lida.du.enums.ReCode;
import com.lida.du.exception.ServiceException;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

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
        System.out.println("----loadUserByUsername------");
        User user = userService.getByUsername(s);
        // 默认所有用户拥有 USER 权限
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("USER");
        grantedAuthorities.add(grantedAuthority);
        if (user != null) {
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities );
        }
        return null;
    }
}
