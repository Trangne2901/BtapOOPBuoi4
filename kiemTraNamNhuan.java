public class kiemTraNamNhuan {
    public static boolean NamNhuan(int nam) {
//        if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
            return (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
//        } else {
//            return false;
    }
    public static void main(String[] args) {
//        int nam = 2028;
//        if (NamNhuan(nam)){
//            System.out.println(nam + " là năm nhuận");
//        }else {
//            System.out.println( nam + " Ko phai nam nhuan");
//        }
        int startYear = 2000;
        int endYear = 3000;
        System.out.println("Cac nam nhuan từ " + startYear + "đến" + endYear + " là : " +",");
        for ( int i = startYear; i< endYear; i++  ){
            if (NamNhuan(i)){
                System.out.println(i);
            }
        }
    }
}
