// 
// Decompiled by Procyon v0.6.0
// 

public final class afzb
{
    public static final afzb a;
    public static final afzb b;
    public static final afzb c;
    public static final afzb d;
    public final String e;
    
    static {
        a = new afzb("TINK");
        b = new afzb("CRUNCHY");
        c = new afzb("LEGACY");
        d = new afzb("NO_PREFIX");
    }
    
    private afzb(final String e) {
        this.e = e;
    }
    
    @Override
    public final String toString() {
        return this.e;
    }
}
