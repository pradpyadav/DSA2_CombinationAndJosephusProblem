package josephusprogram;

import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Josephus problem");
        System.out.println("Enter the number of elements");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Enter the value of index positions to covered at one go");
        int k = scan.nextInt();

        System.out.println("The josephus problem winner is : "+josephusProblemSolver(num,k));

    }

    static int josephusProblemSolver(int num, int k){
        if(num ==1) return 0;
        return (josephusProblemSolver(num-1,k)+k)%num;
    }
}
