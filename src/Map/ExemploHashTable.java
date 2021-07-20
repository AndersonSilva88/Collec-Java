package Map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Anderson", 38);
        estudantes.put("Renata", 32);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        estudantes.remove("Pedro");

        System.out.println(estudantes);

      //  int idadeEstudante = estudantes.get("Mariana");

      //  System.out.println(idadeEstudante);

        System.out.println(estudantes.size());

        for (Map.Entry<String, Integer> entry : estudantes.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        for (String Key : estudantes.keySet()){
            System.out.println(Key + " ---> " + estudantes.get(Key));
        }
        System.out.println(estudantes);
    }

}
