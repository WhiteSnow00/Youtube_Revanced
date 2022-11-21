// 
// Decompiled by Procyon v0.6.0
// 

final class adiv implements Runnable
{
    final String a;
    final adix b;
    final int c;
    final anyz d;
    final anyy e;
    final long f;
    final adiw g;
    
    public adiv(final adiw g, final String a, final adix b, final int c, final anyz d, final anyy e, final long f) {
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
        final anza a = anzb.a();
        final String a2 = this.a;
        ((ahcr)a).copyOnWrite();
        anzb.c((anzb)a.instance, a2);
        final int n = (int)this.b.a;
        ((ahcr)a).copyOnWrite();
        anzb.g((anzb)a.instance, n);
        final int c = this.c;
        ((ahcr)a).copyOnWrite();
        anzb.h((anzb)a.instance, c);
        final anyz d = this.d;
        ((ahcr)a).copyOnWrite();
        anzb.i((anzb)a.instance, d);
        final anyy e = this.e;
        ((ahcr)a).copyOnWrite();
        anzb.d((anzb)a.instance, e);
        ((ahcr)a).copyOnWrite();
        final anzb anzb = (anzb)a.instance;
        int i = 0;
        anzb.e(anzb, false);
        final adix b = this.b;
        final ahcr builder = ajmj.a.createBuilder();
        final int d2 = (int)b.a;
        builder.copyOnWrite();
        final ajmj ajmj = (ajmj)builder.instance;
        ajmj.b |= 0x1;
        ajmj.d = d2;
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
                final ahcr builder2 = ajmi.a.createBuilder();
                final int c2 = adiw.b[i];
                builder2.copyOnWrite();
                final ajmi ajmi = (ajmi)builder2.instance;
                ajmi.b |= 0x1;
                ajmi.c = c2;
                final int d3 = ((int[])b.b)[i];
                builder2.copyOnWrite();
                final ajmi ajmi2 = (ajmi)builder2.instance;
                ajmi2.b |= 0x2;
                ajmi2.d = d3;
                builder2.copyOnWrite();
                final ajmi ajmi3 = (ajmi)builder2.instance;
                ajmi3.b |= 0x4;
                ajmi3.e = e2;
                builder.copyOnWrite();
                final ajmj ajmj2 = (ajmj)builder.instance;
                final ajmi ajmi4 = (ajmi)builder2.build();
                ajmi4.getClass();
                final ahdp c3 = ajmj2.c;
                if (!c3.c()) {
                    ajmj2.c = ahcz.mutableCopy(c3);
                }
                ajmj2.c.add((Object)ajmi4);
            }
            ++i;
        }
        final ajmj ajmj3 = (ajmj)builder.build();
        ((ahcr)a).copyOnWrite();
        anzb.f((anzb)a.instance, ajmj3);
        final anzb anzb2 = (anzb)((ahcr)a).build();
        final akps d4 = akpu.d();
        ((ahcr)d4).copyOnWrite();
        akpu.ba((akpu)d4.instance, anzb2);
        this.g.n.e((akpu)((ahcr)d4).build(), this.f);
    }
}
