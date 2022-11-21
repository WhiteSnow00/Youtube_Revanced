// 
// Decompiled by Procyon v0.6.0
// 

public final class cae implements bzs
{
    private final bat a;
    private final btx b;
    private final String c;
    private bug d;
    private String e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;
    
    public cae() {
        this(null);
    }
    
    public cae(final String c) {
        this.f = 0;
        final bat a = new bat(4);
        this.a = a;
        a.a[0] = -1;
        this.b = new btx();
        this.l = -9223372036854775807L;
        this.c = c;
    }
    
    public final void a(final bat bat) {
        bad.c(this.d);
    Label_0008:
        while (bat.a() > 0) {
            final int f = this.f;
            if (f != 0) {
                if (f != 1) {
                    final int min = Math.min(bat.a(), this.k - this.g);
                    this.d.c(bat, min);
                    final int g = this.g + min;
                    this.g = g;
                    final int k = this.k;
                    if (g < k) {
                        continue;
                    }
                    final long l = this.l;
                    if (l != -9223372036854775807L) {
                        this.d.e(l, 1, k, 0, (buf)null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
                else {
                    final int min2 = Math.min(bat.a(), 4 - this.g);
                    bat.B(this.a.a, this.g, min2);
                    if ((this.g += min2) < 4) {
                        continue;
                    }
                    this.a.G(0);
                    if (!this.b.a(this.a.d())) {
                        this.g = 0;
                        this.f = 1;
                    }
                    else {
                        final btx b = this.b;
                        this.k = b.c;
                        if (!this.h) {
                            final long n = b.g;
                            final int d = b.d;
                            this.j = n * 1000000L / d;
                            final ayg ayg = new ayg();
                            ayg.a = this.e;
                            ayg.k = b.b;
                            ayg.l = 4096;
                            ayg.x = b.e;
                            ayg.y = d;
                            ayg.c = this.c;
                            this.d.b(ayg.a());
                            this.h = true;
                        }
                        this.a.G(0);
                        this.d.c(this.a, 4);
                        this.f = 2;
                    }
                }
            }
            else {
                final byte[] a = bat.a;
                int i;
                int c;
                for (i = bat.b, c = bat.c; i < c; ++i) {
                    final byte b2 = a[i];
                    final boolean j = (b2 & 0xFF) == 0xFF;
                    final boolean b3 = this.i && (b2 & 0xE0) == 0xE0;
                    this.i = j;
                    if (b3) {
                        bat.G(i + 1);
                        this.i = false;
                        this.a.a[1] = a[i];
                        this.g = 2;
                        this.f = 1;
                        continue Label_0008;
                    }
                }
                bat.G(c);
            }
        }
    }
    
    public final void b(final btp btp, final car car) {
        car.c();
        this.e = car.b();
        this.d = btp.q(car.a(), 1);
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
