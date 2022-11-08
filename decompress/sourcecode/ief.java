import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ief extends icx
{
    public ief() {
    }
    
    private static apvx k(final zyz zyz) {
        final agp n = zyz.a.n;
        if (n != null) {
            return fbp.D(n);
        }
        return null;
    }
    
    public final afdu e(final aack aack) {
        final afds i = afdu.i();
        final Iterator iterator = aack.i().l().iterator();
        while (iterator.hasNext()) {
            final apvx k = k((zyz)iterator.next());
            if (k != null) {
                i.h(k);
            }
        }
        return i.g();
    }
    
    public final void g(final vdv vdv, final zyz zyz) {
        final apvx k = k(zyz);
        if (k != null) {
            vdv.j((vdj)k);
        }
    }
}
