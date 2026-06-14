import java.util.Scanner;
class Matrix{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter n:");
int n = sc.nextInt();
int[][] mat = new int[n][n];
System.out.println("Enter matrix Elements");
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){
mat[i][j] = sc.nextInt();
}
}
n--;
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){
mat[i][j] = mat[j][n];
}
n--;
}
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){
System.out.print(mat[i][j]+" ");
}
System.out.println();
}

}
}