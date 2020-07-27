package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));


  /*      System.out.println(employeeList.get(1));  //done in constant random array when provideing information

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());

        employeeList.add(4, new Employee("John", "Doe", 4567));

        //Object[] employeeArray = employeeList.toArray();  // prints the backing array

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for(Employee employee: employeeArray){

            System.out.println(employee);*/

            System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
            System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));


            employeeList.remove(2); //faster

            System.out.println("______________________________________________");

            employeeList.forEach(employee -> System.out.println(employee));


        }



    }

