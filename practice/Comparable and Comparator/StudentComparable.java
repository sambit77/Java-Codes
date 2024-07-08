//package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentComparable implements Comparable<StudentComparable>{

    int rollNo;
    String name;

    public StudentComparable(int rolllNo, String name){
        this.rollNo = rolllNo;
        this.name = name;
    }

    public static void main(String[] args) {
        StudentComparable s1 = new StudentComparable(2,"Shila");
        StudentComparable s2 = new StudentComparable(10,"manas");
        StudentComparable s3  = new StudentComparable(7,"pro");

        ArrayList<StudentComparable> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students);
        System.out.println(students.toString());

    }

    @Override
    public String toString() {
        return "StudentComparable [rollNo=" + rollNo + ", name=" + name + "]";
    }

    @Override
    public int compareTo(StudentComparable o) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");

        if(this.rollNo < o.rollNo)
        {
            return -1;
        }
        else if ( this.rollNo > o.rollNo)
        {
            return 1;
        }
        else {
            return 0;
        }
    }

    
    
}

// implement to comparable , overide compare to
