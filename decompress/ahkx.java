// 
// Decompiled by Procyon v0.6.0
// 

public enum ahkx implements ahdd
{
    a("ACCOUNT_SELECTOR_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("ACCOUNT_SELECTOR_EVENT_TYPE_AUTO", 1, 1);
    
    private static final ahkx[] d;
    public final int c;
    
    private ahkx(final String s, final int n, final int c) {
        this.c = c;
    }
    
    public static ahdf a() {
        return ahhs.s;
    }
    
    public static ahkx b(final int n) {
        if (n == 0) {
            return ahkx.a;
        }
        if (n != 1) {
            return null;
        }
        return ahkx.b;
    }
    
    public final int getNumber() {
        return this.c;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}
