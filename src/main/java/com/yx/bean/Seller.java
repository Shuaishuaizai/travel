package com.yx.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tab_seller")
public class Seller implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer sid;//商家id
    private String sname;//商家名称
    private String consphone;//商家电话
    private String address;//商家地址
}