# powernumber
import java.io.*;
import java.util.*;
public class powernumber{
public static void main(String args[]);
{
Scanner sc=new Scanner(System.in);
int k,m,n=1;
System.out.println("Enter the number");
k=sc.nextInt();
System.out.println("Enter the power");
m=sc.nextInt();
if(k>=0 && m==0){
n=1;
}
else if(k==0 && m>=1){
n=0;
}
else{
for(int i=1;i<=m;i++){
n=n*k;
}
}
System.out.println(k+"^"+m+"="+n);
}
}
