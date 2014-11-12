
package RolePlayingGame;

/**
 *
 * @author 96kennys
 */
public class Boss extends Player{
    
    public Boss(){
        
    }
    
    @Override
    public void setClass(int pClass){
        
        if(pClass == 3){
            
            this.attack = 3;           
            this.health = 6;
    }
  }
    @Override
    public String getRace(){
        
        return "Boss";
        
    } 
}