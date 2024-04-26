import java.util.Arrays;

public class BT_ThemXoaPhanTu {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 5, 4};
        int add = 7;
        int delete = 3;
        themPhanTu( array,add);
        System.out.println(" ");
        xoaPhanTu(array);
        System.out.println(" ");
        xoaPhanTuDau(array);
        System.out.println(" ");
        xoaPhanTuGiua(array,delete);
    }
    //them phan tu cuoi mang
        public static int [] themPhanTu ( int [] array, int add){
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < newArray.length - 1; i++) {
                newArray[i] = array[i];
            }
            newArray[newArray.length - 1] = add;
            for (int i : newArray) {
                System.out.print(i + "\t ");
            }
            return newArray;
        }
        //them phan tu dau mang
//    public static int [] themPhanTuDau(int [] array, int add){
//
//    }

        //xoa phan tu cuoi mang
        public static int [] xoaPhanTu(int [] array){
            int [] newArray = new int [ array.length -1];
            for (int i = 0; i < array.length-1;i++){
                newArray[i]=array[i];
            }
            for ( int i : newArray){
                System.out.print(i+"\t ");
            }
            return newArray;
        }
        //Xoa phan tu dau
        public static int [] xoaPhanTuDau(int [] array){
            int [] newArray = new int [ array.length -1];
            for (int i = 0; i < array.length-1;i++){
                newArray[i]=array[i+1];
            }
            for ( int i : newArray){
                System.out.print(i+"\t ");
            }
            return newArray;
        }
        // Xóa phan tu giũa mang
    public static int [] xoaPhanTuGiua( int [] array,int delete){
        for (int i = delete; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array = Arrays.copyOf(array, array.length - 1);
        for (int i : array) {
            System.out.print(i + "\t ");
        }
        return array;
    }
}
