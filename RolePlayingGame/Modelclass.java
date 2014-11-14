package RolePlayingGame;

public class  Modelclass{

//Public metod skickar härifrån till GUI:et
//"Allting händer här"
    private int pResult, bResult;
    private Player p;
    private Boss b;
    
    public Modelclass(){
        
        this.b = new Boss();
        
    }
    public String combat(){
        
        pResult = p.getHealth();
        bResult = b.getHealth();
        
        while(pResult > 0 && bResult > 0){          
            
            pResult -= b.getAttack();
            bResult -= p.getAttack();
            
        }
        return "winner";
    }
        
    public void addPlayer(Player p){
        
        this.p = p;
        
    }
    public void setClass(int x){
        
            p.setClass(x);
            
        } 
    }

