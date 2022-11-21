import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxi
{
    static final Logger a;
    public static final arxi b;
    
    static {
        a = Logger.getLogger(arxi.class.getName());
        b = new arxi();
    }
    
    private arxi() {
    }
    
    public static arxi b() {
        arxi arxi;
        if ((arxi = arxg.a.a()) == null) {
            arxi = arxi.b;
        }
        return arxi;
    }
    
    public static void d(final Object o, final Object o2) {
        if (o != null) {
            return;
        }
        throw new NullPointerException((String)o2);
    }
    
    public final arxi a() {
        arxi arxi;
        if ((arxi = arxg.a.b(this)) == null) {
            arxi = arxi.b;
        }
        return arxi;
    }
    
    public final void c(final arxi arxi) {
        d(arxi, "toAttach");
        arxg.a.c(this, arxi);
    }
}
