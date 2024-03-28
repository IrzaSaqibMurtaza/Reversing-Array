
package myprojects;

public class ReverseArray
{
    public static int[] reverse(int[] array) //reverse() is defined static as to call in the main(static context) without creating Class object.
    {
        int[] revArray=new int[array.length]; 
        for(int i=0;i<array.length;i++)
        {
            revArray[i]=array[(array.length-1)-i];
        }
        return revArray;
    }
    public static void main(String[] args)
    {
        
//        ReverseArray r1=new ReverseArray(); 
        int[] array={1,2,3};
//        int[] rev=r1.reverse(array);
        int[] rev=reverse(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(rev[i]);
        }
    }
}
