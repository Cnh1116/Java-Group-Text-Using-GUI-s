public class MessageDisperser 
{
    private ChattyFrame[] theList;
    private int numOfFrames;
    
    public MessageDisperser(ChattyFrame[] listOfFrames, int number)
    {
        theList = listOfFrames;
        numOfFrames = number;
        System.out.println("The Message Disperser Object has been created");
    }
    
    public void sendMessage(String message, String senderTitle)
    {
        System.out.println("This is the message to send: " + message);
        System.out.println("The sender of this message was: |" + senderTitle+"|");
        
        for(int i = 0; i < numOfFrames; i++)
        {
            System.out.println(theList[i].myTitle);
            System.out.println((theList[i].myTitle) + " is going to receive that message");
            String sender = "From " + senderTitle + ": ";
            theList[i].addLabel(sender + message);
            theList[i].updateFrame();
        }
    }
}
