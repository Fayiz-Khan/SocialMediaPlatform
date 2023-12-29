
/**
 * Class VideosContent inherits from class Content. This class adds on the strVideoUrl that allows a url to be held if VideoContent is being posted/created
 *
 * @author (Fayiz Khan)
 * @version (Friday, October 20, 2023)
 */
public class VideosContent extends Content
{
    //instance variable of type String to hold the url of a video 
    String strVideoUrl; 
    
    //constructor to initialize the value of the instance variables. Initializing the variables of the superclass as well
    public VideosContent (int intContentId, String strContent, String strVideoUrl)
    {
    
        super(intContentId,strContent); 
        this.strVideoUrl = strVideoUrl; 
        
    }
    
    //getter to return the value of strVideoUrl  
    public String getVideoUrl ()
    
    {
    
        return this.strVideoUrl; 
    
    }
    
    //setter to modify the value of strVideoUrl 
    public void setVideoUrl (String strVideoUrl)
    
    {
        this.strVideoUrl = strVideoUrl; 
    
    }
}
