public class Reverse {
    public static void main(int num) {
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            res = res * 10 + rem;
            num = num / 10;

        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        main(1234);
    }
}
