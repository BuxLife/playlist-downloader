package com.bux.playlist_downloader.exception;

public class UnsupportedProviderException extends RuntimeException {

    public UnsupportedProviderException(String url) {
        super("No media provider supports URL: " + url);
    }
}
