// 
// Decompiled by Procyon v0.6.0
// 

final class arxp implements Runnable
{
    final arxo a;
    final /* synthetic */ String b;
    final /* synthetic */ arug c;
    final /* synthetic */ aruk d;
    final /* synthetic */ asfc e;
    final /* synthetic */ arrk f;
    final /* synthetic */ arxq g;
    
    public arxp(final arxq g, final String b, final arug c, final aruk d, final asfc e, final arrk f) {
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = new arxo(b, g.a, g.e, c, g, (Runnable)this, g.c, g.f, d, e, f, g.g);
    }
    
    @Override
    public final void run() {
        synchronized (this.g.c) {
            final arxq g = this.g;
            if (g.h) {
                ((arxu)this.a.o).f(g.i, true, new arug());
            }
            else {
                if (!g.j) {
                    throw new AssertionError((Object)"Transport is not started");
                }
                final arxo a = this.a;
                g.d.add(a);
                a.o.z.p = g.k;
            }
        }
    }
}
