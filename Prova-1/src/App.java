import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        Lista lista = new Lista(10);

        Lista listaParaIntercalar = new Lista(10);
        ArrayList listaIntercalarNormal = new ArrayList();

        lista.adiciona(9);
        lista.adiciona(22);
        lista.adiciona(0);
        lista.adiciona(15);
        lista.adiciona(89);

        System.out.println("Exercicio 1 \n");
        System.out.println(lista);
        lista.invertendoLista();
        System.out.println(lista);
        lista.invertendoLista();
        System.out.println(lista);
        lista.invertendoLista();
        System.out.println(lista);

        listaParaIntercalar.add(1);
        listaParaIntercalar.add(2);
        listaParaIntercalar.add(3);
        listaParaIntercalar.add(4);
        listaParaIntercalar.add(5);

        listaIntercalarNormal.add(2);
        listaIntercalarNormal.add(4);
        listaIntercalarNormal.add(6);
        listaIntercalarNormal.add(8);
        listaIntercalarNormal.add(10);


        System.out.print("\nLista: ");

        System.out.print("[");
        for (int i = 0; i < listaParaIntercalar.size() ; i++) {  
            System.out.print(listaParaIntercalar.get(i)+ ", ");
        }
        System.out.print("]\n");

        System.out.print("\nLista Intercalada: ");

        listaParaIntercalar.intercalando(listaIntercalarNormal);
        System.out.print("[");
        for (int i = 0; i < listaParaIntercalar.size() ; i++) {  
            System.out.print(listaParaIntercalar.get(i)+ ", ");
        }
        System.out.print("]\n");

        System.out.println("\nExercicio 2");

        ListaPilha listaPilha = new ListaPilha<>();

        listaPilha.adicionar("Tiago");
        listaPilha.adicionar("Lucy");
        listaPilha.adicionar("Carla");
        listaPilha.adicionar("Biel");

        System.out.println("\n4 Elementos que foram adicionados: " + listaPilha);

        listaPilha.remover();

        System.out.println("\nRemovendo elemento: " + listaPilha+ "\n");

        listaPilha.adicionar("Carlos");
        listaPilha.adicionar("Giselda");

        System.out.println("\n2 Adicionano elementos: " + listaPilha);

        listaPilha.remover();

        System.out.println("\nRemovendo elemento: " + listaPilha);

        ListaLigada listaLigada = new ListaLigada();
        ListaLigada listaIntercalar = new ListaLigada();

        listaLigada.add(10);
        listaLigada.add(20);
        listaLigada.add(30);
        listaLigada.add(40);
        listaLigada.add(50);

        System.out.println("\nLista normal: " + listaLigada);
        listaLigada.inverte();
        System.out.println("\nLista invertida: " + listaLigada);
        listaLigada.inverte();

        listaIntercalar.add(1);
        listaIntercalar.add(2);
        listaIntercalar.add(3);
        listaIntercalar.add(4);
        listaIntercalar.add(5);

        listaLigada.intercalar(listaIntercalar);

        System.out.println("\nLista intercalada: " + listaLigada);

        System.out.println("\nExercicio 3");

        ListaLigada novaLista = new ListaLigada();

        novaLista.add(2);
        novaLista.add(4);
        novaLista.add(8);
        novaLista.add(16);
        novaLista.add(64);

        System.out.println("\nLista sem Link: " + novaLista);
        novaLista.unir(listaIntercalar);
        System.out.println("\nLista com Link: " + novaLista);

    }
}