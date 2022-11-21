import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class caj implements btm
{
    private final bay a;
    private final SparseArray b;
    private final bat c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private btp h;
    private boolean i;
    private final can j;
    private egn k;
    
    public caj() {
        final bay a = new bay(0L);
        this.a = a;
        this.c = new bat(4096);
        this.b = new SparseArray();
        this.j = new can(null);
    }
    
    public final void d(final btp h) {
        this.h = h;
    }
    
    public final void e() {
    }
    
    public final void f(long c, final long n) {
        final bay a = this.a;
        Label_0050: {
            if (a.e() != -9223372036854775807L) {
                c = a.c();
                if (c == -9223372036854775807L || c == 0L || c == n) {
                    break Label_0050;
                }
            }
            a.f(n);
        }
        final egn k = this.k;
        if (k != null) {
            k.a(n);
        }
        for (int i = 0; i < this.b.size(); ++i) {
            final lwm lwm = (lwm)this.b.valueAt(i);
            lwm.c = false;
            ((bzs)lwm.f).e();
        }
    }
    
    public final boolean g(final btn btn) {
        final byte[] array = new byte[14];
        btn.j(array, 0, 14);
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
        btn.g(array[13] & 0x7);
        btn.j(array, 0, 3);
        return ((array[0] & 0xFF) << 16 | (array[1] & 0xFF) << 8 | (array[2] & 0xFF)) == 0x1;
    }
    
    public final int h(final btn btn, final pbg pbg) {
        bad.c(this.h);
        final btg btg = (btg)btn;
        final long b = btg.b;
        final long n = -9223372036854775807L;
        int n2 = 1;
        if (b != -1L) {
            final can j = this.j;
            if (!j.c) {
                if (!j.e) {
                    final int n3 = (int)Math.min(20000L, b);
                    final long a = b - n3;
                    if (btg.c != a) {
                        pbg.a = a;
                        return n2;
                    }
                    j.b.C(n3);
                    btn.l();
                    btn.j(j.b.a, 0, n3);
                    final bat b2 = j.b;
                    final int b3 = b2.b;
                    int n4 = b2.c - 4;
                    long b4;
                    while (true) {
                        b4 = n;
                        if (n4 < b3) {
                            break;
                        }
                        if (can.d(b2.a, n4) == 442) {
                            b2.G(n4 + 4);
                            b4 = can.b(b2);
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
                    j.c(btn);
                }
                else if (!j.d) {
                    final int n5 = (int)Math.min(20000L, b);
                    if (btg.c != 0L) {
                        pbg.a = 0L;
                        return n2;
                    }
                    j.b.C(n5);
                    btn.l();
                    btn.j(j.b.a, 0, n5);
                    final bat b5 = j.b;
                    int b6 = b5.b;
                    final int c = b5.c;
                    long b7;
                    while (true) {
                        b7 = n;
                        if (b6 >= c - 3) {
                            break;
                        }
                        if (can.d(b5.a, b6) == 442) {
                            b5.G(b6 + 4);
                            b7 = can.b(b5);
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
                        j.c(btn);
                    }
                    else {
                        final long h = j.a.b(j.g) - j.a.b(f);
                        j.h = h;
                        if (h < 0L) {
                            final StringBuilder sb = new StringBuilder("Invalid duration: ");
                            sb.append(h);
                            sb.append(". Using TIME_UNSET instead.");
                            baq.c("PsDurationReader", sb.toString());
                            j.h = -9223372036854775807L;
                        }
                        j.c(btn);
                    }
                }
                n2 = 0;
                return n2;
            }
        }
        if (!this.i) {
            this.i = true;
            final can i = this.j;
            final long h2 = i.h;
            if (h2 != -9223372036854775807L) {
                final egn k = new egn((btb)new bsz(), (btd)new cai(i.a), h2, h2 + 1L, 0L, b, 188L, 1000);
                this.k = k;
                this.h.x((bud)k.b);
            }
            else {
                this.h.x((bud)new buc(-9223372036854775807L));
            }
        }
        final egn l = this.k;
        if (l != null && l.b()) {
            return l.f(btn, pbg);
        }
        btn.l();
        long n6;
        if (b != -1L) {
            n6 = b - btn.e();
        }
        else {
            n6 = -1L;
        }
        if (n6 != -1L && n6 < 4L) {
            return -1;
        }
        if (!btn.o(this.c.a, 0, 4, true)) {
            return -1;
        }
        this.c.G(0);
        final int d = this.c.d();
        if (d == 441) {
            return -1;
        }
        if (d == 442) {
            btn.j(this.c.a, 0, 10);
            this.c.G(9);
            btn.m((this.c.i() & 0x7) + 14);
            return 0;
        }
        if (d == 443) {
            btn.j(this.c.a, 0, 2);
            this.c.G(0);
            btn.m(this.c.m() + 6);
            return 0;
        }
        if (d >> 8 != 1) {
            btn.m(1);
            return 0;
        }
        final int n7 = d & 0xFF;
        lwm lwm2;
        final lwm lwm = lwm2 = (lwm)this.b.get(n7);
        if (!this.d) {
            lwm lwm3;
            if ((lwm3 = lwm) == null) {
                Object o;
                if (n7 == 189) {
                    o = new bzl();
                    this.e = true;
                    this.g = btg.c;
                }
                else if ((n7 & 0xE0) == 0xC0) {
                    o = new cae(null);
                    this.e = true;
                    this.g = btg.c;
                }
                else if ((n7 & 0xF0) == 0xE0) {
                    o = new bzu(null, null, null, null);
                    this.f = true;
                    this.g = btg.c;
                }
                else {
                    o = null;
                }
                lwm3 = lwm;
                if (o != null) {
                    ((bzs)o).b(this.h, new car(n7, 256));
                    lwm3 = new lwm((bzs)o, this.a);
                    this.b.put(n7, (Object)lwm3);
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
            lwm2 = lwm3;
            if (btg.c > n8) {
                this.d = true;
                this.h.r();
                lwm2 = lwm3;
            }
        }
        btn.j(this.c.a, 0, 2);
        this.c.G(0);
        final int n9 = this.c.m() + 6;
        if (lwm2 == null) {
            btn.m(n9);
        }
        else {
            this.c.C(n9);
            btn.k(this.c.a, 0, n9);
            this.c.G(6);
            final bat c2 = this.c;
            c2.B((byte[])((atlj)lwm2.d).d, 0, 3);
            ((atlj)lwm2.d).m(0);
            ((atlj)lwm2.d).o(8);
            lwm2.a = ((atlj)lwm2.d).q();
            lwm2.b = ((atlj)lwm2.d).q();
            ((atlj)lwm2.d).o(6);
            c2.B((byte[])((atlj)lwm2.d).d, 0, ((atlj)lwm2.d).g(8));
            ((atlj)lwm2.d).m(0);
            long b8;
            if (lwm2.a) {
                ((atlj)lwm2.d).o(4);
                final long n10 = ((atlj)lwm2.d).g(3);
                ((atlj)lwm2.d).o(1);
                final int g = ((atlj)lwm2.d).g(15);
                ((atlj)lwm2.d).o(1);
                final long n11 = ((atlj)lwm2.d).g(15);
                ((atlj)lwm2.d).o(1);
                if (!lwm2.c && lwm2.b) {
                    ((atlj)lwm2.d).o(4);
                    final long n12 = ((atlj)lwm2.d).g(3);
                    ((atlj)lwm2.d).o(1);
                    final int g2 = ((atlj)lwm2.d).g(15);
                    ((atlj)lwm2.d).o(1);
                    final long n13 = ((atlj)lwm2.d).g(15);
                    ((atlj)lwm2.d).o(1);
                    ((bay)lwm2.e).b(n12 << 30 | (long)(g2 << 15) | n13);
                    lwm2.c = true;
                }
                b8 = ((bay)lwm2.e).b((long)(g << 15) | n10 << 30 | n11);
            }
            else {
                b8 = 0L;
            }
            ((bzs)lwm2.f).d(b8, 4);
            ((bzs)lwm2.f).a(c2);
            ((bzs)lwm2.f).c();
            final bat c3 = this.c;
            c3.F(c3.b());
        }
        return 0;
    }
}
