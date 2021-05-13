import java.util.Locale;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(Qaunt(text));
    }
    public static StringBuilder Qaunt(String str){
        String tar = str.toLowerCase();
        int tiv =0;
        int tiv2 =0;
        StringBuilder tar1=new StringBuilder("");
        for (int i = 0; i < tar.length(); i++) {
            tiv=tar.charAt(i)+3;
            char ch=(char) tiv;
            tar1.append(ch);

        }
        System.out.println("tiv= "+tiv);
        System.out.println("tiv2="+tiv2);
        return tar1 ;
    }
}
