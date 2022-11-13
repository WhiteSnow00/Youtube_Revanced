import java.util.Collections;
import android.util.SparseIntArray;
import android.util.SparseBooleanArray;
import android.util.SparseArray;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class can implements btj
{
    public final List a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public btm e;
    public int f;
    public boolean g;
    public int h;
    public final avu i;
    private final bas j;
    private final SparseIntArray k;
    private final cak l;
    private boolean m;
    private boolean n;
    private int o;
    private egk p;
    
    public can() {
        this(null);
    }
    
    public can(final byte[] array) {
        final baw baw = new baw(0L);
        final avu i = new avu((byte[])null, (byte[])null, (byte[])null);
        this.i = i;
        this.a = Collections.singletonList(baw);
        this.j = new bas(new byte[9400], 0);
        final SparseBooleanArray c = new SparseBooleanArray();
        this.c = c;
        this.d = new SparseBooleanArray();
        final SparseArray b = new SparseArray();
        this.b = b;
        this.k = new SparseIntArray();
        this.l = new cak();
        this.e = btm.t;
        this.h = -1;
        c.clear();
        b.clear();
        final SparseArray sparseArray = new SparseArray();
        for (int size = sparseArray.size(), j = 0; j < size; ++j) {
            this.b.put(sparseArray.keyAt(j), (Object)sparseArray.valueAt(j));
        }
        this.b.put(0, (Object)new cai((cah)new cal(this)));
    }
    
    public final void d(final btm e) {
        this.e = e;
    }
    
    public final void e() {
    }
    
    public final void f(long c, final long n) {
        dk.h(true);
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            final baw baw = this.a.get(i);
            if (baw.e() != -9223372036854775807L) {
                c = baw.c();
                if (c == -9223372036854775807L || c == 0L || c == n) {
                    continue;
                }
            }
            baw.f(n);
        }
        if (n != 0L) {
            final egk p2 = this.p;
            if (p2 != null) {
                p2.a(n);
            }
        }
        this.j.C(0);
        this.k.clear();
        for (int j = 0; j < this.b.size(); ++j) {
            ((cap)this.b.valueAt(j)).c();
        }
        this.o = 0;
    }
    
    public final boolean g(final btk btk) {
        final byte[] a = this.j.a;
        btk.j(a, 0, 940);
        int i = 0;
    Label_0023:
        while (i < 188) {
            for (int j = 0; j < 5; ++j) {
                if (a[j * 188 + i] != 71) {
                    ++i;
                    continue Label_0023;
                }
            }
            btk.m(i);
            return true;
        }
        return false;
    }
    
    public final int h(final btk btk, final paq paq) {
        final btd btd = (btd)btk;
        final long b = btd.b;
        final boolean g = this.g;
        int n = 1;
        if (g) {
            if (b != -1L) {
                final cak l = this.l;
                if (!l.c) {
                    final int h = this.h;
                    if (h <= 0) {
                        l.a(btk);
                    }
                    else if (!l.e) {
                        final int n2 = (int)Math.min(112800L, b);
                        final long a = b - n2;
                        if (btd.c != a) {
                            paq.a = a;
                            return n;
                        }
                        l.b.C(n2);
                        btk.l();
                        btk.j(l.b.a, 0, n2);
                        final bas b2 = l.b;
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
                                            final long e = bhu.e(b2, i, h);
                                            if (e != -9223372036854775807L) {
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
                                long e = 0L;
                                l.g = e;
                                l.e = true;
                                return 0;
                            }
                            final long e = -9223372036854775807L;
                            continue Label_0293;
                        }
                    }
                    else if (l.g == -9223372036854775807L) {
                        l.a(btk);
                    }
                    else if (!l.d) {
                        final int n5 = (int)Math.min(112800L, b);
                        if (btd.c != 0L) {
                            paq.a = 0L;
                            return n;
                        }
                        l.b.C(n5);
                        btk.l();
                        btk.j(l.b.a, 0, n5);
                        final bas b4 = l.b;
                        while (true) {
                            for (int k = b4.b; k < b4.c; ++k) {
                                if (b4.a[k] == 71) {
                                    final long e2 = bhu.e(b4, k, h);
                                    if (e2 != -9223372036854775807L) {
                                        l.f = e2;
                                        l.d = true;
                                        return 0;
                                    }
                                }
                            }
                            final long e2 = -9223372036854775807L;
                            continue;
                        }
                    }
                    else {
                        final long f = l.f;
                        if (f == -9223372036854775807L) {
                            l.a(btk);
                        }
                        else {
                            final long h2 = l.a.b(l.g) - l.a.b(f);
                            l.h = h2;
                            if (h2 < 0L) {
                                final StringBuilder sb = new StringBuilder("Invalid duration: ");
                                sb.append(h2);
                                sb.append(". Using TIME_UNSET instead.");
                                bap.c("TsDurationReader", sb.toString());
                                l.h = -9223372036854775807L;
                            }
                            l.a(btk);
                        }
                    }
                    n = 0;
                    return n;
                }
            }
            if (!this.m) {
                this.m = true;
                final cak m = this.l;
                final long h3 = m.h;
                if (h3 != -9223372036854775807L) {
                    final egk p2 = new egk((bsy)new bsw(), (bta)new caj(this.h, m.a), h3, h3 + 1L, 0L, b, 188L, 940);
                    this.p = p2;
                    this.e.x((bua)p2.b);
                }
                else {
                    this.e.x((bua)new btz(-9223372036854775807L));
                }
            }
            if (this.n) {
                this.n = false;
                this.f(0L, 0L);
                if (btd.c != 0L) {
                    paq.a = 0L;
                    return 1;
                }
            }
            final egk p3 = this.p;
            if (p3 != null && p3.b()) {
                return p3.f(btk, paq);
            }
        }
        final bas j2 = this.j;
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
            final bas j3 = this.j;
            if (j3.a() < 188) {
                final int c2 = j3.c;
                final int a5 = btk.a(a3, c2, 9400 - c2);
                if (a5 == -1) {
                    return -1;
                }
                this.j.F(c2 + a5);
            }
            else {
                final int b6 = j3.b;
                final int c3 = j3.c;
                final int d = bhu.d(j3.a, b6, c3);
                this.j.G(d);
                final int n6 = d + 188;
                if (n6 > c3) {
                    this.o += d - b6;
                }
                else {
                    this.o = 0;
                }
                final bas j4 = this.j;
                final int c4 = j4.c;
                if (n6 > c4) {
                    return 0;
                }
                final int d2 = j4.d();
                if ((0x800000 & d2) != 0x0) {
                    this.j.G(n6);
                    return 0;
                }
                final int n7 = ((0x400000 & d2) != 0x0) ? 1 : 0;
                final int n8 = d2 >> 8 & 0x1FFF;
                cap cap;
                if ((d2 & 0x10) != 0x0) {
                    cap = (cap)this.b.get(n8);
                }
                else {
                    cap = null;
                }
                if (cap == null) {
                    this.j.G(n6);
                    return 0;
                }
                final int n9 = d2 & 0xF;
                final int value = this.k.get(n8, n9 - 1);
                this.k.put(n8, n9);
                if (value == n9) {
                    this.j.G(n6);
                    return 0;
                }
                if (n9 != (value + 1 & 0xF)) {
                    cap.c();
                }
                int n10 = n7;
                if ((d2 & 0x20) != 0x0) {
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
                        cap.a(this.j, n10);
                        this.j.F(c4);
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
