package com.lida.du.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: 杜利达
 * @date: 2020/4/6 20:02
 */
@Data
public class User implements Serializable {
    private Long id;

    /**
     * 用户名，手机号
     */
    private String username;

    /**
     * 头像
     */
    private String headImage;

    /**
     * 微信OPEN_ID
     */
    private String openId;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 1 男 0女
     */
    private Integer gender;
}