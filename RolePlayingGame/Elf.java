package RolePlayingGame;

public class Elf extends Player implements Comparable{
    
    protected Boss b;
    
    public Elf(){
  
 }  
    @Override
    public void setClass(int pClass){
        /*
        One is allways the number one, the strongest one
        */
        if(pClass == 2){
            
            this.attack = 2;
            this.health = 6;
            
        }
        if(pClass == 1){
            
            this.attack = 1;
            this.attack = 12;
        }
    }
    //added
    @Override
    public void setHealth(int health){
        this.health = health;
    }
    //added
    
    @Override
    public void setAttack(int attack){
        this.attack = attack;
    }
    @Override
    public String getRace(){
        
        return "Elf";
        
    } 
    
    @Override
    public int compareTo(Player p){
      return 0;
    }

}
