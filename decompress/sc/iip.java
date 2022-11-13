import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iip implements aacc
{
    private static final aacb a;
    
    static {
        a = (aacb)new iio(0);
    }
    
    private static final aabz d(final amul amul) {
        final String i = vgl.i(amul.d);
        final aaby a = aabz.a();
        a.a = 2;
        final ahaz builder = ((ahbh)amul.a).createBuilder();
        builder.copyOnWrite();
        final amul amul2 = (amul)builder.instance;
        amul2.c = 3;
        amul2.b |= 0x1;
        final String x = glb.X(i);
        builder.copyOnWrite();
        final amul amul3 = (amul)builder.instance;
        x.getClass();
        amul3.b |= 0x2;
        amul3.d = x;
        a.b(afeq.r((Object)builder.build()));
        return a.a();
    }
    
    private static ahbb e(final amuj amuj) {
        final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
        final int d = amuj.d;
        ((ahaz)ahbb).copyOnWrite();
        final amuj amuj2 = (amuj)ahbb.instance;
        amuj2.c |= 0x1;
        amuj2.d = d;
        ahbb.n((Iterable)new ahbr((List)amuj.e, amuj.a));
        return ahbb;
    }
    
    public final aacb a(final amul amul) {
        final int cu = aqsx.cU(amul.c);
        if (cu != 0) {
            if (cu == 4) {
                return iip.a;
            }
        }
        return aacb.b;
    }
    
    public final ListenableFuture b(final zme zme, amul amul) {
        final String i = vgl.i(amul.d);
        if (i.isEmpty()) {
            return afwm.m((Object)aabz.c);
        }
        final int c = amul.c;
        int cu;
        if ((cu = aqsx.cU(c)) == 0) {
            cu = 1;
        }
        if (--cu == 1) {
            amuj amuj;
            if ((amuj = amul.e) == null) {
                amuj = amuj.b;
            }
            final afel d = afeq.d();
            final ahaz builder = ((ahbh)amul.a).createBuilder();
            builder.copyOnWrite();
            amul = (amul)builder.instance;
            amul.c = 1;
            amul.b |= 0x1;
            final String h = vgl.h(ancz.b.a(), i);
            builder.copyOnWrite();
            amul = (amul)builder.instance;
            h.getClass();
            amul.b |= 0x2;
            amul.d = h;
            final apyp apyp = (apyp)((ahbc)amuj).rx((ahaq)apyp.b);
            final ahbb e = e(amuj);
            if (!((List)new ahbr((List)((amuj)e.instance).e, amuj.a)).contains(amui.c)) {
                e.p(amui.c);
            }
            final ahbf b = ancv.b;
            final ahaz builder2 = ancv.a.createBuilder();
            amwz amwz;
            if ((amwz = amwz.b(apyp.e)) == null) {
                amwz = amwz.a;
            }
            builder2.copyOnWrite();
            final ancv ancv = (ancv)builder2.instance;
            ancv.e = amwz.k;
            ancv.c |= 0x2;
            final String h2 = apyp.h;
            builder2.copyOnWrite();
            final ancv ancv2 = (ancv)builder2.instance;
            h2.getClass();
            ancv2.c |= 0x8;
            ancv2.f = h2;
            final ahab d2 = apyp.d;
            builder2.copyOnWrite();
            final ancv ancv3 = (ancv)builder2.instance;
            d2.getClass();
            ancv3.c |= 0x1;
            ancv3.d = d2;
            e.e((ahaq)b, (Object)builder2.build());
            final amuj e2 = (amuj)((ahaz)e).build();
            builder.copyOnWrite();
            final amul amul2 = (amul)builder.instance;
            e2.getClass();
            amul2.e = e2;
            amul2.b |= 0x4;
            final amul amul3 = (amul)builder.build();
            final ahaz builder3 = ((ahbh)amul.a).createBuilder();
            builder3.copyOnWrite();
            amul = (amul)builder3.instance;
            amul.c = 1;
            amul.b |= 0x1;
            final String h3 = vgl.h(apzn.b.a(), i);
            builder3.copyOnWrite();
            amul = (amul)builder3.instance;
            h3.getClass();
            amul.b |= 0x2;
            amul.d = h3;
            final apyp apyp2 = (apyp)((ahbc)amuj).rx((ahaq)apyp.b);
            final ahaz builder4 = ((ahbh)apzh.a).createBuilder();
            amwz amwz2;
            if ((amwz2 = amwz.b(apyp2.e)) == null) {
                amwz2 = amwz.a;
            }
            builder4.copyOnWrite();
            final apzh apzh = (apzh)builder4.instance;
            apzh.e = amwz2.k;
            apzh.c |= 0x2;
            final ahab d3 = apyp2.d;
            builder4.copyOnWrite();
            final apzh apzh2 = (apzh)builder4.instance;
            d3.getClass();
            apzh2.c |= 0x1;
            apzh2.d = d3;
            final String h4 = apyp2.h;
            builder4.copyOnWrite();
            final apzh apzh3 = (apzh)builder4.instance;
            h4.getClass();
            apzh3.c |= 0x10;
            apzh3.h = h4;
            final int c2 = apyp2.c;
            if ((c2 & 0x8) != 0x0 && (c2 & 0x10) != 0x0) {
                apzn f;
                if ((f = apyp2.f) == null) {
                    f = apzn.a;
                }
                builder4.copyOnWrite();
                final apzh apzh4 = (apzh)builder4.instance;
                f.getClass();
                apzh4.f = f;
                apzh4.c |= 0x4;
                apyk g;
                if ((g = apyp2.g) == null) {
                    g = apyk.a;
                }
                builder4.copyOnWrite();
                final apzh apzh5 = (apzh)builder4.instance;
                g.getClass();
                apzh5.g = g;
                apzh5.c |= 0x8;
            }
            final ahbb e3 = e(amuj);
            e3.e((ahaq)apzh.b, (Object)builder4.build());
            final amuj e4 = (amuj)((ahaz)e3).build();
            builder3.copyOnWrite();
            amul = (amul)builder3.instance;
            e4.getClass();
            amul.e = e4;
            amul.b |= 0x4;
            builder3.bt(amul3);
            d.h(builder3.build());
            final aaby a = aabz.a();
            a.a = 2;
            a.b(d.g());
            return afwm.m((Object)a.a());
        }
        if (cu == 2) {
            amuj amuj2;
            if ((amuj2 = amul.e) == null) {
                amuj2 = amuj.b;
            }
            final afel d4 = afeq.d();
            final ahaz builder5 = ((ahbh)amul.a).createBuilder();
            builder5.copyOnWrite();
            final amul amul4 = (amul)builder5.instance;
            amul4.c = 2;
            amul4.b |= 0x1;
            final String h5 = vgl.h(ancz.b.a(), i);
            builder5.copyOnWrite();
            final amul amul5 = (amul)builder5.instance;
            h5.getClass();
            amul5.b |= 0x2;
            amul5.d = h5;
            builder5.copyOnWrite();
            final amul amul6 = (amul)builder5.instance;
            amuj2.getClass();
            amul6.e = amuj2;
            amul6.b |= 0x4;
            final amul amul7 = (amul)builder5.build();
            final ahaz builder6 = ((ahbh)amul.a).createBuilder();
            builder6.copyOnWrite();
            final amul amul8 = (amul)builder6.instance;
            amul8.c = 2;
            amul8.b |= 0x1;
            final String h6 = vgl.h(apzn.b.a(), i);
            builder6.copyOnWrite();
            final amul amul9 = (amul)builder6.instance;
            h6.getClass();
            amul9.b |= 0x2;
            amul9.d = h6;
            builder6.copyOnWrite();
            final amul amul10 = (amul)builder6.instance;
            amuj2.getClass();
            amul10.e = amuj2;
            amul10.b |= 0x4;
            builder6.bt(amul7);
            d4.h(builder6.build());
            final aaby a2 = aabz.a();
            a2.a = 2;
            a2.b(d4.g());
            return afwm.m((Object)a2.a());
        }
        if (cu != 3) {
            int cu2;
            if ((cu2 = aqsx.cU(c)) == 0) {
                cu2 = 1;
            }
            ttr.e("Could not handle action: %s for type %s", new Object[] { cu2 - 1, 155 });
            return afwm.m((Object)aabz.c);
        }
        return afwm.m((Object)d(amul));
    }
    
    public final ListenableFuture c(final zme zme, final afeq afeq) {
        int i = 0;
        final int cu = aqsx.cU(((amul)afeq.get(0)).c);
        if (cu != 0) {
            if (cu == 4) {
                final afel d = afeq.d();
                while (i < ((afih)afeq).c) {
                    d.h(d(((List<amul>)afeq).get(i)));
                    ++i;
                }
                return afwm.m((Object)d.g());
            }
        }
        int cu2;
        if ((cu2 = aqsx.cU(((amul)afeq.get(0)).c)) == 0) {
            cu2 = 1;
        }
        throw new UnsupportedOperationException("Cannot handle batched type: ".concat(aqsx.cT(cu2)));
    }
}
