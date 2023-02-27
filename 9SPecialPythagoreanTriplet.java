class SpecialPythagoreanTriplet {
    public int[] GenerateTriplet(int n){
        int triplet[]={0,0,0};
        for(int a=1;a<n;a++){
            for(int b=a+1;b<n;b++){
                int c=n-a-b;
                if(a*a+b*b==c*c){
                    triplet[0]=a;
                    triplet[1]=b;
                    triplet[2]=c;
                    return triplet;
                }
            }
        }
        throw new AssertionError("Not found");
    }
    public static void main(String[] args) {
        int[] arr=new SpecialPythagoreanTriplet().GenerateTriplet(1000);
        int prod=1;
        for(int i=0;i<3;i++){
            prod=prod*arr[i];
        }
        System.out.println(prod);
    }
}
