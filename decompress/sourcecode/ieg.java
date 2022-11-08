import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ieg extends icy
{
    public ieg() {
    }
    
    private static apvx o(final zzl zzl, final boolean b) {
        final agp e = zzl.a.e;
        if ((zzl.q() && b) || e == null) {
            return null;
        }
        return fbp.D(e);
    }
    
    public final afdu a(final aack aack) {
        final afds i = afdu.i();
        final Iterator iterator = aack.l().j().iterator();
        while (iterator.hasNext()) {
            final apvx o = o((zzl)iterator.next(), true);
            if (o != null) {
                i.h(o);
            }
        }
        return i.g();
    }
    
    public final void d(final vdv vdv, final zzl zzl) {
        final apvx o = o(zzl, false);
        if (o != null) {
            vdv.j((vdj)o);
        }
    }
}
