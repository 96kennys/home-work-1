package RolePlayingGame;

public class  Modelclass {

//Public metod skickar härifrån till GUI:et
//"Allting händer här"
    private int pResult, bResult;
    private Player p;
    private Boss b;
    
    public Modelclass(){
        
        this.b = new Boss();
        
    }
    public String combat(){
        
        pResult = p.getHealth() - b.getAttack();
        bResult = b.getHealth() - p.getAttack();
        
        if(p.getHealth() > 0 && b.getHealth() > 0){          
            
            p.setHealth(pResult);
            b.setHealth(bResult);            
        
        return String.valueOf("Your opponents hp: " + bResult + "\n"
        + "Your hp: " + pResult);
        
        }
 
        if( b.getHealth() == 0 ){
            return "*******The Boss Died*******";
        }
            
        else if( p.getHealth() == 0){
            return "*******You Died*******";
        }
            
        return "a";
  
    }
        
    public void addPlayer(Player p){
        
        this.p = p;
        
    }
    public void setClass(int x){
        
            p.setClass(x);
            
        } 
    }

