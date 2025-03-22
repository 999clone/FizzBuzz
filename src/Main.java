import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = 1;
        System.out.println("Please enter the end number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            String temp = "";

            if (i % 3 == 0)
                temp += "Fizz";
            if (i % 5 == 0)
                temp += "Buzz";
            if (temp == "")
                temp += i;

            System.out.println(temp);
        }
    }
}