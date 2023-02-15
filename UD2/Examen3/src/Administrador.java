public class Administrador extends Usuarios {
    private int baneos;

    public Administrador(int mensajeEnteros, String correo, String nick, int papelera, int baneos) {
        super(mensajeEnteros, correo, nick, papelera);
        this.baneos = baneos;
    }
    public void baneosInc(){
        this.baneos=baneos+1;
        
    }
    
    @Override
    public void  quienSoy(){
        System.out.println("Soy Administrador y he baneado a: "  + this.baneos + " personas");
    }
}
