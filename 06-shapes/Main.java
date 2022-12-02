class Main {
  public static void main(String[] args) {
    System.out.println("Square!");
   square();
   rectangle();
   righttriangle(); 
   triangle();
  }

public static void square() {
    for (int row = 0; row < 5; row++) {
      for (int col = 0; col < 5; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
}

public static void rectangle() {
  System.out.println(" ");
  System.out.println("Rectangle!");
    for (int row = 0; row < 4; row++) {
      for (int col = 0; col < 6; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
}

  public static void righttriangle() {
    System.out.println(" ");
    System.out.print("Right Triangle!");
    for (int row = 0; row <= 5; row++) {
      for (int col = 0; col < row; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
}

  public static void triangle() {
    System.out.println(" ");
    System.out.println("Triangle!");
int a,b,c;
for(a=0; a<=5; a++) {
for(b=4; b>=a; b--) {
System.out.print(" ");
}
for(c=1; c<=(2*a-1); c++) {
System.out.print("*");
}
System.out.println(" ");
}
}
}



