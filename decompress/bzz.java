import java.util.Arrays;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzz implements bzs
{
    private final caf a;
    private final caf b;
    private final caf c;
    private long d;
    private final boolean[] e;
    private String f;
    private bug g;
    private bzy h;
    private boolean i;
    private long j;
    private boolean k;
    private final bat l;
    private final dmo m;
    
    public bzz(final dmo m, final byte[] array, final byte[] array2) {
        this.m = m;
        this.e = new boolean[3];
        this.a = new caf(7);
        this.b = new caf(8);
        this.c = new caf(6);
        this.j = -9223372036854775807L;
        this.l = new bat();
    }
    
    private final void f(final byte[] array, final int n, final int n2) {
        if (this.i) {
            final boolean c = this.h.c;
        }
        else {
            this.a.a(array, n, n2);
            this.b.a(array, n, n2);
        }
        this.c.a(array, n, n2);
        final boolean g = this.h.g;
    }
    
    public final void a(final bat bat) {
        bad.c(this.g);
        final int a = baz.a;
        int b = bat.b;
        final int c = bat.c;
        final byte[] a2 = bat.a;
        this.d += bat.a();
        this.g.c(bat, bat.a());
        while (true) {
            final int a3 = bua.a(a2, b, c, this.e);
            if (a3 == c) {
                break;
            }
            final int n = a3 + 3;
            final int e = a2[n] & 0x1F;
            final int n2 = a3 - b;
            if (n2 > 0) {
                this.f(a2, b, a3);
            }
            final int n3 = c - a3;
            final long f = this.d - n3;
            int n4;
            if (n2 < 0) {
                n4 = -n2;
            }
            else {
                n4 = 0;
            }
            final long j = this.j;
            if (this.i) {
                final boolean c2 = this.h.c;
            }
            else {
                this.a.d(n4);
                this.b.d(n4);
                if (!this.i) {
                    if (this.a.a && this.b.a) {
                        final ArrayList m = new ArrayList();
                        final caf a4 = this.a;
                        m.add(Arrays.copyOf(a4.b, a4.c));
                        final caf b2 = this.b;
                        m.add(Arrays.copyOf(b2.b, b2.c));
                        final caf a5 = this.a;
                        final btz c3 = bua.c(a5.b, 3, a5.c);
                        final caf b3 = this.b;
                        final atzq f2 = bua.f(b3.b, b3.c);
                        final String b4 = baf.b(c3.a, c3.b, c3.c);
                        final bug g = this.g;
                        final ayg ayg = new ayg();
                        ayg.a = this.f;
                        ayg.k = "video/avc";
                        ayg.h = b4;
                        ayg.p = c3.e;
                        ayg.q = c3.f;
                        ayg.t = c3.g;
                        ayg.m = m;
                        g.b(ayg.a());
                        this.i = true;
                        this.h.a(c3);
                        this.h.c(f2);
                        this.a.b();
                        this.b.b();
                    }
                }
                else {
                    final caf a6 = this.a;
                    if (a6.a) {
                        this.h.a(bua.c(a6.b, 3, a6.c));
                        this.a.b();
                    }
                    else {
                        final caf b5 = this.b;
                        if (b5.a) {
                            this.h.c(bua.f(b5.b, b5.c));
                            this.b.b();
                        }
                    }
                }
            }
            if (this.c.d(n4)) {
                final caf c4 = this.c;
                this.l.E(this.c.b, bua.b(c4.b, c4.c));
                this.l.G(4);
                this.m.D(j, this.l);
            }
            final bzy h = this.h;
            final boolean i = this.i;
            final boolean k = this.k;
            if (h.e == 9) {
                if (i && h.i) {
                    final long f3 = h.f;
                    final int n5 = (int)(f - f3);
                    final long l = h.k;
                    if (l != -9223372036854775807L) {
                        h.a.e(l, (int)(h.l ? 1 : 0), (int)(f3 - h.j), n3 + n5, (buf)null);
                    }
                }
                h.j = h.f;
                h.k = h.h;
                h.l = false;
                h.i = true;
            }
            final boolean l2 = h.l;
            final int e2 = h.e;
            final boolean l3 = l2 | (e2 == 5 || (k && e2 == 1));
            h.l = l3;
            if (l3) {
                this.k = false;
            }
            final long j2 = this.j;
            if (this.i) {
                final boolean c5 = this.h.c;
            }
            else {
                this.a.c(e);
                this.b.c(e);
            }
            this.c.c(e);
            final bzy h2 = this.h;
            h2.e = e;
            h2.h = j2;
            h2.f = f;
            final boolean b6 = h2.b;
            final boolean c6 = h2.c;
            b = n;
        }
        this.f(a2, b, c);
    }
    
    public final void b(final btp btp, final car car) {
        car.c();
        this.f = car.b();
        this.g = btp.q(car.a(), 2);
        this.h = new bzy(this.g);
        this.m.E(btp, car);
    }
    
    public final void c() {
    }
    
    public final void d(final long j, int n) {
        if (j != -9223372036854775807L) {
            this.j = j;
        }
        final boolean k = this.k;
        if ((n & 0x2) != 0x0) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.k = (((k ? 1 : 0) | n) != 0x0);
    }
    
    public final void e() {
        this.d = 0L;
        this.k = false;
        this.j = -9223372036854775807L;
        bua.d(this.e);
        this.a.b();
        this.b.b();
        this.c.b();
        final bzy h = this.h;
        if (h != null) {
            h.b();
        }
    }
}
