// 
// Decompiled by Procyon v0.6.0
// 

public final class aabv implements aacd
{
    private final wza a;
    private final tkq b;
    private final oco c;
    private final aafz d;
    private final top e;
    private final acoe f;
    private final acjq g;
    
    public aabv(final wza a, final acjq g, final tkq b, final oco c, final aafz d, final top e, final acoe f, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final amwy amwy) {
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.aX((akpu)d.instance, amwy);
        this.a.d((akpu)((ahcr)d).build());
    }
    
    public final void b(amxv c) {
        final long c2 = this.c.c();
        twd.n(c.d);
        final int ce = aqvq.cE(c.h);
        final boolean b = false;
        boolean b2 = false;
        Label_0073: {
            while (true) {
                Label_0047: {
                    if (ce == 0) {
                        break Label_0047;
                    }
                    if (ce == 1) {
                        break Label_0047;
                    }
                    b2 = true;
                    break Label_0073;
                }
                final int cd = aqvq.cD(c.g);
                if (cd != 0 && cd != 1) {
                    continue;
                }
                break;
            }
            b2 = false;
        }
        adme.K(b2);
        final ahcr builder = ((ahcz)c).toBuilder();
        final long l = this.g.t() / 1024L;
        builder.copyOnWrite();
        final amxv amxv = (amxv)builder.instance;
        amxv.b |= 0x200;
        amxv.l = l;
        final ajfx f = this.b.f();
        builder.copyOnWrite();
        final amxv amxv2 = (amxv)builder.instance;
        amxv2.p = f.B;
        amxv2.b |= 0x4000;
        boolean k;
        if (!this.d.R()) {
            k = b;
        }
        else {
            k = this.e.k(this.d.y(this.e));
        }
        builder.copyOnWrite();
        final amxv amxv3 = (amxv)builder.instance;
        amxv3.c |= 0x10;
        amxv3.y = k;
        c = (amxv)builder.build();
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.bS((akpu)d.instance, c);
        this.a.e((akpu)((ahcr)d).build(), c2);
        if ((c.b & 0x2) != 0x0) {
            final acoe f2 = this.f;
            int ce2;
            if ((ce2 = aqvq.cE(c.h)) == 0) {
                ce2 = 1;
            }
            final wzh wzh = new wzh(ce2 - 1, 3);
            final ahcr builder2 = ((ahcz)ajve.a).createBuilder();
            final ahcr builder3 = ((ahcz)amxu.a).createBuilder();
            builder3.copyOnWrite();
            final amxu amxu = (amxu)builder3.instance;
            c.getClass();
            amxu.c = c;
            amxu.b |= 0x1;
            builder2.copyOnWrite();
            final ajve ajve = (ajve)builder2.instance;
            final amxu d2 = (amxu)builder3.build();
            d2.getClass();
            ajve.d = d2;
            ajve.b |= 0x2;
            wzh.a = (ajve)builder2.build();
            f2.f(wzh, ajvy.c, c.e, c2);
        }
    }
    
    public final boolean c(final amvs amvs) {
        final long c = this.c.c();
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.ah((akpu)d.instance, amvs);
        return this.a.e((akpu)((ahcr)d).build(), c);
    }
    
    public final void d(final String c, final int n, final apry e, final int f, final int g, final boolean h) {
        final ahcr builder = ((ahcz)amwz.a).createBuilder();
        builder.copyOnWrite();
        final amwz amwz = (amwz)builder.instance;
        c.getClass();
        amwz.b |= 0x1;
        amwz.c = c;
        builder.copyOnWrite();
        final amwz amwz2 = (amwz)builder.instance;
        amwz2.d = n - 1;
        amwz2.b |= 0x2;
        builder.copyOnWrite();
        final amwz amwz3 = (amwz)builder.instance;
        e.getClass();
        amwz3.e = e;
        amwz3.b |= 0x8;
        builder.copyOnWrite();
        final amwz amwz4 = (amwz)builder.instance;
        amwz4.b |= 0x20;
        amwz4.f = f;
        builder.copyOnWrite();
        final amwz amwz5 = (amwz)builder.instance;
        amwz5.b |= 0x40;
        amwz5.g = g;
        builder.copyOnWrite();
        final amwz amwz6 = (amwz)builder.instance;
        amwz6.b |= 0x100;
        amwz6.h = h;
        final amwz amwz7 = (amwz)builder.build();
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.aw((akpu)d.instance, amwz7);
        this.a.d((akpu)((ahcr)d).build());
    }
    
    public final void e(final afbh afbh, final int n, final int n2) {
        final ahcr builder = ((ahcz)anfq.a).createBuilder();
        if (afbh.h()) {
            final String c = (String)afbh.c();
            builder.copyOnWrite();
            final anfq anfq = (anfq)builder.instance;
            anfq.b |= 0x1;
            anfq.c = c;
        }
        builder.copyOnWrite();
        final anfq anfq2 = (anfq)builder.instance;
        anfq2.d = n - 1;
        anfq2.b |= 0x2;
        builder.copyOnWrite();
        final anfq anfq3 = (anfq)builder.instance;
        anfq3.e = n2 - 1;
        anfq3.b |= 0x4;
        final akps d = akpu.d();
        ((ahcr)d).copyOnWrite();
        akpu.bD((akpu)d.instance, (anfq)builder.build());
        this.a.d((akpu)((ahcr)d).build());
    }
}
