import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glt implements acqp
{
    private final Map a;
    
    public glt() {
        this(null);
    }
    
    public glt(final acrm acrm) {
        final HashMap a = new HashMap();
        this.a = a;
        if (acrm instanceof glr) {
            a.putAll(((glr)acrm).a);
        }
    }
    
    private static Object d(final Object o) {
        if (o instanceof amsn) {
            return new gls(o.getClass(), ((amsn)o).f.I());
        }
        if (o instanceof akgk) {
            return new gls(o.getClass(), ((akgk)o).m.I());
        }
        if (o instanceof amrw) {
            return new gls(o.getClass(), ((amrw)o).g.I());
        }
        return o;
    }
    
    public final aezp a(final Object o) {
        return aezp.j(this.a.remove(d(o)));
    }
    
    public final void c(final Object o, final Object o2) {
        o.getClass();
        o2.getClass();
        this.a.put(d(o), o2);
    }
    
    @Override
    public final acrm qA() {
        return new glr(afev.k(this.a));
    }
}
