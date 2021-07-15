package com.leo.spider.data.service;

import com.github.pagehelper.PageInfo;
import com.leo.spider.data.entity.HouseDetail;

/**
 * @ClassName HouseService.java
 * @Author Leo
 * @Description
 * @Date 2021/7/14
 */
public interface HouseService {


    PageInfo<HouseDetail> list(String startDate, String endDate, String keyword, Integer page, Integer size);
}
