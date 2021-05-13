import java.util.Scanner;

public class Polidrom8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text =scanner.nextLine();
        System.out.println(Palindrom(text));
    }
    public static boolean Palindrom(String str){
        boolean flag =false;
        StringBuilder pol = new StringBuilder(str);
        StringBuilder pl= pol.reverse();
        if (str.equals(pl.toString())){
            flag=true;
            return true;
        } else {
            return flag;
        }
    }
}
