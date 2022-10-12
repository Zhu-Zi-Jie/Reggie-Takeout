package com.zzj.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzj.reggie.common.R;
import com.zzj.reggie.dto.SetmealDto;
import com.zzj.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    //新增套餐，同时需要保存套餐和菜品的关联关系
    public R<String> saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);
}
