package List;

import java.util.*;

public class ExemploLista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Juliana");
        nomes.add("Carlos");
        nomes.add("Anderson");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(5, "Larissa");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Anderson");

        System.out.println(nomes);

        String nome = nomes.get(1);

        System.out.println(nome);

        int posicao = nomes.indexOf("Carlos");

        System.out.println(posicao);

        int tamanho = nomes.size();

        System.out.println(tamanho);



        boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);

        boolean ListaEstaVazia = nomes.isEmpty();

        System.out.println(ListaEstaVazia);

        for (String name: nomes){
            System.out.println("-->" + name);
        }
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("----->" + iterator.next());
        }
        nomes.clear();

        ListaEstaVazia = nomes.isEmpty();

        System.out.println(ListaEstaVazia);


    }
}
