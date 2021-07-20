package List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Mountain Bike");
        esportes.add("Corrida");
        esportes.add("Ciclismo");
        esportes.add("Triathlon");

        esportes.set(2, "skate");

        esportes.remove(2);

        esportes.remove("Triathlon");

        System.out.println(esportes.get(0));

        for (String esporte: esportes){
            System.out.println(esporte);
        }
    }
}
