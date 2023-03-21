public class StandardDev {
    int[] arr;
    public StandardDev(int[] arr) {
        this.arr=arr;
    }
    public void calculate(int[] arr){

    double mean;
    int n=arr.length;
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
    }
    mean=sum/n;
    double sq=0.0;
    for(int i=0;i<n;i++){
    sq=sq+Math.pow((arr[i]-mean),2);
    }
    double sqr=sq/5;
    double sdev=Math.sqrt(sqr);
    System.out.print("standard deviation"+ sdev);

    }
    
}
