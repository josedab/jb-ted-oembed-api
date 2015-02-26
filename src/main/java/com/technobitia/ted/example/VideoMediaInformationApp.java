package com.technobitia.ted.example;

import com.technobitia.ted.client.TedOembedClient;
import com.technobitia.ted.model.TedResource;

public class VideoMediaInformationApp {
    
    public static void main(String[] args) {
        TedOembedClient oembedClient = new TedOembedClient();
        String url = "http://www.ted.com/talks/jill_bolte_taylor_s_powerful_stroke_of_insight";
        TedResource tedResource = oembedClient.extractOEmbedInformationFromUrl(url);
        System.out.println(tedResource);
    }
}
