package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();


        filaBanco.add("Roberto");
        filaBanco.add("Jefersson");
        filaBanco.add("Patricia");
        filaBanco.add("Flávia");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteAserAtendido = filaBanco.poll();

        System.out.println(clienteAserAtendido);

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        //filaBanco.clear();

        String primieiroclienteQuerro =filaBanco.element();

        System.out.println(primieiroclienteQuerro);

        System.out.println(filaBanco);

        for (String client: filaBanco){
            System.out.println(client);
        }

        Iterator<String> iteratorFilabanco = filaBanco.iterator();

        while (iteratorFilabanco.hasNext()){
            System.out.println("---->" + iteratorFilabanco.next());
        }
        System.out.println(filaBanco.size());

        filaBanco.clear();

        System.out.println(filaBanco.isEmpty());

    }
}
