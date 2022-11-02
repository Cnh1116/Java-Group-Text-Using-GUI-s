import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;
import javax.swing.SwingConstants;

public class ChattyFrame extends JFrame
{
    JFrame jframe = new JFrame(); //Frames are invisible by default, do all logic, then set it visible.
    int numOfMessages;
    public String myTitle;
    MessageDisperser messageSender;

    public ChattyFrame(String title) //With inheritance, still need to create the contructor
    {
        //Jframe Parameters
        super(title);
        myTitle = this.getTitle();
        this.setSize(500, 500);
        this.setLayout(new GridLayout(10, 1)); //10 Rows, 1 Collumn
        
        //Text Field
        JTextField messageBox = new JTextField();
        this.add(messageBox);
        
        //Send Button
        JButton myButton = new JButton();
        myButton.setText("Send Message");
        myButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("THE BUTTON WAS CLICKED");
                System.out.println(messageBox.getText());
                messageSender.sendMessage(messageBox.getText(), myTitle);
            }
        });
        this.add(myButton);

        //jframe logic BEFORE setting it visible
        this.setVisible(true);

        //Message Count for Vertical Allignment
        //numOfMessages = 0;
    }

    public void addLabel(String label)
    {
        JLabel chattyLabel = new JLabel(label);
        chattyLabel.setVerticalAlignment(JLabel.TOP);
        chattyLabel.setHorizontalAlignment(SwingConstants.LEFT);
        //chattyLabel.setVerticalTextPosition(250);
        this.add(chattyLabel);
    }

    public void updateFrame()
    {
        this.setVisible(true);
    }
    
    public void setMessageDisperser(MessageDisperser messageDisperserObject)
    {
        messageSender = messageDisperserObject;
    }
}



