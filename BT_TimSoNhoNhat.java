public class BT_TimSoNhoNhat {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 7,9};
//        int index = minValue(arr);
        int index = maxValue(arr);
//        System.out.println("So nho nhat la: " + arr[index]);
        System.out.println("So  lon nhat la:" +arr[index]);
    }
        //min
//    public static int minValue(int[] array) {
//        int index = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < array[index]) {
//                index = i;
//            }
//        }
//        return index;
        public static int maxValue (int [] array){
        int index = 0;
        for (int i = 1; i< array.length;i++ ){
            if (array [i] > array[index]){
                index = i;
            }
        }
        return index;
    }
}

