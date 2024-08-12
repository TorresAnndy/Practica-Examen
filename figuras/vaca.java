package figuras;

public class vaca {
  public static void impresionvaca()
  {
    System.out.println("          (__)");
    System.out.println("          (uu)");
    System.out.println("  /------- \\/");
    System.out.println(" / |     ||");
    System.out.println("*  ||----||");
    System.out.println("   ~~     ~~");
  }

  public static void vacafor(){
    String[] vaca = {"          (__)",
    "          (uu)",
    "  /------- \\/",
    " / |     ||",
    "*  ||----||",
    "   ~~     ~~",
    };

    for (int i = 0; i<vaca.length; i++){
      System.out.println(vaca[i]);
    }

  }

  public static void main(String[] args) {
    vacafor();
  }
  
}
