package com.maskmanage.service;

import com.maskmanage.entity.express;
import com.maskmanage.entity.maskstorage;
import com.maskmanage.entity.maskusage;
import com.maskmanage.entity.requirement;

import java.util.List;

public interface hospitalService {
    //requirement 需求模块
    void saveRequirement(requirement reqr);
    List<requirement> findAllRequirement();
    List<requirement> findReqByHosId(int hosId);

    //express 物流模块
    List<express> findAllExpress();
    express findExpressByReqId(int reqId);

    //usage 使用情况模块
    void saveUsage(maskusage usage);
    List<maskusage> findAllUsage();
    List<maskusage> findUsageByReqId(int reqId);

    //storage 存储量模块
    void saveStorage(maskstorage storage);
    List<maskstorage> findAllStorage();
    List<maskstorage> findStorageByHosId(int hosId);
}
