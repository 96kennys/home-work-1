package RolePlayingGame;

public class  Modelclass {

//Public metod skickar härifrån till GUI:et
//"Allting händer här"
    private int pResult, bResult, i;
    private Player p;
    private Boss b;
    
    public Modelclass(){
        
        this.b = new Boss();
        this.i = 1;
        
    }
    /*
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
  
    }*/
    
    public String combat(){        
        
        if(this.i == 1){
        
            this.i += 1;        
            
            return String.valueOf("The boss's starting hp: " + b.getHealth() 
                    + " || " + "The boss's attack: " + b.getAttack()
                    + "\t\t\t" + "Your starting hp: " + p.getHealth() + " || " 
                    + "Your total attack: " + p.getAttack() );
            
        }
        
        pResult = p.getHealth() - b.getAttack();
        bResult = b.getHealth() - p.getAttack();
                
        if(p.getHealth() > 0 && b.getHealth() > 0){          
            
            p.setHealth(pResult);
            b.setHealth(bResult);            
        
        return String.valueOf("The boss's hp: " + bResult + " || From your: "
                + p.getAttack() + " [dmg] attack. \t\t\t" + "Your hp: " + pResult 
                + " || From boss's: " + p.getAttack() + " [dmg] attack.");
        
        }
 
        if( b.compareTo(p) == 1 ){
            return "\t\t\t*******The Boss Died*******" + "\n \t\t\t *******YOU WON******";
        }
            
        else if( b.compareTo(p) == 0 ){
            return "\t\t\t*******You Died*******" + "\n \t\t\t ******YOU LOST******";
        }
        
        return "You didn't select a class";
  
    }
    
    public void addPlayer(Player p){
        
        this.p = p;
        
    }
    public void setClass(int x){
        
            p.setClass(x);
            
        } 
    }

