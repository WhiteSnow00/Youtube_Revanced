import java.util.ArrayList;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bum implements btm
{
    public bup[] a;
    private final bat b;
    private int c;
    private btp d;
    private bun e;
    private long f;
    private long g;
    private bup h;
    private int i;
    private long j;
    private long k;
    private int l;
    private boolean m;
    private final mxt n;
    
    public bum() {
        this.b = new bat(12);
        this.n = new mxt((byte[])null, (byte[])null);
        this.d = (btp)new bto(1);
        this.a = new bup[0];
        this.j = -1L;
        this.k = -1L;
        this.i = -1;
        this.f = -9223372036854775807L;
    }
    
    private final bup a(final int n) {
        for (final bup bup : this.a) {
            if (bup.b == n || bup.c == n) {
                return bup;
            }
        }
        return null;
    }
    
    public final void d(final btp d) {
        this.c = 0;
        this.d = d;
        this.g = -1L;
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        this.g = -1L;
        this.h = null;
        for (final bup bup : this.a) {
            if (bup.h == 0) {
                bup.f = 0;
            }
            else {
                bup.f = bup.j[baz.av(bup.i, n, true)];
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
    
    public final boolean g(final btn btn) {
        btn.j(this.b.a, 0, 12);
        this.b.G(0);
        if (this.b.e() != 1179011410) {
            return false;
        }
        this.b.H(4);
        return this.b.e() == 541677121;
    }
    
    public final int h(final btn btn, final pbg pbg) {
        final long g = this.g;
        final boolean b = false;
        boolean b2 = false;
        Label_0078: {
            if (g != -1L) {
                final long c = ((btg)btn).c;
                if (g < c || g > 262144L + c) {
                    pbg.a = g;
                    b2 = true;
                    break Label_0078;
                }
                btn.m((int)(g - c));
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
                            btn.k(this.b.a, 0, 8);
                            this.b.G(0);
                            final int e = this.b.e();
                            final int e2 = this.b.e();
                            if (e == 829973609) {
                                this.c = 5;
                                this.l = e2;
                            }
                            else {
                                this.g = ((btg)btn).c + e2;
                            }
                            return 0;
                        }
                        if (c2 != 5) {
                            final btg btg = (btg)btn;
                            final long c3 = btg.c;
                            int n2;
                            if (c3 >= this.k) {
                                n2 = -1;
                            }
                            else {
                                final bup h = this.h;
                                if (h != null) {
                                    final int e3 = h.e;
                                    final int e4 = e3 - h.a.a((ayc)btn, e3, false);
                                    h.e = e4;
                                    n2 = (b ? 1 : 0);
                                    if (e4 == 0) {
                                        if (h.d > 0) {
                                            final bug a = h.a;
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
                                            a.e(a2, n3, d, 0, (buf)null);
                                        }
                                        ++h.f;
                                        this.h = null;
                                        return 0;
                                    }
                                }
                                else {
                                    if ((c3 & 0x1L) == 0x1L) {
                                        btn.m(1);
                                    }
                                    btn.j(this.b.a, 0, 12);
                                    this.b.G(0);
                                    final int e5 = this.b.e();
                                    if (e5 == 1414744396) {
                                        this.b.G(8);
                                        if (this.b.e() != 1769369453) {
                                            n = 8;
                                        }
                                        btn.m(n);
                                        btn.l();
                                        n2 = (b ? 1 : 0);
                                    }
                                    else {
                                        final int e6 = this.b.e();
                                        if (e5 == 1263424842) {
                                            this.g = btg.c + e6 + 8L;
                                            n2 = (b ? 1 : 0);
                                        }
                                        else {
                                            btn.m(8);
                                            btn.l();
                                            final bup a3 = this.a(e5);
                                            if (a3 == null) {
                                                this.g = btg.c + e6;
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
                        final bat bat = new bat(this.l);
                        btn.k(bat.a, 0, this.l);
                        final int a4 = bat.a();
                        long n4 = 0L;
                        if (a4 >= 16) {
                            final int b3 = bat.b;
                            bat.H(8);
                            final long n5 = bat.e();
                            final long j = this.j;
                            if (n5 <= j) {
                                n4 = j + 8L;
                            }
                            bat.G(b3);
                        }
                        while (bat.a() >= 16) {
                            final int e7 = bat.e();
                            final int e8 = bat.e();
                            final long n6 = bat.e();
                            bat.e();
                            final bup a5 = this.a(e7);
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
                        for (final bup bup : this.a) {
                            bup.i = Arrays.copyOf(bup.i, bup.h);
                            bup.j = Arrays.copyOf(bup.j, bup.h);
                        }
                        this.m = true;
                        this.d.x((bud)new bul(this, this.f));
                        this.c = 6;
                        this.g = this.j;
                        return 0;
                    }
                    else {
                        final long m = this.j;
                        if (m != -1L && ((btg)btn).c != m) {
                            this.g = m;
                            return 0;
                        }
                        btn.j(this.b.a, 0, 12);
                        btn.l();
                        this.b.G(0);
                        this.n.a(this.b);
                        final int e9 = this.b.e();
                        final mxt n8 = this.n;
                        final int a7 = n8.a;
                        if (a7 == 1179011410) {
                            btn.m(12);
                            return 0;
                        }
                        if (a7 == 1414744396 && e9 == 1769369453) {
                            final btg btg2 = (btg)btn;
                            final long c4 = btg2.c;
                            this.j = c4;
                            this.k = c4 + n8.c + 8L;
                            if (!this.m) {
                                final bun e10 = this.e;
                                bad.b(e10);
                                if ((e10.b & 0x10) == 0x10) {
                                    this.c = 4;
                                    this.g = this.k;
                                    return 0;
                                }
                                this.d.x((bud)new buc(this.f));
                                this.m = true;
                            }
                            this.g = btg2.c + 12L;
                            this.c = 6;
                            return 0;
                        }
                        this.g = ((btg)btn).c + n8.c + 8L;
                        return 0;
                    }
                }
                else {
                    final int n9 = this.i - 4;
                    final bat bat2 = new bat(n9);
                    btn.k(bat2.a, 0, n9);
                    final buq c5 = buq.c(1819436136, bat2);
                    final int b4 = c5.b;
                    if (b4 != 1819436136) {
                        final StringBuilder sb = new StringBuilder("Unexpected header list type ");
                        sb.append(b4);
                        throw azb.a(sb.toString(), null);
                    }
                    final bun e11 = (bun)c5.b(bun.class);
                    if (e11 != null) {
                        this.e = e11;
                        this.f = e11.c * (long)e11.a;
                        final ArrayList<Object> list = new ArrayList<Object>();
                        final afgh a8 = c5.a;
                        final int c6 = ((afjx)a8).c;
                        int n10 = 0;
                        int n11 = 0;
                        while (true) {
                            Object o = null;
                            if (n10 >= c6) {
                                break;
                            }
                            final buk buk = a8.get(n10);
                            if (buk.a() == 1819440243) {
                                final buq buq = (buq)buk;
                                final int n12 = n11 + 1;
                                final buo buo = (buo)buq.b(buo.class);
                                final bur bur = (bur)buq.b(bur.class);
                                Label_1582: {
                                    if (buo == null) {
                                        baq.c("AviExtractor", "Missing Stream Header");
                                    }
                                    else if (bur == null) {
                                        baq.c("AviExtractor", "Missing Stream Format");
                                    }
                                    else {
                                        final long y = baz.y(buo.d, buo.b * 1000000L, buo.c);
                                        final ayh a9 = bur.a;
                                        final ayg b5 = a9.b();
                                        b5.b(n11);
                                        final int e12 = buo.e;
                                        if (e12 != 0) {
                                            b5.l = e12;
                                        }
                                        final bus bus = (bus)buq.b(bus.class);
                                        if (bus != null) {
                                            b5.b = bus.a;
                                        }
                                        int b6 = aza.b(a9.n);
                                        if (b6 != 1) {
                                            if (b6 != 2) {
                                                o = null;
                                                break Label_1582;
                                            }
                                            b6 = 2;
                                        }
                                        final bug q = this.d.q(n11, b6);
                                        q.b(b5.a());
                                        o = new bup(n11, b6, y, buo.d, q);
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
                        this.a = list.toArray(new bup[0]);
                        this.d.r();
                        this.c = 3;
                        return 0;
                    }
                    throw azb.a("AviHeader not found", null);
                }
            }
            else {
                btn.k(this.b.a, 0, 12);
                this.b.G(0);
                final mxt n13 = this.n;
                final bat b7 = this.b;
                n13.a(b7);
                final int a10 = n13.a;
                if (a10 != 1414744396) {
                    final StringBuilder sb2 = new StringBuilder("LIST expected, found: ");
                    sb2.append(a10);
                    throw azb.a(sb2.toString(), null);
                }
                n13.b = b7.e();
                final mxt n14 = this.n;
                final int b8 = n14.b;
                if (b8 != 1819436136) {
                    final StringBuilder sb3 = new StringBuilder("hdrl expected, found: ");
                    sb3.append(b8);
                    throw azb.a(sb3.toString(), null);
                }
                this.i = n14.c;
                this.c = 2;
            }
        }
        else {
            if (!this.g(btn)) {
                throw azb.a("AVI Header List not found", null);
            }
            btn.m(12);
            this.c = 1;
        }
        return 0;
    }
}
