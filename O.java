public class O {

  public static void main(String[] args) {
    print_alphabet_O(10);
  }

  static void print_alphabet_O(int n) {
    System.out.println("The letter 'O' is printed below \n \n \n \n");

    for (int j = 0; j < n; j++) {
      if (j == n - 1) System.out.println("*"); else System.out.print("***");
    }
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
