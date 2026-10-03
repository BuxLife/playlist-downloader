package com.bux.playlist_downloader.download;

import com.bux.playlist_downloader.model.AudioFormat;
import com.bux.playlist_downloader.model.MediaType;

public record DownloadOptions(
        MediaType mediaType,
        AudioFormat audioFormat,
        String outputDirectory) {
}
