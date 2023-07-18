import java.util.Scanner;

public class Divisibility {
    public static int ModConversion(int[] array)
    {
        int result=0;
        int power=1,output=0;
        for(int i=array.length-1;i>=0;i--)
        {
            result=(result+array[i]*power)%3;
            power=(power*10)%3;
        }
        if(result==0)
        {
            output=1;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] Array=new int[size];
        for(int i=0;i<size;i++)
        {
            Array[i]= scanner.nextInt();
        }
        System.out.println(ModConversion(Array));
    }
}