// 
// Decompiled by Procyon v0.6.0
// 

public final class aahm extends RuntimeException
{
    public final boolean a;
    public final aacn b;
    public final amxs c;
    
    private aahm(final boolean a, final String s, final Exception ex, final aacn b, final amxs c) {
        super(s, ex);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static aahm a(final String s, final Exception ex, final aacn aacn, final amxs amxs) {
        return new aahm(true, s, ex, aacn, amxs);
    }
    
    public static aahm b(final String s, final Exception ex, final aacn aacn, final amxs amxs) {
        return new aahm(false, s, ex, aacn, amxs);
    }
}
