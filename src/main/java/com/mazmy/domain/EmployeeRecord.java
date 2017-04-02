package com.mazmy.domain;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.FixedFormatPattern;
import com.ancientprogramming.fixedformat4j.annotation.Record;

import java.util.Date;

/**
 * Created by azmym on 4/2/2017.
 */
@Record
public class EmployeeRecord {

    private long id;
    private String name;
    private String deptName;
    private long salary;
    private Date joinDate;

    @Field(offset = 1, length = 5)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Field(offset = 6, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Field(offset = 26, length = 20)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Field(offset = 46, length = 10)
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Field(offset = 56, length = 6)
    @FixedFormatPattern("yyMMdd")
    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        StringBuilder employee = new StringBuilder();
        employee.append("Employee").append("[ ");
        employee.append("Id is ").append(id).append(";");
        employee.append("Name is ").append(name).append(",");
        employee.append("Department is ").append(deptName).append(",");
        employee.append("Salary is ").append(salary).append(" ]");
        return employee.toString();
    }
}
