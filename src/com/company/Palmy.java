package com.company;

public class Palmy {
    private Teacher[] pTeachers;
     static final int NUM_PTEACHERS = 4;
    Palmy() {


        pTeachers = new Teacher[NUM_PTEACHERS];

        pTeachers[0] = new Teacher("1105236","Amy Sheffield","PN" );
        pTeachers[1] = new Teacher("1235894","Victoria Jensen","PN" );
        pTeachers[2] = new Teacher("7225669","James Lee","PN" );
        pTeachers[3] = new Teacher("1328991","Colin Delmont","PN" );


    }

}
