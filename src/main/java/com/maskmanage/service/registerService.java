package com.maskmanage.service;

import com.maskmanage.entity.*;

public interface registerService {

    int registerU(maskuser maskuser1);
    int registerDonator(donator donator1);
    int registerHospital(hospital hospital1);
    int registerMaskadmin(maskadmin maskadmin1);
    int registerSupervisor(supervisor supervisor1);
}
