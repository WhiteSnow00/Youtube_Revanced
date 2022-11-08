// 
// Decompiled by Procyon v0.6.0
// 

public final class afuz
{
    public static final afuz a;
    public static final afuz b;
    public static final afuz c;
    private final String d;
    
    static {
        a = new afuz("ENABLED");
        b = new afuz("DISABLED");
        c = new afuz("DESTROYED");
    }
    
    private afuz(final String d) {
        this.d = d;
    }
    
    @Override
    public final String toString() {
        return this.d;
    }
}
