package RolePlayingGame;

public class Elf extends Player{
    
    public Elf(){
  
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
            this.attack = 12;
        }
    }
    @Override
    public String getRace(){
        
        return "Elf";
        
    } 
}
