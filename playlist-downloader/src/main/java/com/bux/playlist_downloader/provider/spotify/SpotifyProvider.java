package com.bux.playlist_downloader.provider.spotify;

import com.bux.playlist_downloader.model.Playlist;
import com.bux.playlist_downloader.provider.MediaProvider;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpotifyProvider implements MediaProvider {

    @Override
    public boolean supports(String url) {
        return url.contains("spotify.com");
    }

    @Override
    public Playlist getPlaylist(String url) {
        return new Playlist(
                "test-spotify-playlist",
                "Test Spotify Playlist",
                url,
                List.of()
        );
    }
}
