/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Iván Aguilar
 */
public class EscalarMatrices {
    
    public int[][] escalarMatriz(int[][] matrizA , int escalar) {
        int[][] matrizResultado;
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;

//        imprimeMatriz("Primera matriz:", matrizA);
        
        matrizResultado = new int[filasA][columnasA];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matrizResultado[i][j] = matrizA[i][j] * escalar;
            }
        }
        
//        imprimeMatriz("Matriz resultado:", matrizResultado);
        
        return matrizResultado;
    }

    private void imprimeMatriz (String matrizTittle, int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        System.out.println(matrizTittle);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println("");
        }
    }
    
}
