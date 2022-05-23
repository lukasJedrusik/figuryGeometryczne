public class TrojkatRownoramienny extends Trojkat{

    private String nazwa = "Trojkąt równoramienny";

    public TrojkatRownoramienny(int a, int b, int c) {
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
