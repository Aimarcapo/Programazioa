public class ZatikiHandia extends Zatikia{

    /** Parametro bi jasotzen ditu konstruktore honek. 
     * Zenbaki bietatik txikiena izango da izendatzailea, beheko balioa.  
     **/
    public ZatikiHandia(int bat,int bi) {
        super(bat,bi);
        if (getGoikoa() < getBehekoa()){
            int aux = getBehekoa();
            setBehekoa(getGoikoa());
            setGoikoa(aux);
        }
    }
    

    /** OSATU EZAZU METODO HAU ZATIKIAREN PARTE OSOA ETA GERATZEN DEN ZATIKIA BEREIZTUZ.
     * Adibidez, 101/20 zatikiaren kasuan metodo honek "5 1/20" String-a itzuliko du.
     * 
     */
    @Override
    public String toString(){
        int fraction=(int) this.getGoikoa()/this.getBehekoa();
        int abs=this.getGoikoa()-(fraction*this.getBehekoa());
        return fraction+" "+abs+"/"+this.getBehekoa();
    }
}
