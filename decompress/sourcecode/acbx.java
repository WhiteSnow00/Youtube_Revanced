// 
// Decompiled by Procyon v0.6.0
// 

public enum acbx
{
    a("BROWSE", 0, "browse_"), 
    b("HOME", 1, "home_"), 
    c("CHANNEL", 2, "channel_"), 
    d("SEARCH", 3, "search_"), 
    e("WATCH", 4, "watch_"), 
    f("ENGAGEMENT", 5, "engagement_"), 
    g("SUGGESTED_PLAYLIST", 6, "suggested_playlist_"), 
    h("LIVE_CHAT", 7, "live_chat_"), 
    i("SHORTS", 8, "shorts_"), 
    j("OTHERS", 9, "others_");
    
    public final String k;
    
    private acbx(final String s, final int n, final String k) {
        this.k = k;
    }
    
    @Override
    public final String toString() {
        return this.k;
    }
}
