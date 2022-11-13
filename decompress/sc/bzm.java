import java.util.Collections;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzm implements bzp
{
    private static final byte[] b;
    public long a;
    private final boolean c;
    private final bas d;
    private final String e;
    private String f;
    private bud g;
    private bud h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private int r;
    private long s;
    private bud t;
    private long u;
    private final atim v;
    
    static {
        b = new byte[] { 73, 68, 51 };
    }
    
    public bzm(final boolean c, final String e) {
        this.v = new atim(new byte[7], (byte[])null);
        this.d = new bas(Arrays.copyOf(bzm.b, 10));
        this.h();
        this.n = -1;
        this.o = -1;
        this.a = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.c = c;
        this.e = e;
    }
    
    public static boolean f(final int n) {
        return (n & 0xFFF6) == 0xFFF0;
    }
    
    private final void g() {
        this.m = false;
        this.h();
    }
    
    private final void h() {
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }
    
    private final void i() {
        this.i = 3;
        this.j = 0;
    }
    
    private final void j(final bud t, final long u, final int j, final int r) {
        this.i = 4;
        this.j = j;
        this.t = t;
        this.u = u;
        this.r = r;
    }
    
    private final boolean k(final bas bas, final byte[] array, final int n) {
        final int min = Math.min(bas.a(), n - this.j);
        bas.B(array, this.j, min);
        final int j = this.j + min;
        this.j = j;
        return j == n;
    }
    
    private static final boolean l(final byte b) {
        return f((b & 0xFF) | 0xFF00);
    }
    
    private static final boolean m(final bas bas, final byte[] array, final int n) {
        if (bas.a() < n) {
            return false;
        }
        bas.B(array, 0, n);
        return true;
    }
    
    public final void a(final bas bas) {
        dk.d((Object)this.g);
        final int a = bax.a;
    Label_0012:
        while (bas.a() > 0) {
            final int i = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            final int min = Math.min(bas.a(), this.r - this.j);
                            this.t.c(bas, min);
                            final int j = this.j + min;
                            this.j = j;
                            final int r = this.r;
                            if (j != r) {
                                continue;
                            }
                            final long s = this.s;
                            if (s != -9223372036854775807L) {
                                this.t.e(s, 1, r, 0, (buc)null);
                                this.s += this.u;
                            }
                            this.h();
                        }
                        else {
                            int n;
                            if (!this.l) {
                                n = 5;
                            }
                            else {
                                n = 7;
                            }
                            if (!this.k(bas, (byte[])this.v.d, n)) {
                                continue;
                            }
                            this.v.m(0);
                            if (!this.q) {
                                final int n2 = this.v.g(2) + 1;
                                if (n2 != 2) {
                                    final StringBuilder sb = new StringBuilder("Detected audio object type: ");
                                    sb.append(n2);
                                    sb.append(", but assuming AAC LC.");
                                    bap.c("AdtsReader", sb.toString());
                                }
                                this.v.o(5);
                                final int g = this.v.g(3);
                                final int o = this.o;
                                final int a2 = bsr.a;
                                final byte[] array = { (byte)((o >> 1 & 0x7) | 0x10), (byte)((g << 3 & 0x78) | (o << 7 & 0x80)) };
                                final ikf a3 = bsr.a(array);
                                final ayf ayf = new ayf();
                                ayf.a = this.f;
                                ayf.k = "audio/mp4a-latm";
                                ayf.h = (String)a3.c;
                                ayf.x = a3.a;
                                ayf.y = a3.b;
                                ayf.m = Collections.singletonList(array);
                                ayf.c = this.e;
                                final ayg a4 = ayf.a();
                                this.a = 1024000000L / a4.B;
                                this.g.b(a4);
                                this.q = true;
                            }
                            else {
                                this.v.o(10);
                            }
                            this.v.o(4);
                            int n3 = this.v.g(13) - 7;
                            if (this.l) {
                                n3 -= 2;
                            }
                            this.j(this.g, this.a, 0, n3);
                        }
                    }
                    else {
                        if (!this.k(bas, this.d.a, 10)) {
                            continue;
                        }
                        this.h.c(this.d, 10);
                        this.d.G(6);
                        this.j(this.h, 0L, 10, this.d.h() + 10);
                    }
                }
                else {
                    if (bas.a() == 0) {
                        continue;
                    }
                    final atim v = this.v;
                    ((byte[])v.d)[0] = bas.a[bas.b];
                    v.m(2);
                    final int g2 = this.v.g(4);
                    final int o2 = this.o;
                    if (o2 != -1 && g2 != o2) {
                        this.g();
                    }
                    else {
                        if (!this.m) {
                            this.m = true;
                            this.n = this.p;
                            this.o = g2;
                        }
                        this.i();
                    }
                }
            }
            else {
                final byte[] a5 = bas.a;
                int k = bas.b;
                while (k < bas.c) {
                    final int n4 = k + 1;
                    final int n5 = a5[k] & 0xFF;
                    Label_1116: {
                        if (this.k == 512 && l((byte)n5)) {
                            Label_1049: {
                                if (!this.m) {
                                    final int n6 = n4 - 2;
                                    bas.G(n6 + 1);
                                    if (!m(bas, (byte[])this.v.d, 1)) {
                                        break Label_1116;
                                    }
                                    this.v.m(4);
                                    final int g3 = this.v.g(1);
                                    final int n7 = this.n;
                                    if (n7 != -1 && g3 != n7) {
                                        break Label_1116;
                                    }
                                    if (this.o != -1) {
                                        if (!m(bas, (byte[])this.v.d, 1)) {
                                            break Label_1049;
                                        }
                                        this.v.m(2);
                                        if (this.v.g(4) != this.o) {
                                            break Label_1116;
                                        }
                                        bas.G(n6 + 2);
                                    }
                                    if (m(bas, (byte[])this.v.d, 4)) {
                                        this.v.m(14);
                                        final int g4 = this.v.g(13);
                                        if (g4 < 7) {
                                            break Label_1116;
                                        }
                                        final byte[] a6 = bas.a;
                                        final int c = bas.c;
                                        int n8 = n6 + g4;
                                        if (n8 < c) {
                                            final byte b = a6[n8];
                                            if (b == -1) {
                                                if (++n8 != c) {
                                                    final byte b2 = a6[n8];
                                                    if (!l(b2) || (b2 & 0x8) >> 3 != g3) {
                                                        break Label_1116;
                                                    }
                                                }
                                            }
                                            else {
                                                if (b != 73) {
                                                    break Label_1116;
                                                }
                                                final int n9 = n8 + 1;
                                                if (n9 != c) {
                                                    if (a6[n9] != 68) {
                                                        break Label_1116;
                                                    }
                                                    final int n10 = n8 + 2;
                                                    if (n10 != c && a6[n10] != 51) {
                                                        break Label_1116;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            this.p = (n5 & 0x8) >> 3;
                            this.l = (0x1 == ((n5 & 0x1) ^ 0x1));
                            if (!this.m) {
                                this.i = 1;
                                this.j = 0;
                            }
                            else {
                                this.i();
                            }
                            bas.G(n4);
                            continue Label_0012;
                        }
                    }
                    final int l = this.k;
                    final int n11 = l | n5;
                    Label_1236: {
                        int m;
                        if (n11 != 329) {
                            if (n11 != 511) {
                                if (n11 != 836) {
                                    if (n11 == 1075) {
                                        this.i = 2;
                                        this.j = 3;
                                        this.r = 0;
                                        this.d.G(0);
                                        bas.G(n4);
                                        continue Label_0012;
                                    }
                                    if (l != 256) {
                                        this.k = 256;
                                        k = n4 - 1;
                                        continue;
                                    }
                                    break Label_1236;
                                }
                                else {
                                    m = 1024;
                                }
                            }
                            else {
                                m = 512;
                            }
                        }
                        else {
                            m = 768;
                        }
                        this.k = m;
                    }
                    k = n4;
                }
                bas.G(k);
            }
        }
    }
    
    public final void b(final btm btm, final cao cao) {
        cao.c();
        this.f = cao.b();
        final bud q = btm.q(cao.a(), 1);
        this.g = q;
        this.t = q;
        if (this.c) {
            cao.c();
            final bud q2 = btm.q(cao.a(), 5);
            this.h = q2;
            final ayf ayf = new ayf();
            ayf.a = cao.b();
            ayf.k = "application/id3";
            q2.b(ayf.a());
            return;
        }
        this.h = (bud)new bti();
    }
    
    public final void c() {
    }
    
    public final void d(final long s, final int n) {
        if (s != -9223372036854775807L) {
            this.s = s;
        }
    }
    
    public final void e() {
        this.s = -9223372036854775807L;
        this.g();
    }
}
