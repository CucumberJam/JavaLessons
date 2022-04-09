package com.company.laba5;

class TestClass {
    private String firstname;
    private String lastname;
    private int age;


    public TestClass(){

    }

    public TestClass(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getFirstname(String message) {
        System.out.println(message);
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
