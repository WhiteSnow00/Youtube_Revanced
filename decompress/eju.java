import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class eju implements eka, ejw
{
    public final String d;
    protected final Map e;
    
    public eju(final String d) {
        this.e = new HashMap();
        this.d = d;
    }
    
    public abstract eka a(final hyx p0, final List p1);
    
    public eka d() {
        return (eka)this;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof eju)) {
            return false;
        }
        final eju eju = (eju)o;
        final String d = this.d;
        return d != null && d.equals(eju.d);
    }
    
    public final eka f(final String s) {
        if (this.e.containsKey(s)) {
            return this.e.get(s);
        }
        return eju.f;
    }
    
    public final Boolean g() {
        return true;
    }
    
    public final Double h() {
        return Double.NaN;
    }
    
    @Override
    public final int hashCode() {
        final String d = this.d;
        if (d != null) {
            return d.hashCode();
        }
        return 0;
    }
    
    public final String i() {
        return this.d;
    }
    
    public final Iterator l() {
        return epf.l(this.e);
    }
    
    public final eka lA(final String s, final hyx hyx, final List list) {
        if ("toString".equals(s)) {
            return (eka)new ekd(this.d);
        }
        return epf.ae((ejw)this, (eka)new ekd(s), hyx, list);
    }
    
    public final void r(final String s, final eka eka) {
        if (eka == null) {
            this.e.remove(s);
            return;
        }
        this.e.put(s, eka);
    }
    
    public final boolean t(final String s) {
        return this.e.containsKey(s);
    }
}
