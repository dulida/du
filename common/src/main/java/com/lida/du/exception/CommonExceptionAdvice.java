package com.lida.du.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常拦截配置
 *
 * @author Administrator
 */
@Slf4j
@RestControllerAdvice
public class CommonExceptionAdvice {

    /**
     * 自定义业务
     *
     * @param request
     * @param ex
     * @return
     */
    /*@ExceptionHandler(ServiceException.class)
    public Object serviceException(HttpServletRequest request, ServiceException ex) {
        printLogger(request, ex);
        return ReMsg.error(ex.getCode(), ex.getMessage());
    }

    *//**
     * @Vlidated 异常
     * @param e
     * @param request
     * @return
     *//*
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Object handlerValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        BindingResult bindingResult = e.getBindingResult();
        StringBuilder errMsg = new StringBuilder("");
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        if (!CollectionUtils.isEmpty(fieldErrors)) {
            for (int i = 0; i < fieldErrors.size(); i++) {
                if (i > 0) {
                    errMsg.append(",");
                }
                FieldError error = fieldErrors.get(i);
                errMsg.append(error.getDefaultMessage());
            }
        }
        printLogger(request, e);
        return ReMsg.error(ReCode.ERROR, errMsg.toString());
    }

    *//**
     * 其他
     *
     * @param request
     * @param ex
     * @return
     *//*
    @ExceptionHandler(Exception.class)
    public Object exception(HttpServletRequest request, Exception ex) {
        printLogger(request, ex);
        return ReMsg.error(ReCode.ERROR, "未知异常");
    }

    *//**
     *
     * @param req
     * @param e
     * @description 打印日志
     * @version 1.0
     *//*
    private void printLogger(HttpServletRequest req, Exception e) {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String url = req.getRequestURL().toString();
        String uri = req.getRequestURI();
        String method = req.getMethod();
        String query = req.getQueryString();

        log.error("=====================当前时间:" + time + "==============\n");
        log.error("请求URL:" + url + "\n");
        log.error("请求URI:" + uri + "\n");
        log.error("请求method:" + method + "\n");
        log.error("请求参数:" + query + "\n");
        log.error("当前异常如下:\n", e);
        log.error("===========================处理完毕=========================\n");
    }*/


}