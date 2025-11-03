import java.util.Scanner;
public class UKL1B {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b;
       System.out.print("Masukkan bilangan :");
       b=a.nextInt();
       if (b%2==0) {
        System.out.println("bilangan genap");
       }else{
        System.out.println("bilangan ganjil");
       }

    }
}
