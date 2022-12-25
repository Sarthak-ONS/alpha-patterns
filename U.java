public class U {

  public static void main(String[] args) {
    int n = 8;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j == n - 1 || j == 0) System.out.print(
          "*  "
        ); else System.out.print("   ");
      }
      System.out.println();
    }
    for (int j = 0; j < n; j++) {
      if (j == n - 1) System.out.println("*"); else System.out.print("***");
    }
  }
}
