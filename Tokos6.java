import java.util.Locale;
import java.util.Scanner;

public class Tokos6 {
    public static void main(String[] args) {
        count("test123456");
    }

    public static void count(String str) {
        String tiv = str.replaceAll("[^a, i,o,u,e,A,E,O,U,I]","");
        String tiv2 = str.replaceAll("[^0,9]","");
        double number = ((double) tiv.length()/str.length())*100;
        double number1 = ((double) tiv2.length()/str.length())*100;
        System.out.println(" tokos"+ tiv.length() + " "+String.format(" ",number));
        System.out.println(" tokos"+ tiv2.length() + " "+String.format(" ",number1));
    }
}