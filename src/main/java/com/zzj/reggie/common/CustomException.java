package com.zzj.reggie.common;

/**
 * @BelongsProject: reggie_take_out
 * @BelongsPackage: com.zzj.reggie.common
 * @Author: zzj
 * @CreateTime: 2022-10-09  16:19
 * @Description: 自定义业务异常类
 * @Version: 1.0
 */
public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}
