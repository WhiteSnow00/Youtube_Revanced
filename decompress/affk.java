import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class affk extends affq
{
    final affr a;
    
    public affk(final affr a) {
        super(this.a = a);
    }
    
    @Override
    public final /* bridge */ Object a(final int n) {
        return new affi(this.a, n);
    }
    
    @Override
    public final boolean contains(Object key) {
        if (key instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)key;
            key = entry.getKey();
            final Object value = entry.getValue();
            final int c = this.a.c(key);
            if (c != -1 && aexq.c(value, this.a.b[c])) {
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
            final int d = this.a.d(key, u);
            if (d != -1 && aexq.c(value, this.a.b[d])) {
                this.a.k(d, u);
                return true;
            }
        }
        return false;
    }
}
