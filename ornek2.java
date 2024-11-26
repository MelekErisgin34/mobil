import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi1;
        System.out.print("1.sayi");
        sayi1= oku.nextInt();

        int kare=kareal(sayi1);
        System.out.println("kareal :"+kare);
    }
    private static int kareal(int sayi1){
        int sonuc=sayi1*sayi1;
        return sonuc;
    }

}
