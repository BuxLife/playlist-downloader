package com.bux.playlist_downloader.provider;

import com.bux.playlist_downloader.exception.UnsupportedProviderException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MediaProviderResolver {

    private final List<MediaProvider> providers;

    public MediaProviderResolver(List<MediaProvider> providers) {
        this.providers = providers;
    }

    public MediaProvider resolve(String url) {
        return providers.stream()
                .filter(provider -> provider.supports(url))
                .findFirst()
                .orElseThrow(() -> new UnsupportedProviderException(url));
    }
}
