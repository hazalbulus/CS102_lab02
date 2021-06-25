/**
 * Part B MySimpleURLReader
 * @author Hazal Buluş
 * @version 1.0 24.06.2021
 */
public class WordSearch extends HTMLFilteredReader  {
    //Properties
    String url;

    //Constructor
    public WordSearch(String url)
    {
        super(url);
    }

    /**
	 * This method search for the given word in page content
     * @param word
	 * @return index of the searched word
	 */
    public int search(String word){

        return this.getPageContents().indexOf(word);
    }

    public static void main(String[] args) {

        
        WordSearch wordSearch = new WordSearch("http://www.cs.bilkent.edu.tr/~ozturk/cs102/scrapethissite.html");
        System.out.println("Word search Turkey: " +  (wordSearch.search("Turkey")));
        System.out.println("Word search Ankara: " + (wordSearch.search("Ankara")));
    }
}
