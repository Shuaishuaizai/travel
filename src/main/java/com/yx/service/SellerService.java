package com.yx.service;

import com.github.pagehelper.PageInfo;
import com.yx.bean.Seller;

import java.util.List;

public interface SellerService {

    /**
     * 分页查询
     * @param conditioin 查询条件
     * @return
     */
    public PageInfo<Seller> findPage(Seller conditioin, int pageNum, int pageSize);
    /**
     * 查询
     * @param conditioin 查询条件
     * @return
     */
    public List<Seller> find(Seller conditioin);
    /**
     * 添加
     * @param seller
     * @return
     */
    public int add(Seller seller);
    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    public Seller findById(Integer id);
    /**
     * 修改
     * @param seller
     * @return
     */
    public int update(Seller seller);
    /**
     * 删除
     * @param id
     * @return
     */
    public int delete(Integer id);
}
