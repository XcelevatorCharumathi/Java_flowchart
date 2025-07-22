public class FCP009{
public static void main(String []args)
{
int A = 36;
int B = 6;
int N;
int R;
if (A%B != 0){
N = A/B;
R = N*B;
System.out.println(R);
}
else{
A = A-1;
N = A/B;
R = N*B;
System.out.println(R);
}
}
}