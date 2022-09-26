package com.mycompany.aula01;

/**
 *
 * @author LUQUINHA
 */
public class ListaEncadeada {
    
    private No primeiro ; 
    
    //Construtor 
    public ListaEncadeada(){
        primeiro = null;
    }
    
    //getter
    public No getPrimeiro(){
        return primeiro;
    }
    
    //Lista vazia 
    public boolean estaVazia(){
        //por ser do tipo boolean vai retornar verdadeiro ou falso 
        if (primeiro == null){
            return true;
        }else {
            return false;
        }   
    
    } 
    
    //Insere na primeira posição
    public void inserePrimeiro(int valor){
        No no1 = new No(valor);
        no1.setProx(primeiro);
        primeiro = no1;
        no1.setUlt(null);
        
    }
    
    // inserir na última posição
    public void insereUltimo(int valor){
        //se a lista estiver vazia será inserido na primeira posição 
        if (estaVazia()){
            inserePrimeiro(valor);
        }else{
            No ponteiro = primeiro;
            while (ponteiro.getProx() != null){
                ponteiro = ponteiro.getProx();
            }
            //O último ponteiro deixa de ser null e passa a ter no1 com proximo
            No no1 = new No(valor);
            ponteiro.setProx(no1);
            no1.setUlt(ponteiro);
            
        }
    }
    
    // inserir de depois 
    public void inserirDepois(No no , int num){
        //novo no no1
        No no1 = new No(num);
        //no1 passou a ter como proximo o nó do no
        no1.setProx(no.getProx());
        
        //e o no passou a ter com proximo o no1
        no.setProx(no1);
        no1.setUlt(no);
            
    }
    
    //busca na lista 
    public void buscar(int num){
        int cont=1;
        boolean vdd = false;
        No ponteiro = primeiro;
        while(ponteiro != null){
            if (ponteiro.getNum() == num){
                System.out.println("Foi encontrado no nó: "+ cont);
                vdd = true;
            }
            cont++;
            ponteiro = ponteiro.getProx();
        }
        if (vdd ==true){
            System.out.println("Número : "+ num);
        }else{
            System.out.println("Número não encontrado: "+ num);
        }        
    }      

    // Imprimir lista 
    public void mostrar(){
        
        if (estaVazia()){
            System.out.println("Lista esta vazia, não há informação para mostrar.");
        }else{
            No ponteiro  = primeiro;
            while(ponteiro != null){
                System.out.println(ponteiro.getNum());
                ponteiro = ponteiro.getProx();
            }
        }
    }
    // metodos de remoção
    // remove primeiro 
    public No removePrimeiro(){
        if (estaVazia()){
            System.out.println("Lista vazia não possui informação para ser removida.");
            return null;
        }else {
            No ponteiro = primeiro;
            primeiro = primeiro.getProx();
            primeiro.setUlt(null);
            
            return ponteiro;
        }        
    }
    
    // remove depois 
    public void removeDepois(No no){
        if (estaVazia()){
            System.out.println("Lista vazia não possui informação para ser removida.");
        }else{
            No anterior ;
            No ponteiro = primeiro;
            
            while (ponteiro.getProx() != null){
                anterior = ponteiro;
                ponteiro = ponteiro.getProx();
                anterior.setProx(ponteiro.getProx());
                ponteiro.getProx().setUlt(anterior);
               
            }
        }
        
    }
    //remove ultimo
    public void removeUltimo(){
        if (estaVazia()){
            System.out.println("Lista vazia não possui informação para ser removida.");
            
        }else{
            No anterior = null;
            No ponteiro = primeiro;
            
            while (ponteiro.getProx() != null){
                anterior = ponteiro;
                ponteiro = ponteiro.getProx();
            }
            anterior.setProx(null);
        }
    }
            
}
