// 
// Decompiled by Procyon v0.6.0
// 

public final class cab implements bzp
{
    private final bas a;
    private final btu b;
    private final String c;
    private bud d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;
    
    public cab() {
        this(null);
    }
    
    public cab(final String c) {
        this.f = 0;
        final bas a = new bas(4);
        this.a = a;
        a.a[0] = -1;
        this.b = new btu();
        this.l = -9223372036854775807L;
        this.c = c;
    }
    
    public final void a(final bas bas) {
        dk.e((Object)this.d);
    Label_0008:
        while (bas.a() > 0) {
            final int f = this.f;
            if (f != 0) {
                if (f != 1) {
                    final int min = Math.min(bas.a(), this.k - this.g);
                    this.d.c(bas, min);
                    final int g = this.g + min;
                    this.g = g;
                    final int k = this.k;
                    if (g < k) {
                        continue;
                    }
                    final long l = this.l;
                    if (l != -9223372036854775807L) {
                        this.d.e(l, 1, k, 0, (buc)null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
                else {
                    final int min2 = Math.min(bas.a(), 4 - this.g);
                    bas.B(this.a.a, this.g, min2);
                    if ((this.g += min2) < 4) {
                        continue;
                    }
                    this.a.G(0);
                    if (!this.b.a(this.a.d())) {
                        this.g = 0;
                        this.f = 1;
                    }
                    else {
                        final btu b = this.b;
                        this.k = b.c;
                        if (!this.h) {
                            final long n = b.g;
                            final int d = b.d;
                            this.j = n * 1000000L / d;
                            final ayf ayf = new ayf();
                            ayf.a = this.e;
                            ayf.k = b.b;
                            ayf.l = 4096;
                            ayf.x = b.e;
                            ayf.y = d;
                            ayf.c = this.c;
                            this.d.b(ayf.a());
                            this.h = true;
                        }
                        this.a.G(0);
                        this.d.c(this.a, 4);
                        this.f = 2;
                    }
                }
            }
            else {
                final byte[] a = bas.a;
                int i;
                int c;
                for (i = bas.b, c = bas.c; i < c; ++i) {
                    final byte b2 = a[i];
                    final boolean j = (b2 & 0xFF) == 0xFF;
                    final boolean b3 = this.i && (b2 & 0xE0) == 0xE0;
                    this.i = j;
                    if (b3) {
                        bas.G(i + 1);
                        this.i = false;
                        this.a.a[1] = a[i];
                        this.g = 2;
                        this.f = 1;
                        continue Label_0008;
                    }
                }
                bas.G(c);
            }
        }
    }
    
    public final void b(final btm btm, final cao cao) {
        cao.c();
        this.e = cao.b();
        this.d = btm.q(cao.a(), 1);
    }
    
    public final void c() {
    }
    
    public final void d(final long l, final int n) {
        if (l != -9223372036854775807L) {
            this.l = l;
        }
    }
    
    public final void e() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }
}
