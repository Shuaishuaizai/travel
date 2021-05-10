package com.yx.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tab_route_img")
public class RouteImg implements Serializable {
    @TableId(type = IdType.AUTO)
    private int rgid;//商品图片id
    private int rid;//旅游商品id
    private String bigpic;//详情商品大图
    private String smallpic;//详情商品小图
}
