
package RolePlayingGame;

/**
 *
 * @author 96kennys
 */
public class Boss extends Player{
    
    protected int attack = 3;
    protected int health = 10;
    
    
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
        
        int playerHealth = this.getHealth();
        int enemyHealth = p.getHealth();
        
        final int MORE = 1;
        final int EQUAL = 0;        
        final int LESS = -1;
        
        if(playerHealth < enemyHealth){
            return LESS;
        }
        
        if(playerHealth > enemyHealth){
            return MORE;
        }
        
        if(playerHealth == enemyHealth){
            return EQUAL;
        }
        return 2;
    }


}