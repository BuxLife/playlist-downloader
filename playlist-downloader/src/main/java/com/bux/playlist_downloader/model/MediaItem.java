package com.bux.playlist_downloader.model;

public record MediaItem(
        String id,
        String title,
        String url,
        String duration) {
}
