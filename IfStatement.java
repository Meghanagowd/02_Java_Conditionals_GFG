import java.util.Scanner;

class IfStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num > 10) {
            System.out.println("Big");
        }

        sc.close();
    }
}
