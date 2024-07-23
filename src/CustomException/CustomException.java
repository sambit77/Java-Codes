//package practice.CustomException;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int num = sc.nextInt();

        if(num % 2 != 0)
        {
            throw new OddFoundException("Odd found");
        }

        

        try
        {
            if(num % 2 == 0)
            {
                throw new EvenFoundException("Even found");
            }
        }
        catch(EvenFoundException e)
        {
            e.printStackTrace();
        }
    }
}

class EvenFoundException extends Exception
{
    public EvenFoundException(String msg)
    {
        super(msg);
    }
}

class OddFoundException extends RuntimeException
{
    public OddFoundException(String mgs)
    {
        super(mgs);
    }
}
