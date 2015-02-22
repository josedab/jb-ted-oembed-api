package com.technobitia.ted.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TedOembedClientTest {

    @InjectMocks
    private TedOembedClient tedOembedClient;

    @Test(expected = NullPointerException.class)
    public void whenExtractingOembedInformation_givenNullUrl_thenThrowNPE() {
        tedOembedClient.extractOEmbedInformationFromUrl(null);
    }
}
