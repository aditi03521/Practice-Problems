import java.util.Scanner;
public class subarrayeqk{
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
System.out.println("enter k");
int k=sc.nextInt();
int count=0;
for (int i=0;i<n-1;i++)
{
    if ((a[i]+a[i+1])==k){
        count=count+1;
    }
}
 System.out.println(count);
}
}
