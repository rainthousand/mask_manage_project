package com.maskmanage.service.impl;

import com.maskmanage.entity.maskcolumn;
import com.maskmanage.entity.maskcolumnExample;
import com.maskmanage.mapper.maskcolumnMapper;
import com.maskmanage.service.columnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class columnServiceImpl  implements columnService {

    @Autowired
    private maskcolumnMapper maskcolumnMapper;
    @Override
    public List<maskcolumn> getAllColumn() {
        maskcolumnExample maskcolumnExample = new maskcolumnExample();
        maskcolumnExample.Criteria criteria = maskcolumnExample.createCriteria();
        List<maskcolumn> list = maskcolumnMapper.selectByExample(maskcolumnExample);
        return list;
    }

    @Override
    public maskcolumn getColumnById(int columnid) {
        return maskcolumnMapper.selectByPrimaryKey(columnid);
    }
}
