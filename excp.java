
class Sample {
    public static void main(String[] args) {
        int a = 30, b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Not be zero" + e);
        }
    }
}