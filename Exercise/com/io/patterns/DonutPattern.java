package Exercise.com.io.patterns;

/**
 * Exercise.com.io.patterns.RoundPattern
 */
public class DonutPattern {

    public static void main(String[] args) {
        int n=5,i,j;
        for(i=1;i<n;i++){
            for(j=n-i-1;j>=1;j--){
                if(i==2 && j==1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }

                
            }
            for(j=1;j<=i;j++){
                if(i==4 && j==4){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            for(j=1;j<=i;j++){         //1 karvo
                if((i==5&&j==4)||(i==5&&j==5)||(i==4&&j==1)){
                    System.out.print("   ");
                }else{
                System.out.print(" * ");
                }
            }for(j=n-i+1;j>=2;j--){
                if(i==2&&j==4){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
            }

            System.out.println();
        } 
        for(i=n-1;i>=1;i--){
            for(j=n-i-1;j>=1;j--){
                if(i==2 && j==1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }

                
            }
            for(j=1;j<=i;j++){
                if(i==4 && j==4){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            for(j=1;j<=i;j++){         //1 karvo
                if((i==5&&j==4)||(i==5&&j==5)||(i==4&&j==1)){
                    System.out.print("   ");
                }else{
                System.out.print(" * ");
                }
            }for(j=n-i+1;j>=2;j--){
                if(i==2&&j==4){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
            }

            System.out.println();
        }       
    }
    
}