package com.main;

public class Main {
    public static void main(String[] args) {
       Students st = getValues();
        System.out.println(st.getName());
        System.out.println(st.getAddres());
    }

    public static Students getValues(){
        Students students = new Students();
        students.setName("PC");
        students.setAddres("NCR");
        return students;
    }
}