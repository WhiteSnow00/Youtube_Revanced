// 
// Decompiled by Procyon v0.6.0
// 

final class aafr implements aagx
{
    final /* synthetic */ String a;
    final /* synthetic */ amuv b;
    final /* synthetic */ zzf c;
    final /* synthetic */ byte[] d;
    final /* synthetic */ aafu e;
    
    public aafr(final aafu e, final String a, final amuv b, final zzf c, final byte[] d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
    }
    
    public final void b() {
        final aafu e = this.e;
        final String a = this.a;
        final amuv b = this.b;
        final zzf c = this.c;
        final byte[] d = this.d;
        final aagc e2 = e.e;
        final int a2 = e.a();
        Label_0494: {
            if (!e2.b.p() || a2 == 0) {
                break Label_0494;
            }
            int g = 2;
            while (true) {
                try {
                    final agza builder = ((agzi)amsh.a).createBuilder();
                    builder.copyOnWrite();
                    final amsh amsh = (amsh)builder.instance;
                    amsh.c = 1;
                    amsh.b |= 0x1;
                    final String h = vek.h(a2, a);
                    builder.copyOnWrite();
                    final amsh amsh2 = (amsh)builder.instance;
                    h.getClass();
                    amsh2.b |= 0x2;
                    amsh2.d = h;
                    final agzc agzc = (agzc)((agzi)amsf.b).createBuilder();
                    final int m = fbp.m(306, 2, 2);
                    agzc.copyOnWrite();
                    final amsf amsf = (amsf)agzc.instance;
                    amsf.c |= 0x1;
                    amsf.d = m;
                    final agzg b2 = alxb.b;
                    final agza builder2 = ((agzi)alxb.a).createBuilder();
                    builder2.copyOnWrite();
                    final alxb alxb = (alxb)builder2.instance;
                    alxb.c |= 0x4;
                    alxb.f = Integer.MAX_VALUE;
                    builder2.copyOnWrite();
                    final alxb alxb2 = (alxb)builder2.instance;
                    alxb2.h = 1;
                    alxb2.c |= 0x10;
                    builder2.copyOnWrite();
                    final alxb alxb3 = (alxb)builder2.instance;
                    alxb3.e = b.k;
                    alxb3.c |= 0x2;
                    final int ordinal = c.ordinal();
                    builder2.copyOnWrite();
                    final alxb alxb4 = (alxb)builder2.instance;
                    alxb4.c |= 0x8;
                    alxb4.g = ordinal;
                    final agyc x = agyc.x(d);
                    builder2.copyOnWrite();
                    final alxb alxb5 = (alxb)builder2.instance;
                    alxb5.c |= 0x1;
                    alxb5.d = x;
                    agzc.e((agyr)b2, builder2.build());
                    final amsf e3 = (amsf)agzc.build();
                    builder.copyOnWrite();
                    final amsh amsh3 = (amsh)builder.instance;
                    e3.getClass();
                    amsh3.e = e3;
                    amsh3.b |= 0x4;
                    final amsh amsh4 = (amsh)builder.build();
                    zvk.f(amsh4, afcr.q(), e2.a.a(amsh4), e2.c, e2.d.a(), e2.a());
                    g = 0;
                    this.e.m(g);
                    return;
                    g = e2.d.a().i().G(a, b, c, d);
                    continue;
                }
                catch (final aaan aaan) {
                    continue;
                }
                break;
            }
        }
    }
}
