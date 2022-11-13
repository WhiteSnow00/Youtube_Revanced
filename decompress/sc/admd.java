// 
// Decompiled by Procyon v0.6.0
// 

public final class admd
{
    public static final admd a;
    public final boolean b;
    public final int c;
    
    static {
        a = new admd(true, 0);
    }
    
    private admd() {
        this(true, 0);
    }
    
    private admd(final boolean b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    public static admd a(final int n) {
        return new admd(false, n);
    }
}
