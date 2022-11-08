import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iel extends icx
{
    private final atjj a;
    
    public iel(final atjj a) {
        this.a = a;
    }
    
    private final void k(final zyx zyx) {
        final bhu bhu = (bhu)this.a.a();
        final String e = fms.e(zyx.a);
        apwq apwq;
        if (!zyx.a.startsWith("BL")) {
            apwq = apwq.b;
        }
        else {
            final int n = gkt.aT(zyx) - 1;
            if (n != 2) {
                if (n != 3) {
                    apwq = apwq.c;
                }
                else {
                    apwq = apwq.e;
                }
            }
            else {
                apwq = apwq.d;
            }
        }
        bhu.D(e, (Object)apwq);
    }
    
    private static final apwl l(final zyz zyz) {
        final zyx a = zyz.a;
        final List b = zyz.b;
        final String a2 = a.a;
        final String bs = gkt.bs(a2);
        bs.getClass();
        agot.E(bs.isEmpty() ^ true, (Object)"key cannot be empty");
        final agza builder = ((agzi)apwp.a).createBuilder();
        builder.copyOnWrite();
        final apwp apwp = (apwp)builder.instance;
        apwp.c |= 0x1;
        apwp.d = bs;
        final apwl apwl = new apwl(builder);
        final agza a3 = apwl.a;
        a3.copyOnWrite();
        final apwp apwp2 = (apwp)a3.instance;
        apwp2.c |= 0x4;
        apwp2.e = a2;
        final String b2 = a.b;
        final agza a4 = apwl.a;
        a4.copyOnWrite();
        final apwp apwp3 = (apwp)a4.instance;
        b2.getClass();
        apwp3.c |= 0x10;
        apwp3.g = b2;
        final Iterator iterator = b.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            int i = 0;
            if (!hasNext) {
                break;
            }
            final String bu = gkt.bu(a2, (String)iterator.next());
            while (i <= 0) {
                final String s = (new String[] { bu })[i];
                final agza a5 = apwl.a;
                a5.copyOnWrite();
                final apwp apwp4 = (apwp)a5.instance;
                s.getClass();
                final agzy l = apwp4.l;
                if (!l.c()) {
                    apwp4.l = agzi.mutableCopy(l);
                }
                apwp4.l.add((Object)s);
                ++i;
            }
        }
        final agp n = a.n;
        if (n != null) {
            final String av = gkt.aV((String)n.e);
            final agza a6 = apwl.a;
            a6.copyOnWrite();
            final apwp apwp5 = (apwp)a6.instance;
            av.getClass();
            apwp5.c |= 0x8;
            apwp5.f = av;
        }
        final int f = apwq.b.f;
        final agza builder2 = ((agzi)anib.a).createBuilder();
        final aorm e = a.d.e();
        builder2.copyOnWrite();
        final anib anib = (anib)builder2.instance;
        e.getClass();
        anib.c = e;
        anib.b = 1;
        apwl.b(Integer.valueOf(f), (anib)builder2.build());
        final aorm as = gkt.aS(a);
        apwl.b(Integer.valueOf(4), fbp.q(as));
        apwl.b(Integer.valueOf(3), fbp.q(as));
        apwl.b(Integer.valueOf(2), fbp.q(null));
        apwl.b(Integer.valueOf(0), fbp.q(null));
        return apwl;
    }
    
    public final afdu e(final aack aack) {
        final afds i = afdu.i();
        for (final zyz zyz : aack.i().l()) {
            i.h(l(zyz));
            this.k(zyz.a);
        }
        return i.g();
    }
    
    public final void g(final vdv vdv, final zyz zyz) {
        vdv.j((vdj)l(zyz));
        this.k(zyz.a);
    }
    
    public final void h(final vdv vdv, final String s) {
        vdv.g(gkt.bs(s));
        ((bhu)this.a.a()).C(fms.e(s));
    }
    
    public final void i(final vdv vdv, final zyz zyz) {
        vdv.j((vdj)l(zyz));
        this.k(zyz.a);
    }
    
    public final void j(final vdv vdv, final zyz zyz) {
        vdv.j((vdj)l(zyz));
    }
}
