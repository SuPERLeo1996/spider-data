package com.leo.spider.data.controller;

import com.github.pagehelper.PageInfo;
import com.leo.spider.data.entity.CommonResponse;
import com.leo.spider.data.entity.HouseDetail;
import com.leo.spider.data.service.HouseService;
import com.leo.spider.data.vo.HouseDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName HouseController.java
 * @Author Leo
 * @Description
 * @Date 2021/7/14
 */
@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping("/list")
    public CommonResponse<PageInfo<HouseDetail>> list(@RequestParam(value = "startDate",required = false) String startDate,
                                     @RequestParam(value = "endDate",required = false) String endDate,
                                     @RequestParam(value = "keyword",required = false) String keyword,
                                     @RequestParam(value = "page",defaultValue = "1") Integer page,
                                     @RequestParam(value = "size",defaultValue = "10") Integer size) {
        PageInfo<HouseDetail> list = houseService.list(startDate, endDate, keyword, page, size);
        return new CommonResponse<>(list);
    }

}
