import java.util.Scanner;
public class movezero{
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
int index=0;
for (int i=0;i<n;i++)
{
    if (a[i]!=0){
        a[index]=a[i];
        index++;
}
}
for (int j=index;j<n;j++)
{
    a[j]=0;
}
for (int k=0;k<n;k++)
{   System.out.println(a[k]);
    
}
}
}