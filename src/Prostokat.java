public class Prostokat extends Czworokat {

    private String nazwa = "Prostokat";
    public Prostokat(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public  static boolean sprawdzWarunek(int a, int b, int c, int d){
        //if(a == b && b == c && c == d ){
        return (a == c && b == d && a != b );
        //}
    }

    public String getNazwa() {
        return nazwa;
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
