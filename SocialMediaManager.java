/**
 * Class SocialMediaManager is used to  manage user profiles, posts, and comments.
 * Uses an ArrayList of type UserProfile to store user profiles, posts, and comments.
 * Implements methods for creating user profiles, making posts, adding comments, listing posts by a user, and listing comments on a post.

 * @author (Fayiz Khan)
 * @version (Friday, October 20, 2023)
 */

//importing array list library 
import java.util.ArrayList; 

public class SocialMediaManager
{
    //private static variables of type int to serve as counters 
    //will increment by one to generate a new comment and post id every time a new comment or post is made
    private static int intCommentIdCounter = 1, intPostIdCounter = 1;
    //ArrayList of type UserProfile to store the user profile, that user's posts, and the comments on that post 
    //stored this all in one array list instead of individual ArrayLists for profile, posts, and comment 
    ArrayList<UserProfile> userProfiles;

    //Iniitializing the userProfiles ArrayList in a constructor 
    public SocialMediaManager()
    {    
        this.userProfiles = new ArrayList<>();
    }

    //Method to create a user profile. Passes in variable of type UserProfile as a parameter 
    public void createUserProfile(UserProfile userProfile)
    {
        //adding to the userProfiles array list 
        userProfiles.add(userProfile);
    }    

    //Method to create a post
    //takes in variables of type UserProfile and Content as parameters 
    public void createPost(UserProfile user, Content content)
    {
        //Although values in the test class are hardcoded, in a real social media would have to check whether the user exists hence the .contains
        if (userProfiles.contains(user)) 
        {
            //Generating unique PostId
            Post post = new Post(intPostIdCounter++, content);
            //adding the post to the arraylist in the UserProfile class 
            user.userPosts.add(post);
        } 
    }

    //method to add the comments to the specific post 
    //Parameters of variables types of UserProfile, Post, and String 
    public void addComment(UserProfile user, Post post, String strComment) 
    {
        //once again using the contains method as in a real social media platform this would be useful 
        if (userProfiles.contains(user))
        
        {
            //generating a unique CommentId 
            Comment comment = new Comment(intCommentIdCounter++, user, strComment);
            //adding the comment to the comments array list in the post class 
            post.comments.add(comment);
        }
    }

    //method to print 
    public ArrayList<Post> listPostsByUser(UserProfile user) 
    {
        //Returning the posts of the given user
        return user.userPosts; 
    }
}