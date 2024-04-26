import java.util.Scanner;

public class BT_XepLoai {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Điểm chuyên cần:" );
      double scores1 = sc.nextDouble();
      System.out.print("Điểm kiểm tra:");
      double scores2 = sc.nextDouble();
      System.out.print("Điểm thi cuối kì:");
      double scores3 = sc.nextDouble();
      String xeploai = XepLoai( scores1, scores2, scores3);
      System.out.println("Năng lực học tập của bạn được đánh giá là: " + xeploai);
   }
   public static String XepLoai( double scores1, double scores2, double scores3){
      double diemTrungBinh = (scores1 + scores2 +scores3 ) / 3.0;

      if ( diemTrungBinh >10 ){
         return "Lỗi";
      }else if (diemTrungBinh >=9){
         return " Xuất xác";
      }else if (diemTrungBinh >=8){
         return " Giỏi";
      }else if ( diemTrungBinh >=6.5){
         return "Khá";
      }else if ( diemTrungBinh >=5){
         return "Trung bình";
      }else if ( diemTrungBinh < 5){
         return "Yếu";
      }else {
         return " Lỗi";
      }
   }

}
