package com.company;

public class Palmy {
    private Teacher[] PalmyTeachers;
     static final int NUM_PalmyTeachers = 4;

     Palmy() {


        PalmyTeachers = new Teacher[NUM_PalmyTeachers];

        PalmyTeachers[0] = new Teacher("1105236","Amy Sheffield");
        PalmyTeachers[1] = new Teacher("1235894","Victoria Jensen");
        PalmyTeachers[2] = new Teacher("7225669","James Lee");
        PalmyTeachers[3] = new Teacher("1328991","Colin Delmont");


    }
    public void printTeachers()
    {
        System.out.println("PALMERSTON NORTH");
        for (int i = 0; i < 4; i++)
        {
            PalmyTeachers[i].printTeacher();
        }
    }
}
