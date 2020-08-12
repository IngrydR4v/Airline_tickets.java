import java.util.Scanner;

public class Passagens_Aereas_2 {

    private static final int QTD_ASSENTOS = 40;

    public static void passagens() {
        
        Scanner scanner = new Scanner(System.in);

        java.lang.String[][] assentos = getAssentos();

        for (int i = 0; i < QTD_ASSENTOS; i++) {
            System.out.print((i + 1) + "º passageiro: ");
            assentos[i][1] = scanner.next();
        }
        for (int i = 0; i < QTD_ASSENTOS; i++) {
            System.out.println(assentos[i][0] +
                    " - " + assentos[i][1] +
                    " - " + getClasse(assentos[i][0]));
        }
    }
    private static java.lang.String getClasse(java.lang.String codAssento) {
        if (codAssento.contains("A")) {
            return "1º Classe";
        } else {
            return "Classe Econômica";
        }
    }
    private static java.lang.String[][] getAssentos() {
        java.lang.String[][] assentos = new java.lang.String[QTD_ASSENTOS][2];
        int numeroAssento = 1;

        for (int i = 0; i < QTD_ASSENTOS; i += 4) {
            assentos[i][0] = numeroAssento + "A";
            assentos[i + 1][0] = numeroAssento + "B";
            assentos[i + 2][0] = numeroAssento + "C";
            assentos[i + 3][0] = numeroAssento + "D";
            numeroAssento++;
        }
        return assentos;
    }
}
