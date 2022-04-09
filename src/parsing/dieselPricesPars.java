package parsing;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class dieselPricesPars {
    private static Document getPage() throws IOException {
        String url = "https://fuelprices.ru/uralfo/tyumen";
        Document page = Jsoup.parse(new URL(url), 10000);
        return page;
    }

    public static void main(String[] args) throws IOException {
        Document page =getPage();
        Element date = page.select("span[class=text-nowrap]").first();
        System.out.println(date);

        Element tableDiesel = page.select("div[class=all-fuel clearfix]").first();

        Elements prices = tableDiesel.getElementsByAttributeValue("class", "price");

        for (org.jsoup.nodes.Element element: prices){
            System.out.println(element);
        }

        Elements names = tableDiesel.getElementsByAttributeValue("itemprop", "name");

        for (org.jsoup.nodes.Element element: names){
            System.out.println(element);
        }

        // System.out.printf("Бензин: " + names + "Стоимость: " + prices);
    }

}

// Document document = Jsoup.connect("https://fuelprices.ru/uralfo/tyumen").get();
// System.out.println(tableDiesel);
//    System.out.println(names);
//    System.out.println(prices);