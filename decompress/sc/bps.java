// 
// Decompiled by Procyon v0.6.0
// 

public class bps extends bph
{
    private final int o;
    private final long p;
    private long q;
    private volatile boolean r;
    private boolean s;
    private final bpl t;
    
    public bps(final bbl bbl, final bbp bbp, final ayg ayg, final int n, final Object o, final long n2, final long n3, final long n4, final long n5, final long n6, final int o2, final long p13, final bpl t) {
        super(bbl, bbp, ayg, n, o, n2, n3, n4, n5, n6);
        this.o = o2;
        this.p = p13;
        this.t = t;
    }
    
    public final void a() {
        this.r = true;
    }
    
    public final void b() {
        if (this.q == 0L) {
            final bpj d = this.d();
            d.b(this.p);
            final bpl t = this.t;
            final bpn g = this.g(d);
            final long a = this.a;
            long n;
            if (a == -9223372036854775807L) {
                n = -9223372036854775807L;
            }
            else {
                n = a - this.p;
            }
            final long b = this.b;
            long n2;
            if (b == -9223372036854775807L) {
                n2 = -9223372036854775807L;
            }
            else {
                n2 = b - this.p;
            }
            t.b(g, n, n2);
        }
        try {
            final bbp b2 = this.f.b(this.q);
            final bcm m = this.m;
            final btd btd = new btd((ayb)m, b2.g, m.b(b2));
            try {
                while (!this.r && this.t.d((btk)btd)) {}
                this.q = btd.c - this.f.g;
                ef.d((bbl)this.m);
                this.s = (this.r ^ true);
            }
            finally {
                this.q = btd.c - this.f.g;
            }
        }
        finally {
            ef.d((bbl)this.m);
            while (true) {}
        }
    }
    
    public final long f() {
        return this.n + this.o;
    }
    
    protected bpn g(final bpj bpj) {
        return (bpn)bpj;
    }
    
    public final boolean h() {
        return this.s;
    }
}
