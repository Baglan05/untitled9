public class Second {
    public double func(int n, int[] arr){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        return (double) sum / n;
    }
}
