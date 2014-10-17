package RolePlayingGame;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.JTextField;

public class MainGUI extends JFrame{
    /**
     * GUI - komponenter
     */
    private Dimension dimFrame, dimButton, dimTxf;
   
    private JMenuBar menu;
    private JMenu archive;
    private JMenuItem terminate;
    private JLabel lblCreateCharacter, lblFinalCharacter;
    private JButton btnConfirm, btnHuman, btnElf, btnWarrior, btnArcher;
    private JTextField name;
    private JPanel pCreateCharacter, pPlayGame;
    private JTabbedPane jtp;
   
    /**
     * Modellvariabler
     */
    public MainGUI(){
        /**
         * fönstrets storlek
         */
        this.dimFrame = new Dimension(700, 700);
        this.dimButton = new Dimension(100, 50);
        this.dimTxf = new Dimension(70, 50);
        this.initGIU();
        this.setSize(dimFrame);
        
        
    }
    
    private void initGIU(){
        
        this.setTitle("RolePlayingGame");
        
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        /*
         * Skapar menyerna
         */
        
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
         * Character - functions
         * buttons
         */
        
        this.btnElf = new JButton("Elf");
        this.btnElf.setPreferredSize(dimButton);     
        this.btnElf.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
            }
        });               
        this.btnHuman = new JButton("Human");
        this.btnHuman.setPreferredSize(dimButton);
        this.btnElf.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
            }
        });
        this.btnWarrior = new JButton("Warrior");
        this.btnWarrior.setPreferredSize(dimButton);            
        this.btnWarrior.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
            }
        });
        this.btnArcher = new JButton("Archer");
        this.btnArcher.setPreferredSize(dimButton);            
        this.btnArcher.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e ){
            }
        });
        this.lblCreateCharacter = new JLabel("Create Character");
        
        this.pCreateCharacter.add(lblCreateCharacter);
        this.pCreateCharacter.add(btnElf, BorderLayout.NORTH);
        this.pCreateCharacter.add(btnHuman, BorderLayout.CENTER);
        this.pCreateCharacter.add(btnWarrior, BorderLayout.SOUTH);
        this.pCreateCharacter.add(btnArcher);
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


