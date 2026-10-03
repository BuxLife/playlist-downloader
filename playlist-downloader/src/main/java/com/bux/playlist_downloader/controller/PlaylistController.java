package com.bux.playlist_downloader.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/playlists")
public class PlaylistController {

    @GetMapping("/test")
    public String test() {
        return "Playlist Downloader is running!";
    }

}
