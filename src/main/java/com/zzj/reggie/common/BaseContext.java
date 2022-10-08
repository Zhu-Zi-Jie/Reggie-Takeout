package com.zzj.reggie.common;

/**
 * @BelongsProject: reggie_take_out
 * @BelongsPackage: com.zzj.reggie.common
 * @Author: zzj
 * @CreateTime: 2022-10-08  23:26
 * @Description: 基于ThreadLocal封装工具类，用于用户保存和获取当前登录用户id
 * @Version: 1.0
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }
}
