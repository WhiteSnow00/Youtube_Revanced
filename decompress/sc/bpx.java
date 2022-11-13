// 
// Decompiled by Procyon v0.6.0
// 

public final class bpx extends bph
{
    private final int o;
    private final ayg p;
    private long q;
    private boolean r;
    
    public bpx(final bbl bbl, final bbp bbp, final ayg ayg, final int n, final Object o, final long n2, final long n3, final long n4, final int o2, final ayg p10) {
        super(bbl, bbp, ayg, n, o, n2, n3, -9223372036854775807L, -9223372036854775807L, n4);
        this.o = o2;
        this.p = p10;
    }
    
    public final void a() {
    }
    
    public final void b() {
        final bpj d = this.d();
        d.b(0L);
        final int o = this.o;
        int i = 0;
        final bud a = d.a(0, o);
        a.b(this.p);
        try {
            long b;
            final long n = b = this.m.b(this.f.b(this.q));
            if (n != -1L) {
                b = n + this.q;
            }
            for (btd btd = new btd((ayb)this.m, this.q, b); i != -1; i = a.a((ayb)btd, Integer.MAX_VALUE, true)) {
                this.q += i;
            }
            a.e(this.k, 1, (int)this.q, 0, (buc)null);
            ef.d((bbl)this.m);
            this.r = true;
        }
        finally {
            ef.d((bbl)this.m);
            while (true) {}
        }
    }
    
    public final boolean h() {
        return this.r;
    }
}
