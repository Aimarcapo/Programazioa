public class TestZatikia {
    public static void main(String[] args) {
       
        // Lerroak ez-komentatzen joan metodoak programatzen dituzun neurrian

        Zatikia zat1 = new Zatikia("3/4");
        System.out.print("Lehen zatikia: " + zat1 + " ");
        System.out.println(zat1.isPositive() ? "positiboa" : "negatiboa");

         Zatikia zat2 = new Zatikia(-2, 6);
        System.out.print("Bigarren zatikia: " + zat2 + " ");
        System.out.println(zat2.isPositive() ? "positiboa" : "negatiboa");

        Zatikia zat3 = new Zatikia("2/3");
        System.out.print("Hirugarren zatikia: " + zat3 + " ");
        System.out.println(zat3.isPositive() ? "positiboa" : "negatiboa");

        Zatikia zat4 = new Zatikia(-8, -9);
        System.out.print("Laugarren zatikia: " + zat4 + " ");
        System.out.println(zat4.isPositive() ? "positiboa" : "negatiboa");

        ZatikiHandia zat5 = new ZatikiHandia(5, 3);
        System.out.println("Bostgarren zatikia: " + zat5.toString() + " ");

        ZatikiHandia zat6 = new ZatikiHandia(13, 2);
        System.out.println("Seigarren zatikia: " + zat6 + " ");

    }
}
