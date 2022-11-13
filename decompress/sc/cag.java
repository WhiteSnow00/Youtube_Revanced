import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cag implements btj
{
    private final baw a;
    private final SparseArray b;
    private final bas c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private btm h;
    private boolean i;
    private final cak j;
    private egk k;
    
    public cag() {
        final baw a = new baw(0L);
        this.a = a;
        this.c = new bas(4096);
        this.b = new SparseArray();
        this.j = new cak((byte[])null);
    }
    
    public final void d(final btm h) {
        this.h = h;
    }
    
    public final void e() {
    }
    
    public final void f(long c, final long n) {
        final baw a = this.a;
        Label_0050: {
            if (a.e() != -9223372036854775807L) {
                c = a.c();
                if (c == -9223372036854775807L || c == 0L || c == n) {
                    break Label_0050;
                }
            }
            a.f(n);
        }
        final egk k = this.k;
        if (k != null) {
            k.a(n);
        }
        for (int i = 0; i < this.b.size(); ++i) {
            final lvy lvy = (lvy)this.b.valueAt(i);
            lvy.c = false;
            ((bzp)lvy.f).e();
        }
    }
    
    public final boolean g(final btk btk) {
        final byte[] array = new byte[14];
        btk.j(array, 0, 14);
        if (((array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF)) != 0x1BA) {
            return false;
        }
        if ((array[4] & 0xC4) != 0x44) {
            return false;
        }
        if ((array[6] & 0x4) != 0x4) {
            return false;
        }
        if ((array[8] & 0x4) != 0x4) {
            return false;
        }
        if ((array[9] & 0x1) != 0x1) {
            return false;
        }
        if ((array[12] & 0x3) != 0x3) {
            return false;
        }
        btk.g(array[13] & 0x7);
        btk.j(array, 0, 3);
        return ((array[0] & 0xFF) << 16 | (array[1] & 0xFF) << 8 | (array[2] & 0xFF)) == 0x1;
    }
    
    public final int h(final btk btk, final paq paq) {
        dk.e((Object)this.h);
        final btd btd = (btd)btk;
        final long b = btd.b;
        final long n = -9223372036854775807L;
        int n2 = 1;
        if (b != -1L) {
            final cak j = this.j;
            if (!j.c) {
                if (!j.e) {
                    final int n3 = (int)Math.min(20000L, b);
                    final long a = b - n3;
                    if (btd.c != a) {
                        paq.a = a;
                        return n2;
                    }
                    j.b.C(n3);
                    btk.l();
                    btk.j(j.b.a, 0, n3);
                    final bas b2 = j.b;
                    final int b3 = b2.b;
                    int n4 = b2.c - 4;
                    long b4;
                    while (true) {
                        b4 = n;
                        if (n4 < b3) {
                            break;
                        }
                        if (cak.d(b2.a, n4) == 442) {
                            b2.G(n4 + 4);
                            b4 = cak.b(b2);
                            if (b4 != -9223372036854775807L) {
                                break;
                            }
                        }
                        --n4;
                    }
                    j.g = b4;
                    j.e = true;
                }
                else if (j.g == -9223372036854775807L) {
                    j.c(btk);
                }
                else if (!j.d) {
                    final int n5 = (int)Math.min(20000L, b);
                    if (btd.c != 0L) {
                        paq.a = 0L;
                        return n2;
                    }
                    j.b.C(n5);
                    btk.l();
                    btk.j(j.b.a, 0, n5);
                    final bas b5 = j.b;
                    int b6 = b5.b;
                    final int c = b5.c;
                    long b7;
                    while (true) {
                        b7 = n;
                        if (b6 >= c - 3) {
                            break;
                        }
                        if (cak.d(b5.a, b6) == 442) {
                            b5.G(b6 + 4);
                            b7 = cak.b(b5);
                            if (b7 != -9223372036854775807L) {
                                break;
                            }
                        }
                        ++b6;
                    }
                    j.f = b7;
                    j.d = true;
                }
                else {
                    final long f = j.f;
                    if (f == -9223372036854775807L) {
                        j.c(btk);
                    }
                    else {
                        final long h = j.a.b(j.g) - j.a.b(f);
                        j.h = h;
                        if (h < 0L) {
                            final StringBuilder sb = new StringBuilder("Invalid duration: ");
                            sb.append(h);
                            sb.append(". Using TIME_UNSET instead.");
                            bap.c("PsDurationReader", sb.toString());
                            j.h = -9223372036854775807L;
                        }
                        j.c(btk);
                    }
                }
                n2 = 0;
                return n2;
            }
        }
        if (!this.i) {
            this.i = true;
            final cak i = this.j;
            final long h2 = i.h;
            if (h2 != -9223372036854775807L) {
                final egk k = new egk((bsy)new bsw(), (bta)new caf(i.a), h2, h2 + 1L, 0L, b, 188L, 1000);
                this.k = k;
                this.h.x((bua)k.b);
            }
            else {
                this.h.x((bua)new btz(-9223372036854775807L));
            }
        }
        final egk l = this.k;
        if (l != null && l.b()) {
            return l.f(btk, paq);
        }
        btk.l();
        long n6;
        if (b != -1L) {
            n6 = b - btk.e();
        }
        else {
            n6 = -1L;
        }
        if (n6 != -1L && n6 < 4L) {
            return -1;
        }
        if (!btk.o(this.c.a, 0, 4, true)) {
            return -1;
        }
        this.c.G(0);
        final int d = this.c.d();
        if (d == 441) {
            return -1;
        }
        if (d == 442) {
            btk.j(this.c.a, 0, 10);
            this.c.G(9);
            btk.m((this.c.i() & 0x7) + 14);
            return 0;
        }
        if (d == 443) {
            btk.j(this.c.a, 0, 2);
            this.c.G(0);
            btk.m(this.c.m() + 6);
            return 0;
        }
        if (d >> 8 != 1) {
            btk.m(1);
            return 0;
        }
        final int n7 = d & 0xFF;
        lvy lvy2;
        final lvy lvy = lvy2 = (lvy)this.b.get(n7);
        if (!this.d) {
            lvy lvy3;
            if ((lvy3 = lvy) == null) {
                Object o;
                if (n7 == 189) {
                    o = new bzi();
                    this.e = true;
                    this.g = btd.c;
                }
                else if ((n7 & 0xE0) == 0xC0) {
                    o = new cab(null);
                    this.e = true;
                    this.g = btd.c;
                }
                else if ((n7 & 0xF0) == 0xE0) {
                    o = new bzr(null, null, null, null);
                    this.f = true;
                    this.g = btd.c;
                }
                else {
                    o = null;
                }
                lvy3 = lvy;
                if (o != null) {
                    ((bzp)o).b(this.h, new cao(n7, 256));
                    lvy3 = new lvy((bzp)o, this.a);
                    this.b.put(n7, (Object)lvy3);
                }
            }
            final boolean e = this.e;
            long n8 = 1048576L;
            if (e) {
                n8 = n8;
                if (this.f) {
                    n8 = this.g + 8192L;
                }
            }
            lvy2 = lvy3;
            if (btd.c > n8) {
                this.d = true;
                this.h.r();
                lvy2 = lvy3;
            }
        }
        btk.j(this.c.a, 0, 2);
        this.c.G(0);
        final int n9 = this.c.m() + 6;
        if (lvy2 == null) {
            btk.m(n9);
        }
        else {
            this.c.C(n9);
            btk.k(this.c.a, 0, n9);
            this.c.G(6);
            final bas c2 = this.c;
            c2.B((byte[])((atim)lvy2.d).d, 0, 3);
            ((atim)lvy2.d).m(0);
            ((atim)lvy2.d).o(8);
            lvy2.a = ((atim)lvy2.d).q();
            lvy2.b = ((atim)lvy2.d).q();
            ((atim)lvy2.d).o(6);
            c2.B((byte[])((atim)lvy2.d).d, 0, ((atim)lvy2.d).g(8));
            ((atim)lvy2.d).m(0);
            long b8;
            if (lvy2.a) {
                ((atim)lvy2.d).o(4);
                final long n10 = ((atim)lvy2.d).g(3);
                ((atim)lvy2.d).o(1);
                final int g = ((atim)lvy2.d).g(15);
                ((atim)lvy2.d).o(1);
                final long n11 = ((atim)lvy2.d).g(15);
                ((atim)lvy2.d).o(1);
                if (!lvy2.c && lvy2.b) {
                    ((atim)lvy2.d).o(4);
                    final long n12 = ((atim)lvy2.d).g(3);
                    ((atim)lvy2.d).o(1);
                    final int g2 = ((atim)lvy2.d).g(15);
                    ((atim)lvy2.d).o(1);
                    final long n13 = ((atim)lvy2.d).g(15);
                    ((atim)lvy2.d).o(1);
                    ((baw)lvy2.e).b(n12 << 30 | (long)(g2 << 15) | n13);
                    lvy2.c = true;
                }
                b8 = ((baw)lvy2.e).b((long)(g << 15) | n10 << 30 | n11);
            }
            else {
                b8 = 0L;
            }
            ((bzp)lvy2.f).d(b8, 4);
            ((bzp)lvy2.f).a(c2);
            ((bzp)lvy2.f).c();
            final bas c3 = this.c;
            c3.F(c3.b());
        }
        return 0;
    }
}
