import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvs extends cvw
{
    public cvs(final List list) {
        super(list);
    }
    
    public final /* bridge */ Object f(final czs czs, final float n) {
        return this.l(czs, n);
    }
    
    public final int k() {
        return this.l(this.d(), this.b());
    }
    
    public final int l(final czs czs, final float n) {
        final Object b = czs.b;
        if (b != null && czs.c != null) {
            final int intValue = (int)b;
            final int intValue2 = (int)czs.c;
            final czt d = this.d;
            if (d != null) {
                final float g = czs.g;
                czs.h.floatValue();
                this.c();
                final Integer n2 = (Integer)d.a();
                if (n2 != null) {
                    return n2;
                }
            }
            return cja.d(czm.b(n, 0.0f, 1.0f), intValue, intValue2);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
