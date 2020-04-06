package com.lida.du.common;

import com.lida.du.enums.ReCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author: 杜利达
 * @date: 2020/3/8 19:15
 */
@Data
public class ReMsg<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public ReMsg(Integer code, String message) {
        this(code, message, null);
    }

    private ReMsg() {

    }

    private ReMsg(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ReMsg ok() {
        return new ReMsg(ReCode.OK.getCode(), ReCode.OK.getMessage(), null);
    }
    public static ReMsg ok(Object data) {
        return new ReMsg(ReCode.OK.getCode(), ReCode.OK.getMessage(), data);
    }
    public static ReMsg error(ReCode reCode, Object data) {
        return new ReMsg(reCode.getCode(), reCode.getMessage(), data);
    }

}
