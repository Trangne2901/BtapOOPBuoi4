import java.util.Scanner;
public class TH_KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if(year % 4 == 0){//chia hết cho 4 là năm nhuận
            if(year % 100 == 0){ //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
                if(year % 400 == 0){//chia hết cho 400 là năm nhuận
                    System.out.print(year + " : Là năm nhuận");
                } else {//không chia hết cho 400 thì không phải năm nhuận
                    System.out.print(year + " : Là năm không nhuận");
                }
            } else {//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                System.out.print( " Năm "+ year + " : Là năm nhuận");
            }
        } else {
            System.out.print("Năm " +year + " : Là năm không nhuận");
        }

    }
//static boolean checkYear(int year){
//    return (((year % 4 == 0) && (year % 100 != 0)) ||
//            (year % 400 == 0));
//}
//
//    // Driver method
//    public static void main(String[] args)
//    {
//        int year = 2000;
//        System.out.println(checkYear(2000)? "Leap Year" :
//                "Not a Leap Year" );
//    }
}
