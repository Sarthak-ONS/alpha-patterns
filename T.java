public class T {

  public static void main(String[] args) {
    print_alphabet_T(11);
  }

  static void print_alphabet_T(int n) {
    System.out.println("The letter 'T' is printed below \n \n \n \n");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0) {
          System.out.print("* ");
        } else {
          if (j == n-1) {
            System.out.print("*");
          } else System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
