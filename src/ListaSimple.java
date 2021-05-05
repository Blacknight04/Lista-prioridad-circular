/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramon Ruiz
 */
public class ListaSimple {
    protected Lista[] vector;
    protected int ini;
    protected int fin;

    public ListaSimple(int tamano){
        vector = new Lista[tamano];
        ini = -1;
        fin = -1;
    }

    public boolean insertar(Lista dato){
        if(ListaLlena()){
            return false;
        }
        fin++;
        vector[fin]=dato;
        if(ini == -1){
            ini = 0;
        }
        return true;
    }
    
    protected boolean ListaLlena(){
        return fin == vector.length-1;
    }
    
    public boolean eliminar(){
        if(ListaVacia()) return false;
        if(hayUnSoloDato()){
            ini = -1;
            fin = -1;
            return true;
        }
        ini++;
        return true;
    }
    
    protected boolean ListaVacia(){
        return ini == -1 && fin == -1;
    }
    
    protected boolean hayUnSoloDato(){
        return ini == fin;
    }

     public Lista getValor(int pos){
        return vector[pos];
    }
    

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }
}
