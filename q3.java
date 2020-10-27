class q3{
    public static void main (String[] args) {
        int sum = 0;
        double a = 0;
        double b = 0;
        for(int i = 1; i <= 100; i++){
            a += i*i;
            b += i;
        }
        System.out.println(b*b - a);
    }
}