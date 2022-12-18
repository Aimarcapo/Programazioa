public class Laukia {
   private int altuera;
   private int zabalera;
   int maxPerimetroa = Integer.MIN_VALUE;

   public Laukia() { // 1st Constructor (default constructor)
      altuera = 5;
      zabalera = 5;
   }

   public Laukia(int a, int z) { // 1st Constructor (default constructor)
      altuera = a;
      zabalera = z;
   }

   public int getZabalera() { // getter for radius
      return zabalera;
   }

   /** Returns the color */
   public int getAltuera() { // getter for color
      return altuera;
   }

   public int getAzalera() {
      return altuera * zabalera;
   }

   public int getPerimetroa() {
      return (altuera * 2) + (zabalera * 2);
   }

   public int getmaxPerimetroa() {
      return (altuera * 2) + (zabalera * 2);
   }

   public void setZabalera(int zabaleraBerria) {
      zabalera = zabaleraBerria;
   }

   public void setAltuera(int altueraBerria) {
      altuera = altueraBerria;
   }

   public String toString() {
      return "Laukia[" + zabalera + "x" + altuera + "]";
   }

   public String getMota() {
      
      if (altuera == zabalera) {
         return "Karratua";
      } else if (altuera > zabalera) {
         return "Bertikala";
      } else  {
         return "Horizontala";
      }
      
   }

   public void marraztuBeteta() {
      for (int i = 1; i <= altuera; i++) {
         for (int z = 1; z <= zabalera; z++) {
            System.out.print("* ");
         }

         System.out.println("");
      }
   }

   public void marraztuHutsik() {
      for (int i = 1; i <= altuera; i++) {
         for (int z = 1; z <= zabalera; z++) {

            if (i == 1 || i == altuera ||
                  z == 1 || z == zabalera) {
               System.out.print("*");
            } else {
               System.out.print(" ");
            }
         }
         System.out.println("");

      }
   }

   public void marraztuBeteta(char ikurra) {
      for (int i = 1; i <= altuera; i++) {
         for (int z = 1; z <= zabalera; z++) {
            System.out.print(ikurra);
         }

         System.out.println("");
      }
   }

   public boolean isBiggerThan(Laukia x){
      boolean bigger=false;
      if(this.getAzalera()>x.getAzalera()){

         bigger=true;
   }
   return bigger;
}

   public static Laukia getTheBiggest(Laukia[] laukiak) {
      Laukia max = laukiak[0];
      for (int i = 1; i < laukiak.length && laukiak[i] != null; i++) {
         if (laukiak[i].isBiggerThan(max)) {
            max = laukiak[i];
         }
      }
      return max;
   }
}
