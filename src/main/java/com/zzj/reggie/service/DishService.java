package com.zzj.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzj.reggie.entity.Dish;
import com.zzj.reggie.entity.DishDto;

public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表
    public void saveWithFlavor(DishDto dishDto);
}
