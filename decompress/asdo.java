import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asdo
{
    public final asfd a;
    public final Object b;
    public final Map c;
    private final asdm d;
    private final Map e;
    private final Map f;
    
    public asdo(final asdm d, final Map map, final Map map2, final asfd a, final Object b, final Map map3) {
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
    
    final arvd a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return (arvd)new asdn(this);
    }
    
    final asdm b(final arwo arwo) {
        asdm asdm;
        if ((asdm = this.e.get(arwo.b)) == null) {
            asdm = this.f.get(arwo.c);
        }
        if (asdm == null) {
            return this.d;
        }
        return asdm;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final asdo asdo = (asdo)o;
                if (adkp.ae(this.d, asdo.d) && adkp.ae(this.e, asdo.e) && adkp.ae(this.f, asdo.f) && adkp.ae(this.a, asdo.a) && adkp.ae(this.b, asdo.b)) {
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
        final aezo ab = adkp.ab(this);
        ab.b("defaultMethodConfig", (Object)this.d);
        ab.b("serviceMethodMap", (Object)this.e);
        ab.b("serviceMap", (Object)this.f);
        ab.b("retryThrottling", (Object)this.a);
        ab.b("loadBalancingConfig", this.b);
        return ab.toString();
    }
}
