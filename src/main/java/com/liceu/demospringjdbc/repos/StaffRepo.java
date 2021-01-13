package com.liceu.demospringjdbc.repos;

import com.liceu.demospringjdbc.entities.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StaffRepo {

    List<Staff> getAllStaff();

    Staff staffInfo(String email);

}
