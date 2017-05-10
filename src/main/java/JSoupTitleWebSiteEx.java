import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by brunorocha on 5/9/17.
 */
public class JSoupTitleWebSiteEx {

    public static void main(String[] args) throws IOException {
        String url = "https://www.userede.com.br/redepay";

        Document doc = Jsoup.connect(url).get();
        String title = doc.title();
        System.out.println(title);
    }
}
