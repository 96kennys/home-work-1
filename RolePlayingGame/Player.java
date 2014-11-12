package RolePlayingGame;

public abstract class  Player {
    
    protected int race;
    protected int pClass;
    protected int attack;
    protected int health;
    
    public Player(){
    
    }

    public abstract void setClass(int pClass);
        

    public int getpClass() {
        return pClass;
    }
    public abstract String getRace();
}
/*
kommentar
*/