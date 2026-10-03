package com.bux.playlist_downloader.download;

public record DownloadResult(
        boolean successful,
        String filePath,
        String errorMessage) {
}
