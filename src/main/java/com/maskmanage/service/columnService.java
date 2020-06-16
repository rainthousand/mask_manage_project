package com.maskmanage.service;

import com.maskmanage.entity.maskcolumn;

import java.util.List;

public interface columnService {
    List<maskcolumn> getAllColumn();
    maskcolumn getColumnById(int columnid);
}
