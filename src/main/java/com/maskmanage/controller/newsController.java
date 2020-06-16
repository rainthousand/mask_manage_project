package com.maskmanage.controller;

import com.alibaba.fastjson.JSON;
import com.maskmanage.entity.news;
import com.maskmanage.service.newsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 新闻信息的展示
 */
@RestController
@RequestMapping("/")
public class newsController {

    @Resource(name = "newsServiceImpl")
    private newsService newsService;

    @GetMapping("getNews")
    public String getAllNews(){
        List<news> list = newsService.getAllNews();
        return JSON.toJSONString(list);
    }

    @GetMapping("getNewsContent/{id}")
    public String getNewsById(@PathVariable("id") int newsid){
        news news1 = new news();
        news1 = newsService.getNewsByID(newsid);
        return JSON.toJSONString(news1);
    }
}
