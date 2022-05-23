public class TrojkatRoznoboczny extends Trojkat{

    private String nazwa = "Trójkąt Różnoboczny";

    public TrojkatRoznoboczny(int a, int b, int c) {
        super(a, b, c);
    }

    public String getNazwa() {
        return nazwa;
    }
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
                .append(" Obwod: ")
                .append(this.obwod())
                .append(" Pole: ")
                .append(this.pole(this.obwod()));
        return sb.toString();
    }
}
