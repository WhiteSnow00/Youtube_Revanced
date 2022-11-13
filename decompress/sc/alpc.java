// 
// Decompiled by Procyon v0.6.0
// 

public enum alpc implements ahbl
{
    a("STARTUP_SIGNAL_TYPE_UNKNOWN", 0, 0), 
    b("STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_CREATED", 1, 1), 
    c("STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_STOPPED", 2, 2), 
    d("STARTUP_SIGNAL_TYPE_FIRST_THUMBNAIL_LOADED", 3, 3), 
    e("STARTUP_SIGNAL_TYPE_BROWSE_FEED_LOADED", 4, 4), 
    f("STARTUP_SIGNAL_TYPE_AFTER_ONRESUME_LOADED", 5, 5);
    
    private static final alpc[] h;
    public final int g;
    
    private alpc(final String s, final int n, final int g) {
        this.g = g;
    }
    
    public static ahbn a() {
        return alnf.g;
    }
    
    public static alpc b(final int n) {
        if (n == 0) {
            return alpc.a;
        }
        if (n == 1) {
            return alpc.b;
        }
        if (n == 2) {
            return alpc.c;
        }
        if (n == 3) {
            return alpc.d;
        }
        if (n == 4) {
            return alpc.e;
        }
        if (n != 5) {
            return null;
        }
        return alpc.f;
    }
    
    public final int getNumber() {
        return this.g;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}
