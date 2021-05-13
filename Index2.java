import java.util.Scanner;

public class Index2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int index = scanner.nextInt();
        char text1 = text.charAt(0);
        System.out.println(text.indexOf(text1));

    }
}
