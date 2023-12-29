
/**
 * Class Content is used to represent the content on the platform.
 * Attributes such as contentId, content and timestamp
 * Getters and setters to retrieve and modify the values of the private variables 
 
 *
 * @author (Fayiz Khan)
 * @version (Friday, October 20, 2023)
 */

//importing Date library to be able to create an object of type Date to then store the timestamp of when the user made their account
import java.util.Date; 

public class Content
{
    //private instance variable of type short to score ContentId
    private int intContentId; 
    //private instance variable of type String to store the content 
    private String strContent; 
    //private instance variable of type String to store the date of the Content 
    private String strTimestamp;     

    //constructor to initialize the values of the instance variables
    public Content(int intContentId, String strContent) {
        this.intContentId = intContentId;
        this.strContent = strContent;

        //Initializing strTimestamp based on the current date and time
        this.strTimestamp = new Date().toString();

    }

    //getter to return the value of shrContentId
    public int getContentId ()

    {

        return this.intContentId; 

    }

    //getter to return the value of strContent
    //this method will be called to get the String of the Content instance
    public String getContent()

    {

        return this.strContent;

    }

    //getter to return the value of strTimestamp 
    public String getTimestamp ()

    {
        return this.strTimestamp; 

    }


    //setter to change the value of strContent 
    public void setContent (String strContent)

    {

        this.strContent = strContent; 

    }
}
