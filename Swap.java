public class Swap {
    public static void main(String[] args) {
        int A = 1, B = 2, temp;
        System.out.printf("Initial Values: A = %d, B = %d\n", A, B);
        temp = A;
        A = B;
        B = temp;
        System.out.printf("A is %d, B is %d",A, B);
    }
}
