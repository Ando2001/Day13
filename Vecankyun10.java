import java.util.Scanner;

public class Vecankyun10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println(hex(number));
    }
    public static  boolean hex(String str){
        boolean flag=false;
        String tox = str.replaceAll("[^0-9A-Fa-f]","");
        if (str.equals(tox)){
            flag=true;
            return true;
        }
        return flag;
    }
}
