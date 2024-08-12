package arraylist;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
  public static void main(String[] args) {
    List<Persona> lista = new ArrayList<Persona>();
    lista.add(new Persona(1, "Andy", 21));
    lista.add(new Persona(2, "Aylin", 19));
    lista.add(new Persona(3, "Andres", 18));
    lista.add(new Persona(4, "Angel", 21));

    System.out.println("-----for-----");
    //recorrer por indice
    for(int i = 0; i < lista.size(); i++){
      System.out.println(lista.get(i).getNombre());
    }

    System.out.println("-----foreach-----");

    //recorrido foreach
    for (Persona persona : lista) {
      System.out.println("Num. "+ persona.getNum());
      System.out.println("Nombes. "+ persona.getNombre());
      System.out.println("Edades. "+ persona.getEdad());
      System.out.println("\n");
      
    }
  }
}
