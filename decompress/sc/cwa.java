import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwa extends cvw
{
    private final czu e;
    
    public cwa(final List list) {
        super(list);
        this.e = new czu();
    }
    
    public final Object f(final czs czs, float c) {
        final Object b = czs.b;
        if (b != null) {
            final Object c2 = czs.c;
            if (c2 != null) {
                final czu czu = (czu)b;
                final czu czu2 = (czu)c2;
                final czt d = this.d;
                if (d != null) {
                    final float g = czs.g;
                    czs.h.floatValue();
                    this.c();
                    final czu czu3 = (czu)d.a();
                    if (czu3 != null) {
                        return czu3;
                    }
                }
                final czu e = this.e;
                final float c3 = czm.c(czu.a, czu2.a, c);
                c = czm.c(czu.b, czu2.b, c);
                e.a = c3;
                e.b = c;
                return this.e;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
