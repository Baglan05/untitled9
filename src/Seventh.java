public class Seventh {
    public void func(int n, int[] arr){
        if (n == 0){
            return;

        } else {
            System.out.print(n + " ");
            func(n-1, arr );
        }
    }
}
