// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcelable$Creator;

public enum b
{
    a("AD_EVENT_DATA", 0, AdEventData.CREATOR), 
    b("ERROR_DATA", 1, ErrorData.CREATOR), 
    c("HOT_CONFIG_DATA", 2, HotConfigData.CREATOR), 
    d("FRAGMENT_KEY_DATA", 3, FragmentKeyData.CREATOR), 
    e("MUTED_AUTOPLAY_STATE", 4, MutedAutoplayState.CREATOR), 
    f("PLAYBACK_EVENT_DATA", 5, PlaybackEventData.CREATOR), 
    g("PLAYER_VIEW_MODE", 6, PlayerViewModeData.CREATOR), 
    h("RELATED_VIDEO_ITEM", 7, RelatedVideoItem.CREATOR), 
    i("RELATED_VIDEOS_SCREEN", 8, RelatedVideosScreen.CREATOR);
    
    private static final b[] k;
    public final Parcelable$Creator j;
    
    private b(final String s, final int n, final Parcelable$Creator j) {
        this.j = j;
    }
    
    public static b a(final String s) {
        return Enum.valueOf(b.class, s);
    }
}
