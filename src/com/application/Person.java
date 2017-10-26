package com.application;

import com.sun.tools.javac.util.List;

import java.io.IOException;

public class Person {
    private static List<Person> roster;
    private String name;
    private String email;
    private String telephone1;
    private String telephone2;
    private String telephone3;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getTelephone3() {
        return telephone3;
    }

    public void setTelephone3(String telephone3) {
        this.telephone3 = telephone3;
    }


    public void checkTelephone() {
//        telephone2
        if (telephone2 != null) {

        }
    }
    public void bigSmallMethod() throws IOException{
        Person person = new Person();

        if (person != null) {


        }
    }
    public void printPerson(){

    }
    public void printPersonsOlderThan(List<Person> roster, int age){

//        Person.roster = roster;
//        Person.age = age;
        for (Person p:roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }

}
