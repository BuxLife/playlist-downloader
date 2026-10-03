package com.bux.playlist_downloader.download;

import com.bux.playlist_downloader.model.MediaItem;

public interface MediaDownloader {

    DownloadResult download(MediaItem mediaItem, DownloadOptions downloadOptions);
}
