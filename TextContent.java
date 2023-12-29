
/**
 * Class TextContent inherits from the Content class. Introduces instance variable shrTextLength to hold the length of the text of the content  
 *
 * @author (Fayiz Khan)
 * @version (Friday, October 20, 2023)
 */

public class TextContent extends Content 
{
    //instance variable of type short to store the length of the text 
    //chose short as a char limit of roughly 37,0000 is more than reasonable 
    private short shrTextLength; 
    
    //constructor to initialize values 
    //shrTextLength is equal to the length of strContent 
    public TextContent (int intContentId, String strContent)
    {
    
        super(intContentId,strContent); 
        
        //cast to a short for proper conversion
        this.shrTextLength = (short) strContent.length(); 
        
    }
    
    //getter to return the value of the length
    public short getLength ()
    
    {
        
        return shrTextLength; 
        
    }
    
}
