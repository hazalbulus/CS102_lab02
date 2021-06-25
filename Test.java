import cs1.SimpleURLReader;

/**  
 * test class
 * @author Hazal Buluş
 * @version 1.0 23.06.2021
 * 
 */

public class Test{
  public static void main( String[] args ){
    
    SimpleURLReader urlReader = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt"); 
    MySimpleURLReader mySimpReader = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
    HTMLFilteredReader filteredReader = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
    WordSearch wordSearch = new WordSearch("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
    
    //PART A
    System.out.println( "Page content: " + urlReader.getPageContents() );
    System.out.println("Line count: " + urlReader.getLineCount() );
    
    //PART B
    System.out.println( "URL: " + mySimpReader.getURL() );
    System.out.println( "Name: " + mySimpReader.getName() );
    System.out.println( "Page content: " + mySimpReader.getPageContents() );

    //PART C
    System.out.println( "Number of CSS links: " + mySimpReader.getNumberOfCSSLinks());
    
    //PART D
    System.out.println( "Page contents: " + filteredReader.getPageContents() );
    System.out.println( "Unfiltered page contents: " + filteredReader.getUnfilteredPageContents() );

    //PART E
    System.out.println("Word search Turkey: " +  (wordSearch.search("Turkey")));
    System.out.println("Word search Ankara: " + (wordSearch.search("Ankara")));
        
  }
}