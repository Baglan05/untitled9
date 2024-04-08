public class First {
    public int func(int n, int[] arr){
        int m = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] < m){
                m = arr[i];
            }
        }

        return m;
    }
}
