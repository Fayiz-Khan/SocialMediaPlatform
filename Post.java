
/**
 * Class Post to represent posts made by users.
 * Attributes such as postId, content, timestamp, and an ArrayList to store comments on the post.
 * toString to print comments 

 *
 * @author (Fayiz Khan)
 * @version (Friday, October 20, 2023)
 */
//importing libraries
import java.util.ArrayList;
import java.util.Date;

public class Post {
    //private instance variable of type short to store the PostId
    //int because you can make multiple posts and thus in theory exceed the range of a short 
    private int intPostId;
    //private instance variable of type Content to store the content 
    private Content content;
    //private instance variable of type String to hold the timestamp of the post 
    private String strTimestamp;
    //ArrayList instance variable to store all the comments 
    ArrayList<Comment> comments;

    //initializing the instance variables
    public Post(int postId, Content content)
    {
        this.intPostId = postId;
        this.content = content;

        this.strTimestamp = new Date().toString();

        this.comments = new ArrayList<>();
    }

    //getter to return the value of the timestamp of the post 
    public String getTimestamp ()

    {
        return this.strTimestamp;
    }
    
    //getter to return the value of the PostId 
    public int getPostId ()

    {
        return this.intPostId; 

    }

    //getter to return the value of Content 
    public Content getContent ()

    {

        return this.content; 
    }

    //toString method to output    
    public String toString() {

        //Variable of type String to store the comments. Calling in a method from content to first store the title of the post 
        String strComments = this.content.getContent() + "\n\nComments on this post:\n"; 

        //Storing the comments 
        for (Comment c : comments) 
        {
            ///Adding the comment to the resulting String
            //strComments += c.toString() + "\n"; 
            strComments += c.getContent() + "\n"; 
        }

        //returning the comments of the user 
        return strComments; 
    }

}



