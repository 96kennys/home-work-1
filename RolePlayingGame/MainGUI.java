/**
 * @author Kent Nystedt
 */
package RolePlayingGame;
//Importing the necessary components to be used in the GUI.
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MainGUI extends JFrame{
    /**
     * GUI - naming the components used in the GUI.
     */
    private Dimension dimFrame, dimButton;
   
    private JMenuBar menu;
    private JMenu archive;
    private JMenuItem terminate;;
    private JButton btnConfirm, btnHuman, btnElf, btnWarrior, btnArcher, btnAttack;
    private JTextArea txaName, txaConsole;
    private JPanel pCreateCharacter, pPlayGame;
    private JTabbedPane jtp;
    
    private Modelclass model;

   
    /**
     * Model variables
     */
    public MainGUI(){
        /*
        Creating dimensions for the buttons and the frame/display.
        */
        this.dimFrame = new Dimension(700, 700);
        this.dimButton = new Dimension(350,700);
        //Inserts the components in MainGUI from initGUI.
        this.initGUI();
        //Sets the size of the display.
        this.setSize(dimFrame);
        //Makes the display unreziable.
        this.setResizable(false);
        //Initalizing the model class with the new "model".
        this.model = new Modelclass();
        
    }
    
    private void initGUI(){
        
        this.setTitle("RolePlayingGame");
        
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        /*
         * Creates the menu
         */
          
        this.menu = new JMenuBar();
        this.archive = new JMenu("Arkiv");
        this.terminate = new JMenuItem("Avsluta programmet");
        
        //Adds a menu.
        this.setJMenuBar( menu );
        //In the menu a archive is added.
        this.menu.add( archive );
        //In archive a terminate is added.
        this.archive.add( terminate );
        
        this.terminate.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                System.exit( 0 );
            }
        });
        /*
         * Tabs for the game are initialized.
         */
        this.jtp = new JTabbedPane();
        this.add(jtp);
        
        this.pCreateCharacter = new JPanel();
        this.pPlayGame = new JPanel();
        
        /*
        The tabs are added onto the JTabbedPane.
        */
        this.jtp.addTab("Create Character", pCreateCharacter);
        this.jtp.addTab("Play Game", pPlayGame);
        /************************Play game - tab*****************************/
        /*
        Console(txaConsole) is initialized with a dimension and set to uneditable       
         */
        this.txaConsole = new JTextArea((int)dimButton.getWidth(), 300);
        this.txaConsole.setEditable(false);
        txaConsole.append("\t\t\t******Welcome to the Game******" + "\n");
        
        /*
        The component button btnAttack is initialized and added an actionlistener.
        */
        this.btnAttack = new JButton("Attack");
        this.btnAttack.addActionListener( new ActionListener() {
           //Everytime the button is pressed this occurs:
           @Override
           public void actionPerformed( ActionEvent e){
               //The combat occurs and is set written to the console(txaConsole).
                String cmbt = String.valueOf(model.combat() + "\n");
                txaConsole.append(cmbt);
                /*
                If the player has died or hasn't selected a class I make the
                buttons unpressable and they're prompted to restart the game.
                */
                if(model.runnable() == 0 ){
                    btnAttack.setEnabled(false);
                    btnElf.setEnabled(false);
                    btnHuman.setEnabled(false);
                    cmbt = String.valueOf(model.combat() + "\n");
                    txaConsole.append(cmbt);
                }
                
           }
        });
        /*
        I add the components and organize everything in the tab Play Game with
        the method setBounds. In order to use the method set bounds i need to 
        set the layout to null. Set bounds is a method which but the component 
        at the (x-cordinate(pixels),y-cordinate(pixels),x-size(pixels),y-size(pixels).
        */
        this.pPlayGame.setLayout(null);
        this.pPlayGame.add(txaConsole);
        this.txaConsole.setBounds(0, 0, 700, 500);
        this.pPlayGame.add(btnAttack);
        this.btnAttack.setBounds(0,500, (int)dimButton.getWidth()*2, 120);
        
        /**********************Create Characyer - tab***************************/
        /*
        Intializing the components, in this case a button and add an actionlistener.
        */
        this.btnElf = new JButton("Elf");
        this.btnElf.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                /*
                When btnElf is pressed it removes the buttons previously on the screen
                and allows the player to choose a class and then makes the player an Elf.
                */
                pCreateCharacter.remove(btnElf);
                pCreateCharacter.remove(btnHuman);
                pCreateCharacter.add(btnWarrior);
                pCreateCharacter.add(btnArcher);
                model.addPlayer(new Elf());
            }
        });               
        this.btnHuman = new JButton("Human");
        this.btnHuman.addActionListener( new ActionListener(){           
            @Override
            public void actionPerformed( ActionEvent e ){
                /*
                When btnHuman is pressed it removes the buttons previously on the screen
                and allways the player to choose a class and then makes the player an Human.
                */
                pCreateCharacter.remove(btnElf);
                pCreateCharacter.remove(btnHuman);
                pCreateCharacter.add(btnWarrior);
                pCreateCharacter.add(btnArcher);
                model.addPlayer(new Human());
            }
        });

        this.btnWarrior = new JButton("Warrior");
        this.btnWarrior.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){ 
                /*
                When button warrior is pressed the class is set to 1 which will
                give the player(depending on race) health and attack.
                */
                model.setClass(1);
                
            }
        });

        this.btnArcher = new JButton("Archer");           
        this.btnArcher.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){              
                /*
                When button warrior is pressed the class is set to 1 which will
                give the player(depending on race) health and attack.
                */
                model.setClass(2);
            }
            
        });
        /*
        I add the components and organize everything in the tab Create Character with
        the method setBounds. In order to use the method set bounds i need to 
        set the layout to null. Set bounds is a method which but the component 
        at the (x-cordinate(pixels),y-cordinate(pixels),x-size(pixels),y-size(pixels).
        */
        this.pCreateCharacter.setLayout(null);
        this.btnElf.setBounds(0, 0, (int)dimButton.getWidth(), (int)dimButton.getHeight());
        this.pCreateCharacter.add(btnElf);
        this.btnHuman.setBounds(350, 0, (int)dimButton.getWidth(), (int)dimButton.getHeight());
        this.pCreateCharacter.add(btnHuman);
        this.btnWarrior.setBounds(0, 0, (int)dimButton.getWidth(), (int)dimButton.getHeight());
        this.btnArcher.setBounds(350, 0, (int)dimButton.getWidth(), (int)dimButton.getHeight());
    }
    
      //This code part is to make the MainGUI runnable.
      public static void main(String[] args) {
       java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }   
       });
       
    }
}


