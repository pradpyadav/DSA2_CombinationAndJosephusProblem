package combinations;

import java.util.Scanner;

public class NcrGenerator {
    public static void main(String[] args) {

        System.out.println("Enter the value of N and R");
        Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();
         int r = scan.nextInt();
        System.out.println("The NCR result : "+generatenCr(num,r));
    }

    static int generatenCr(int num, int r) {
        if(r == 0 || num == r)
            return 1;
        return generatenCr(num-1,r-1)+generatenCr(num-1,r);
    }


}