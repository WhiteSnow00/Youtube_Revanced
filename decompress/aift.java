// 
// Decompiled by Procyon v0.6.0
// 

public enum aift
{
    a("SCREEN_EXIT", 0), 
    b("PLAYBACK_STOPPED", 1), 
    c("EVENT_NOT_SET", 2);
    
    private static final aift[] d;
    
    private aift(final String s, final int n) {
    }
    
    public static aift a(final int n) {
        if (n == 0) {
            return aift.c;
        }
        if (n == 1) {
            return aift.a;
        }
        if (n != 2) {
            return null;
        }
        return aift.b;
    }
}
