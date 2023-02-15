public class Moderadores extends Usuarios {

    public Moderadores(int mensajeEnteros, String correo, String nick, int papelera) {
        super(mensajeEnteros, correo, nick, papelera);
    }

    
    @Override
    public void  quienSoy(){
        System.out.println("Soy Moderador");
    } 
    
}
