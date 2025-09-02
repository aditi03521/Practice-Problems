import java.util.Scanner;
public class leader{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER SIZE");
int n=sc.nextInt();
int[] a=new int[n];
System.out.println(n);
for (int i=0;i<n;i++)
{
    a[i]=sc.nextInt();
    System.out.println("updated");
}
int max = a[n-1];
for(int i= n-2;i>=0;i--)
{
    if (a[i] >= max);
    {max=a[i];
    System.err.println(max);
    }

}
}
}