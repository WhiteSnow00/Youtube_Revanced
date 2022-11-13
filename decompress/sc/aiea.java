// 
// Decompiled by Procyon v0.6.0
// 

public enum aiea
{
    a("SCREEN_EXIT", 0), 
    b("PLAYBACK_STOPPED", 1), 
    c("EVENT_NOT_SET", 2);
    
    private static final aiea[] d;
    
    private aiea(final String s, final int n) {
    }
    
    public static aiea a(final int n) {
        if (n == 0) {
            return aiea.c;
        }
        if (n == 1) {
            return aiea.a;
        }
        if (n != 2) {
            return null;
        }
        return aiea.b;
    }
}
