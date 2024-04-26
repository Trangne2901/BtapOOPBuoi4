import java.util.Scanner;

public class TH_TinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện tiêu thụ trong tháng (kWh): ");
        int soDienTieuThu = sc.nextInt();
        double tienDien = tinhTienDien(soDienTieuThu);

        System.out.println("Số tiền điện phải trả trong tháng là: " + tienDien + " đồng");

    }
    public static double tinhTienDien(int soDienTieuThu) {
        double tienDien = 0;

        if (soDienTieuThu <= 50) {
            tienDien = soDienTieuThu * 1.549;
        } else if (soDienTieuThu <= 100) {
            tienDien = 50 * 1.549 + (soDienTieuThu - 50) * 1.600;
        } else if (soDienTieuThu <= 200) {
            tienDien = 50 * 1.549 + 50 * 1.600 + (soDienTieuThu - 100) * 1.858;
        } else if (soDienTieuThu <= 300) {
            tienDien = 50 * 1.549 + 50 * 1.600 + 100 * 1.858 + (soDienTieuThu - 200) * 2.340;
        } else if (soDienTieuThu <= 400) {
            tienDien = 50 * 1.549 + 50 * 1.600 + 100 * 1.858 + 100 * 2.340 + (soDienTieuThu - 300) * 2.615;
        } else {
            tienDien = 50 * 1.549 + 50 * 1.600 + 100 * 1.858 + 100 * 2.340 + 100*2.615 + (soDienTieuThu - 400) * 2.701;
        }


        return tienDien;
    }
}
