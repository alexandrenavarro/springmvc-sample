package com.github.springmvc;

import java.util.Arrays;
import java.util.List;

public class Person {
    
    private String firstName;
    private String lastName;
    private List<String> test;
    //private String[] test;
    
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
//    public String[] getTest() {
//        return this.test;
//    }
//    public void setTest(String[] aTest) {
//        this.test = aTest;
//    }
//    @Override
//    public String toString() {
//        return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName + ", test=" + Arrays.toString(this.test) + "]";
//    }
    public List<String> getTest() {
        return this.test;
    }
    public void setTest(List<String> aTest) {
        this.test = aTest;
    }
    @Override
    public String toString() {
        return "Person [firstName=" + this.firstName + ", lastName=" + this.lastName + ", test=" + this.test + "]";
    }
    
    
    
    
    
    
    
    
    
}
