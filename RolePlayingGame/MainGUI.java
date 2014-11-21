package RolePlayingGame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MainGUI extends JFrame{
    /**
     * GUI - komponenter
     */
    private Dimension dimFrame, dimButton, dimTxf;
   
    private JMenuBar menu;
    private JMenu archive;
    private JMenuItem terminate;
    private JLabel lblCreateCharacter, lblFinalCharacter;
    private JButton btnConfirm, btnHuman, btnElf, btnWarrior, btnArcher, btnAttack;
    private JTextArea txaName, txaConsole;
    private JPanel pCreateCharacter, pPlayGame;
    private JTabbedPane jtp;
    
    private Modelclass model;

   
    /**
     * Modellvariabler
     */
    public MainGUI(){
        /**
         * fönstrets storlek
         */
        
        this.dimFrame = new Dimension(700, 700);
        this.dimButton = new Dimension(350,700);
        this.dimTxf = new Dimension(70, 50);
        this.initGIU();
        this.setSize(dimFrame);
        this.setResizable(false);
        /**
         * Stiff characters
         */
        
        
    }
    
    private void initGIU(){
        
        this.setTitle("RolePlayingGame");
        
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        /*
         * Skapar menyerna
         */
        model = new Modelclass();
        
        this.menu = new JMenuBar();
        this.archive = new JMenu("Arkiv");
        this.terminate = new JMenuItem("Avsluta programmet");
        
        this.setJMenuBar( menu );
        this.menu.add( archive );
        this.archive.add( terminate );
        
        this.terminate.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                System.exit( 0 );
            }
        });
        /**
         * Tabs for the game
         */
        this.jtp = new JTabbedPane();
        this.add(jtp);
        
        this.pCreateCharacter = new JPanel();
        this.pPlayGame = new JPanel();
        
        this.jtp.addTab("Create Character", pCreateCharacter);
        this.jtp.addTab("Play Game", pPlayGame);
        /**
         * Play game - output file
         * Attack butotn
         */
        this.txaConsole = new JTextArea((int)dimButton.getWidth(), 300);
        this.txaConsole.setEditable(false);
        txaConsole.append("\t\t\t******Welcome to the Game******" + "\n");
        
        this.btnAttack = new JButton("Attack");
        this.btnAttack.addActionListener( new ActionListener() {
           @Override
           public void actionPerformed( ActionEvent e){
               
                String cmbt = String.valueOf(model.combat() + "\n");
                txaConsole.append(cmbt);
                
           }
        });
        this.pPlayGame.setLayout(null);
        this.pPlayGame.add(txaConsole);
        this.txaConsole.setBounds(0, 0, 700, 500);
        this.pPlayGame.add(btnAttack);
        this.btnAttack.setBounds(0,500, (int)dimButton.getWidth()*2, 120);

        /**
         * Character - functions
         * buttons
         */
        this.btnElf = new JButton("Elf");
        this.btnElf.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
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
                pCreateCharacter.remove(btnElf);
                pCreateCharacter.remove(btnHuman);
                pCreateCharacter.add(btnWarrior);
                pCreateCharacter.add(btnArcher);
                model.addPlayer(new Human());
            }
        });
        /*
        Setting specific class attributes
        */
        
        this.btnWarrior = new JButton("Warrior");
        this.btnWarrior.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){ 
                
                model.setClass(1);
                
            }
        });
        /*
        Setting specific class attributes
        */
        this.btnArcher = new JButton("Archer");           
        this.btnArcher.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
                
                model.setClass(2);
            }
            
        });
        this.lblCreateCharacter = new JLabel("Create Character");
        
        this.pCreateCharacter.setLayout(null);
        this.pCreateCharacter.add(lblCreateCharacter);
        this.btnElf.setBounds(0, 0, (int)dimButton.getWidth(), (int)dimButton.getHeight());
        this.pCreateCharacter.add(btnElf);
        this.btnHuman.setBounds(350, 0, (int)dimButton.getWidth(), (int)dimButton.getHeight());
        this.pCreateCharacter.add(btnHuman);
        this.btnWarrior.setBounds(0, 0, (int)dimButton.getWidth(), (int)dimButton.getHeight());
        this.btnArcher.setBounds(350, 0, (int)dimButton.getWidth(), (int)dimButton.getHeight());
        /**
         * Play Game - functions
         */
    }
    
    
      public static void main(String[] args) {
       java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }   
       });
       
    }
}


