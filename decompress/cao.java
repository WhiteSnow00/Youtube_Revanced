// 
// Decompiled by Procyon v0.6.0
// 

final class cao implements cak
{
    final caq a;
    private final atlj b;
    
    public cao(final caq a) {
        this.a = a;
        this.b = new atlj(new byte[4], null);
    }
    
    @Override
    public final void a(final bat bat) {
        if (bat.i() != 0) {
            return;
        }
        if ((bat.i() & 0x80) == 0x0) {
            return;
        }
        bat.H(6);
        for (int n = bat.a() / 4, i = 0; i < n; ++i) {
            bat.I(this.b, 4);
            final int g = this.b.g(16);
            this.b.o(3);
            if (g == 0) {
                this.b.o(13);
            }
            else {
                final int g2 = this.b.g(13);
                if (this.a.b.get(g2) == null) {
                    final caq a = this.a;
                    a.b.put(g2, (Object)new cal(new cap(a, g2)));
                    final caq a2 = this.a;
                    ++a2.f;
                }
            }
        }
        this.a.b.remove(0);
    }
    
    @Override
    public final void b(final bay bay, final btp btp, final car car) {
    }
}
