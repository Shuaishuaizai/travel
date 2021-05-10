package com.yx.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tab_category")
public class Category implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer cid;//分类id
    private String cname;//分类名称
}
