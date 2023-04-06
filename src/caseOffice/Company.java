package caseOffice;

import java.util.LinkedList;
import java.util.List;

public class Company {
    private String name;
    private int id;
    private Office office;
    private List<Department> departmentList;



    public Company(String name, int id) {
        this.name = name;
        this.id = id;
        departmentList = new LinkedList<>();
    }


    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public void addDepartment(Department d) {
        departmentList.add(d);
    }
}
