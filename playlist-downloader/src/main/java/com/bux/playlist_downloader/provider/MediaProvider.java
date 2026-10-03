package com.bux.playlist_downloader.provider;

import com.bux.playlist_downloader.model.Playlist;

public interface MediaProvider {

    boolean supports(String url);

    Playlist getPlaylist(String url);
}
