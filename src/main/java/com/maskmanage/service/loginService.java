package com.maskmanage.service;

import com.maskmanage.entity.*;

public interface loginService {
    maskuser loginU(maskuserKey maskuserkey1);
    donator loginDonatorById(int donatorId);
    hospital loginHospitalById(int hospitalId);
    maskadmin loginMaskadmin(int adminId);
    supervisor loginSupervisor(int supervisorId);

}
