import java.util.*;
public class FCP026{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int a=Sc.nextInt();
int b=Sc.nextInt();
int s=0;
for(int i=a; i<=b; i++){
s=s+i;
}
System.out.println(s);
}
}