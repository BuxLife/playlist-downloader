package com.bux.playlist_downloader.controller;

import com.bux.playlist_downloader.model.Playlist;
import com.bux.playlist_downloader.service.PlaylistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/playlists")
public class PlaylistController {

    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping
    public Playlist getPlaylist(@RequestParam String url) {
        return playlistService.getPlaylist(url);
    }

    @GetMapping("/test")
    public String test() {
        return "Playlist Downloader is running!";
    }

}
