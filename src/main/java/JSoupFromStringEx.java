import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by brunorocha on 5/9/17.
 */
public class JSoupFromStringEx {

    public static void main(String[] args) {

        String htmlString = "<html><head><title>My Title</title></head>" +
                "<body>Body content</body></html>";

        Document doc = Jsoup.parse(htmlString);
        String title = doc.title();
        String body = doc.body().text();

        System.out.printf("Title: %s%n", title);
        System.out.printf("Body: %s", body);
    }
}
