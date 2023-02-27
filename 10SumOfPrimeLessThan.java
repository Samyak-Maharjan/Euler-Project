import java.lang.Math;
import java.util.ArrayList;
class SumOfPrimeLessThan {
    public boolean primechk(int n){
        if(n==0||n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public ArrayList<Integer> primeList(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(primechk(i)) list.add(i);
        }
        return list;
    }
    public long summation(ArrayList<Integer> list){
        long sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list=new SumOfPrimeLessThan().primeList(2000000);
        System.out.println(new SumOfPrimeLessThan().summation(list));
    }
}
