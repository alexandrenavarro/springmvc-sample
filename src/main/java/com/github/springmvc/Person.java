package com.github.springmvc;

public class Person {
    
    private String firstName;
    private String lastName;
    
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }
    @Override
    public String toString() {
        return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName + "]";
    }
    
    
    
    
}
