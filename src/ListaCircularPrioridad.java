/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramon Ruiz
 */
public class ListaCircularPrioridad extends ListaCircular{
    
    public ListaCircularPrioridad(int t){
        super(t);
    }
    
    public boolean insertar(Lista dato){
        boolean resul = super.insertar(dato); 
        if(!resul) return false;
        Acomodar(dato);
        return true;
    }
    
    public void Acomodar(Lista dato){
        Lista t;
        for(int i=fin-1; i>-1; i--){
            if(dato.getNivel() > vector[i].getNivel()){
                t = vector[i];
                vector[i] = dato;
                vector[i+1] = t;
            }
        }
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
