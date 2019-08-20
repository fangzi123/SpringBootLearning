package com.forezp.sharedingjdbcmasterslavetables;

import io.shardingsphere.core.keygen.DefaultKeyGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.InetAddress;
import java.net.UnknownHostException;
@SpringBootApplication
public class SharedingJdbcMasterSlaveTablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharedingJdbcMasterSlaveTablesApplication.class, args);
    }

    @Bean
    DefaultKeyGenerator defaultKeyGenerator(){
        try {
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println("addr.getHostAddress()=="+addr.getHostAddress());
            String ip = addr.getHostAddress().replaceAll("\\.","");
            System.out.println("workerId=="+Long.valueOf(ip)%1024);
            DefaultKeyGenerator.setWorkerId(0);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return new DefaultKeyGenerator();
    }
}
