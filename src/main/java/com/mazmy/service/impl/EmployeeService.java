package com.mazmy.service.impl;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import com.mazmy.domain.EmployeeRecord;
import com.mazmy.service.IEmployeeService;
import org.springframework.stereotype.Service;

/**
 * Created by azmym on 4/2/2017.
 */
@Service("employeeService")
public class EmployeeService implements IEmployeeService {
    @Override
    public EmployeeRecord load(String line) {
        FixedFormatManager manager = new FixedFormatManagerImpl();
        //load the string into an object representation
        EmployeeRecord record = manager.load(EmployeeRecord.class, line);
        return record;
    }
}
