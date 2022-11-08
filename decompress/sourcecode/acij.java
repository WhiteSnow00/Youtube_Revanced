import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acij extends wwx
{
    public final abn f;
    private Map g;
    
    public acij() {
        this.f = new abn();
    }
    
    public acij(final acij acij) {
        this();
        this.i(acij);
    }
    
    public final int b(final String s, final int n) {
        final Object value = this.f.get((Object)s);
        if (value instanceof Integer) {
            return (int)value;
        }
        return n;
    }
    
    public final Object c(final String s) {
        return this.f.get((Object)s);
    }
    
    public final Object d(final String s, final Object o) {
        final Object value = this.f.get((Object)s);
        if (value == null) {
            return o;
        }
        return value;
    }
    
    public final Map e() {
        Map<Object, Object> map;
        if ((map = this.g) == null) {
            map = Collections.emptyMap();
        }
        return map;
    }
    
    public final void f(final String s, final Object o) {
        this.f.put((Object)s, o);
    }
    
    public final void g(final Map map) {
        if (map != null) {
            if (map.size() > 0) {
                if (this.g == null) {
                    this.g = new HashMap();
                }
                this.g.putAll(map);
            }
        }
    }
    
    public final void h() {
        super.a = wwv.k;
        this.f.clear();
        final Map g = this.g;
        if (g != null) {
            g.clear();
        }
    }
    
    public final void i(final acij acij) {
        acij.getClass();
        this.h();
        super.a = acij.a;
        super.b = acij.b;
        super.c = null;
        this.g(acij.g);
        this.f.h(acij.f);
    }
    
    public final boolean j(final String s, final boolean b) {
        final Object value = this.f.get((Object)s);
        if (value instanceof Boolean) {
            return (boolean)value;
        }
        return b;
    }
    
    public final String k(final String s) {
        final Object value = this.f.get((Object)s);
        if (value instanceof String) {
            return (String)value;
        }
        return null;
    }
}
