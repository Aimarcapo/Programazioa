public class Probatxoa {
    public static void main(String[] args) {
        char letraBat="E23-01".charAt(0);
        char[]arrayBat={'E','2','3','-','0','1'};
        String strKodea="E23-02";
        char [] kodea=new char[strKodea.length()];
        String []kodeaStringetanZatitua=strKodea.split("-");
        for(int i=0;i<strKodea.length();i++){
            kodea[i]=strKodea.charAt(i);
        }
        char[]kodea2;
        kodea2=strKodea.toCharArray();
        System.out.println();
    }
}
