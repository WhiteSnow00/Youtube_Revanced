import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class ejx implements eka, ejw
{
    public final Map a;
    
    public ejx() {
        this.a = new HashMap();
    }
    
    public final eka d() {
        final ejx ejx = new ejx();
        for (final Map.Entry<String, eka> entry : this.a.entrySet()) {
            if (entry.getValue() instanceof ejw) {
                ejx.a.put(entry.getKey(), entry.getValue());
            }
            else {
                ejx.a.put(entry.getKey(), entry.getValue().d());
            }
        }
        return (eka)ejx;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ejx && this.a.equals(((ejx)o).a));
    }
    
    public final eka f(final String s) {
        if (this.a.containsKey(s)) {
            return this.a.get(s);
        }
        return ejx.f;
    }
    
    public final Boolean g() {
        return true;
    }
    
    public final Double h() {
        return Double.NaN;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String i() {
        return "[object Object]";
    }
    
    public final Iterator l() {
        return epf.l(this.a);
    }
    
    public eka lA(final String s, final hyx hyx, final List list) {
        if ("toString".equals(s)) {
            return (eka)new ekd(this.toString());
        }
        return epf.ae((ejw)this, (eka)new ekd(s), hyx, list);
    }
    
    public final void r(final String s, final eka eka) {
        if (eka == null) {
            this.a.remove(s);
            return;
        }
        this.a.put(s, eka);
    }
    
    public final boolean t(final String s) {
        return this.a.containsKey(s);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("{");
        if (!this.a.isEmpty()) {
            for (final String s : this.a.keySet()) {
                sb.append(String.format("%s: %s,", s, this.a.get(s)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
