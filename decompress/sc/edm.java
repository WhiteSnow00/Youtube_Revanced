// 
// Decompiled by Procyon v0.6.0
// 

public final class edm implements efp
{
    final Object a;
    private final int b;
    
    public edm(final ead a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public edm(final eeb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final int w, final int x, int i, int n, int n2) {
        if (this.b != 0) {
            final Object a = this.a;
            synchronized (a) {
                final dzt f = ((ead)a).f;
                monitorexit(a);
                if (f != null) {
                    ((ead)a).h(f, w, x, i, n, n2);
                }
                return;
            }
        }
        final eeb eeb = (eeb)this.a;
        eeb.w = w;
        eeb.x = x;
        eeb.F.b = false;
        eeb.C();
        final eeb eeb2 = (eeb)this.a;
        i = eeb2.y;
        if (i != -1) {
            n = Math.max(i, x - w);
            n2 = (int)(n * eeb2.i);
            for (i = Math.max(0, w - n2), n = Math.min(n + w + n2, eeb2.b.size() - 1); i <= n; ++i) {
                ((ebt)eeb2.b.get(i)).s(i, w, x);
            }
        }
    }
}
