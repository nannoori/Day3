package com.training.org;

import java.util.ArrayList;

public class Employee {
    private int empId;
    private String empName;
    private double salary;

    private FamilyDetails familyDetails;  //Contained object
    private ArrayList<Address> addresses;


    public Employee() {
        System.out.println("Default constructor of Employee is called");
        empId = 0;
        empName = "";
        salary = 0;
        familyDetails = new FamilyDetails();
        addresses = new ArrayList<Address>();
    }

    public Employee(int id, String empName, double salary, FamilyDetails familyDetails, Address address) {
        System.out.println("Parameterised constructor of Employee is called");
        empId = id;
        this.empName = empName;
        this.salary = salary;
        this.familyDetails = familyDetails;
        addresses = new ArrayList<Address>();
        addresses.add(address);
    }

    public void addNewAddress(String state, String city, String area, String buildingWithFlatNo, long pinCode) {
        System.out.println("addNewAddress is called");
        addresses.add(new Address(state, city, area, buildingWithFlatNo, pinCode));
    }

    public Employee(int empId, String empName, double salary, int familyMembers, String fatherName, String surname, String state, String city, String area, String buildingWithFlatNo, long pinCode) {
        System.out.println("Parameterised constructor of Employee is called");
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.familyDetails = new FamilyDetails(familyMembers, fatherName, surname);

        this.addresses = new ArrayList<Address>();
        addresses.add(new Address(state, city, area, buildingWithFlatNo, pinCode));
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "\nEmployee DETAILS:- {" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                "}\n" + "FAMILY DETAILS:- " + familyDetails.toString() + "\nADDRESS :- " + addresses.toString();
    }
}

//    public double getWages(){
//        return 0 ;
//    }
//    public double setWages(double wages) {
//        return wages;
//    }
