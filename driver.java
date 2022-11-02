/*
 * driver.java, ChattyFrame.java, MessageDisperser.java
 * 
 * Carson Holland
 * October 2022
 * 
 * A simple Java program that uses a JFrame implementing class
 * to simulate a Group converstation with multiple GUI's.
 * 
 * Supports arbitrary number of frames.
 */
import  java.util.Scanner;

public class driver
{
    public static void main(String[] args)
    {
        //Getting the number of Chatty Frames
        System.out.println("Please enter the number of Chatty Frames to instansiate");
        Scanner integerScan = new Scanner(System.in);
        int numOfFrames = integerScan.nextInt();
        integerScan.close();
        
        //Create the list of Frames
        ChattyFrame[] listOfChattyFrames = new ChattyFrame[numOfFrames];
        
        //Creating the List of Chatty Frames
        for(int i = 0; i < numOfFrames; i++)
        {
            listOfChattyFrames[i] = new ChattyFrame(Character.toString('A'+ i)); 
        }


        MessageDisperser messageDisperser = new MessageDisperser(listOfChattyFrames, numOfFrames);

        for(int i = 0; i < numOfFrames; i++)
        {
            listOfChattyFrames[i].setMessageDisperser(messageDisperser);
        }
          

    }//Main End
}//Driver End