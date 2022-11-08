import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class iea extends icy
{
    private final boolean a;
    
    public iea(final uyf uyf) {
        alvl alvl;
        if ((alvl = uyf.b().e) == null) {
            alvl = alvl.a;
        }
        this.a = alvl.N;
    }
    
    private final amub o(final zzl zzl) {
        if (zzl.i() == zzh.b && this.a) {
            final String a = zzl.a();
            final apka e = apka.e;
            final String bp = gkt.bp(a);
            bp.getClass();
            agot.E(bp.isEmpty() ^ true, (Object)"key cannot be empty");
            final agza builder = amue.a.createBuilder();
            builder.copyOnWrite();
            final amue amue = (amue)builder.instance;
            amue.c |= 0x1;
            amue.d = bp;
            final amub amub = new amub(builder);
            final agza a2 = amub.a;
            a2.copyOnWrite();
            final amue amue2 = (amue)a2.instance;
            amue2.e = e.k;
            amue2.c |= 0x2;
            return amub;
        }
        return null;
    }
    
    public final afdu a(final aack aack) {
        final afds i = afdu.i();
        if (this.a) {
            final Iterator iterator = aack.l().j().iterator();
            while (iterator.hasNext()) {
                final amub o = this.o((zzl)iterator.next());
                if (o != null) {
                    i.h(o);
                }
            }
        }
        return i.g();
    }
    
    public final void k(final vdv vdv, final zzl zzl) {
        if (this.a) {
            final amub o = this.o(zzl);
            if (o != null) {
                vdv.j((vdj)o);
            }
        }
    }
    
    public final void l(final vdv vdv, final String s) {
        if (this.a) {
            vdv.g(gkt.bp(s));
        }
    }
}
