import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;

public class Votes
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    private JLabel labelsam;
    private JLabel labeldon;
    private JButton votesam;
    private JButton votedon;
    private JButton finish;
    private int samvoteCount;
    //private int donvoteCount;

    /**
     * Constructor for objects of class Voting
     */
    public Votes()
    {
        // initialise instance variables
        samvoteCount = 5;
        makeFrame();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    public void incVoteCountSam(){
        
        samvoteCount= (int)Math.pow(samvoteCount,2);
        labelsam.setText("Votes for sam is: "+ samvoteCount);
        /**Container contentPane = frame.getContentPane();
        labelsam = new JLabel("Votes for sam is: "+ samvoteCount);
        contentPane.add(labelsam);**/
        
        
        
         
        
    }
    /**
    public void incVoteCountDon(){
        
        donvoteCount = donvoteCount + 1;
        labeldon.setText("Votes for don is: "+ donvoteCount);
        /**Container contentPane = frame.getContentPane();
        labeldon = new JLabel("Votes for don is: "+ donvoteCount);
        contentPane.add(labeldon);
        
    
        
    }
    public void findWinner(){
        
        
        if (samvoteCount > donvoteCount){
            
            labelsam.setText("Congartulatio! You are winner Sam!, you received "+ samvoteCount + " Votes");
            
        
        }
        
        else if (samvoteCount < donvoteCount){
            
            labeldon.setText("Congartulatio! You are winner Don!, you received "+ donvoteCount + " Votes");
            
            
        }
        
        else{
            labelsam.setText("Tied Votes");
            labeldon.setText("Tied Votes");
            
        }
    }
    **/
    public void makeFrame()
    {
        // put your code here
        frame = new JFrame("Vote Counter");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,700,20));
        
        votesam = new JButton("Vote for sam");
        votesam.addActionListener(e -> incVoteCountSam());
        //votedon = new JButton("Vote for don");
        //votedon.addActionListener(e -> incVoteCountDon());
        
        //finish = new JButton("Finish");
        //finish.addActionListener(e -> findWinner());
        
        labelsam = new JLabel("Votes for sam is: "+ samvoteCount);
        //labeldon = new JLabel("Votes for don is: "+ donvoteCount);
        /**labelsam = new JLabel("Vote for sam");
        labeldon = new JLabel("Vote for don");
        contentPane.add(labelsam,labeldon);**/
        contentPane.add(votesam);
        contentPane.add(labelsam);
        //contentPane.add(votedon);
        //contentPane.add(labeldon);
        //contentPane.add(finish);
        
        
        frame.pack();
        frame.setVisible(true);
    }
    
   
    
    
}