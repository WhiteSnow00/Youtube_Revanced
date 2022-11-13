// 
// Decompiled by Procyon v0.6.0
// 

public enum alek implements ahbl
{
    a("WATCH_WHILE", 0, 1), 
    b("WATCH_NEXT_TYPE_MUSIC_QUEUE_ADD_OPERATION", 1, 2), 
    c("WATCH_NEXT_TYPE_SKIP_VIDEO", 2, 3);
    
    private static final alek[] e;
    public final int d;
    
    private alek(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return aldq.e;
    }
    
    public static alek b(final int n) {
        if (n == 1) {
            return alek.a;
        }
        if (n == 2) {
            return alek.b;
        }
        if (n != 3) {
            return null;
        }
        return alek.c;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
