import java.util.Collections;
import android.util.SparseIntArray;
import android.util.SparseBooleanArray;
import android.util.SparseArray;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class caq implements btm
{
    public final List a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public btp e;
    public int f;
    public boolean g;
    public int h;
    public final avv i;
    private final bat j;
    private final SparseIntArray k;
    private final can l;
    private boolean m;
    private boolean n;
    private int o;
    private egn p;
    
    public caq() {
        this(null);
    }
    
    public caq(final byte[] array) {
        final bay bay = new bay(0L);
        final avv i = new avv((byte[])null, (byte[])null, (byte[])null);
        this.i = i;
        this.a = Collections.singletonList(bay);
        this.j = new bat(new byte[9400], 0);
        final SparseBooleanArray c = new SparseBooleanArray();
        this.c = c;
        this.d = new SparseBooleanArray();
        final SparseArray b = new SparseArray();
        this.b = b;
        this.k = new SparseIntArray();
        this.l = new can();
        this.e = btp.t;
        this.h = -1;
        c.clear();
        b.clear();
        final SparseArray sparseArray = new SparseArray();
        for (int size = sparseArray.size(), j = 0; j < size; ++j) {
            this.b.put(sparseArray.keyAt(j), (Object)sparseArray.valueAt(j));
        }
        this.b.put(0, (Object)new cal(new cao(this)));
    }
    
    public final void d(final btp e) {
        this.e = e;
    }
    
    public final void e() {
    }
    
    public final void f(long c, final long n) {
        bad.f(true);
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final bay bay = this.a.get(i);
            if (bay.e() != -9223372036854775807L) {
                c = bay.c();
                if (c == -9223372036854775807L || c == 0L || c == n) {
                    continue;
                }
            }
            bay.f(n);
        }
        if (n != 0L) {
            final egn p2 = this.p;
            if (p2 != null) {
                p2.a(n);
            }
        }
        this.j.C(0);
        this.k.clear();
        for (int j = 0; j < this.b.size(); ++j) {
            ((cas)this.b.valueAt(j)).c();
        }
        this.o = 0;
    }
    
    public final boolean g(final btn btn) {
        final byte[] a = this.j.a;
        btn.j(a, 0, 940);
        int i = 0;
    Label_0023:
        while (i < 188) {
            for (int j = 0; j < 5; ++j) {
                if (a[j * 188 + i] != 71) {
                    ++i;
                    continue Label_0023;
                }
            }
            btn.m(i);
            return true;
        }
        return false;
    }
    
    public final int h(final btn btn, final pbg pbg) {
        final btg btg = (btg)btn;
        final long b = btg.b;
        final boolean g = this.g;
        int n = 1;
        if (g) {
            if (b != -1L) {
                final can l = this.l;
                if (!l.c) {
                    final int h = this.h;
                    if (h <= 0) {
                        l.a(btn);
                    }
                    else if (!l.e) {
                        final int n2 = (int)Math.min(112800L, b);
                        final long a = b - n2;
                        if (btg.c != a) {
                            pbg.a = a;
                            return n;
                        }
                        l.b.C(n2);
                        btn.l();
                        btn.j(l.b.a, 0, n2);
                        final bat b2 = l.b;
                        final int b3 = b2.b;
                        final int c = b2.c;
                        int i = c - 188;
                    Label_0293:
                        while (true) {
                            while (i >= b3) {
                                final byte[] a2 = b2.a;
                                int j = -4;
                                int n3 = 0;
                                while (j <= 4) {
                                    final int n4 = j * 188 + i;
                                    if (n4 >= b3 && n4 < c && a2[n4] == 71) {
                                        if (++n3 == 5) {
                                            final long d = bhx.d(b2, i, h);
                                            if (d != -9223372036854775807L) {
                                                break Label_0293;
                                            }
                                            break;
                                        }
                                    }
                                    else {
                                        n3 = 0;
                                    }
                                    ++j;
                                }
                                --i;
                                continue;
                                long d = 0L;
                                l.g = d;
                                l.e = true;
                                return 0;
                            }
                            final long d = -9223372036854775807L;
                            continue Label_0293;
                        }
                    }
                    else if (l.g == -9223372036854775807L) {
                        l.a(btn);
                    }
                    else if (!l.d) {
                        final int n5 = (int)Math.min(112800L, b);
                        if (btg.c != 0L) {
                            pbg.a = 0L;
                            return n;
                        }
                        l.b.C(n5);
                        btn.l();
                        btn.j(l.b.a, 0, n5);
                        final bat b4 = l.b;
                        while (true) {
                            for (int k = b4.b; k < b4.c; ++k) {
                                if (b4.a[k] == 71) {
                                    final long d2 = bhx.d(b4, k, h);
                                    if (d2 != -9223372036854775807L) {
                                        l.f = d2;
                                        l.d = true;
                                        return 0;
                                    }
                                }
                            }
                            final long d2 = -9223372036854775807L;
                            continue;
                        }
                    }
                    else {
                        final long f = l.f;
                        if (f == -9223372036854775807L) {
                            l.a(btn);
                        }
                        else {
                            final long h2 = l.a.b(l.g) - l.a.b(f);
                            l.h = h2;
                            if (h2 < 0L) {
                                final StringBuilder sb = new StringBuilder("Invalid duration: ");
                                sb.append(h2);
                                sb.append(". Using TIME_UNSET instead.");
                                baq.c("TsDurationReader", sb.toString());
                                l.h = -9223372036854775807L;
                            }
                            l.a(btn);
                        }
                    }
                    n = 0;
                    return n;
                }
            }
            if (!this.m) {
                this.m = true;
                final can m = this.l;
                final long h3 = m.h;
                if (h3 != -9223372036854775807L) {
                    final egn p2 = new egn((btb)new bsz(), (btd)new cam(this.h, m.a), h3, h3 + 1L, 0L, b, 188L, 940);
                    this.p = p2;
                    this.e.x((bud)p2.b);
                }
                else {
                    this.e.x((bud)new buc(-9223372036854775807L));
                }
            }
            if (this.n) {
                this.n = false;
                this.f(0L, 0L);
                if (btg.c != 0L) {
                    pbg.a = 0L;
                    return 1;
                }
            }
            final egn p3 = this.p;
            if (p3 != null && p3.b()) {
                return p3.f(btn, pbg);
            }
        }
        final bat j2 = this.j;
        final byte[] a3 = j2.a;
        final int b5 = j2.b;
        if (9400 - b5 < 188) {
            final int a4 = j2.a();
            if (a4 > 0) {
                System.arraycopy(a3, b5, a3, 0, a4);
            }
            this.j.E(a3, a4);
        }
        while (true) {
            final bat j3 = this.j;
            if (j3.a() < 188) {
                final int c2 = j3.c;
                final int a5 = btn.a(a3, c2, 9400 - c2);
                if (a5 == -1) {
                    return -1;
                }
                this.j.F(c2 + a5);
            }
            else {
                final int b6 = j3.b;
                final int c3 = j3.c;
                final int c4 = bhx.c(j3.a, b6, c3);
                this.j.G(c4);
                final int n6 = c4 + 188;
                if (n6 > c3) {
                    this.o += c4 - b6;
                }
                else {
                    this.o = 0;
                }
                final bat j4 = this.j;
                final int c5 = j4.c;
                if (n6 > c5) {
                    return 0;
                }
                final int d3 = j4.d();
                if ((0x800000 & d3) != 0x0) {
                    this.j.G(n6);
                    return 0;
                }
                final int n7 = ((0x400000 & d3) != 0x0) ? 1 : 0;
                final int n8 = d3 >> 8 & 0x1FFF;
                cas cas;
                if ((d3 & 0x10) != 0x0) {
                    cas = (cas)this.b.get(n8);
                }
                else {
                    cas = null;
                }
                if (cas == null) {
                    this.j.G(n6);
                    return 0;
                }
                final int n9 = d3 & 0xF;
                final int value = this.k.get(n8, n9 - 1);
                this.k.put(n8, n9);
                if (value == n9) {
                    this.j.G(n6);
                    return 0;
                }
                if (n9 != (value + 1 & 0xF)) {
                    cas.c();
                }
                int n10 = n7;
                if ((d3 & 0x20) != 0x0) {
                    final int i2 = this.j.i();
                    int n11;
                    if ((this.j.i() & 0x40) != 0x0) {
                        n11 = 2;
                    }
                    else {
                        n11 = 0;
                    }
                    n10 = (n7 | n11);
                    this.j.H(i2 - 1);
                }
                final boolean g2 = this.g;
                Label_1324: {
                    if (g2 || !this.d.get(n8, false)) {
                        this.j.F(n6);
                        cas.a(this.j, n10);
                        this.j.F(c5);
                        if (g2) {
                            break Label_1324;
                        }
                    }
                    if (this.g && b != -1L) {
                        this.n = true;
                    }
                }
                this.j.G(n6);
                return 0;
            }
        }
    }
}
