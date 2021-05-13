import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        bin2Dec(number);
    }
    public static void bin2Dec(String str){
        double sum=0;
        int number = str.length();
        String tox = str.replaceAll("[^01]","");

        int number2=tox.length();
        if (str.length()!=number2){
            System.out.println("number inviled");
        } else {
            for (int i = 0; i < number2; i++) {
                sum=sum+Integer.parseInt(String.valueOf(str.charAt(i))) *Math.pow(2,number2-1-i);
            }
            System.out.println("sum="+sum);
        }

    }
}
