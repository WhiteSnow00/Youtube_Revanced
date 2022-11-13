import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class bog implements bnv, bnu
{
    public final bnv[] a;
    private final IdentityHashMap b;
    private final ArrayList c;
    private final HashMap d;
    private bnu e;
    private bpe f;
    private bnv[] g;
    private boy h;
    
    public bog(final long[] array, final bnv... a) {
        this.a = a;
        this.c = new ArrayList();
        this.d = new HashMap();
        int i = 0;
        this.h = bkw.b(new boy[0]);
        this.b = new IdentityHashMap();
        this.g = new bnv[0];
        while (i < a.length) {
            final long n = array[i];
            if (n != 0L) {
                this.a[i] = (bnv)new boe(a[i], n);
            }
            ++i;
        }
    }
    
    public final long a(final long n, final bfv bfv) {
        final bnv[] g = this.g;
        bnv bnv;
        if (g.length > 0) {
            bnv = g[0];
        }
        else {
            bnv = this.a[0];
        }
        return bnv.a(n, bfv);
    }
    
    public final /* bridge */ void b(final boy boy) {
        final bnv bnv = (bnv)boy;
        final bnu e = this.e;
        dk.d((Object)e);
        e.b((boy)this);
    }
    
    public final long c() {
        return this.h.c();
    }
    
    public final long d() {
        return this.h.d();
    }
    
    public final long e() {
        final bnv[] g = this.g;
        final int length = g.length;
        long n = -9223372036854775807L;
        long e;
        for (int i = 0; i < length; ++i, n = e) {
            final bnv bnv = g[i];
            e = bnv.e();
            if (e != -9223372036854775807L) {
                if (n == -9223372036854775807L) {
                    for (final bnv bnv2 : this.g) {
                        if (bnv2 == bnv) {
                            break;
                        }
                        if (bnv2.f(e) != e) {
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
                    if (bnv.f(n) != n) {
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
            final bnv[] g = this.g;
            if (n >= g.length) {
                return f;
            }
            if (g[n].f(f) != f) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            ++n;
        }
    }
    
    public final long g(final bqw[] array, final boolean[] array2, final bow[] array3, final boolean[] array4, long n) {
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
            final bow bow = array3[n2];
            if (bow != null) {
                n3 = (Integer)this.b.get(bow);
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
            final bqw bqw = array[n2];
            if (bqw != null) {
                final azn azn = this.d.get(bqw.j());
                dk.d((Object)azn);
                int n4 = 0;
                while (true) {
                    final bnv[] a = this.a;
                    if (n4 >= a.length) {
                        break;
                    }
                    if (a[n4].h().a(azn) != -1) {
                        array6[n2] = n4;
                        break;
                    }
                    ++n4;
                }
            }
            ++n2;
        }
        this.b.clear();
        final bow[] array7 = new bow[length2];
        final bow[] array8 = new bow[length2];
        final bqw[] array9 = new bqw[length2];
        final ArrayList<bnv> list = new ArrayList<bnv>(this.a.length);
        for (int i = 0; i < this.a.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                bow bow2;
                if (array5[j] == i) {
                    bow2 = array3[j];
                }
                else {
                    bow2 = null;
                }
                array8[j] = bow2;
                if (array6[j] == i) {
                    final bqw bqw2 = array[j];
                    dk.d((Object)bqw2);
                    final azn azn2 = this.d.get(bqw2.j());
                    dk.d((Object)azn2);
                    array9[j] = (bqw)new bod(bqw2, azn2);
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
                    final bow bow3 = array8[k];
                    dk.d((Object)bow3);
                    array7[k] = array8[k];
                    this.b.put(bow3, i);
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
        final bnv[] g2 = list.toArray(new bnv[0]);
        this.g = g2;
        this.h = bkw.b((boy[])g2);
        return n;
    }
    
    public final bpe h() {
        final bpe f = this.f;
        dk.d((Object)f);
        return f;
    }
    
    public final void i(final long n, final boolean b) {
        final bnv[] g = this.g;
        for (int length = g.length, i = 0; i < length; ++i) {
            g[i].i(n, b);
        }
    }
    
    public final void j() {
        final bnv[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            a[i].j();
        }
    }
    
    public final void kX(final bnv bnv) {
        this.c.remove(bnv);
        if (!this.c.isEmpty()) {
            return;
        }
        final bnv[] a = this.a;
        final int length = a.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            n += a[i].h().b;
            ++i;
        }
        final azn[] array = new azn[n];
        int n2 = 0;
        int n3 = 0;
        while (true) {
            final bnv[] a2 = this.a;
            if (n2 >= a2.length) {
                break;
            }
            final bpe h = a2[n2].h();
            for (int b = h.b, j = 0; j < b; ++j, ++n3) {
                final azn b2 = h.b(j);
                final String b3 = b2.b;
                final StringBuilder sb = new StringBuilder();
                sb.append(n2);
                sb.append(":");
                sb.append(b3);
                final azn azn = new azn(sb.toString(), b2.d);
                this.d.put(azn, b2);
                array[n3] = azn;
            }
            ++n2;
        }
        this.f = new bpe(array);
        final bnu e = this.e;
        dk.d((Object)e);
        e.kX((bnv)this);
    }
    
    public final void l(final bnu e, final long n) {
        this.e = e;
        Collections.addAll(this.c, this.a);
        final bnv[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            a[i].l((bnu)this, n);
        }
    }
    
    public final void m(final long n) {
        this.h.m(n);
    }
    
    public final boolean n(final long n) {
        if (!this.c.isEmpty()) {
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                ((bnv)this.c.get(i)).n(n);
            }
            return false;
        }
        return this.h.n(n);
    }
    
    public final boolean o() {
        return this.h.o();
    }
}
