import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvv extends cvw
{
    public cvv(final List list) {
        super(list);
    }
    
    public final /* bridge */ Object f(final czs czs, final float n) {
        return this.k(czs, n);
    }
    
    public final int k(final czs czs, final float n) {
        if (czs.b != null && czs.c != null) {
            final czt d = this.d;
            if (d != null) {
                final float g = czs.g;
                czs.h.floatValue();
                final Integer n2 = (Integer)czs.b;
                final Integer n3 = (Integer)czs.c;
                this.c();
                final Integer n4 = (Integer)d.a();
                if (n4 != null) {
                    return n4;
                }
            }
            int k;
            if ((k = czs.k) == 784923401) {
                k = (int)czs.b;
                czs.k = k;
            }
            int l;
            if ((l = czs.l) == 784923401) {
                l = (int)czs.c;
                czs.l = l;
            }
            return czm.e(k, l, n);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
