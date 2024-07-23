//package Iterate;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(2);
        v.add(3);
        v.add(4);
        v.add(27);

        
        Enumeration<Integer> enm = v.elements();

        while (enm.hasMoreElements()) {
            System.out.print(enm.nextElement()+" ,");
        }
    }
    
}
