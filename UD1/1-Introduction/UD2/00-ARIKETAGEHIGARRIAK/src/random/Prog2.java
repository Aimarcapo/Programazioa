package random;

public class Prog2 {
    public static void main(String[]args){
        
    String[]jokalariak={"messi","cristiano","benzema","Mcguire","Iker Fasillas"};

    int rand = (int)(Math.random()*jokalariak.length);
   
    System.out.println("Jokalari aukeratua "+jokalariak[rand]+" izan da");
}
}
