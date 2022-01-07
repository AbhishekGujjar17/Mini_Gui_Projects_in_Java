
/**
 * Write a description of class election here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class election
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    private JButton vote;
    private int votecount; 

    /**
     * Constructor for objects of class election
     */
    public election()
    {
        // initialise instance variables
        votecount = 50;
        makeFrame();
        makeMenu();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void makeFrame()
    {
        // put your code here
        frame = new JFrame("Elections 2021");
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        vote = new JButton("The best party in the world received " + votecount + " votes!");
        vote.addActionListener(e-> incVote());
        contentPane.add(vote,BorderLayout.CENTER);
        
        
        frame.addWindowListener(new WindowAdapter() {
            
            
            public void windowClosing(WindowEvent e){
                
                System.exit(0);
            }
        });
        
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public void makeMenu(){
        
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        JMenu our_menu = new JMenu("Our_Menu");
        menubar.add(our_menu);
        
        JMenuItem exit = new JMenuItem("Exit_Program");
        our_menu.add(exit);
        
        exit.addActionListener(e-> quit());
        
    }
    
    public void quit(){
        
        System.exit(0);
    }
    
    public void incVote(){
        
        votecount+=25;
        vote.setText("The best party in the world received " + votecount + " votes!");
    }
    
    
}
