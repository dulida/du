package com.lida.du.exception;


import com.lida.du.enums.ReCode;

/**
 * Service层公用的Exception.
 * 
 * 继承自RuntimeException, 从由Spring管理事务的函数中抛出时会触发事务回滚.
 * 
 * @author 杜利达
 * @version 0.1
 * @since 0.1
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 3583566093089790852L;
    
    private ReCode reCode;
    
    
    private ServiceException() {

    }
    public ServiceException(ReCode reCode) {
        super(reCode.getMessage());
        this.reCode = reCode;
    }




}
