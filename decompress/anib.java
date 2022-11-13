// 
// Decompiled by Procyon v0.6.0
// 

public enum anib implements ahbl
{
    a("PAGE_SOURCE_UNKNOWN", 0, 0), 
    b("PAGE_SOURCE_PLAYLIST_SUGGESTIONS", 1, 1);
    
    private static final anib[] c;
    private final int d;
    
    private anib(final String s, final int n, final int d) {
        this.d = d;
    }
    
    public static ahbn a() {
        return anic.b;
    }
    
    public static anib b(final int n) {
        if (n == 0) {
            return anib.a;
        }
        if (n != 1) {
            return null;
        }
        return anib.b;
    }
    
    public final int getNumber() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}
