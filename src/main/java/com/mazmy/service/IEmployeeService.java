package com.mazmy.service;

import com.mazmy.domain.EmployeeRecord;

/**
 * Created by azmym on 4/2/2017.
 */
public interface IEmployeeService {

    EmployeeRecord load(String line);
}
