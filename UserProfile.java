
/**
 * Class UserProfile is used to represent users on the platform.
 * Include attributes such as userId, username, email, dateJoined, and an ArrayList to store the user's posts.
 * Getters and setters to retrieve and modify the value of the private variables 
 * Date variable to store timestamp of when the user made their account
 * toString to print the contents 
 *
 * @author (Fayiz Khan)
 * @version (Friday, October 20, 2023)
 */

//importing ArrayList Library to be able to create an ArrayList of type Post to store user posts 
import java.util.ArrayList; 
//importing Date library to be able to create an object of type Date to then store the timestamp of when the user made their account
import java.util.Date; 

public class UserProfile
{
    //private instance variable of type short to store UserId. I chose to make it a short as this social media is in beta and there aren't 
    //that many users but the amount of users may exceed that of a byte 
    private short shrUserId;
    //private instance variable of type String to store the Username of the user 
    private String strUsername;
    //private instance variable of type String to store the email of the user 
    private String strEmail;
    //instance variable that is an ArrayList of type Post that will store all the posts of a given user 
    ArrayList<Post> userPosts;
    //private instance variable of type String to store the date the user joined the social media 
    private String strDateJoined;

    //constructor to initialize the values of the instance variables 
    public UserProfile(short id, String u, String e)
    {
        this.shrUserId = id;
        this.strUsername = u; 
        this.strEmail = e;
        this.userPosts = new ArrayList<>();

        //initializing the value of strDateJoined and converting the Date into text by calling it's toString
        //assigning that value to strDateJoined
        this.strDateJoined = new Date().toString();

    }

    //Getter to return the value of strUsername
    public String getUsername ()
    {
        return this.strUsername; 
    }

    //Getter to return the value of shrUserID
    public short getUserId ()
    {
        return this.shrUserId; 
    }

    //Getter to return the value of strEmail
    public String getEmail ()

    {
        return this.strEmail; 
    }

    //Getter to return the value of strDateJoined
    public String getDateJoined ()
    {
        return this.strDateJoined; 
    }

    //setter to change the value of strEmail
    public void setEmail (String strEmail)

    {
        this.strEmail = strEmail; 
    }

    //setter to change the value of strUsername
    public void setUserName (String strUsername)

    {
        this.strUsername = strUsername; 
    }

    //toString to print the contents 
    public String toString()
    {
        //Stores the posts by the user
        String strResult = "Posts by " + this.strUsername + ":\n"; 

        //Adds the post content, as well as all the comments on that specific post
        //this way everything functions more like a regular social media app where the comments are under THAT specific post 
        for (Post p : userPosts)
        {
            strResult += p.toString() + "\n"; 
        }

        //Returning the resulting String
        return strResult; 
    }
}