class q4{
    public static void main (String [] arg){
        int sum = 0;
        for(int a = 1; a < 1000; a++){
            for (int b = 0; b < 1000; b++){
                double c = (Math.sqrt(a*a + b*b));
                if(a+b+c == 1000){
                    System.out.println("A +" + a +"B +" + b + "C +"+ c);
                }
            }
        }
    }
}
