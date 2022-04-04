package com.company;

public class Auckland {
    private Teacher[] aTeachers;
    static final int NUM_ATeachers = 5;
    Auckland() {


        aTeachers = new Teacher[NUM_ATeachers];

        aTeachers[0] = new Teacher("1562347","Thomas Becker","Auckland" );
        aTeachers[1] = new Teacher("5664789","Steven Hobbs","Auckland" );
        aTeachers[2] = new Teacher("3658947","Andrew Jackson","Auckland" );
        aTeachers[3] = new Teacher("6332698","Jonathon Wood","Auckland" );
        aTeachers[4] = new Teacher("17202138","Marcel Cantin-Gilmore","Auckland" );

    }
}
