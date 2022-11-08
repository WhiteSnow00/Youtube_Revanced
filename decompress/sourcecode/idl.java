import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class idl extends icy
{
    private final uyi a;
    
    public idl(final uyi a) {
        this.a = a;
    }
    
    private final alyf o(final zzl zzl) {
        if (this.a.ay()) {
            final String a = zzl.a();
            final long i = zzl.i;
            final boolean c = zzl.C();
            final alyf d = alyg.d(gkt.bA(a));
            d.d(gkt.br(a));
            d.c(Long.valueOf(i));
            d.e(Boolean.valueOf(c));
            return d;
        }
        final String a2 = zzl.a();
        final long j = zzl.i;
        final alyf d2 = alyg.d(gkt.bA(a2));
        d2.d(gkt.br(a2));
        d2.c(Long.valueOf(j));
        return d2;
    }
    
    @Deprecated
    public final afdu a(final aack aack) {
        final afds i = afdu.i();
        final Iterator iterator = aack.l().j().iterator();
        while (iterator.hasNext()) {
            i.h(this.o((zzl)iterator.next()));
        }
        return i.g();
    }
    
    @Deprecated
    public final void b(final vdv vdv, final zzl zzl) {
        vdv.j((vdj)this.o(zzl));
    }
    
    @Deprecated
    public final void d(final vdv vdv, final zzl zzl) {
        vdv.j((vdj)this.o(zzl));
    }
    
    @Deprecated
    public final void l(final vdv vdv, final String s) {
        vdv.g(gkt.bA(s));
    }
}
