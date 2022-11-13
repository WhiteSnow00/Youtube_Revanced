import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class buj implements btj
{
    public bum[] a;
    private final bas b;
    private int c;
    private btm d;
    private buk e;
    private long f;
    private long g;
    private bum h;
    private int i;
    private long j;
    private long k;
    private int l;
    private boolean m;
    private final mxe n;
    
    public buj() {
        this.b = new bas(12);
        this.n = new mxe((byte[])null, (byte[])null);
        this.d = (btm)new btl(1);
        this.a = new bum[0];
        this.j = -1L;
        this.k = -1L;
        this.i = -1;
        this.f = -9223372036854775807L;
    }
    
    private final bum a(final int n) {
        for (final bum bum : this.a) {
            if (bum.b == n || bum.c == n) {
                return bum;
            }
        }
        return null;
    }
    
    public final void d(final btm d) {
        this.c = 0;
        this.d = d;
        this.g = -1L;
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        this.g = -1L;
        this.h = null;
        for (final bum bum : this.a) {
            if (bum.h == 0) {
                bum.f = 0;
            }
            else {
                bum.f = bum.j[bax.av(bum.i, n, true)];
            }
        }
        int c;
        if (n == 0L) {
            if (this.a.length == 0) {
                this.c = 0;
                return;
            }
            c = 3;
        }
        else {
            c = 6;
        }
        this.c = c;
    }
    
    public final boolean g(final btk btk) {
        btk.j(this.b.a, 0, 12);
        this.b.G(0);
        if (this.b.e() != 1179011410) {
            return false;
        }
        this.b.H(4);
        return this.b.e() == 541677121;
    }
    
    public final int h(final btk btk, final paq paq) {
        final long g = this.g;
        final boolean b = false;
        boolean b2 = false;
        Label_0078: {
            if (g != -1L) {
                final long c = ((btd)btk).c;
                if (g < c || g > 262144L + c) {
                    paq.a = g;
                    b2 = true;
                    break Label_0078;
                }
                btk.m((int)(g - c));
            }
            b2 = false;
        }
        this.g = -1L;
        if (b2) {
            return 1;
        }
        final int c2 = this.c;
        int n = 12;
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 2) {
                    if (c2 != 3) {
                        if (c2 == 4) {
                            btk.k(this.b.a, 0, 8);
                            this.b.G(0);
                            final int e = this.b.e();
                            final int e2 = this.b.e();
                            if (e == 829973609) {
                                this.c = 5;
                                this.l = e2;
                            }
                            else {
                                this.g = ((btd)btk).c + e2;
                            }
                            return 0;
                        }
                        if (c2 != 5) {
                            final btd btd = (btd)btk;
                            final long c3 = btd.c;
                            int n2;
                            if (c3 >= this.k) {
                                n2 = -1;
                            }
                            else {
                                final bum h = this.h;
                                if (h != null) {
                                    final int e3 = h.e;
                                    final int e4 = e3 - h.a.a((ayb)btk, e3, false);
                                    h.e = e4;
                                    n2 = (b ? 1 : 0);
                                    if (e4 == 0) {
                                        if (h.d > 0) {
                                            final bud a = h.a;
                                            final long a2 = h.a(h.f);
                                            final int binarySearch = Arrays.binarySearch(h.j, h.f);
                                            final int d = h.d;
                                            int n3;
                                            if (binarySearch >= 0) {
                                                n3 = 1;
                                            }
                                            else {
                                                n3 = 0;
                                            }
                                            a.e(a2, n3, d, 0, (buc)null);
                                        }
                                        ++h.f;
                                        this.h = null;
                                        return 0;
                                    }
                                }
                                else {
                                    if ((c3 & 0x1L) == 0x1L) {
                                        btk.m(1);
                                    }
                                    btk.j(this.b.a, 0, 12);
                                    this.b.G(0);
                                    final int e5 = this.b.e();
                                    if (e5 == 1414744396) {
                                        this.b.G(8);
                                        if (this.b.e() != 1769369453) {
                                            n = 8;
                                        }
                                        btk.m(n);
                                        btk.l();
                                        n2 = (b ? 1 : 0);
                                    }
                                    else {
                                        final int e6 = this.b.e();
                                        if (e5 == 1263424842) {
                                            this.g = btd.c + e6 + 8L;
                                            n2 = (b ? 1 : 0);
                                        }
                                        else {
                                            btk.m(8);
                                            btk.l();
                                            final bum a3 = this.a(e5);
                                            if (a3 == null) {
                                                this.g = btd.c + e6;
                                                n2 = (b ? 1 : 0);
                                            }
                                            else {
                                                a3.d = e6;
                                                a3.e = e6;
                                                this.h = a3;
                                                n2 = (b ? 1 : 0);
                                            }
                                        }
                                    }
                                }
                            }
                            return n2;
                        }
                        final bas bas = new bas(this.l);
                        btk.k(bas.a, 0, this.l);
                        final int a4 = bas.a();
                        long n4 = 0L;
                        if (a4 >= 16) {
                            final int b3 = bas.b;
                            bas.H(8);
                            final long n5 = bas.e();
                            final long j = this.j;
                            if (n5 <= j) {
                                n4 = j + 8L;
                            }
                            bas.G(b3);
                        }
                        while (bas.a() >= 16) {
                            final int e7 = bas.e();
                            final int e8 = bas.e();
                            final long n6 = bas.e();
                            bas.e();
                            final bum a5 = this.a(e7);
                            if (a5 != null) {
                                if ((e8 & 0x10) == 0x10) {
                                    if (a5.h == a5.j.length) {
                                        final long[] i = a5.i;
                                        a5.i = Arrays.copyOf(i, i.length * 3 / 2);
                                        final int[] k = a5.j;
                                        a5.j = Arrays.copyOf(k, k.length * 3 / 2);
                                    }
                                    final long[] l = a5.i;
                                    final int h2 = a5.h;
                                    l[h2] = n6 + n4;
                                    a5.j[h2] = a5.g;
                                    a5.h = h2 + 1;
                                }
                                ++a5.g;
                            }
                        }
                        for (final bum bum : this.a) {
                            bum.i = Arrays.copyOf(bum.i, bum.h);
                            bum.j = Arrays.copyOf(bum.j, bum.h);
                        }
                        this.m = true;
                        this.d.x((bua)new bui(this, this.f));
                        this.c = 6;
                        this.g = this.j;
                        return 0;
                    }
                    else {
                        final long m = this.j;
                        if (m != -1L && ((btd)btk).c != m) {
                            this.g = m;
                            return 0;
                        }
                        btk.j(this.b.a, 0, 12);
                        btk.l();
                        this.b.G(0);
                        this.n.a(this.b);
                        final int e9 = this.b.e();
                        final mxe n8 = this.n;
                        final int a7 = n8.a;
                        if (a7 == 1179011410) {
                            btk.m(12);
                            return 0;
                        }
                        if (a7 == 1414744396 && e9 == 1769369453) {
                            final btd btd2 = (btd)btk;
                            final long c4 = btd2.c;
                            this.j = c4;
                            this.k = c4 + n8.c + 8L;
                            if (!this.m) {
                                final buk e10 = this.e;
                                dk.d((Object)e10);
                                if ((e10.b & 0x10) == 0x10) {
                                    this.c = 4;
                                    this.g = this.k;
                                    return 0;
                                }
                                this.d.x((bua)new btz(this.f));
                                this.m = true;
                            }
                            this.g = btd2.c + 12L;
                            this.c = 6;
                            return 0;
                        }
                        this.g = ((btd)btk).c + n8.c + 8L;
                        return 0;
                    }
                }
                else {
                    final int n9 = this.i - 4;
                    final bas bas2 = new bas(n9);
                    btk.k(bas2.a, 0, n9);
                    final bun c5 = bun.c(1819436136, bas2);
                    final int b4 = c5.b;
                    if (b4 != 1819436136) {
                        final StringBuilder sb = new StringBuilder("Unexpected header list type ");
                        sb.append(b4);
                        throw aza.a(sb.toString(), (Throwable)null);
                    }
                    final buk e11 = (buk)c5.b(buk.class);
                    if (e11 != null) {
                        this.e = e11;
                        this.f = e11.c * (long)e11.a;
                        final ArrayList<Object> list = new ArrayList<Object>();
                        final afeq a8 = c5.a;
                        final int c6 = ((afih)a8).c;
                        int n10 = 0;
                        int n11 = 0;
                        while (true) {
                            Object o = null;
                            if (n10 >= c6) {
                                break;
                            }
                            final buh buh = ((List<buh>)a8).get(n10);
                            if (buh.a() == 1819440243) {
                                final bun bun = (bun)buh;
                                final int n12 = n11 + 1;
                                final bul bul = (bul)bun.b(bul.class);
                                final buo buo = (buo)bun.b(buo.class);
                                Label_1583: {
                                    if (bul == null) {
                                        bap.c("AviExtractor", "Missing Stream Header");
                                    }
                                    else if (buo == null) {
                                        bap.c("AviExtractor", "Missing Stream Format");
                                    }
                                    else {
                                        final long y = bax.y((long)bul.d, bul.b * 1000000L, (long)bul.c);
                                        final ayg a9 = buo.a;
                                        final ayf b5 = a9.b();
                                        b5.b(n11);
                                        final int e12 = bul.e;
                                        if (e12 != 0) {
                                            b5.l = e12;
                                        }
                                        final bup bup = (bup)bun.b(bup.class);
                                        if (bup != null) {
                                            b5.b = bup.a;
                                        }
                                        int b6 = ayz.b(a9.n);
                                        if (b6 != 1) {
                                            if (b6 != 2) {
                                                o = null;
                                                break Label_1583;
                                            }
                                            b6 = 2;
                                        }
                                        final bud q = this.d.q(n11, b6);
                                        q.b(b5.a());
                                        o = new bum(n11, b6, y, bul.d, q);
                                        this.f = y;
                                    }
                                }
                                if (o != null) {
                                    list.add(o);
                                }
                                n11 = n12;
                            }
                            ++n10;
                        }
                        this.a = list.toArray(new bum[0]);
                        this.d.r();
                        this.c = 3;
                        return 0;
                    }
                    throw aza.a("AviHeader not found", (Throwable)null);
                }
            }
            else {
                btk.k(this.b.a, 0, 12);
                this.b.G(0);
                final mxe n13 = this.n;
                final bas b7 = this.b;
                n13.a(b7);
                final int a10 = n13.a;
                if (a10 != 1414744396) {
                    final StringBuilder sb2 = new StringBuilder("LIST expected, found: ");
                    sb2.append(a10);
                    throw aza.a(sb2.toString(), (Throwable)null);
                }
                n13.b = b7.e();
                final mxe n14 = this.n;
                final int b8 = n14.b;
                if (b8 != 1819436136) {
                    final StringBuilder sb3 = new StringBuilder("hdrl expected, found: ");
                    sb3.append(b8);
                    throw aza.a(sb3.toString(), (Throwable)null);
                }
                this.i = n14.c;
                this.c = 2;
            }
        }
        else {
            if (!this.g(btk)) {
                throw aza.a("AVI Header List not found", (Throwable)null);
            }
            btk.m(12);
            this.c = 1;
        }
        return 0;
    }
}
