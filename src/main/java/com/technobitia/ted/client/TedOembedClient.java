package com.technobitia.ted.client;

import static com.google.common.base.Preconditions.checkNotNull;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.technobitia.ted.example.VideoMediaInformationApp;
import com.technobitia.ted.model.TedResource;

/**
 * Client for requesting embedded representation of a url on TED website. Works
 * with the oembed type video. For more information about its use, @see
 * {@link VideoMediaInformationApp}
 */
public class TedOembedClient {

    private static final String TED_TALKS_BASE_URL = "http://www.ted.com/talks";
    private static final String OEMBED_PATH = "oembed.json";

    private Client restClient;
    private WebTarget baseTarget;

    public TedOembedClient() {
        restClient = ClientBuilder.newClient();
        baseTarget = restClient.target(TED_TALKS_BASE_URL).path(OEMBED_PATH);
    }

    public TedResource extractOEmbedInformationFromUrl(String url) {
        checkNotNull(url);
        WebTarget webTarget = baseTarget.queryParam("url", url);

        TedResource tedResource = webTarget.request().get(TedResource.class);
        return tedResource;
    }
}
