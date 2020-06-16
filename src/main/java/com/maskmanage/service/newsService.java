package com.maskmanage.service;

import com.maskmanage.entity.news;

import java.util.List;

public interface newsService {
    List<news> getAllNews();
    news getNewsByID(int newsid);
}
