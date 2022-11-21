// 
// Decompiled by Procyon v0.6.0
// 

public final class afys
{
    public static final afys a;
    public static final afys b;
    public static final afys c;
    private final String d;
    
    static {
        a = new afys("ENABLED");
        b = new afys("DISABLED");
        c = new afys("DESTROYED");
    }
    
    private afys(final String d) {
        this.d = d;
    }
    
    @Override
    public final String toString() {
        return this.d;
    }
}
