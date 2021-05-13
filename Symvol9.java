import java.util.Scanner;

public class Symvol9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println(checkBinStr(number));
    }
    public static boolean  checkBinStr(String str){
        boolean flag = false;
        int tiv = str.length();
        String tiv1=str.replaceAll("[^0,1]","");
        if (tiv==tiv1.length()){
            flag=true;
            return true;
        }
        return flag;
    }
}
