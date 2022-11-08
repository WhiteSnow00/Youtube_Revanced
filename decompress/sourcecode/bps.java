// 
// Decompiled by Procyon v0.6.0
// 

public final class bps extends bpl
{
    public bpm a;
    private long b;
    private volatile boolean c;
    private final bpk d;
    
    public bps(final bbk bbk, final bbo bbo, final ayf ayf, final int n, final Object o, final bpk d) {
        super(bbk, bbo, 2, ayf, n, o, -9223372036854775807L, -9223372036854775807L);
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
            final bbo b = this.f.b(this.b);
            final bcl m = this.m;
            final btc btc = new btc((aya)m, b.g, m.b(b));
            try {
                while (!this.c && this.d.d((btj)btc)) {}
                this.b = btc.c - this.f.g;
                ef.d((bbk)this.m);
            }
            finally {
                this.b = btc.c - this.f.g;
            }
        }
        finally {
            ef.d((bbk)this.m);
            while (true) {}
        }
    }
}
