package com.maskmanage.service;

import com.maskmanage.entity.maskdata;

import java.util.List;

public interface datadisclosureService {
    List<maskdata> getAllMaskdata();
    maskdata getMaskdataByid(int dataId);
}
