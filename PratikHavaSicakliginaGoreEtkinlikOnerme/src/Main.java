import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int heat =0;
	    System.out.print("Sıcaklık Değerini Giriniz : ");
	    heat = input.nextInt();

	    if (heat < 5){
	        System.out.print("Kayak Yapabilirsiniz.");
        }
	    else  if (heat < 15){
            System.out.print("Sinemaya Gidebilirsiniz.");
        }
	    else if (heat < 25){
            System.out.print("Piknik Yapabilirsiniz.");
        }
	    else {
            System.out.print("Yüzmeye Gidebilirsiniz.");
        }
    }
}
