package com.zzj.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzj.reggie.entity.AddressBook;
import com.zzj.reggie.mapper.AddressBookMapper;
import com.zzj.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: reggie_take_out
 * @BelongsPackage: com.zzj.reggie.service.impl
 * @Author: zzj
 * @CreateTime: 2022-10-13  16:35
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
