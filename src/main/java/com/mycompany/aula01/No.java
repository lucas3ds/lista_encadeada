
package com.mycompany.aula01;

public class No {
    private int num ;
    private No prox;
    private No ult;
    
        //Construtor
    public No (int num){
        //Valor a ser colocado no Nó
        this.num = num;
        //Referencia para o proximo, se for o primeiro ele e null
        this.prox = null;
    }
    // geter setter
    //metodo para obiter a informação que será atribuida ao nó
    
    //geter setter para num
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    
    //geter setter para proximo
    public No getProx(){
        return prox;
    }
    public void setProx(No prox){
        this.prox = prox;
    }
    
    //geter setter para ultimo
    
     public No getUlt(){
        return ult;
    }
    public void setUlt(No ult){
        this.ult = ult;
    }
    
}
