/**
 * @author © Kent Nystedt Björknäsgymansiet TE12
 */
package RolePlayingGame;

import java.util.Random;


//Adds methods and the components from the class Player.
public class Boss extends Player{
    //A random genereator which gives random health and attack to the boss.
    Random rdm = new Random();
    //Components used in the boss class.
    protected int attack = rdm.nextInt(10) + 1;
    protected int health = rdm.nextInt(10) + 1;
    
    
    public Boss(){
        
    }
    /**Gets the health of the boss.
     * @return the current health of the boss as an integer.
     */
    public int getHealth(){
        
        return health;
        
    }
    /**
     * Gets the attack of the boss.
     * @return the current attack of the boss as an integer.
     */
    public int getAttack(){
        
        return attack;
        
    }
    /**
     * Sets the attack to the boss.
     * @param attack can be set to any integer, but in this case it's 
     * random generated.
     */
    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    /**
     * Sets the health to the boss.
     * @param health can be set to any an integer, but in this case it's 
     * random generated.
     */
    @Override
    public void setHealth(int health) {
        this.health = health;
    }
    /**
     * An unused method that's extended from player
     * @param pClass sets the class but does not manage it in this case.
     */
    @Override
    public void setClass(int pClass) {
        
    }
     /**
     * A method previously used during the development stage which returns
     * which race the player has chosen.
     * @return a string which contains "Boss".
     */
    @Override
    public String getRace() {
        return "Boss";
    }
    /**
     * Compares an inserted player's(p) hp to the boss's. And return different types
     * of Integers depending if they've been defeated or not.
     * @param p a player
     * @return WIN = 1(The boss died), LOSS = 0(The player died), BUG = -1
     * (someting went incredibly wrong)
     */
   @Override
    public int compareTo(Player p){
        
        int bossHealth = this.getHealth();
        int enemyHealth = p.getHealth();
        
        final int WIN = 1;
        final int LOSS = 0;               
        final int BUG = -1;
        
        if(bossHealth <= 0){
            return WIN;
        }
        
        if(enemyHealth <= 0){
            return LOSS;
        }
        
        return  BUG;
    
    }
}