package com.zzj.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzj.reggie.entity.User;
import com.zzj.reggie.mapper.UserMapper;
import com.zzj.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: reggie_take_out
 * @BelongsPackage: com.zzj.reggie.service.impl
 * @Author: zzj
 * @CreateTime: 2022-10-12  21:48
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
