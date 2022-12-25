public class U {

  public static void main(String[] args) {
    int n = 8;
    print_alphabet_U(n);
  }

  // Below Function prints U
  static void print_alphabet_U(int n) {
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
