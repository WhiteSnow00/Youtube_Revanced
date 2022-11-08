import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class bof implements bnu, bnt
{
    public final bnu[] a;
    private final IdentityHashMap b;
    private final ArrayList c;
    private final HashMap d;
    private bnt e;
    private bpd f;
    private bnu[] g;
    private box h;
    
    public bof(final long[] array, final bnu... a) {
        this.a = a;
        this.c = new ArrayList();
        this.d = new HashMap();
        int i = 0;
        this.h = bkv.b(new box[0]);
        this.b = new IdentityHashMap();
        this.g = new bnu[0];
        while (i < a.length) {
            final long n = array[i];
            if (n != 0L) {
                this.a[i] = (bnu)new bod(a[i], n);
            }
            ++i;
        }
    }
    
    public final long a(final long n, final bfu bfu) {
        final bnu[] g = this.g;
        bnu bnu;
        if (g.length > 0) {
            bnu = g[0];
        }
        else {
            bnu = this.a[0];
        }
        return bnu.a(n, bfu);
    }
    
    public final long c() {
        return this.h.c();
    }
    
    public final long d() {
        return this.h.d();
    }
    
    public final long e() {
        final bnu[] g = this.g;
        final int length = g.length;
        long n = -9223372036854775807L;
        long e;
        for (int i = 0; i < length; ++i, n = e) {
            final bnu bnu = g[i];
            e = bnu.e();
            if (e != -9223372036854775807L) {
                if (n == -9223372036854775807L) {
                    for (final bnu bnu2 : this.g) {
                        if (bnu2 == bnu) {
                            break;
                        }
                        if (bnu2.f(e) != e) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                else {
                    if (e != n) {
                        throw new IllegalStateException("Conflicting discontinuities.");
                    }
                    e = n;
                }
            }
            else {
                e = n;
                if (n != -9223372036854775807L) {
                    if (bnu.f(n) != n) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                    e = n;
                }
            }
        }
        return n;
    }
    
    public final long f(long f) {
        f = this.g[0].f(f);
        int n = 1;
        while (true) {
            final bnu[] g = this.g;
            if (n >= g.length) {
                return f;
            }
            if (g[n].f(f) != f) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            ++n;
        }
    }
    
    public final long g(final bqv[] array, final boolean[] array2, final bov[] array3, final boolean[] array4, long n) {
        final int length = array.length;
        final int[] array5 = new int[length];
        final int[] array6 = new int[length];
        int n2 = 0;
        int length2;
        while (true) {
            length2 = array.length;
            Integer n3 = null;
            if (n2 >= length2) {
                break;
            }
            final bov bov = array3[n2];
            if (bov != null) {
                n3 = (Integer)this.b.get(bov);
            }
            int intValue;
            if (n3 == null) {
                intValue = -1;
            }
            else {
                intValue = n3;
            }
            array5[n2] = intValue;
            array6[n2] = -1;
            final bqv bqv = array[n2];
            if (bqv != null) {
                final azm azm = this.d.get(bqv.j());
                dk.d((Object)azm);
                int n4 = 0;
                while (true) {
                    final bnu[] a = this.a;
                    if (n4 >= a.length) {
                        break;
                    }
                    if (a[n4].h().a(azm) != -1) {
                        array6[n2] = n4;
                        break;
                    }
                    ++n4;
                }
            }
            ++n2;
        }
        this.b.clear();
        final bov[] array7 = new bov[length2];
        final bov[] array8 = new bov[length2];
        final bqv[] array9 = new bqv[length2];
        final ArrayList<bnu> list = new ArrayList<bnu>(this.a.length);
        for (int i = 0; i < this.a.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                bov bov2;
                if (array5[j] == i) {
                    bov2 = array3[j];
                }
                else {
                    bov2 = null;
                }
                array8[j] = bov2;
                if (array6[j] == i) {
                    final bqv bqv2 = array[j];
                    dk.d((Object)bqv2);
                    final azm azm2 = this.d.get(bqv2.j());
                    dk.d((Object)azm2);
                    array9[j] = (bqv)new boc(bqv2, azm2);
                }
                else {
                    array9[j] = null;
                }
            }
            final long g = this.a[i].g(array9, array2, array8, array4, n);
            if (i == 0) {
                n = g;
            }
            else if (g != n) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            int k = 0;
            int n5 = 0;
            while (k < array.length) {
                final int n6 = array6[k];
                boolean b = true;
                int n7;
                if (n6 == i) {
                    final bov bov3 = array8[k];
                    dk.d((Object)bov3);
                    array7[k] = array8[k];
                    this.b.put(bov3, i);
                    n7 = 1;
                }
                else {
                    n7 = n5;
                    if (array5[k] == i) {
                        if (array8[k] != null) {
                            b = false;
                        }
                        dk.h(b);
                        n7 = n5;
                    }
                }
                ++k;
                n5 = n7;
            }
            if (n5 != 0) {
                list.add(this.a[i]);
            }
        }
        System.arraycopy(array7, 0, array3, 0, length2);
        final bnu[] g2 = list.toArray(new bnu[0]);
        this.g = g2;
        this.h = bkv.b((box[])g2);
        return n;
    }
    
    public final bpd h() {
        final bpd f = this.f;
        dk.d((Object)f);
        return f;
    }
    
    public final void i(final long n, final boolean b) {
        final bnu[] g = this.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            g[i].i(n, b);
        }
    }
    
    public final void j() {
        final bnu[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            a[i].j();
        }
    }
    
    public final void kX(final bnu bnu) {
        this.c.remove(bnu);
        if (!this.c.isEmpty()) {
            return;
        }
        final bnu[] a = this.a;
        final int length = a.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            n += a[i].h().b;
            ++i;
        }
        final azm[] array = new azm[n];
        int n2 = 0;
        int n3 = 0;
        while (true) {
            final bnu[] a2 = this.a;
            if (n2 >= a2.length) {
                break;
            }
            final bpd h = a2[n2].h();
            for (int b = h.b, j = 0; j < b; ++j, ++n3) {
                final azm b2 = h.b(j);
                final String b3 = b2.b;
                final StringBuilder sb = new StringBuilder();
                sb.append(n2);
                sb.append(":");
                sb.append(b3);
                final azm azm = new azm(sb.toString(), b2.d);
                this.d.put(azm, b2);
                array[n3] = azm;
            }
            ++n2;
        }
        this.f = new bpd(array);
        final bnt e = this.e;
        dk.d((Object)e);
        e.kX((bnu)this);
    }
    
    public final void l(final bnt e, final long n) {
        this.e = e;
        Collections.addAll(this.c, this.a);
        final bnu[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            a[i].l((bnt)this, n);
        }
    }
    
    public final void m(final long n) {
        this.h.m(n);
    }
    
    public final boolean n(final long n) {
        if (!this.c.isEmpty()) {
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                ((bnu)this.c.get(i)).n(n);
            }
            return false;
        }
        return this.h.n(n);
    }
    
    public final boolean o() {
        return this.h.o();
    }
}
