import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asci
{
    public final asdw a;
    public final Object b;
    public final Map c;
    private final ascg d;
    private final Map e;
    private final Map f;
    
    public asci(final ascg d, final Map map, final Map map2, final asdw a, final Object b, final Map map3) {
        this.d = d;
        this.e = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(map));
        this.f = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(map2));
        this.a = a;
        this.b = b;
        Map<Object, Object> unmodifiableMap;
        if (map3 != null) {
            unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(map3));
        }
        else {
            unmodifiableMap = null;
        }
        this.c = unmodifiableMap;
    }
    
    final arsy a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return (arsy)new asch(this);
    }
    
    final ascg b(final aruk aruk) {
        ascg ascg;
        if ((ascg = this.e.get(aruk.b)) == null) {
            ascg = this.f.get(aruk.c);
        }
        if (ascg == null) {
            return this.d;
        }
        return ascg;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final asci asci = (asci)o;
                if (aeda.v((Object)this.d, (Object)asci.d) && aeda.v((Object)this.e, (Object)asci.e) && aeda.v((Object)this.f, (Object)asci.f) && aeda.v((Object)this.a, (Object)asci.a) && aeda.v(this.b, asci.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.d, this.e, this.f, this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("defaultMethodConfig", this.d);
        o.b("serviceMethodMap", this.e);
        o.b("serviceMap", this.f);
        o.b("retryThrottling", this.a);
        o.b("loadBalancingConfig", this.b);
        return o.toString();
    }
}
