public class POO {
  public static void main(String[] args) {
    Alumno alu1 = new Alumno();
    Alumno alu2 = new Alumno(200, "andy", "Gonzales");

    System.out.println("id. "+ alu2.id);
    System.out.println("Nombre. "+ alu2.nombre);
    System.out.println("Apellido. "+ alu2.apellido);
  }
}
