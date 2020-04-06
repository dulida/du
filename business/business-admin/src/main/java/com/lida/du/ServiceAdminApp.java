package com.lida.du;

import com.lida.du.utils.IDWorker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author Lida Du
 * @Date 2020/3/25 14:15
 */
@SpringBootApplication
public class ServiceAdminApp {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApp.class, args);
    }

    /**
     * 数据中心
     */
    @Value("${idWorker.dataCenterId}")
    private long dataCenterId;
    /**
     * 机器标识
     */
    @Value("${idWorker.machineId}")
    private long machineId;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    /**
     * id生成器注入
     *
     * @return .
     */
    @Bean
    public IDWorker getIdWorker() {
        return new IDWorker(dataCenterId, machineId);
    }
}
