package RolePlayingGame;

public abstract class  Player {
    
    protected int race;
    protected int pClass;
    protected int attack;
    protected int health;
    
    public Player(){
    
    }
    /**
     * Sets the class strong or weak
     * @param pClass can be declared 1(strong) or 2(weak)
     */
    public abstract void setClass(int pClass);
    
    public abstract void setAttack(int attack);
    //added
    public abstract void setHealth(int health);

    public int getAttack(){
        return attack;
    }
    
    public int getHealth(){
        return health;
    }
    
    public abstract String getRace();
}
/*
kommentar
*/