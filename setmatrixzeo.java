import java.util.*;
public class setmatrixzeo{
    int n;
    int m;
    public void setzero(int[][] a,int i,int j){
    for(int k=0;k<n;k++){
        a[k][j]=0;
        }
    for(int o=0;o<m;o++){
        a[i][o]=0;
        }
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
setmatrixzeo obj=new setmatrixzeo();
obj.n=n;
obj.m=m;
boolean[][] zero=new boolean[n][m];
for (int i=0;i<n;i++)
{   for (int j=0;j<m;j++)
    {if (a[i][j]==0)
    {   zero[i][j]=true;

    }
}
}
for (int i=0;i<n;i++)
{   for (int j=0;j<m;j++)
    {if (zero[i][j])
    {   obj.setzero(a,i,j);

    }
}
}
for (int i=0;i<n;i++)
{   for (int j=0;j<m;j++)
    {
        System.out.println(a[i][j]);
    }

    }
}
}