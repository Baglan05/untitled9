public class Sixth {
    public int func(int a, int n) {
        // Base case: any number to the power of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: multiply a by the result of power(a, n-1)
        else {
            return a * func(a, n-1);
        }
    }
}
