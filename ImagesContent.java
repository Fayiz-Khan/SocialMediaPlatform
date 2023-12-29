
/**
 * Class ImagesContent inherits from the content class. Introduces instance variables of strImageType of type String to store image type
 * if type of content is an image 
 *
 * @author (Fayiz Khan)
 * @version (Friday, October 20, 2023)
 */
public class ImagesContent extends Content
{
    //instance variable of type String to hold the image type 
    String strImageType; 
    
    //constructor to initialize the value of the instance variables. Initializing the variables of the superclass as well
    public ImagesContent (int intContentId, String strContent, String strImageContent)
    {
    
        super(intContentId,strContent); 
        
        
        this.strImageType = strImageType; 
        
    }
    
    //getter to return the value of the image type 
    public String getImageType ()
    
    {
    
        return this.strImageType;
    
    }
    
    //setter to modify the value of strImageType 
    public void setImageType (String strImageType)
    
    {
        this.strImageType = strImageType; 
    
    }
}
