//product of array except self
import java.util.Scanner;
public class productexceptself{
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
int find=0;
for (int i=0;i<n;i++)
{   
int product=1;
find=a[i];
for(int j=0;j<n;j++)
{
    if(a[j]!= find)
    {product =product*a[j];
    }
   
}
System.out.println(product);
}


}
}
