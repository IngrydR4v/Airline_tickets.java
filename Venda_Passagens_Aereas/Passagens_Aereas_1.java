import java.util.Scanner;

public class Passagens_Aereas_1 {
    
    private static final int QTD_ASSENTOS = 40;

    public static void passagens() {

        // 40 lugares
        Scanner scanner = new Scanner(System.in);
        java.lang.String[][] assentos = new java.lang.String[QTD_ASSENTOS][2];

        assentos[0][0] = "1A";
        assentos[1][0] = "2B";
        assentos[2][0] = "3C";
        assentos[3][0] = "4D";
        assentos[4][0] = "1A";
        assentos[5][0] = "2B";
        assentos[6][0] = "3C";
        assentos[7][0] = "4D";
        assentos[8][0] = "1A";
        assentos[9][0] = "2B";
        assentos[10][0] = "3C";
        assentos[11][0] = "4D";
        assentos[12][0] = "1A";
        assentos[13][0] = "2B";
        assentos[14][0] = "3C";
        assentos[15][0] = "4D";
        assentos[16][0] = "1A";
        assentos[17][0] = "2B";
        assentos[18][0] = "3C";
        assentos[19][0] = "4D";
        assentos[20][0] = "1A";
        assentos[21][0] = "2B";
        assentos[22][0] = "3C";
        assentos[23][0] = "4D";
        assentos[24][0] = "1A";
        assentos[25][0] = "2B";
        assentos[26][0] = "3C";
        assentos[27][0] = "4D";
        assentos[28][0] = "1A";
        assentos[29][0] = "2B";
        assentos[30][0] = "3C";
        assentos[31][0] = "4D";
        assentos[32][0] = "1A";
        assentos[33][0] = "2B";
        assentos[34][0] = "3C";
        assentos[35][0] = "4D";
        assentos[36][0] = "1A";
        assentos[37][0] = "2B";
        assentos[38][0] = "3C";
        assentos[39][0] = "4D";

        for (int i = 0; i < QTD_ASSENTOS; i++) {
            System.out.print((i + 1) + "º passageiro: ");
            assentos[i][1] = scanner.next();
        }
        for (int i = 0; i < QTD_ASSENTOS; i++) {
            if (assentos[i][0].contains("A")) {
                System.out.println(assentos[i][0] +
                        " - " + assentos[i][1] +
                        " - 1º Classe ");
            } else {
                System.out.println(assentos[i][0] +
                        " - " + assentos[i][1] +
                        " - Classe econômica ");
            }
        }
    }
}
