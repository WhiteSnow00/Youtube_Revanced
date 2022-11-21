import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class affm extends affq
{
    public affm(final affr affr) {
        super(affr);
    }
    
    @Override
    public final /* bridge */ Object a(final int n) {
        return new affj(this.b, n);
    }
    
    @Override
    public final boolean contains(Object key) {
        if (key instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)key;
            key = entry.getKey();
            final Object value = entry.getValue();
            final int e = this.b.e(key);
            if (e != -1 && aexq.c(this.b.a[e], value)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean remove(Object key) {
        if (key instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)key;
            key = entry.getKey();
            final Object value = entry.getValue();
            final int u = aegu.u(key);
            final int f = this.b.f(key, u);
            if (f != -1 && aexq.c(this.b.a[f], value)) {
                this.b.l(f, u);
                return true;
            }
        }
        return false;
    }
}
