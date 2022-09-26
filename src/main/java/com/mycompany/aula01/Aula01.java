package com.mycompany.aula01;

import java.util.Scanner;

/**
 *
 * @author LUQUINHA
 */ 
public class Aula01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();
        int num,repet=1,aux,aux02;
        while(repet <=3){
            System.out.println("Digite um número: ");
            num = entrada.nextInt();
            
            if (repet == 1){
                lista.inserePrimeiro(num);
                repet++;
            }else if(repet ==2){
                No no1 = lista.getPrimeiro();
                lista.inserirDepois(no1, num);
                repet++;
            }else {
                lista.insereUltimo(num);
                repet++;
            }
            
        }
        System.out.println("  ");
        lista.mostrar();
        System.out.println("   Onde deseja inserir o proximo valor? ");
        System.out.println("   [1] No inicio ");
        System.out.println("   [2] No meio ");
        System.out.println("   [3] No final ");
        aux = entrada.nextInt();
        switch(aux){
                case 1:
                    System.out.println("Digite o valor: ");
                    aux02 = entrada.nextInt();
                    lista.inserePrimeiro(aux02);
                    break;
                case 2: 
                    System.out.println("Digite o valor: ");
                    aux02 = entrada.nextInt();
                    No no1 = lista.getPrimeiro();
                    lista.inserirDepois(no1, aux02);
                    break;
                case 3:
                    System.out.println("Digite o valor: ");
                    aux02 = entrada.nextInt();
                    lista.insereUltimo(aux02);
                    break;
                default :
                    System.out.println("Opção invalida ");
        }   
        lista.mostrar();
        
        
    }
}
