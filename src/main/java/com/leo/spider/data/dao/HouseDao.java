package com.leo.spider.data.dao;

import com.leo.spider.data.entity.Catalog;
import com.leo.spider.data.entity.HouseDetail;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName HouseDetailDao.java
 * @Author Leo
 * @Description
 * @Date 2021/7/14
 */
public interface HouseDao {

    List<Catalog> getCatalogList();

    List<HouseDetail> getHouseDetailList(@Param("startDate") LocalDateTime startDate,
                                         @Param("endDate") LocalDateTime endDate,
                                         @Param("keyword") String keyword);
}
