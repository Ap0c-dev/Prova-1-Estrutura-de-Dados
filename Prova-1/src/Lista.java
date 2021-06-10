import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Lista<T> extends ArrayList { 
    private T[] elementos;
    private T[] elementosi;
    private int tamanho;

    public boolean invertendoLista(){
    //Letra A
        LinkedList listaInvertida = new LinkedList();
        for (int i = this.size() - 1; i >= 0; i--) {
            listaInvertida.add(this.get(i));
        }

        for (int i = 0; i < listaInvertida.size(); i++) {
            this.set(i , listaInvertida.get(i));
        }
        return true;
    }

    //Letra B
    public boolean adiciona(T elemento){
        this.aumentandoCapacidade();
        if( this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.elementosi = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse){
            this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
            this.tamanho = 0;        
    }  


    //Letra C
    private void aumentandoCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public boolean adiciona(int posicao, T elemento) throws IllegalAccessException{
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao Invalida");
        }
        this.aumentandoCapacidade();
        for (int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public boolean intercalando(ArrayList list) {
        for (int i = this.size() - 1; i >= 0; i--) {
            if (!(i % 2 == 0)){
                this.add(i, list.get(i));
            } 
                this.add(i, list.get(i));
            }
        return true;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public T busca(int posicao) throws IllegalAccessException{
        if(!(posicao >=0 && posicao < tamanho)){
            throw new IllegalAccessException("Posicao Invalida");
        }
        return this.elementos[posicao];
    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        
        return s.toString();
    }
    
}