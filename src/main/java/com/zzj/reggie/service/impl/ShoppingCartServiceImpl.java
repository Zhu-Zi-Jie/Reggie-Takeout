package com.zzj.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzj.reggie.entity.ShoppingCart;
import com.zzj.reggie.mapper.ShoppingCartMapper;
import com.zzj.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: reggie_take_out
 * @BelongsPackage: com.zzj.reggie.service.impl
 * @Author: zzj
 * @CreateTime: 2022-10-13  22:02
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
