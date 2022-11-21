// 
// Decompiled by Procyon v0.6.0
// 

public enum ablh
{
    a("PLAYBACK_PENDING", 0), 
    b("PLAYBACK_LOADED", 1), 
    c("PLAYBACK_INTERRUPTED", 2), 
    d("READY", 3), 
    e("VIDEO_REQUESTED", 4), 
    f("VIDEO_PLAYING", 5), 
    g("PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES", 6), 
    h("ENDED", 7);
    
    private static final ablh[] i;
    
    private ablh(final String s, final int n) {
    }
    
    public final boolean a(final ablh... array) {
        for (int i = 0; i < array.length; ++i) {
            if (this == array[i]) {
                return true;
            }
        }
        return false;
    }
}
