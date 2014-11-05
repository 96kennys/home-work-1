package RolePlayingGame;

public class  Human extends Abstractclass{
    
    public Human(){
        
    }
    public int humanArcher(int x){
        
        int strength = attack(x);  
        
        return strength;
    }
    public int humanWarrior(int x){
        
        int strength = attack(x);
        
        return strength;
    }

}
