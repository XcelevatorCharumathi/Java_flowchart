import java.util.*;
public class FCP048{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int M=Sc.nextInt();
int N=Sc.nextInt();
int temp=0;
int D=0;
int S=0;
int c=0;
while(N<=M){
for(int i=N; i>=0; i/=10){
temp=N;
D=N%10;
N=N/10;
c=c+1;
}
for(int j=temp; j>=0; j/=10){
D=temp%10;
S=S+(int)Math.pow(D, c);
}
if(S==N){
System.out.println(N);
}
else{
N=N+1;
}
}
}
}
