package com.spring.first._SecondProject;

import java.util.List;

public class AmeerpetTech {
    private List<String> studentNames;

    public void setStudentNames(List<String> studentNames) {
        this.studentNames = studentNames;
    }
    public List<String> getStudentNames() {
        return studentNames;
    }
    public void print() {
       
            for (String name : studentNames) {
                System.out.println(name);
            }
    }
}
