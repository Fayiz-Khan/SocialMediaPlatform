
/**
 * This class is the main which ties all the other clases together 
 * Users, posts, and comments are being hardcoded here
 * This class then prints out the users, their posts, and the individual comments on their posts 
 * 
 * 
 * @author (Fayiz Khan)
 * @version (Friday, October 20, 2023)
 */
public class FayizSocialMediaTestClass
{
    public static void main(String[] args)
    
    {
        //Mrs. G's Test Class 
        
        SocialMediaManager socialMediaManager = new SocialMediaManager();

        UserProfile user1 = new UserProfile((short)1, "Jack Skellington", "JackS@example.com");
        UserProfile user2 = new UserProfile((short)2, "Sally", "Sally@example.com");
        UserProfile user3 = new UserProfile((short)3, "Oogie Boogie", "OogieB@example.com");

        Content textContent = new TextContent(1, "The Nightmare before Christmas is the best movie!.");
        Content textContent2 = new TextContent(2, "Best Halloween movie to watch?.");
        Content imageContent = new ImagesContent(3, "The Nightmare before Christmas poster", "jpg");
        Content videoContent = new VideosContent(4, "Click to watch The Nightmare before Christmas Movie", "video_url.mp4");
        Content videoContent2 = new VideosContent(5, "Click to watch Saunders Fright Fest videos", "frightfest.mp4");

        socialMediaManager.createUserProfile(user1);
        socialMediaManager.createUserProfile(user2);
        socialMediaManager.createUserProfile(user3);

        socialMediaManager.createPost(user1, textContent);
        socialMediaManager.createPost(user3, textContent2);
        socialMediaManager.createPost(user2, imageContent);
        socialMediaManager.createPost(user1, videoContent);
        socialMediaManager.createPost(user3, videoContent2);

        socialMediaManager.addComment(user2, socialMediaManager.listPostsByUser(user1).get(0), "Love that Poster!");
        socialMediaManager.addComment(user3, socialMediaManager.listPostsByUser(user1).get(0), "Best Movie to watch. Thanks!");
        socialMediaManager.addComment(user1, socialMediaManager.listPostsByUser(user2).get(0), "Great image! Love that movie");
        socialMediaManager.addComment(user2, socialMediaManager.listPostsByUser(user3).get(0), "Friday the 13th is the best one to watch!");
        socialMediaManager.addComment(user2, socialMediaManager.listPostsByUser(user3).get(0), "The best halloween movie is definitely \"Halloween\"");

        //Moved into the toString()
        //System.out.println("\nPosts by " + user1.getUsername() + ":");
        
        //printing the contents of each user 
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        //Moved into toString() ^
        //System.out.println("\nComments on " + user1.getUsername() + "'s post:");
        
        /* 
         * CODE GOES HERE-------
         * Write the code to output all the comments on User1 post(s)
         */
      
        //System.out.println("\nPosts by " + user2.getUsername() + ":");
        
        /*
         * CODE GOES HERE-------        
         * Write the code to output all the posts by user2
         */
       
        //System.out.println("\nComments on " + user2.getUsername() + "'s post:");
        
        /* 
         * CODE GOES HERE-------
         * Write the code to output all the comments on User2 post(s)
         */
     
        //System.out.println("\nPosts by " + user3.getUsername() + ":");
        
         /*
         * CODE GOES HERE-------
         * Write the code to output all the posts by user3
         */
       
        //System.out.println("\nComments on " + user3.getUsername() + "'s post:");
        
        /* 
         * CODE GOES HERE-------
         * Write the code to output all the comments on User3 post(s)
         */

        
    }
}
