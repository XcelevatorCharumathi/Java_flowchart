import java.util.*;
public class FCP035{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int c=0;
for(int i=1; i<=N; i++){
if(N%i==0){
c=c+1;
}
}
if(c==2){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}