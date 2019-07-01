package com.erpSys.main.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.erpSys.main.model.Commodity;

@Mapper
public interface CommodityMapper extends BaseMapper<Commodity> {
    
}