package com.leo.spider.data.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leo.spider.data.dao.HouseDao;
import com.leo.spider.data.entity.HouseDetail;
import com.leo.spider.data.service.HouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @ClassName HouseServiceImpl.java
 * @Author Leo
 * @Description
 * @Date 2021/7/14
 */
@Service("houseService")
public class HouseServiceImpl implements HouseService {

    @Resource
    private HouseDao houseDao;

    @Override
    public PageInfo<HouseDetail> list(String startDate, String endDate, String keyword, Integer page, Integer size) {
        PageHelper.startPage(page,size);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        startDate += " 00:00:00";
        endDate += " 23:59:59";
        LocalDateTime startDateTimeStamp = LocalDateTime.parse(startDate, dateTimeFormatter);
        LocalDateTime endDateTimeStamp = LocalDateTime.parse(endDate, dateTimeFormatter);
        PageHelper.startPage(page,size);
        List<HouseDetail> houseDetailList = houseDao.getHouseDetailList(startDateTimeStamp, endDateTimeStamp, keyword);
        return new PageInfo<>(houseDetailList);

    }
}
