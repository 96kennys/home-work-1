/**
 * @author © Kent Nystedt Björknäsgymansiet TE12
 */
package RolePlayingGame;

public class  Modelclass {

  //Components that interacts off-screen that're displayed in the console(txaConsole).
    private int pResult, bResult, i;
    private Player p;
    private Boss b;
    
    public Modelclass(){
        //Creates the boss and iterator "i".    
        this.b = new Boss();
        this.i = 1;
        
    }
    
    /**
     * This method is the fight between the boss and the player
     * @return a string with results from the combat
     */
    public String combat(){        
      /*
        I use the iterator "i" to determine if a the player has created a class,
        then I increase "i" with 1. If the player has no attack, which means
        he hasn't chosen a class, i'm prompting the player to select a class then resets
        the iterator "i" to 1.
      */
        if(this.i == 1){
        
            this.i += 1;        
            
            if(p.getAttack() == 0){
                this.i = 1;
                return "\t\t\t***You didn't select a class!***";
            }
            
            return String.valueOf("The boss's starting hp: " + b.getHealth() 
                    + " || " + "The boss's attack: " + b.getAttack()
                    + "\t\t\t" + "Your starting hp: " + p.getHealth() + " || " 
                    + "Your total attack: " + p.getAttack() );
            
        }
        /*
        The result of the interaction between the player and boss.
        */
        
        pResult = p.getHealth() - b.getAttack();
        bResult = b.getHealth() - p.getAttack();
        /*
        If the players are alive set their current hp to the result from the combat
        and return the results from the combat.
        */        
        if(p.getHealth() > 0 && b.getHealth() > 0){          
            
            p.setHealth(pResult);
            b.setHealth(bResult);            
            
        return String.valueOf("The boss's hp: " + bResult + " || From your: "
                + p.getAttack() + " [dmg] attack. \t\t\t" + "Your hp: " + pResult 
                + " || From boss's: " + b.getAttack() + " [dmg] attack.");
        
        }
        //The boss died, return "you win".
        if( b.compareTo(p) == 1 ){
            return "\t\t\t*******The Boss Died*******" + "\n \t\t\t *******YOU WON******";
        }
        //You died, return "you lose".    
        else if( b.compareTo(p) == 0 ){
            return "\t\t\t*******You Died*******" + "\n \t\t\t ******YOU LOSE******";
        }
        /*
        If the method runs this return it means that the program was run without
        intializing the player or the boss, this error will RARELY occur because
        I already adressed the user to set a class if they didn't choose any.
        */
        return "ERROR 404";
  
    }
    /**
     * This method makes the game unplayable if the player or the boss died.
     * @return 0 and 1.
     */
    public int runnable(){
        if(b.compareTo(p) == 1|| b.compareTo(p) == 0){
            return 0;
        }
        return 1;
    }
    /**
     * Adds the player so to either a Human or and Elf.
     * @param p can be set to human or elf.
     */
    public void addPlayer(Player p){
        
        this.p = p;
        
    }
    /**
     * Sets the class of the player(which already chose a race).
     * @param x can be declared 1 or 2.
     */
    public void setClass(int x){
        
            p.setClass(x);
            
        } 
    }

