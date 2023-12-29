
/**
 * Class comment is used to represent the comments on posts. Stores the comment id, who's commenting, what the comment is, and the timestamp of the comments
 *
 * @author (Fayiz Khan)
 * @version (Friday, October 20, 2023)
 */

//importing the date class 
import java.util.Date; 

public class Comment
{
    //private instance variable of type int to store comment id. Although shrUserId in UserProfile is a short, 
    //I believe it was a good decision to make this variable an integer as people can comment more than once. Thus, if 30,0000 users all commented twice
    //comment id would then need to be stored in an int
    private int intCommentId;
    //private instance variable of type UserProfile to to store the commenter's on the posts
    private UserProfile commenter;
    //private instance variable of type String to store the comment 
    private String strContent;
    //private instance variable of Type String to hold the timestamp 
    private String strTimestamp;

    //constructor to initialize the values of the instance variables 
    public Comment(int intCommentId, UserProfile commenter, String strContent) {
        this.intCommentId = intCommentId;
        this.commenter = commenter;
        this.strContent = strContent;
        //assigning strTimestamp to the current date 
        this.strTimestamp = new Date().toString();

    }

    //getter to return the comment 
    public String getContent ()

    {
        //Returning the text of the comment
        return this.strContent; 
    }

    //getter to return the value and see who commented 
    public UserProfile getCommenter ()

    {

        return this.commenter; 
    }

    //getter to return the value of intCommentId
    public int getCommentId ()

    {

        return this.intCommentId; 

    }

    //getter to return the value of strTimestamp to see when the comment was made 
    public String getTimestamp ()

    {
        return this.strTimestamp; 

    }
    
    
    //setter to modify the value of strContent if the commenter chooses to edit their comment 
    public void setContent (String strContent)

    {

        this.strContent = strContent; 

    }
}


