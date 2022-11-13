// 
// Decompiled by Procyon v0.6.0
// 

public final class arlt implements arls, arkg
{
    private static final arlt b;
    public final Object a;
    
    static {
        b = new arlt(null);
    }
    
    private arlt(final Object a) {
        this.a = a;
    }
    
    public static arls b(final Object o) {
        o.getClass();
        return new arlt(o);
    }
    
    public static arls c(final Object o) {
        arlt b;
        if (o == null) {
            b = arlt.b;
        }
        else {
            b = new arlt(o);
        }
        return b;
    }
    
    public final Object a() {
        return this.a;
    }
}
