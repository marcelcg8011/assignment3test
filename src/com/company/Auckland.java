package com.company;

public class Auckland {
    private Teacher[] AucklandTeachers;
    static final int NUM_AucklandTeachers = 5;
    Auckland() {


        AucklandTeachers = new Teacher[NUM_AucklandTeachers];

        AucklandTeachers[0] = new Teacher("1562347","Thomas Becker","Auckland" );
        AucklandTeachers[1] = new Teacher("5664789","Steven Hobbs","Auckland" );
        AucklandTeachers[2] = new Teacher("3658947","Andrew Jackson","Auckland" );
        AucklandTeachers[3] = new Teacher("6332698","Jonathon Wood","Auckland" );
        AucklandTeachers[4] = new Teacher("17202138","Marcel Cantin-Gilmore","Auckland" );

    }
    public void printTeachers()
    {
        for (int i = 0; i < 5; i++)
        {
            AucklandTeachers[i].printTeacher();
        }
    }

}
