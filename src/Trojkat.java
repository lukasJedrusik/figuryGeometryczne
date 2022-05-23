public class Trojkat extends Figura{
    private int a;
    private int b;
    private int c;

    public Trojkat(int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;

    }

    int obwod(){
        return a + b +c;
    }

    //wzor herona
    double pole(int obwod){
        double p = (double) obwod / 2;
        double p1 = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(p1);

    }

    public static boolean  sprawdzWarunek(int a, int b, int c){
        boolean flag = false;
        if (a + b > c && b + c > a && a + c > b){
            flag =  true;
        }
        return flag;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }


}
