
package RolePlayingGame;

import java.util.Random;

/**
 *
 * @author 96kennys
 */
public class Boss extends Player{
    
    Random rdm = new Random();
    
    protected int attack = rdm.nextInt(10) + 1;
    protected int health = rdm.nextInt(10) + 1;
    
    
    public Boss(){
        
    }
 
    public int getHealth(){
        
        return health;
        
    }
    
    public int getAttack(){
        
        return attack;
        
    }
    @Override
    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
   }

    @Override
    public void setClass(int pClass) {
        
    }

    @Override
    public String getRace() {
        return "";
    }

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