package com.liceu.demospringjdbc.repos;

import com.liceu.demospringjdbc.entities.Staff;
import org.springframework.stereotype.Repository;


public interface StaffRepo {

    Staff staffInfo(String email);

}
