/**
 * Part B MySimpleURLReader
 * @author Hazal Buluş
 * @version 1.0 23.06.2021
 */
import cs1.SimpleURLReader;

public class MySimpleURLReader extends SimpleURLReader {

    //Properties
    String url;

    //Constructor
    public MySimpleURLReader(String url){
        super(url);
        this.url = url;
    }

    /**
	 * This method gets url address of the page
	 * @return String url
	 */
    public String getURL(){
        return url;
    }

    /**
	 * This method gets name of the page
	 * @return String name
	 */
    public String getName(){
    
        String result = "";

        for( int i  = 0;  i < (url.length() - 1); i++)
        {
            if(url.charAt(i) == '/')
            {
                result = url.substring(i + 1, url.length());
            }
        }
        return result;
    }

    /**
	 * This method gets the number of external css files in html page
	 * @return number of css links
	 */
    public int getNumberOfCSSLinks(){
        
        int i = 0;
        int j = 0;
        int counter = 0;
        
        while(i != (this.getPageContents().length() - 1) || j != (this.getPageContents().length() - 1)){
            
            while(this.getPageContents().charAt(i) != '<' && i != (this.getPageContents().length() - 1))
                i++;
            
            while(this.getPageContents().charAt(j) != '>' && j != (this.getPageContents().length() - 1))
                j++;    
                
            if(i == (this.getPageContents().length() - 1) || j == (this.getPageContents().length() - 1))
                break;
                
            if(this.getPageContents().substring(i, j).contains(".css"))
                counter++;
                
            i++;
            j++;
        }
        return counter;
    }
    

    public static void main(String[] args) {
        MySimpleURLReader simpleURLReader = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");

        System.out.println("Name of the web site: " + simpleURLReader.getName());
        System.out.println("URL of the webiste: " + simpleURLReader.getURL());
        System.out.println("Number of CSS links: " + simpleURLReader.getNumberOfCSSLinks());
    
    }
   
}


