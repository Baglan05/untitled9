public class Forth {
    public int func(int n){
        if (n == 1){
            return 1;
        } else {
            return n * func(n-1);
        }
    }
}
