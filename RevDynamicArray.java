
package myprojects;
import java.util.Scanner;
public class RevDynamicArray

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
        Scanner input= new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int arrLen=input.nextInt();
        int[] array=new int[arrLen];
        System.out.println("Input array integer elements : ");
        for(int i=0;i<array.length;i++)
        {
           array[i]=input.nextInt();
        }
        
        int[] rev=reverse(array);
        System.out.println("Following are array elements in reverse order : ");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(rev[i]);
        }
    }
}
