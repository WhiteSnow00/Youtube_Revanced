// 
// Decompiled by Procyon v0.6.0
// 

final class bwy
{
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    private final bar g;
    
    public bwy() {
        this.f = new int[255];
        this.g = new bar(255);
    }
    
    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }
    
    public final boolean b(final btj btj, final boolean b) {
        this.a();
        this.g.C(27);
        final boolean f = blx.f(btj, this.g.a, 27, b);
        int i = 0;
        if (f) {
            if (this.g.q() == 1332176723L) {
                if (this.g.i() != 0) {
                    if (b) {
                        return false;
                    }
                    throw ayz.d("unsupported bit stream revision");
                }
                else {
                    this.a = this.g.i();
                    this.b = this.g.n();
                    this.g.o();
                    this.g.o();
                    this.g.o();
                    final int j = this.g.i();
                    this.c = j;
                    this.d = j + 27;
                    this.g.C(j);
                    if (blx.f(btj, this.g.a, this.c, b)) {
                        while (i < this.c) {
                            this.f[i] = this.g.i();
                            this.e += this.f[i];
                            ++i;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean c(final btj btj) {
        return this.d(btj, -1L);
    }
    
    public final boolean d(final btj btj, final long n) {
        final btc btc = (btc)btj;
        dk.f(btc.c == btj.e());
        this.g.C(4);
        while (true) {
            while (n == -1L || btc.c + 4L < n) {
                if (!blx.f(btj, this.g.a, 4, true)) {
                    while (n == -1L || btc.c < n) {
                        int n2;
                        if ((n2 = btc.c(1)) == 0) {
                            n2 = btc.b(btc.a, 0, Math.min(1, 4096), 0, true);
                        }
                        btc.h(n2);
                        if (n2 == -1) {
                            break;
                        }
                    }
                    return false;
                }
                this.g.G(0);
                if (this.g.q() == 1332176723L) {
                    btj.l();
                    return true;
                }
                btj.m(1);
            }
            continue;
        }
    }
}
