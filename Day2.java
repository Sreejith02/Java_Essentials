/*
LetsUpgrade | Java Essentials.

Day-1_Assignment

Question-1

  Write a Java program which would take two values through command line argument and print the sum of the two values.
*/


class Day-2
{
      public static void main(String args[])
      {
        
    int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum = x + y;
        
  System.out.println("sum of " + x + " and " + y +" is " +sum);
      }
}