/**
 * @author © Kent Nystedt Björknäsgymansiet TE12
 */
package RolePlayingGame;

//Implements comparable => implementing a interface.
public abstract class  Player implements Comparable{
    //components used in Player.
    protected int race;
    protected int pClass;
    protected int attack;
    protected int health;
    
    public Player(){
    
    }
    /**
     * Sets the class strong or weak
     * @param pClass can be declared 1 or 2.
     */
    public abstract void setClass(int pClass);
    
     /**
     * Sets attack of a player.
     * @param attack can be any type of Integer.
     */
    public abstract void setAttack(int attack);
    /**
     * Sets the health of a player.
     * @param health can be any type of integer.
     */
    public abstract void setHealth(int health);
    
    /**
     * Gets the attack of the player.
     * @return attack;
     */
    public int getAttack(){
        return attack;
    }
    /**
     * Gets the Health of the player.
     * @return health;
     */
    public int getHealth(){
        return health;
    }
    
    /**
     * A method previously used during the development stage which returns
     * which race the player has chosen.
     * @return the race the player has chosen
     */
    public abstract String getRace();
}