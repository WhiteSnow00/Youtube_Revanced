import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.io.NotSerializableException;
import java.util.Arrays;
import java.io.Serializable;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atks implements Map, Serializable, atnq
{
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int d;
    public int e;
    public boolean f;
    private int[] g;
    private int h;
    private int i;
    private atku j;
    private atkt k;
    private atkc l;
    
    public atks() {
        this(8);
    }
    
    public atks(final int n) {
        final Object[] a = new Object[n];
        final int[] c = new int[n];
        final int[] g = new int[atvp.b(n)];
        this.a = a;
        this.b = null;
        this.c = c;
        this.g = g;
        this.h = 2;
        this.d = 0;
        this.i = atvp.c(this.n());
    }
    
    private final int m() {
        return this.a.length;
    }
    
    private final int n() {
        return this.g.length;
    }
    
    private final int o(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode * -1640531527 >>> this.i;
    }
    
    private final void p(int b) {
        final int n = this.d + b;
        if (n >= 0) {
            if (n > this.m()) {
                final int n2 = this.m() * 3 / 2;
                if ((b = n) <= n2) {
                    b = n2;
                }
                this.a = atvl.h(this.a, b);
                final Object[] b2 = this.b;
                Object[] h;
                if (b2 != null) {
                    h = atvl.h(b2, b);
                }
                else {
                    h = null;
                }
                this.b = h;
                final int[] copy = Arrays.copyOf(this.c, b);
                copy.getClass();
                this.c = copy;
                b = atvp.b(b);
                if (b > this.n()) {
                    this.q(b);
                }
            }
            else if (this.d + n - this.e > this.m()) {
                this.q(this.n());
            }
            return;
        }
        throw new OutOfMemoryError();
    }
    
    private final void q(int n) {
        final int d = this.d;
        final int e = this.e;
        final int n2 = 0;
        if (d > e) {
            final Object[] b = this.b;
            int n3 = 0;
            int d2 = 0;
            int d3;
            while (true) {
                d3 = this.d;
                if (n3 >= d3) {
                    break;
                }
                int n4 = d2;
                if (this.c[n3] >= 0) {
                    final Object[] a = this.a;
                    a[d2] = a[n3];
                    if (b != null) {
                        b[d2] = b[n3];
                    }
                    n4 = d2 + 1;
                }
                ++n3;
                d2 = n4;
            }
            atvl.g(this.a, d2, d3);
            if (b != null) {
                atvl.g(b, d2, this.d);
            }
            this.d = d2;
        }
        int i;
        if (n != this.n()) {
            this.g = new int[n];
            this.i = atvp.c(n);
            i = n2;
        }
        else {
            final int[] g = this.g;
            n = this.n();
            g.getClass();
            Arrays.fill(g, 0, n, 0);
            i = n2;
        }
        while (i < this.d) {
            final int n5 = i + 1;
            n = this.o(this.a[i]);
            int h = this.h;
            while (true) {
                final int[] g2 = this.g;
                if (g2[n] == 0) {
                    g2[n] = n5;
                    this.c[i] = n;
                    i = n5;
                    break;
                }
                if (--h < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                if (n == 0) {
                    n = this.n() - 1;
                }
                else {
                    --n;
                }
            }
        }
    }
    
    private final Object writeReplace() {
        if (this.f) {
            return new atkw(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }
    
    public final int a(final Object o) {
        this.f();
        while (true) {
            int o2 = this.o(o);
            final int h = this.h;
            final int e = atnp.e(h + h, this.n() >> 1);
            int h2 = 0;
            while (true) {
                final int n = this.g[o2];
                if (n <= 0) {
                    if (this.d >= this.m()) {
                        this.p(1);
                        break;
                    }
                    final int d = this.d;
                    final int d2 = d + 1;
                    this.d = d2;
                    this.a[d] = o;
                    this.c[d] = o2;
                    this.g[o2] = d2;
                    ++this.e;
                    if (h2 > this.h) {
                        this.h = h2;
                    }
                    return d;
                }
                else {
                    if (atnh.c(this.a[n - 1], o)) {
                        return -n;
                    }
                    if (++h2 > e) {
                        final int n2 = this.n();
                        this.q(n2 + n2);
                        break;
                    }
                    if (o2 == 0) {
                        o2 = this.n() - 1;
                    }
                    else {
                        --o2;
                    }
                }
            }
        }
    }
    
    public final int b(final Object o) {
        int o2 = this.o(o);
        int h = this.h;
        while (true) {
            int n = this.g[o2];
            if (n == 0) {
                return -1;
            }
            if (n > 0) {
                --n;
                if (atnh.c(this.a[n], o)) {
                    return n;
                }
            }
            if (--h < 0) {
                return -1;
            }
            if (o2 == 0) {
                o2 = this.n() - 1;
            }
            else {
                --o2;
            }
        }
    }
    
    public final int c(final Object o) {
        int d = this.d;
        while (true) {
            final int n = d - 1;
            if (n < 0) {
                return -1;
            }
            d = n;
            if (this.c[n] < 0) {
                continue;
            }
            final Object[] b = this.b;
            b.getClass();
            d = n;
            if (atnh.c(b[n], o)) {
                return n;
            }
        }
    }
    
    @Override
    public final void clear() {
        this.f();
        final atkk a = ((atnx)new atny(0, this.d - 1)).a();
        while (a.a) {
            final int a2 = a.a();
            final int[] c = this.c;
            final int n = c[a2];
            if (n >= 0) {
                this.g[n] = 0;
                c[a2] = -1;
            }
        }
        atvl.g(this.a, 0, this.d);
        final Object[] b = this.b;
        if (b != null) {
            atvl.g(b, 0, this.d);
        }
        this.e = 0;
        this.d = 0;
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.b(o) >= 0;
    }
    
    @Override
    public final boolean containsValue(final Object o) {
        return this.c(o) >= 0;
    }
    
    public final int d(final Object o) {
        this.f();
        final int b = this.b(o);
        if (b < 0) {
            return -1;
        }
        this.g(b);
        return b;
    }
    
    public final atko e() {
        return new atko(this);
    }
    
    @Override
    public final /* bridge */ Set entrySet() {
        atkt k;
        if ((k = this.k) == null) {
            k = new atkt(this);
            this.k = k;
        }
        return (Set)k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof Map) {
                final Map map = (Map)o;
                if (this.e != map.size() || !this.h(map.entrySet())) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final void f() {
        if (!this.f) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public final void g(final int n) {
        atvl.f(this.a, n);
        int n2 = this.c[n];
        final int h = this.h;
        int e = atnp.e(h + h, this.n() >> 1);
        int n3 = 0;
        int n4 = n2;
        while (true) {
            int n5;
            int n9 = 0;
            do {
                if (n2 == 0) {
                    n2 = this.n() - 1;
                }
                else {
                    --n2;
                }
                final int n6 = n3 + 1;
                if (n6 > this.h) {
                    this.g[n4] = 0;
                }
                else {
                    final int[] g = this.g;
                    final int n7 = g[n2];
                    if (n7 != 0) {
                        Label_0185: {
                            if (n7 < 0) {
                                g[n4] = -1;
                            }
                            else {
                                final int n8 = n7 - 1;
                                n9 = n4;
                                if ((this.o(this.a[n8]) - n2 & this.n() - 1) < (n3 = n6)) {
                                    break Label_0185;
                                }
                                this.g[n4] = n7;
                                this.c[n8] = n4;
                            }
                            n9 = n2;
                            n3 = 0;
                        }
                        n5 = e - 1;
                        n4 = n9;
                        continue;
                    }
                    g[n4] = 0;
                }
                this.c[n] = -1;
                --this.e;
                return;
            } while ((e = n5) >= 0);
            this.g[n9] = -1;
            continue;
        }
    }
    
    @Override
    public final Object get(final Object o) {
        final int b = this.b(o);
        if (b < 0) {
            return null;
        }
        final Object[] b2 = this.b;
        b2.getClass();
        return b2[b];
    }
    
    public final boolean h(final Collection collection) {
        collection.getClass();
        final Iterator iterator = collection.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return true;
            }
            final Object next = iterator.next();
            if (next == null) {
                return false;
            }
            try {
                if (!this.i((Entry)next)) {
                    return false;
                }
                continue;
            }
            catch (final ClassCastException ex) {
                return false;
            }
        }
    }
    
    @Override
    public final int hashCode() {
        final atko e = this.e();
        int n = 0;
        while (e.hasNext()) {
            final int b = e.b;
            final atks a = e.a;
            if (b >= a.d) {
                throw new NoSuchElementException();
            }
            e.b = b + 1;
            e.c = b;
            final Object o = a.a[b];
            int hashCode;
            if (o != null) {
                hashCode = o.hashCode();
            }
            else {
                hashCode = 0;
            }
            final Object[] b2 = e.a.b;
            b2.getClass();
            final Object o2 = b2[e.c];
            int hashCode2;
            if (o2 != null) {
                hashCode2 = o2.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            e.a();
            n += (hashCode ^ hashCode2);
        }
        return n;
    }
    
    public final boolean i(final Entry entry) {
        final int b = this.b(entry.getKey());
        if (b < 0) {
            return false;
        }
        final Object[] b2 = this.b;
        b2.getClass();
        return atnh.c(b2[b], entry.getValue());
    }
    
    @Override
    public final boolean isEmpty() {
        return this.e == 0;
    }
    
    public final Object[] j() {
        final Object[] b = this.b;
        if (b != null) {
            return b;
        }
        return this.b = new Object[this.m()];
    }
    
    public final void k() {
        this.f();
        this.f = true;
    }
    
    @Override
    public final /* bridge */ Set keySet() {
        atku j;
        if ((j = this.j) == null) {
            j = new atku(this);
            this.j = j;
        }
        return (Set)j;
    }
    
    public final atkr l() {
        return new atkr(this, 1, null);
    }
    
    @Override
    public final Object put(Object o, final Object o2) {
        this.f();
        final int a = this.a(o);
        final Object[] j = this.j();
        if (a < 0) {
            final int n = -a - 1;
            o = j[n];
            j[n] = o2;
            return o;
        }
        j[a] = o2;
        return null;
    }
    
    @Override
    public final void putAll(final Map map) {
        map.getClass();
        this.f();
        final Set entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            this.p(entrySet.size());
            for (final Entry<Object, V> entry : entrySet) {
                final int a = this.a(entry.getKey());
                final Object[] j = this.j();
                if (a >= 0) {
                    j[a] = entry.getValue();
                }
                else {
                    final int n = -a - 1;
                    if (atnh.c(entry.getValue(), j[n])) {
                        continue;
                    }
                    j[n] = entry.getValue();
                }
            }
        }
    }
    
    @Override
    public final Object remove(final Object o) {
        final int d = this.d(o);
        if (d < 0) {
            return null;
        }
        final Object[] b = this.b;
        b.getClass();
        final Object o2 = b[d];
        atvl.f(b, d);
        return o2;
    }
    
    @Override
    public final int size() {
        return this.e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(this.e * 3 + 2);
        sb.append("{");
        final atko e = this.e();
        int n = 0;
        while (e.hasNext()) {
            if (n > 0) {
                sb.append(", ");
            }
            final int b = e.b;
            final atks a = e.a;
            if (b >= a.d) {
                throw new NoSuchElementException();
            }
            e.b = b + 1;
            e.c = b;
            final Object o = a.a[b];
            if (atnh.c(o, a)) {
                sb.append("(this Map)");
            }
            else {
                sb.append(o);
            }
            sb.append('=');
            final atks a2 = e.a;
            final Object[] b2 = a2.b;
            b2.getClass();
            final Object o2 = b2[e.c];
            if (atnh.c(o2, a2)) {
                sb.append("(this Map)");
            }
            else {
                sb.append(o2);
            }
            e.a();
            ++n;
        }
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public final /* bridge */ Collection values() {
        atkc l;
        if ((l = this.l) == null) {
            l = new atkc(this);
            this.l = l;
        }
        return (Collection)l;
    }
}
