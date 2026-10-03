package com.bux.playlist_downloader.service;

import com.bux.playlist_downloader.model.Playlist;
import com.bux.playlist_downloader.provider.MediaProvider;
import com.bux.playlist_downloader.provider.MediaProviderResolver;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService {

    private final MediaProviderResolver providerResolver;

    public PlaylistService(MediaProviderResolver providerResolver) {
        this.providerResolver = providerResolver;
    }

    public Playlist getPlaylist(String url) {
        MediaProvider provider = providerResolver.resolve(url);

        return provider.getPlaylist(url);
    }
}
