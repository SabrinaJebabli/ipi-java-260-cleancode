import static java.lang.System.out;

public class CleanCodeExemple1 {

    public static void main(String[] args) {
        /*code pourri
        int a = 20;
        int b = 4;

        double resultat = a/b;
        System.out.println(resultat);*/

        /*code corrigé*/
        /*gestion des exceptions*/
        int a = 20;
        int b = 4;
        double resultat = a/b;

        try {
            System.out.println(resultat);
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro, impossible !");
        }
    }

}
