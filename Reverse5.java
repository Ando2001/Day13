import java.util.Scanner;

public class Reverse5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        String test = str.reverse().toString();
        System.out.println(test);

    }
}
