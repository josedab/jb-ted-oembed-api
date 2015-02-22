package com.technobitia.ted.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class TedResource {
    private String type;
    private float version;
    private int width;
    private int height;
    private String title;
    private String url;

    @JsonProperty("author_name")
    private String authorName;

    @JsonProperty("author_url")
    private String authorUrl;

    @JsonProperty("provider_name")
    private String providerName;

    @JsonProperty("provider_url")
    private String providerUrl;

    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;

    @JsonProperty("thumbnail_width")
    private String thumbnailWidth;

    @JsonProperty("thumbnail_height")
    private String thumbnailHeight;

    private String html;

    public String getType() {
        return type;
    }

    public float getVersion() {
        return version;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getProviderUrl() {
        return providerUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getThumbnailWidth() {
        return thumbnailWidth;
    }

    public String getThumbnailHeight() {
        return thumbnailHeight;
    }

    public String getHtml() {
        return html;
    }

}
