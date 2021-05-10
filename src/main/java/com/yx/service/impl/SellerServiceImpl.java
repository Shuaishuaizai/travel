package com.yx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yx.bean.Seller;
import com.yx.dao.SellerDao;
import com.yx.service.SellerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SellerServiceImpl implements SellerService {
    @Resource
    private SellerDao sellerDao;
    @Override
    public PageInfo<Seller> findPage(Seller conditioin, int pageNum, int pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> {
            sellerDao.findSellerList(conditioin);
        });
    }
    @Override
    public List<Seller> find(Seller condition) {
        return sellerDao.selectList(Wrappers.query());
    }
    @Override
    public int add(Seller seller) {
        return sellerDao.insert(seller);
    }
    @Override
    public Seller findById(Integer id) {
        return sellerDao.selectById(id);
    }
    @Override
    public int update(Seller seller) {
        return sellerDao.updateById(seller);
    }
    @Override
    public int delete(Integer id) {
        return sellerDao.deleteById(id);
    }
}
