public class Laukia {
   private int altuera;
   private int zabalera;

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

   public void setZabalera(int zabaleraBerria) {
      zabalera = zabaleraBerria;
   }

   public void setAltuera(int altueraBerria) {
      altuera = altueraBerria;
   }

   public String toString() {
      return "Circle[radius=" + altuera + ",color=" + zabalera + "]";
   }

   public String getMota() {
      String emaitza = "";
      if (altuera == zabalera) {
         emaitza = "Karratua";
      } else if (altuera > zabalera) {
         emaitza = "Bertikala";
      } else if (zabalera > altuera) {
         emaitza = "Horizontala";
      }
      return emaitza;
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
            }
            else{
            System.out.print(" ");   
         }
      }
      System.out.println("");
         
      }
   }
}