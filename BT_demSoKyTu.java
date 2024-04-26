public class BT_demSoKyTu {
    public static void main(String[] args) {
        String chuoi = "Cong hoa xa hoi chu nghi Viet Nam";
        char kyTu = 'c';
        int soLanXuatHien = demSoKyTu(chuoi, kyTu);
        System.out.println("Số lần xuất hiện cua ky hiệu '" + kyTu + "' trong chuỗi là : " + soLanXuatHien);
    }

    public static int demSoKyTu(String chuoi, char kyTu) {
        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
//            if (chuoi.charAt(i) == kyTu){
            if(Character.toLowerCase(chuoi.charAt(i))== Character.toLowerCase(kyTu)){
                dem++;
            }
        }
        return dem;
    }
}
