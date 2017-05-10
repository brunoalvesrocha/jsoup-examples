import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;

/**
 * Created by brunorocha on 5/9/17.
 */
public class JSoupFromFileEx {

    public static void main(String[] args) throws IOException {
        String filename = "/Users/brunorocha/Desktop/myhtml.html";

        Document doc = Jsoup.parse(new File(filename), "utf-8");
        Element divTag = doc.getElementById("mydiv");

        System.out.println(divTag.text());
    }
}
