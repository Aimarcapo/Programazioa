public abstract class Usuarios {
    private int mensajeEnteros;
    private String correo;
    private String nick;
    private int papelera;
    

    public Usuarios(int mensajeEnteros, String correo, String nick, int papelera) {
        this.mensajeEnteros = mensajeEnteros;
        this.correo = correo;
        this.nick = nick;
        this.papelera = papelera;
    }

    public int getMensajeEnteros() {
        return mensajeEnteros;
    }

    public void setMensajeEnteros(int mensajeEnteros) {
        this.mensajeEnteros = mensajeEnteros;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void incrementa() {
        this.mensajeEnteros = mensajeEnteros + 1;
    }

    public void decrementa() {
        this.mensajeEnteros = mensajeEnteros - 1;
    }
    public void papeleraInc(){
    this.papelera=papelera+1;
    this.mensajeEnteros=mensajeEnteros-1;
    }
    public void modificaCorreo(String nuevo) {
        correo = nuevo;
    }

    public int getPapelera() {
        return papelera;
    }

    public void setPapelera(int papelera) {
        this.papelera = papelera;
    }

    public abstract void quienSoy();

}
