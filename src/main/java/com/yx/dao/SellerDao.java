package com.yx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yx.bean.Seller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SellerDao extends BaseMapper<Seller> {

   List<Seller> findSellerList (Seller seller);

   @Select("SELECT * FROM tab_seller WHERE sid=#{id}")
   public Seller findById(Integer id);
}
