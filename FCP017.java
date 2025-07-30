import java.util.*;
public class FCP017{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int X=Sc.nextInt();
int Y=Sc.nextInt(); 
int Z=Sc.nextInt();
int Max1=0;
int Max2=0;
if(X<Y){
Max1=Y;
Max2=X;
}
if(Max2>Z){
System.out.println(Max2);
}
else if(Max1>Z){
System.out.println(Z);
}
else{
System.out.println(Max1);
}
}
}