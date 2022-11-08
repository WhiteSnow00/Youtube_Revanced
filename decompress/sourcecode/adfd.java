// 
// Decompiled by Procyon v0.6.0
// 

final class adfd implements Runnable
{
    final /* synthetic */ String a;
    final /* synthetic */ adff b;
    final /* synthetic */ int c;
    final /* synthetic */ anuq d;
    final /* synthetic */ anup e;
    final /* synthetic */ long f;
    final /* synthetic */ adfe g;
    
    public adfd(final adfe g, final String a, final adff b, final int c, final anuq d, final anup e, final long f) {
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
        final anur a = anus.a();
        final String a2 = this.a;
        ((agza)a).copyOnWrite();
        anus.c((anus)a.instance, a2);
        final long a3 = this.b.a;
        ((agza)a).copyOnWrite();
        anus.g((anus)a.instance, (int)a3);
        final int c = this.c;
        ((agza)a).copyOnWrite();
        anus.h((anus)a.instance, c);
        final anuq d = this.d;
        ((agza)a).copyOnWrite();
        anus.i((anus)a.instance, d);
        final anup e = this.e;
        ((agza)a).copyOnWrite();
        anus.d((anus)a.instance, e);
        ((agza)a).copyOnWrite();
        final anus anus = (anus)a.instance;
        int i = 0;
        anus.e(anus, false);
        final adff b = this.b;
        final agza builder = ((agzi)ajig.a).createBuilder();
        final long a4 = b.a;
        builder.copyOnWrite();
        final ajig ajig = (ajig)builder.instance;
        ajig.b |= 0x1;
        ajig.d = (int)a4;
        while (i < 6) {
            final long n = ((int[])b.d)[i];
            final long n2 = ((long[])b.c)[i];
            long n3 = 0L;
            if (n > 0L) {
                n3 = n2 / n;
            }
            final int e2 = (int)n3;
            if (((int[])b.b)[i] > 0 || e2 > 0) {
                final agza builder2 = ((agzi)ajif.a).createBuilder();
                final int c2 = adfe.b[i];
                builder2.copyOnWrite();
                final ajif ajif = (ajif)builder2.instance;
                ajif.b |= 0x1;
                ajif.c = c2;
                final int d2 = ((int[])b.b)[i];
                builder2.copyOnWrite();
                final ajif ajif2 = (ajif)builder2.instance;
                ajif2.b |= 0x2;
                ajif2.d = d2;
                builder2.copyOnWrite();
                final ajif ajif3 = (ajif)builder2.instance;
                ajif3.b |= 0x4;
                ajif3.e = e2;
                builder.copyOnWrite();
                final ajig ajig2 = (ajig)builder.instance;
                final ajif ajif4 = (ajif)builder2.build();
                ajif4.getClass();
                final agzy c3 = ajig2.c;
                if (!c3.c()) {
                    ajig2.c = agzi.mutableCopy(c3);
                }
                ajig2.c.add(ajif4);
            }
            ++i;
        }
        final ajig ajig3 = (ajig)builder.build();
        ((agza)a).copyOnWrite();
        anus.f((anus)a.instance, ajig3);
        final anus anus2 = (anus)((agza)a).build();
        final aklo d3 = aklq.d();
        ((agza)d3).copyOnWrite();
        aklq.aZ((aklq)d3.instance, anus2);
        this.g.n.e((aklq)((agza)d3).build(), this.f);
    }
}
