public class Czworokat extends Figura {

    private int a;
    private int b;
    private int c;
    private int d;
    private String nazwa = "Czworokąt nieforemny";

    public Czworokat(int a, int b, int c, int d) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static boolean  sprawdzWarunek(int a, int b, int c, int d){
        boolean flag = false;
        if (a + b + c > d && b + c + d > a && c + a + d > b && a + b + d >c){
            flag =  true;
        }
        return flag;
    }

    public String getNazwa() {
        return nazwa;
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

    public int getD() {
        return d;
    }

    @Override
    public String toString(){
        StringBuilder sb =new StringBuilder();
        sb.append("Nazwa: ")
                .append(this.getNazwa())
                .append(" - boki: ")
                .append(this.getA())
                .append(", ")
                .append(this.getB())
                .append(", ")
                .append(this.getC())
                .append(",  ")
                .append(this.getD());
        return sb.toString();
    }
}
