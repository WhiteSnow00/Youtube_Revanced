// 
// Decompiled by Procyon v0.6.0
// 

public final class eow implements eoq
{
    public static final eow a;
    public static final eow b;
    private final int c;
    
    static {
        b = new eow(1);
        a = new eow(0);
    }
    
    private eow(final int c) {
        this.c = c;
    }
    
    public final String a() {
        return "";
    }
    
    public final int b() {
        if (this.c != 0) {
            return 2;
        }
        return 3;
    }
}
