/**
 * @author Kent Nystedt
 */
package RolePlayingGame;

//Adds methods and the components from the class Player.
public class Elf extends Player{
    
    public Elf(){
  
    }
    /** Sets the class to pClass.
     * @param pClass set the class to 1 or 2, which will vary how much health and
     * attack the player has.
     */
    @Override
    public void setClass(int pClass){
        
        if(pClass == 2){
            
            this.attack = 2;
            this.health = 6;
            
        }
        if(pClass == 1){
            
            this.attack = 1;
            this.health = 12;
        }
    }
    /**
     * Sets the health to the player.
     * @param health can be set to any integer.
     */
    @Override
    public void setHealth(int health){
        this.health = health;
    }
    /**
     * Sets the attack to the player.
     * @param attack can be set to any integer.
     */
    @Override
    public void setAttack(int attack){
        this.attack = attack;
    }
    /**
     * A method previously used during the development stage which returns
     * which race the player has chosen.
     * @return a string which contains "Elf".
     */
    @Override
    public String getRace(){
        
        return "Elf";
        
    } 
    /**
     * This method is empty but is needed because it's implemented in player.
     * @param p  The player you wish to compareTo.
     * @return 0
     */
    @Override
    public int compareTo(Player p){   
      return 0;
    }

}
