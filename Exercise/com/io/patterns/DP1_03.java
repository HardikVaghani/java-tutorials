package Exercise.com.io.patterns;

public class DP1_03 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){   //-1 ahiya che
                System.out.print("8");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("8");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("8");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){  //-1 ahiya che
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
