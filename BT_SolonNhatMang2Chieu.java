public class BT_SolonNhatMang2Chieu {
    public static void main(String[] args) {
      int [][] arr = {
              {2,3,4},
              {1,9,5},
      };
      int max = arr[0][0];
      timSoLonNhat(arr, max);
    }
    public static int timSoLonNhat( int [][] arr, int max){
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if( max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.print(max + " Là số lớn nhất");
        return max;
    }
}
