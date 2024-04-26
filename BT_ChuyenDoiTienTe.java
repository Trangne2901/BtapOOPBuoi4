import java.util.Scanner;

public class BT_ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD : ");
        double vnd = 23.000;
        double usd;
        usd = sc.nextDouble();
        double quydoi = chuyenDoiTienTe(vnd,usd);
        System.out.println( "Giá trị VND :" + quydoi );
    }
    public static double chuyenDoiTienTe(double vnd , double usd){
        double quydoi = usd *23.000;
        return quydoi;
    }
}
