// 
// Decompiled by Procyon v0.6.0
// 

public final class afzk
{
    public static final afzk a;
    public static final afzk b;
    public static final afzk c;
    public static final afzk d;
    public final String e;
    
    static {
        a = new afzk("TINK");
        b = new afzk("CRUNCHY");
        c = new afzk("LEGACY");
        d = new afzk("NO_PREFIX");
    }
    
    private afzk(final String e) {
        this.e = e;
    }
    
    @Override
    public final String toString() {
        return this.e;
    }
}
