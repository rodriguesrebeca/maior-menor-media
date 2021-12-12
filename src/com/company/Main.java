package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite 5 números: ");
        for (int i=0; i < numeros.length; i++){
            numeros[i]=scan.nextInt();
        }

        int maiorNumero = 0;
        int menorNumero = Integer.MAX_VALUE;
        float mediaNumeros = 0f;


        for(int i=0; i <numeros.length; i++){
            mediaNumeros += numeros[i];
            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];

            }
            if(numeros[i] < menorNumero) {
                menorNumero = numeros[i];

            }
            if(i+1 == numeros[i]){
                mediaNumeros = mediaNumeros / numeros.length;

            }
        }

        System.out.println("O maior número é: " +maiorNumero);
        System.out.println("O menor número é: " +menorNumero);
        System.out.println("A média dos numeros é: " +  mediaNumeros);

    }
}
