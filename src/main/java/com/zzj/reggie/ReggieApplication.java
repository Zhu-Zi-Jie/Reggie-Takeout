package com.zzj.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @BelongsProject: reggie_take_out
 * @BelongsPackage: com.zzj.reggie
 * @Author: zzj
 * @CreateTime: 2022-10-05  13:10
 * @Description: TODO
 * @Version: 1.0
 */
@Slf4j
@SpringBootApplication
@ServletComponentScan
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
    }
}
