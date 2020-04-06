package com.lida.du.domain;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author: 杜利达
 * @date: 2020/4/6 18:51
 */
@Validated
@Data
public class LoginForm implements Serializable {

    @NotBlank(message = "用户名不得为空")
    private String username;
    @NotBlank(message = "密码不得为空")
    private String password;

}
