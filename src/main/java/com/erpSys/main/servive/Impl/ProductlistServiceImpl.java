package com.erpSys.main.servive.Impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.erpSys.main.mapper.ProductlistMapper;
import com.erpSys.main.model.Productlist;
import com.erpSys.main.service.ProductlistService;

@Service
public class ProductlistServiceImpl extends ServiceImpl<ProductlistMapper, Productlist> implements ProductlistService {

}
