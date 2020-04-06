package com.lida.du.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Author Lida Du
 * @Date 2020/3/27 10:41
 *
 * 手机号注册
 */
@Data
public class Register implements Serializable {

    /**
     * 手机号
     */
    @NotBlank(message = "用户名不能为空")
    private String username;

    /**
     * 手机验证码
     */
    @NotBlank(message = "密码不能为空")
    private String password;

}
