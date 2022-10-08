package com.zzj.reggie.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: reggie_take_out
 * @BelongsPackage: com.zzj.reggie.config
 * @Author: zzj
 * @CreateTime: 2022-10-07  22:35
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class MybatisPlusConfig {
    //配置mybatisplus的分页插件
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }
}
