
package RolePlayingGame;

/**
 *
 * @author 96kennys
 */
public abstract class Boss {
    
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
    public abstract void setAttack(int attack);
    //added
    public abstract void setHealth(int health);
}