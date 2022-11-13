import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvt extends cvw
{
    public cvt(final List list) {
        super(list);
    }
    
    public final /* bridge */ Object f(final czs czs, final float n) {
        return this.l(czs, n);
    }
    
    public final float k() {
        return this.l(this.d(), this.b());
    }
    
    final float l(final czs czs, final float n) {
        if (czs.b != null && czs.c != null) {
            final czt d = this.d;
            if (d != null) {
                final float g = czs.g;
                czs.h.floatValue();
                final Float n2 = (Float)czs.b;
                final Float n3 = (Float)czs.c;
                this.c();
                final Float n4 = (Float)d.a();
                if (n4 != null) {
                    return n4;
                }
            }
            float i;
            if ((i = czs.i) == -3987645.8f) {
                i = (float)czs.b;
                czs.i = i;
            }
            float j;
            if ((j = czs.j) == -3987645.8f) {
                j = (float)czs.c;
                czs.j = j;
            }
            return czm.c(i, j, n);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
