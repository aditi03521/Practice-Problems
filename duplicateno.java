//find duplicate no in an array
import java.util.Scanner;
public class duplicateno{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER SIZE");
int n=sc.nextInt();
int[] a=new int[n];
System.out.println(n);
for (int i=0;i<n;i++)
{   System.out.println("enter no to be inserted in array");
    a[i]=sc.nextInt();
}

int max = a[0];
for (int i=0;i<n;i++)
{
    if (a[i]>max)
    {
        max=a[i];
    }
}
int actsum = (max*(max+1))/2;
int sum =0;
for (int i=0;i<n;i++)
{
    sum = sum+a[i];
}
int duplicate = sum - actsum;
System.out.println("Duplicate no:"+ duplicate);
}
}
    
