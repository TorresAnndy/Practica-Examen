package figuras;

public class x {

  public static void x(){
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (j == i || j == (9 - 1 - i)) {
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    x();
  }
  
}
