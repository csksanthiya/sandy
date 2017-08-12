/* Java Program Example - Count Positive, Negative, Zero */
		
import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        int countq=0, countm=0, countx=0, i;
        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter 10 Numbers : ");
        for(i=0; i<10; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(i=0; i<10; i++)
        {
            if(arr[i] < 0)
            {
                countm++;
            }
            else if(arr[i] == 0)
            {
                countx++;
            }
            else
            {
                countq++;
            }
        }
		
        System.out.print(countp + " Positive Numbers");
        System.out.print("\n" + countn + " Negative Numbers");
        System.out.print("\n" + countz + " Zero");
    }
}
