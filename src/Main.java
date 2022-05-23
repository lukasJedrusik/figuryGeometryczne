import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figura[] tr = new Figura[4];
        String input ;
        int count= 0;
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, e, f;



        while(count < 4) {
            count++;
            input = scan.nextLine();
            String[] numbers = input.split(" ");
            switch (numbers.length) {
                case 3:
                     a = Integer.parseInt(numbers[0]);
                     b = Integer.parseInt(numbers[1]);
                     c = Integer.parseInt(numbers[2]);
                    if (Trojkat.sprawdzWarunek(a, b, c)) {
                        if (a == b && b == c) {
                            tr[count - 1] = new TrojkatRownoboczny(a, b, c);
                        } else if (a != b && b != c && c != a) {
                            tr[count - 1] = new TrojkatRoznoboczny(a, b, c);
                        } else {
                            tr[count - 1] = new TrojkatRownoramienny(a, b, c);
                        }
                    } else {
                        tr[count] = null;
                    }
                    break;
                case 4:
                     a = Integer.parseInt(numbers[0]);
                     b = Integer.parseInt(numbers[1]);
                     c = Integer.parseInt(numbers[2]);
                     d = Integer.parseInt(numbers[3]);
                     if(Czworokat.sprawdzWarunek(a,b,c,d)){
                         if(Kwadrat.sprawdzWarunek(a,b,c,d)) {
                             tr[count - 1] = new Kwadrat(a, b, c, d);
                         } else if(Prostokat.sprawdzWarunek(a, b, c, d)){
                             tr[count - 1] = new Prostokat(a, b, c, d);
                         } else tr[count - 1] = new Czworokat(a, b, c, d);

                     }


                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }

    for(int i = 0; i< tr.length; i++){
        if(tr[i] != null){
            System.out.println(tr[i].toString());
        } else System.out.println("Nie mozna utworzyc figury!!!");
    }

    }
   /* public static boolean  sprawdzWarunek(int a, int b, int c){
        boolean flag = false;
        if (a + b >= c && b + c >= b && a + c >= b){
            flag =  true;
        }
        return flag;
    }*/
}
