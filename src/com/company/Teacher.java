package com.company;

public class Teacher {
    private String name;
    private String ID;
//    private String campus;

     Teacher(String ID, String name) {
        this.name = name;
        this.ID = ID;
//        this.campus = campus;
    }

    public void printTeacher(){
        System.out.println("The name: " + name);
        System.out.println("The ID: " + ID);
        System.out.println();
//        System.out.println("The campus: " + campus);
    }
}
