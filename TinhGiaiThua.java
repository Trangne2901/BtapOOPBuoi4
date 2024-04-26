public class TinhGiaiThua {
    public static void main(String[] args) {
        System.out.println("Giai thừa của 6  là : " + factorial(6));
        System.out.println("Giai thừa của 0  là : " + factorial(0));
        System.out.println("Giai thừa của 4  là : " + factorial(4));
    }
    static int factorial(int n){
//        if ( n == 0)
//            return 1;
//        else
//            return (n * factorial(n-1));
        if (n>0)
            return n*factorial(n-1);
        else
            return 1;
    }
}
