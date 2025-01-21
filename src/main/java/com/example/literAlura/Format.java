package com.example.literAlura;

import java.util.Map;

public class Format {
    private Map<String, String> formats;

    // Getters and Setters

    public Map<String, String> getFormats() {
        return formats;
    }

    public void setFormats(Map<String, String> formats) {
        this.formats = formats;
    }

    @Override
    public String toString() {
        return "Format{" +
                "formats=" + formats +
                '}';
    }
}
