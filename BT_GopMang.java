public class BT_GopMang {
    public static void main(String[] args) {
       int [] arr1 = {1,3,5,7,9};
       int [] arr2 = {2,4,6,8};
       int add = arr1.length + arr2.length;
       int [] newArray = new int [add];
       gopMang(arr1,arr2, newArray);
    }
    public static int [] gopMang(int [] arr1, int [] arr2, int [] newArray){
        for (int i = 0 ; i < arr1.length ; i++){
            newArray[i]=arr1[i];
        }
        for (int i = 0; i<arr2.length; i++){
            newArray[ arr1.length+i] = arr2[i];
        }
        for (int i : newArray){
            System.out.print(i+ "\t");
        }
        return newArray;
    }
}
