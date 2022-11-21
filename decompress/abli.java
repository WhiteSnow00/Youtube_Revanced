// 
// Decompiled by Procyon v0.6.0
// 

public enum abli
{
    a("NEW", 0), 
    b("VIDEO_LOADING", 1), 
    c("VIDEO_PLAYBACK_ERROR", 2), 
    d("VIDEO_PLAYBACK_LOADED", 3), 
    e("VIDEO_WATCH_LOADED", 4);
    
    private static final abli[] f;
    
    private abli(final String s, final int n) {
    }
    
    public final boolean a(final abli... array) {
        for (int i = 0; i < array.length; ++i) {
            if (this == array[i]) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean b(final abli abli) {
        return this.ordinal() >= abli.ordinal();
    }
}
