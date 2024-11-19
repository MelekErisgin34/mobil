import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int y1,y2,ortalama;
        System.out.println("1.sayi ");
        y1=oku.nextInt();
        System.out.println("2.sayi");
        y2=oku.nextInt();
        ortalama=ortalama(y1,y2);
        System.out.println("ortalama"+ortalama);


    }
    private static int ortalama(int y1,int y2){
        int sonuc= (y1+y2)/2;
        return sonuc;
    }

}
