//package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class StudentComparator{

    int rollNo;
    String name;

    public StudentComparator(int rolllNo, String name){
        this.rollNo = rolllNo;
        this.name = name;
    }

    public static void main(String[] args) {
        StudentComparator s1 = new StudentComparator(2,"Shila");
        StudentComparator s2 = new StudentComparator(10,"manas");
        StudentComparator s3  = new StudentComparator(7,"pro");

        ArrayList<StudentComparator> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        //RollNoComparator r = new RollNoComparator();
        // Collections.sort(students, new Comparator<StudentComparator>() {

        //     @Override
        //     public int compare(StudentComparator o1, StudentComparator o2) {
        //         // TODO Auto-generated method stub
        //         //throw new UnsupportedOperationException("Unimplemented method 'compare'");

        //         if(o1.rollNo <= o2.rollNo)
        //         {
        //             return -1;
        //         }
        //         else
        //         {
        //             return 1;
        //         }
        //     }
            
        // } );

        Collections.sort(students, new Comparator<StudentComparator>() {

            @Override
            public int compare(StudentComparator o1, StudentComparator o2) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'compare'");
            }
            
        });
        System.out.println(students.toString());

    }

    @Override
    public String toString() {
        return "StudentComparator [rollNo=" + rollNo + ", name=" + name + "]";
    }    
    
}

// implement to comparable , overide compare to
