class SumOfDigits{
public static void main(String[] args){
 int n = 45;
int sum = 0;
while(n>0){
sum+=n%10;
n/=10;
}
System.out.println("Sum of Digits");
}
}