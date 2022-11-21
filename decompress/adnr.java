// 
// Decompiled by Procyon v0.6.0
// 

public final class adnr
{
    public static final adnr a;
    public final boolean b;
    public final int c;
    
    static {
        a = new adnr(true, 0);
    }
    
    private adnr() {
        this(true, 0);
    }
    
    private adnr(final boolean b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    public static adnr a(final int n) {
        return new adnr(false, n);
    }
}
