//programe two divide two numbers

import java.lang.*;
import java.util.*;

class programe1
{
   public static void main(String arg[])
   {
      int div;
     
      Scanner sobj = new Scanner(System.in);
    
      System.out.println("Enter First Number");
      int iValue1 = sobj.nextInt();

      System.out.println("Enter Second Number");
      int iValue2 = sobj.nextInt();

      div =iValue1/iValue2;

      System.out.println("The Output is :"+div);

      

     
   }

}