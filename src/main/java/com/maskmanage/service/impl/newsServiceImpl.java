package com.maskmanage.service.impl;

import com.maskmanage.entity.news;
import com.maskmanage.entity.newsExample;
import com.maskmanage.mapper.newsMapper;
import com.maskmanage.service.newsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class newsServiceImpl implements newsService {

    @Autowired
    private newsMapper newsMapper;
    @Override
    public List<news> getAllNews() {
        newsExample newsExample = new newsExample();
        newsExample.Criteria criteria = newsExample.createCriteria();

        return newsMapper.selectByExample(newsExample);
    }

    @Override
    public news getNewsByID(int newsid) {
        return newsMapper.selectByPrimaryKey(newsid);
    }
}
