import java.util.Scanner;

/**
 * forLoop
 */
public class forLoop {

    public static void main(String[] args) {

        // for (int i=0 ; i<= 10; i+=5){

        //     System.out.println(i);
        // }

        // Largest of N numbers;

        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt() ;

        int maxValue= Integer.MIN_VALUE;
         
        for (int i=1;i<=n;i++){
            int current = sc.nextInt();
            maxValue = Math.max(maxValue,current);
        }
        System.out.println(maxValue);

    }
}