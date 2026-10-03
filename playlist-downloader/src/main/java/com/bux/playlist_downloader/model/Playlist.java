package com.bux.playlist_downloader.model;

import java.util.List;

public record Playlist(
        String id,
        String title,
        String sourceUrl,
        List<MediaItem> items) {
}
