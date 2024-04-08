public class Fifth {
    public int func(int n) {
        if (n <= 1) {
            return n;
        } else {
            return func(n - 1) + func(n - 2);
        }
    }
}
