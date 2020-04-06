package com.lida.du.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: 杜利达
 * @date: 2020/4/4 21:58
 */
@AllArgsConstructor
@Getter
public enum ReCode {
    /**
     * 请求成功
     */
    OK(200, "成功"),

    /**
     * 请求失败
     */
    FAIL(201, "失败"),

    ;

    private Integer code;
    private String message;

}
