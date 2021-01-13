package com.liceu.demospringjdbc.services;

import com.liceu.demospringjdbc.entities.Staff;
import com.liceu.demospringjdbc.repos.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    @Autowired
    StaffRepo staffRepo;
    
    public Staff getStaff(String email) { return staffRepo.staffInfo(email); }

}
