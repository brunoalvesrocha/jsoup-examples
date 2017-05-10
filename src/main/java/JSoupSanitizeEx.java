import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;

/**
 * Created by brunorocha on 5/9/17.
 */
public class JSoupSanitizeEx {

    public static void main(String[] args) {

        String htmlString = "<html><head><title>My title</title></head>"
                + "<body><center>Body content</center></body></html>";

        boolean valid = Jsoup.isValid(htmlString, Whitelist.basic());

        if (valid) {

            System.out.println("The document is valid");
        } else {

            System.out.println("The document is not valid.");
            System.out.println("Cleaned document");

            Document dirtyDoc = Jsoup.parse(htmlString);
            Document cleanDoc = new Cleaner(Whitelist.basic()).clean(dirtyDoc);

            System.out.println(cleanDoc.html());
        }
    }
}
