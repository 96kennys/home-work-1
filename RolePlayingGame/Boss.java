
package RolePlayingGame;

/**
 *
 * @author 96kennys
 */
public class Boss extends Player {
    
    int attack = 3;
    int health = 10;
    
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
}