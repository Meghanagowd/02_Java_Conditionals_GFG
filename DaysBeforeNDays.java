 
  import java.util.Scanner;

 public class DaysBeforeNDays {
    public static int nthDay(int d, int n) {
        return (d - (n % 7) + 7) % 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input current day number (0 to 6)
        System.out.println("Enter current day (0=Sunday, 1=Monday, ..., 6=Saturday):");
        int d = sc.nextInt();

        // Input number of days before
        System.out.println("Enter number of days:");
        int n = sc.nextInt();

        int result = nthDay(d, n);

        System.out.println("Day before " + n + " days is: " + result);

        sc.close();
    }
}

  

