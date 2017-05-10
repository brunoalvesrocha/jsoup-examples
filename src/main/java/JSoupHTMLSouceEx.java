import org.jsoup.Jsoup;

import java.io.IOException;

/**
 * Created by brunorocha on 5/9/17.
 */
public class JSoupHTMLSouceEx {

    public static void main(String[] args) throws IOException {

        String webPage = "https://www.userede.com.br/redepay";
        String html = Jsoup.connect(webPage).get().html();

        System.out.println(html);
    }
}
