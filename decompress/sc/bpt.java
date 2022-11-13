// 
// Decompiled by Procyon v0.6.0
// 

public final class bpt extends bpm
{
    public bpn a;
    private long b;
    private volatile boolean c;
    private final bpl d;
    
    public bpt(final bbl bbl, final bbp bbp, final ayg ayg, final int n, final Object o, final bpl d) {
        super(bbl, bbp, 2, ayg, n, o, -9223372036854775807L, -9223372036854775807L);
        this.d = d;
    }
    
    public final void a() {
        this.c = true;
    }
    
    public final void b() {
        if (this.b == 0L) {
            this.d.b(this.a, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            final bbp b = this.f.b(this.b);
            final bcm m = this.m;
            final btd btd = new btd((ayb)m, b.g, m.b(b));
            try {
                while (!this.c && this.d.d((btk)btd)) {}
                this.b = btd.c - this.f.g;
                ef.d((bbl)this.m);
            }
            finally {
                this.b = btd.c - this.f.g;
            }
        }
        finally {
            ef.d((bbl)this.m);
            while (true) {}
        }
    }
}
