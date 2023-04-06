package caseOffice;

import java.util.LinkedList;
import java.util.List;


public class Department {
    private String name;
    private List<Employee> employees;
    private Employee manager;

    public Department(String name) {
        this.name = name;
        employees = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }


    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
