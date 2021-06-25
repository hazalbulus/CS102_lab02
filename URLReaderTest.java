/**
 * Part A test SimpleURLReader
 * @author Hazal Buluş
 * @version 1.0 23.06.2021
 */
import cs1.SimpleURLReader;

public class URLReaderTest {
  public static void main(String[] args) {
      SimpleURLReader urlReader = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");

      System.out.println("\nPage content: " + urlReader.getPageContents());
      System.out.println();
      System.out.println("\nLine count: " + urlReader.getLineCount());
  }
}