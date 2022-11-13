// 
// Decompiled by Procyon v0.6.0
// 

public enum agnf implements agkg
{
    a("UNKNOWN_EVENT", 0, 0), 
    b("MESSAGE_DELIVERED", 1, 1), 
    c("MESSAGE_OPEN", 2, 2);
    
    private static final agnf[] d;
    private final int e;
    
    static {
        d = b();
    }
    
    private agnf(final String s, final int n, final int e) {
        this.e = e;
    }
    
    private static agnf[] b() {
        return new agnf[] { agnf.a, agnf.b, agnf.c };
    }
    
    public int a() {
        return this.e;
    }
}
