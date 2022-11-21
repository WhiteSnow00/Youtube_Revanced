// 
// Decompiled by Procyon v0.6.0
// 

final class aajj implements aakp
{
    final String a;
    final amze b;
    final aacw c;
    final byte[] d;
    final aajm e;
    
    public aajj(final aajm e, final String a, final amze b, final aacw c, final byte[] d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void b() {
        final aajm e = this.e;
        final String a = this.a;
        final amze b = this.b;
        final aacw c = this.c;
        final byte[] d = this.d;
        final aaju e2 = e.e;
        final int a2 = e.a();
        Label_0518: {
            if (!e2.b.p() || a2 == 0) {
                break Label_0518;
            }
            int g = 2;
            while (true) {
                try {
                    final ahcr builder = ((ahcz)amwq.a).createBuilder();
                    builder.copyOnWrite();
                    final amwq amwq = (amwq)builder.instance;
                    amwq.c = 1;
                    amwq.b |= 0x1;
                    final String h = vht.h(a2, a);
                    builder.copyOnWrite();
                    final amwq amwq2 = (amwq)builder.instance;
                    h.getClass();
                    amwq2.b |= 0x2;
                    amwq2.d = h;
                    final ahct ahct = (ahct)((ahcz)amwo.b).createBuilder();
                    final int v = ffa.v(306, 2, 2);
                    ((ahcr)ahct).copyOnWrite();
                    final amwo amwo = (amwo)ahct.instance;
                    amwo.c |= 0x1;
                    amwo.d = v;
                    final ahcx b2 = ambg.b;
                    final ahcr builder2 = ambg.a.createBuilder();
                    builder2.copyOnWrite();
                    final ambg ambg = (ambg)builder2.instance;
                    ambg.c |= 0x4;
                    ambg.f = Integer.MAX_VALUE;
                    builder2.copyOnWrite();
                    final ambg ambg2 = (ambg)builder2.instance;
                    ambg2.h = 1;
                    ambg2.c |= 0x10;
                    builder2.copyOnWrite();
                    final ambg ambg3 = (ambg)builder2.instance;
                    ambg3.e = b.k;
                    ambg3.c |= 0x2;
                    final int ordinal = c.ordinal();
                    builder2.copyOnWrite();
                    final ambg ambg4 = (ambg)builder2.instance;
                    ambg4.c |= 0x8;
                    ambg4.g = ordinal;
                    final ahbt x = ahbt.x(d);
                    builder2.copyOnWrite();
                    final ambg ambg5 = (ambg)builder2.instance;
                    ambg5.c |= 0x1;
                    ambg5.d = x;
                    ahct.e((ahci)b2, (Object)builder2.build());
                    final amwo e3 = (amwo)((ahcr)ahct).build();
                    builder.copyOnWrite();
                    final amwq amwq3 = (amwq)builder.instance;
                    e3.getClass();
                    amwq3.e = e3;
                    amwq3.b |= 0x4;
                    final amwq amwq4 = (amwq)builder.build();
                    zzc.f(amwq4, afgh.q(), e2.a.a(amwq4), e2.c, e2.d.a(), e2.a());
                    g = 0;
                    this.e.m(g);
                    return;
                    g = e2.d.a().i().G(a, b, c, d);
                    continue;
                }
                catch (final aaee aaee) {
                    continue;
                }
                break;
            }
        }
    }
}
