import java.util.Arrays;
import java.util.Scanner;

public class lista03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("\nQUESTÃO 01");
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Digite o tamanho do vetor: ");
        // int n = scanner.nextInt();
        // int[] vetor = new int[n];
        // System.out.println("Digite "+n+" números:");
        // for (int i = 0; i < n; i++) {
        //     vetor[i] = scanner.nextInt();
        // }
        // for (int i = n-1; i >= 0; i--) {
        //     System.out.print(vetor[i] + " ");
        // }

        // System.out.println("\nQUESTÃO 02");
        // int[] nums = new int[10];
        // System.out.println("Digite 10 números:");
        // for (int i = 0; i < 10; i++) {
        //     nums[i] = scanner.nextInt();
        // }
        // for (int i = 0; i < 10-1; i++) {
        //     for (int j = 0; j < 10-1-i; j++) {
        //         if (nums[j] > nums[j + 1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }
        // for (int i = nums.length-1; i >= 0; i--) {
        //     System.out.print(nums[i] + " ");
        // }

        // System.out.println("\nQUESTÃO 03");
        // int[][] matriz = new int[5][5];
        // int maiorValor = -1;
        // int linhaMaior = 0;
        // int colunaMaior = 0;
        // System.out.println("Digite valores positivos para preencher a matriz 5x5:");
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         matriz[i][j] = scanner.nextInt();
        //         if (matriz[i][j] > maiorValor) {
        //             maiorValor = matriz[i][j];
        //             linhaMaior = i;
        //             colunaMaior = j;
        //         }
        //     }
        // }
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("["+matriz[i][j]+"] ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("\nMaior valor: "+maiorValor+"\nLinha: "+(linhaMaior+1)+"\nColuna: "+(colunaMaior+1));

        // System.out.println("\nQUESTÃO 04");
        // int[][] matrizA = new int[2][3];
        // int[][] matrizB = new int[3][2];
        // int[][] matrizC = new int[2][2];
        // System.out.println("Digite os valores da matriz 2x3 (A):");
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print("A["+i+"]["+j+"]: ");
        //         matrizA[i][j] = scanner.nextInt();
        //     }
        // }
        // System.out.println("Digite os valores da matriz 3x2 (B):");
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         System.out.print("B["+i+"]["+j+"]: ");
        //         matrizB[i][j] = scanner.nextInt();
        //     }
        // }
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         matrizC[i][j] = 0;
        //         for (int k = 0; k < 3; k++) {
        //             matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
        //         }
        //     }
        // }
        // System.out.println("\nMatriz resultado (2x2) da multiplicação:");
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         System.out.print("["+matrizC[i][j]+"] ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("\nQUESTÃO 05");
        // System.out.print("Digite um número inteiro positivo: ");
        // int n = scanner.nextInt();
        // int[][] pascal = new int[n][n];
        // for (int i = 0; i < n; i++) {
        //     pascal[i][0] = 1;
        //     pascal[i][i] = 1;
        //     for (int j = 1; j < i; j++) {
        //         pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(pascal[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("\nQUESTÃO 06");
        // int[][] matriz = new int[5][5];
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         if (i == j) {
        //             matriz[i][j] = 1;
        //         } else {
        //             matriz[i][j] = 0;
        //         }
        //     }
        // }
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("["+matriz[i][j]+"] ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("\nQUESTÃO 07, 08 e 09");
        // int[][] matriz = new int[3][3];
        // int somaDiagonalSuperior = 0;
        // int somaDiagonalInferior = 0;
        // int somaDiagonalPrincipal = 0;
        // System.out.println("Digite os valores da matriz 3x3:");
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print("Elemento ["+i+"]["+j+"]: ");
        //         matriz[i][j] = scanner.nextInt();
        //         if (j>i){
        //             somaDiagonalSuperior += matriz[i][j];
        //         }
        //         if (j<i){
        //             somaDiagonalInferior += matriz[i][j];
        //         }
        //         if (j==i) {
        //             somaDiagonalPrincipal += matriz[i][j]; 
        //         }
        //     }
        // }
        // System.out.println("\nMatriz 3x3:");
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print("["+matriz[i][j]+"] ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("Soma da diagonal superior: "+somaDiagonalSuperior);
        // System.out.println("Soma da diagonal inferior: "+somaDiagonalInferior);
        // System.out.println("Soma da diagonal principal: "+somaDiagonalPrincipal);

        // System.out.println("\nQUESTÃO 10");
        // char[][] tabuleiro = new char[8][8];
        // System.out.println("Movimentos de uma torre no xadrez!");
        // System.out.print("Digite a linha em que a torre se encontra: ");
        // int linhaTorre = scanner.nextInt();
        // System.out.print("Digite a coluna em que a torre se encontra: ");
        // int colunaTorre = scanner.nextInt();
        // for (int i = 0; i < tabuleiro.length; i++) {
        //     for (int j = 0; j < tabuleiro.length; j++) {
        //         tabuleiro[i][j] = '-';
        //         if (i==linhaTorre-1) {
        //             tabuleiro[i][j] = 'X';
        //         }
        //         if (j==colunaTorre-1) {
        //             tabuleiro[i][j] = 'X';
        //         }
        //     }
        // }
        // System.out.println("\nMovimentos possíveis:");
        // System.out.println("  1 2 3 4 5 6 7 8");
        // for (int i = 0; i < 8; i++) {
        //     System.out.print((i+1)+" ");
        //     for (int j = 0; j < 8; j++) {
        //         System.out.print(tabuleiro[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
