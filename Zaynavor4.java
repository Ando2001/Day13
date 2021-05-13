import java.util.Scanner;

public class Zaynavor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        qaunt(text);
    }
    public static void qaunt(String str){
        int zaynavor = 0;
        int baxazayny = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='a' ||ch=='A' || ch =='I' || ch=='i'|| ch=='U'|| ch=='u'||ch=='O'||ch=='o'||ch=='E'||ch=='e'){
                zaynavor++;
            } else{
                baxazayny ++;
            }
        }

        System.out.println(" baxazayn " + baxazayny);
        System.out.println("zaynavor " + zaynavor);
    }
}
