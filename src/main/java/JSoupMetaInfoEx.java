import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by brunorocha on 5/9/17.
 */
public class JSoupMetaInfoEx {

    public static void main(String[] args) throws IOException {

        String url = "http://www.jsoup.org";

        Document document = Jsoup.connect(url).get();

        String description = document.select("meta[name=description]").first().attr("content");

        System.out.println("Description: "+  description);

        String keywords = document.select("meta[name=keywords]").first().attr("content");

        System.out.println("Keywords: " + keywords);
    }

}
