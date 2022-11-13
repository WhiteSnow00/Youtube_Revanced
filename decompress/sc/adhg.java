// 
// Decompiled by Procyon v0.6.0
// 

final class adhg implements Runnable
{
    final String a;
    final adhi b;
    final int c;
    final anwt d;
    final anws e;
    final long f;
    final adhh g;
    
    public adhg(final adhh g, final String a, final adhi b, final int c, final anwt d, final anws e, final long f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void run() {
        final anwu a = anwv.a();
        final String a2 = this.a;
        a.copyOnWrite();
        anwv.c((anwv)a.instance, a2);
        final int n = (int)this.b.a;
        a.copyOnWrite();
        anwv.g((anwv)a.instance, n);
        final int c = this.c;
        a.copyOnWrite();
        anwv.h((anwv)a.instance, c);
        final anwt d = this.d;
        a.copyOnWrite();
        anwv.i((anwv)a.instance, d);
        final anws e = this.e;
        a.copyOnWrite();
        anwv.d((anwv)a.instance, e);
        a.copyOnWrite();
        final anwv anwv = (anwv)a.instance;
        int i = 0;
        anwv.e(anwv, false);
        final adhi b = this.b;
        final ahaz builder = ((ahbh)ajkk.a).createBuilder();
        final int d2 = (int)b.a;
        builder.copyOnWrite();
        final ajkk ajkk = (ajkk)builder.instance;
        ajkk.b |= 0x1;
        ajkk.d = d2;
        while (i < 6) {
            final long n2 = ((int[])b.d)[i];
            final long n3 = ((long[])b.c)[i];
            long n4 = 0L;
            if (n2 > 0L) {
                n4 = n3 / n2;
            }
            final int n5 = ((int[])b.b)[i];
            final int e2 = (int)n4;
            if (n5 > 0 || e2 > 0) {
                final ahaz builder2 = ((ahbh)ajkj.a).createBuilder();
                final int c2 = adhh.b[i];
                builder2.copyOnWrite();
                final ajkj ajkj = (ajkj)builder2.instance;
                ajkj.b |= 0x1;
                ajkj.c = c2;
                final int d3 = ((int[])b.b)[i];
                builder2.copyOnWrite();
                final ajkj ajkj2 = (ajkj)builder2.instance;
                ajkj2.b |= 0x2;
                ajkj2.d = d3;
                builder2.copyOnWrite();
                final ajkj ajkj3 = (ajkj)builder2.instance;
                ajkj3.b |= 0x4;
                ajkj3.e = e2;
                builder.copyOnWrite();
                final ajkk ajkk2 = (ajkk)builder.instance;
                final ajkj ajkj4 = (ajkj)builder2.build();
                ajkj4.getClass();
                final ahbx c3 = ajkk2.c;
                if (!c3.c()) {
                    ajkk2.c = ahbh.mutableCopy(c3);
                }
                ajkk2.c.add((Object)ajkj4);
            }
            ++i;
        }
        final ajkk ajkk3 = (ajkk)builder.build();
        a.copyOnWrite();
        anwv.f((anwv)a.instance, ajkk3);
        final anwv anwv2 = (anwv)a.build();
        final aknr d4 = aknt.d();
        ((ahaz)d4).copyOnWrite();
        aknt.ba((aknt)d4.instance, anwv2);
        this.g.n.e((aknt)((ahaz)d4).build(), this.f);
    }
}
