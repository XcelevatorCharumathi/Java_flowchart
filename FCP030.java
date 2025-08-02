import java.util.*;
public class FCP030{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int s=0;
int i=1;
while(i<=N){
s=i*i;
i=i+1;
if(s==N){
System.out.println("Yes");
break;
}
}
if(s!=N){
System.out.println("No");
}
}
}

