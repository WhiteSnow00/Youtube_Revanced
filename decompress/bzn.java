// 
// Decompiled by Procyon v0.6.0
// 

public final class bzn implements bzs
{
    private final bat a;
    private final String b;
    private String c;
    private bug d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private ayh i;
    private int j;
    private long k;
    private final atlj l;
    
    public bzn() {
        this(null);
    }
    
    public bzn(final String b) {
        final atlj l = new atlj(new byte[16], null);
        this.l = l;
        this.a = new bat((byte[])l.d);
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.k = -9223372036854775807L;
        this.b = b;
    }
    
    public final void a(final bat bat) {
        bad.c(this.d);
        while (bat.a() > 0) {
            final int e = this.e;
            if (e != 0) {
                if (e != 1) {
                    final int min = Math.min(bat.a(), this.j - this.f);
                    this.d.c(bat, min);
                    final int f = this.f + min;
                    this.f = f;
                    final int j = this.j;
                    if (f != j) {
                        continue;
                    }
                    final long k = this.k;
                    if (k != -9223372036854775807L) {
                        this.d.e(k, 1, j, 0, (buf)null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
                else {
                    final byte[] a = this.a.a;
                    final int min2 = Math.min(bat.a(), 16 - this.f);
                    bat.B(a, this.f, min2);
                    if ((this.f += min2) != 16) {
                        continue;
                    }
                    this.l.m(0);
                    final aeve c = bsw.c(this.l);
                    final ayh i = this.i;
                    if (i == null || i.A != 2 || c.c != i.B || !"audio/ac4".equals(i.n)) {
                        final ayg ayg = new ayg();
                        ayg.a = this.c;
                        ayg.k = "audio/ac4";
                        ayg.x = 2;
                        ayg.y = c.c;
                        ayg.c = this.b;
                        final ayh a2 = ayg.a();
                        this.i = a2;
                        this.d.b(a2);
                    }
                    this.j = c.a;
                    this.h = c.b * 1000000L / this.i.B;
                    this.a.G(0);
                    this.d.c(this.a, 16);
                    this.e = 2;
                }
            }
            else {
                while (bat.a() > 0) {
                    if (this.g) {
                        final int l = bat.i();
                        this.g = (l == 172);
                        byte b = 64;
                        int n;
                        if ((n = l) != 64) {
                            if (l != 65) {
                                continue;
                            }
                            n = 65;
                        }
                        this.e = 1;
                        final byte[] a3 = this.a.a;
                        a3[0] = -84;
                        if (n == 65) {
                            b = 65;
                        }
                        a3[1] = b;
                        this.f = 2;
                        break;
                    }
                    this.g = (bat.i() == 172);
                }
            }
        }
    }
    
    public final void b(final btp btp, final car car) {
        car.c();
        this.c = car.b();
        this.d = btp.q(car.a(), 1);
    }
    
    public final void c() {
    }
    
    public final void d(final long k, final int n) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
    
    public final void e() {
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.k = -9223372036854775807L;
    }
}
