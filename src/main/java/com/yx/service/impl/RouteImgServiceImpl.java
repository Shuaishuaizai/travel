package com.yx.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yx.bean.RouteImg;
import com.yx.dao.RouteImgDao;
import com.yx.service.RouteImgService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class RouteImgServiceImpl implements RouteImgService {
    @Resource
    private RouteImgDao imgDao;
    @Override
    @Transactional
    public void saveImg(Integer rid, List<RouteImg> routeImgs) {
        imgDao.delete(Wrappers.<RouteImg>query().eq("rid", rid));
        for (RouteImg ri : routeImgs) {
            imgDao.insert(ri);
        }
    }
}
