import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by brunorocha on 5/9/17.
 */
public class JSoupLinksEx {

    public static void main(String[] args) throws IOException {

        String url = "http://www.jsoup.org";

        Document document = Jsoup.connect(url).get();
        Elements links = document.select("a[href]");

        links.forEach( lnk -> {
            System.out.println("link" + lnk.attr("hfref"));
            System.out.println("text: " + lnk.text());
        });
    }
}
