/**
 * Part D HTMLFileReader
 * @author Hazal Buluş
 * @version 1.0 23.06.2021
 */
public class HTMLFilteredReader extends MySimpleURLReader {


	//Constructor
    public HTMLFilteredReader(String url) {
        super(url);
    }

    
	/**
	 * This method gets filetered content of the HTML page. There are not any HTML <> sign in output 
	 * @return Filtered content
     */
	 
	@Override
	public String getPageContents(){
        
        String result;
        boolean go ;
        go = true;
        
        result = "";
        
        int i = 0;
        int j = 0;
        
        while(this.getUnfilteredPageContents().charAt(i) != '<')
        {
            i++;
		}    
        result= this.getUnfilteredPageContents().substring(0, i);
        i++;
            
        while(i < this.getUnfilteredPageContents().lastIndexOf('>'))
        {
        
            if(j < this.getUnfilteredPageContents().length() - 1)
            {
                while(this.getUnfilteredPageContents().charAt(j) != '>'&& go)
                {
                    j++; 

                    if(j >= (this.getUnfilteredPageContents().length() - 1)){
                        go = false;
                    }
                }
            }
            
            if(i < this.getUnfilteredPageContents().length() - 1){

                while(this.getUnfilteredPageContents().charAt(i) != '<' && go ){
                    i++;

                    if(i >= (this.getUnfilteredPageContents().length() - 1)){
                        go = false;
                    }
                }
            }
            
            if(i < this.getUnfilteredPageContents().length() && j < this.getUnfilteredPageContents().length()){
                result += this.getUnfilteredPageContents().substring((j + 1), i);
            }
                
            i++;
            j++;
        }
        
        return result;
    }

	/**
	 * This method gets  content of the HTML page.  
	 * @return Unfiltered content
	 */
    public String getUnfilteredPageContents(){
        return super.getPageContents();
    }

	//Main method for test
    public static void main(String[] args) {
        HTMLFilteredReader htmlReader = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");

        //System.out.println( "unfiltered Page content: " + htmlReader.getUnfilteredPageContents());
        System.out.println( "Page content: " + htmlReader.getPageContents());
    }
}
