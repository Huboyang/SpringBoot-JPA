package com.hby.myselfproject.Service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hby.myselfproject.Service.IShopService;
import com.hby.myselfproject.entity.Shop;
import com.hby.myselfproject.mapper.ShopMapper;
import org.springframework.stereotype.Service;

@Service
public class IShopServiceImpl extends ServiceImpl<ShopMapper,Shop> implements IShopService{

}
