//package Iterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(5);
        al.add(4);
        al.add(3);

        for( int i = 0 ; i < al.size() ; i++)
        {
            System.out.print(al.get(i)+" ");
            //System.out.println();
        }
        System.out.println();

        for(int a : al)
        {
            System.out.print(a+" ");
            
        }
        System.out.println();

        Iterator itr = al.iterator();
        System.out.println("Using Iterator");

        
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ,");
            //System.out.println();
        }
        System.out.println();

        System.out.println("List Iterator");

        ListIterator litr = al.listIterator();

        while (litr.hasNext()) {
            litr.next();
        }
        while(litr.hasPrevious())
        {
            System.out.print(litr.previous()+" ,");
        }
    }
}
