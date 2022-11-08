// 
// Decompiled by Procyon v0.6.0
// 

public final class afzj
{
    public static final afzj a;
    public static final afzj b;
    public static final afzj c;
    public static final afzj d;
    public static final afzj e;
    public final String f;
    
    static {
        a = new afzj("SHA1");
        b = new afzj("SHA224");
        c = new afzj("SHA256");
        d = new afzj("SHA384");
        e = new afzj("SHA512");
    }
    
    private afzj(final String f) {
        this.f = f;
    }
    
    @Override
    public final String toString() {
        return this.f;
    }
}
