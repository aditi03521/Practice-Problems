
import java.util.*;
public class spiral{
    int n;
    int m;
    public void sp(int[][] a){
    for (int i=0;i<n-1;i++)
    {   System.out.println(a[0][i]);}
    for (int i=0;i<n-1;i++)
    {   System.out.println(a[i][n-1]);}
    for (int i=n-1;i>=0;i--)
    {   System.out.println(a[n-1][i]);}
    for (int i=0;i<n-1;i++)
    {   System.out.println(a[n-2][i]);}
    }
    
    
        

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER row");
int n=sc.nextInt();
System.out.println("ENTER column");
int m=sc.nextInt();
int[][] a=new int[n][m];

System.out.println(n);
for (int i=0;i<n;i++)
{   for (int j=0;j<m;j++)
    {System.out.println("enter no to be inserted in array");
    a[i][j]=sc.nextInt();}

}
spiral obj=new spiral();
obj.n=n;
obj.m=m;
obj.sp(a);


}
}