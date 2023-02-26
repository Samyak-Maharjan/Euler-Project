public class DifferenceSquareOfSumAndSumOfSquare {
    static double SumOfSquare(int n){
        double sos=0;
        sos=((n*(n+1)*(2*n+1))/6);
        return sos;
    }
    static double SquareOfSum(int n){
        double sos=0;
        sos=(n*(n+1))/2;
        return sos*sos;
    }
    public static void main(String[] args) {
        int n=100;
        System.out.println(SquareOfSum(n)-SumOfSquare(n));
    }
}
