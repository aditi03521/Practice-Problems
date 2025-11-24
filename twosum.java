//2sum problem:find two no that sum to a target
import java.util.Scanner;
public class twosum{
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
 System.out.println("enter output sum");
 int osum= sc.nextInt();
 for ( int i=0;i<n;i++)
 {
    for(int j=0;j<n;j++){
        if(a[i]+a[j]==osum){
            if(a[j]==a[i]){
                break;
            }
            else{
                 System.out.println(i+","+j);
            }
        }
    }
 }
}
}
