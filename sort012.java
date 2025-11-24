//sort array of 0,1,2
import java.util.Scanner;
public class sort012{
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
int count0=0;
int count1=0;
int count2=0;

for(int i=0;i<n;i++){
    if(a[i]==0){
        count0++;
    }
    else if(a[i]==1){
        count1++;
    }
    else{
        count2++;
    }
}
int count=0;
for(int i=0;i<count0;i++){
    a[i]=0;
    count++;
}
for(int i=count0;i<count0+count1;i++){
    a[i]=1;
    count++;
}
for(int i=count;i<count0+count1+count2;i++){
    a[i]=2;
}
for(int i=0;i<n;i++){
    System.out.println(a[i]);
}
}
}
