// 
// Decompiled by Procyon v0.6.0
// 

public final class gkh implements ns
{
    public static final gkh a;
    private final int b;
    
    static {
        a = new gkh(0);
    }
    
    public gkh(final int b) {
        this.b = b;
    }
    
    public final int a(final int n, final int n2) {
        if (this.b != 0) {
            return n - 1 - n2;
        }
        return n - n2 - 1;
    }
}
