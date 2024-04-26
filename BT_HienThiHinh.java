import java.util.Scanner;

public class BT_HienThiHinh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1.Hình chữ nhật");
            System.out.println("2.Hình vuông");
            System.out.println("3.Hình tam giác vuông");
            System.out.println("4.Hình tam giác cân");
            System.out.println("5. Exit");
            System.out.println(" Enter your choie: ");
            choice = sc.nextInt();
            hienThi(choice);
        }

    }
    public static void hienThi( int height){
        switch (height) {
            case 1:
                System.out.println("Hình chữ nhật:");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println(" Hình vuông :");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                System.out.println("Hình tam giác vuông");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
//                    System.out.println("HÌnh tam giác vuông ngược");
//                    for(int i=5 ; i>=1 ; i--){
//                        for(int j=1;j<=i;j++){
//                            System.out.print(" *");
//                        }
//                        System.out.println("");
//                    }
//                    break;
            case 4:
                System.out.println("Hình tam giác cân");
                for (int i = 1; i <= 6; i++) {
                    for (int j = 1; j <= 6 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 5:
                System.exit(4);
            default:
                System.out.println("No choice!");
        }
    }
}
