package RolePlayingGame;

public class  Human extends Player implements Comparable{
    
    protected Boss b;
    
    public Human(){
        
    }
    
    @Override
    public void setClass(int pClass){
        /*
        One is allways the number one, the strongest one
        */
        if(pClass == 1){
            
            this.attack = 2;
            this.health = 6;
            
        }
        if(pClass == 2){
            
            this.attack = 1;
            this.health = 12;
            
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
        
        return "Human";
        
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
