package com.forezp.shardingjdbcmasterslave;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.forezp.shardingjdbcmasterslave.repository")
@SpringBootApplication
public class ShardingJdbcMasterSlaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcMasterSlaveApplication.class, args);
    }

}
