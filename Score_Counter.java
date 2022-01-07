
/**
 * Write a description of class previous here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Score_Counter
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    private JLabel labelmariners;
    private JLabel labelgrowlers;
    private JButton growlers;
    private JButton mariners;
    private int marinersScoreCount;
    private int growlersScoreCount;

    /**
     * Constructor for objects of class previous
     */
    public Score_Counter()
    {
        // initialise instance variables
        marinersScoreCount = 5;
        growlersScoreCount = 5;
        makeFrame();
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public void incScoreCountGrowlers(){
        
        growlersScoreCount+=2;
        labelgrowlers.setText("Growlers: " + growlersScoreCount);
        
    }
    
    public void incScoreCountMariners(){
        
        marinersScoreCount+=2;
        labelmariners.setText("Mariners: " + marinersScoreCount);
    }
    public void makeFrame()
    {
        // put your code here
        
        frame = new JFrame("Growlers vs Mariners");
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        
        growlers = new JButton("Score: Growlers!");
        growlers.addActionListener(e-> incScoreCountGrowlers());
        labelgrowlers = new JLabel("Growlers: " + growlersScoreCount);
        
        mariners = new JButton("Score: Mariners!");
        mariners.addActionListener(e-> incScoreCountMariners());
        labelmariners = new JLabel("Mariners: " + marinersScoreCount);
        
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 0));
        textPanel.add(labelgrowlers);
        textPanel.add(labelmariners);
        
        contentPane.add(growlers,BorderLayout.NORTH);
        contentPane.add(textPanel, BorderLayout.CENTER);
        //contentPane.add(labelmariners, BorderLayout.CENTER);
        contentPane.add(mariners,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        
        
    }
}
