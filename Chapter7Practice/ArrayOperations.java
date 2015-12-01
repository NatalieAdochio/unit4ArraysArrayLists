

/**
 * Write a description of class ArrayOperations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayOperations
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class ArrayOperations
     */
    public static void main(String[] args)
    {
        // initialise instance variables
        double[] x = {8, 4, 5, 21,7,9,18,2,100};
        System.out.println("length of x: " + x.length);
        System.out.println("x[0] : "+ x[0]);
        System.out.println("x[8]: "+ x[8]);
        System.out.println(x[x.length -1]+":"+x[x.length-1]);
        for(int i =0; i < x.length; i++)
        {
            System.out.println(x[i]);
        }
        for (int i = 0; i<x.length; i++)
        {
            //g e7.2
            System.out.println("x["+i+"] : " + x[i]);
        }
        for (int i = x.length -1; i>= 0; i--)
        {
            System.out.println("x["+ i +"] :" + x[i]);
        }
        for (double value: x)
        {
            //the array goes after the colon and then it assigns whatever it is to the value vari
            //can't print labels because don't know where it is in the list
            System.out.println(value);
        }
    }

    public static void printItOut()
    {
        // put your code here
        
    }

}
