package com.bux.playlist_downloader.provider;

import com.bux.playlist_downloader.model.Playlist;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class YoutubeProvider implements MediaProvider {


    @Override
    public boolean supports(String url) {
        return url.contains("youtube.com") || url.contains("youtu.be");
    }

    @Override
    public Playlist getPlaylist(String url) {
        return new Playlist("test-youtube-playlist",
                "Test Youtube Playlist",
                url,
                List.of());
    }
}
