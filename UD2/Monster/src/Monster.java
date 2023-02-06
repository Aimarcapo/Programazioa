 public abstract class  Monster{
    private String name;
    public Monster(String name){
        this.name=name;
    }
     public abstract String attack(){
        return "!^_&^$@+%$* I don't know how to attack!";
    }
    @Override
     public String toString() {
        return "Monster [name=" + name + "]";
    }
    
}