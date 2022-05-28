package com.zoho;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//  -------------Hashcode and equals Method-------------

public class employee {
    String name;
    int id;

    public employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id=" + id;
    }

    public static void main(String[] args) {

        com.zoho.employee employee1 = new com.zoho.employee("sunil", 1);
        com.zoho.employee employee2 = new com.zoho.employee("mohan", 1);

        Set employees = new HashSet();
        employees.add(employee1);
        employees.add(employee2);


        System.out.println(employees);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee employee = (employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        //result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
        //return Objects.hash(id);
    }
}


