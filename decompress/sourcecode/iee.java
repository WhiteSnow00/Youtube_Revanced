import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class iee extends icy
{
    public iee() {
    }
    
    private static aplj o(final zzl zzl, final boolean b) {
        if (zzl.q() && b) {
            return null;
        }
        return fbp.s(zzl.a(), zzl.h);
    }
    
    public final afdu a(final aack aack) {
        final afds i = afdu.i();
        for (final zzl zzl : aack.l().j()) {
            if (zzl != null) {
                final aplj o = o(zzl, true);
                if (o == null) {
                    continue;
                }
                i.h(o);
            }
        }
        return i.g();
    }
    
    public final void d(final vdv vdv, final zzl zzl) {
        final aplj o = o(zzl, false);
        if (o != null) {
            vdv.j((vdj)o);
        }
    }
    
    public final void l(final vdv vdv, final String s) {
        vdv.g(gkt.bB(s));
    }
    
    public final void m(final vdv vdv, final zzl zzl) {
        vdv.j((vdj)fbp.s(zzl.a(), zzl.h));
    }
}
