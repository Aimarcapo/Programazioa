package MyPoint;

import java.util.Scanner;

public class GeometriaAzterketa {
  private static Scanner sc = new Scanner(System.in);
  private static double nota = 0;

  public static void main(String[] args) {

    System.out.println("GEOMETRIA AZTERKETA");
    if (galdera1()) {
      nota++;
    }
    if (galdera2()) {
      nota++;
    }
    if (galdera3()) {
      nota++;
    }
    System.out.println("NOTA FINALA=" + nota);
  }

  public static boolean galdera1() {
    MyPoint p1 = new MyPoint(1, 5);
    MyPoint p2 = new MyPoint(7, 3);
    double emaitza;
    double erantzun;
    boolean bai = false;
    System.out.println("Zein da P1" + p1 + "eta P2" + p2 + "artean dagoen distantzia");
    emaitza = p1.distance(p2);
    erantzun = sc.nextDouble();
    if ((int) emaitza == (int) erantzun) {
      bai = true;
      System.out.println("Erantzun zuzena");
    } else {
      System.out.println("Erantzun okerra");
    }
    return bai;
  }

  public static boolean galdera2() {
    MyCircle zirkulu1 = new MyCircle(4, 2, 15);
    double erantzun;
    double emaitza;
    boolean bai = false;
    System.out.println("Kalkulatu zirukulu1" + zirkulu1 + "-en azalera");
    emaitza = zirkulu1.getArea();
    erantzun = sc.nextDouble();
    if ((int) emaitza == (int) erantzun) {
      bai = true;
      System.out.println("Azalera zuzena da");
    } else {
      System.out.println("Azalera okerra da");
    }
    return bai;
  }

  public static boolean galdera3() {
    MyCircle zirkulu1 = new MyCircle(4, 2, 6);
    int x;
    int y;
    boolean erantzuna = false;
    System.out.println("Jarri puntu bat " + zirkulu1 + "zirkuluaren barruan dagoela");
    x = sc.nextInt();
    y = sc.nextInt();
    MyPoint puntua = new MyPoint(x, y);
    if (zirkulu1.isInside(puntua)) {
      erantzuna = true;
      System.out.println("Idatzi duzun puntua zirkuluaren barruan dago");
    }
    else{
      System.out.println("Idatzi duzun puntua ez dago zirukularen barruan");
    }
    return erantzuna;
  }
}
