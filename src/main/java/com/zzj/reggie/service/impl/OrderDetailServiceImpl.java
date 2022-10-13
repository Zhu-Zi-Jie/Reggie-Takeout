package com.zzj.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzj.reggie.entity.OrderDetail;
import com.zzj.reggie.mapper.OrderDetailMapper;
import com.zzj.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: reggie_take_out
 * @BelongsPackage: com.zzj.reggie.service.impl
 * @Author: zzj
 * @CreateTime: 2022-10-13  22:52
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
