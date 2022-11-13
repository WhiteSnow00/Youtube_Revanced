import java.util.Arrays;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzw implements bzp
{
    private final cac a;
    private final cac b;
    private final cac c;
    private long d;
    private final boolean[] e;
    private String f;
    private bud g;
    private bzv h;
    private boolean i;
    private long j;
    private boolean k;
    private final bas l;
    private final dml m;
    
    public bzw(final dml m, final byte[] array, final byte[] array2) {
        this.m = m;
        this.e = new boolean[3];
        this.a = new cac(7);
        this.b = new cac(8);
        this.c = new cac(6);
        this.j = -9223372036854775807L;
        this.l = new bas();
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
    
    public final void a(final bas bas) {
        dk.e((Object)this.g);
        final int a = bax.a;
        int b = bas.b;
        final int c = bas.c;
        final byte[] a2 = bas.a;
        this.d += bas.a();
        this.g.c(bas, bas.a());
        while (true) {
            final int a3 = btx.a(a2, b, c, this.e);
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
                        final cac a4 = this.a;
                        m.add(Arrays.copyOf(a4.b, a4.c));
                        final cac b2 = this.b;
                        m.add(Arrays.copyOf(b2.b, b2.c));
                        final cac a5 = this.a;
                        final btw c3 = btx.c(a5.b, 3, a5.c);
                        final cac b3 = this.b;
                        final atwt f2 = btx.f(b3.b, b3.c);
                        final String b4 = bae.b(c3.a, c3.b, c3.c);
                        final bud g = this.g;
                        final ayf ayf = new ayf();
                        ayf.a = this.f;
                        ayf.k = "video/avc";
                        ayf.h = b4;
                        ayf.p = c3.e;
                        ayf.q = c3.f;
                        ayf.t = c3.g;
                        ayf.m = m;
                        g.b(ayf.a());
                        this.i = true;
                        this.h.a(c3);
                        this.h.c(f2);
                        this.a.b();
                        this.b.b();
                    }
                }
                else {
                    final cac a6 = this.a;
                    if (a6.a) {
                        this.h.a(btx.c(a6.b, 3, a6.c));
                        this.a.b();
                    }
                    else {
                        final cac b5 = this.b;
                        if (b5.a) {
                            this.h.c(btx.f(b5.b, b5.c));
                            this.b.b();
                        }
                    }
                }
            }
            if (this.c.d(n4)) {
                final cac c4 = this.c;
                this.l.E(this.c.b, btx.b(c4.b, c4.c));
                this.l.G(4);
                this.m.D(j, this.l);
            }
            final bzv h = this.h;
            final boolean i = this.i;
            final boolean k = this.k;
            if (h.e == 9) {
                if (i && h.i) {
                    final long f3 = h.f;
                    final int n5 = (int)(f - f3);
                    final long l = h.k;
                    if (l != -9223372036854775807L) {
                        h.a.e(l, (int)(h.l ? 1 : 0), (int)(f3 - h.j), n3 + n5, (buc)null);
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
            final bzv h2 = this.h;
            h2.e = e;
            h2.h = j2;
            h2.f = f;
            final boolean b6 = h2.b;
            final boolean c6 = h2.c;
            b = n;
        }
        this.f(a2, b, c);
    }
    
    public final void b(final btm btm, final cao cao) {
        cao.c();
        this.f = cao.b();
        this.g = btm.q(cao.a(), 2);
        this.h = new bzv(this.g);
        this.m.E(btm, cao);
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
        btx.d(this.e);
        this.a.b();
        this.b.b();
        this.c.b();
        final bzv h = this.h;
        if (h != null) {
            h.b();
        }
    }
}
