package com.uglycrow.dnas4j.config;

public class Config {
    public final String path; // 読み込む.propertiesのパス
    public final String prefix; // 読み込むプロパティのプレフィックス

    public Config(String path) {
        if (path == null) {
            throw new IllegalArgumentException("Parameter must not null.");
        }

        this.path = path;
        this.prefix = "dnas4j.";
    }

    public Config(String path, String prefix) {
        if (path == null || prefix == null) {
            throw new IllegalArgumentException("Parameter must not null.");
        }

        this.path = path;
        if (!prefix.isEmpty() && !prefix.endsWith(".")) {
            prefix += ".";
        }
        this.prefix = prefix;
    }
}
