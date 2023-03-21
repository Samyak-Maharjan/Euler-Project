import java.lang.Math;
class highlyDivisibleTraingularNumber{
    private static int countDivisor(int n) {
        int num=0;
        double end=Math.sqrt(n);
        for(int i=1;i<end;i++){
            if(n%i==0) num+=2;
        }
        if(end*end==n) num++;
        return num;
    }
    private static String moreThanN(int n) {
        int tri=0;
        for(int i=1;;i++){
            tri+=i;
            if(countDivisor(tri)>n) return Integer.toString(tri);
        }
    }
    public static void main(String[] args) {
        System.out.println(moreThanN(500));
    }
}