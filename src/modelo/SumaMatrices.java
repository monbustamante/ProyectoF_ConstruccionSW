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
public class SumaMatrices {

    public int[][] sumarMatriz(int[][] matrizA , int[][] matrizB) {
        int[][] matrizResultado;
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;

        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

//        imprimeMatriz("Primera matriz:", matrizA);
//        imprimeMatriz("Segunda matriz:", matrizB);
        
        if (filasA==filasB && columnasB==columnasA) {

            matrizResultado = new int[filasA][columnasA];
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }

        } else {
            throw new Error("Las matrices deben tener la misma cantidad de filas que columnas");
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
