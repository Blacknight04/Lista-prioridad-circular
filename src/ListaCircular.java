/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramon Ruiz
 */
public class ListaCircular extends ListaSimple{
    
    public ListaCircular(int t){
        super(t);
    }

    @Override
    public boolean insertar(Lista dato){
        if(modoCircular()){
            if(ListaCircularLlena()) return false;
            fin++;
            vector[fin].setDato(dato.getDato());
            return true;
        }
        boolean res = super.insertar(dato);
        if(res) return true;
        if(ini==0) return false;                
        fin = 0;
        vector[fin].setDato(dato.getDato());
        return true;
    }
    
    protected boolean modoCircular(){
        return fin<ini;
    }
    
    public boolean ListaCircularLlena(){
        return (fin +1) == ini;
    }

    public Lista[] getVector() {
        return vector;
    }

    public void setVector(Lista[] vector) {
        this.vector = vector;
    }

    public int getIni() {
        return ini;
    }

    public void setIni(int ini) {
        this.ini = ini;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    
    
}
