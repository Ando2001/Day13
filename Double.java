import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println(doubled(number));
    }

    public static int doubled(String input) {
        int tiv=0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 1; j < input.length(); j++) {
                if (input.charAt(i)==input.charAt(j)){

                } else if (i!=j){
                    tiv++;
                }
                break;
            }
        }
        return tiv;
    }
}
