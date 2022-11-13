import java.util.Map;
import java.util.ConcurrentModificationException;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class abo
{
    private int[] a;
    private Object[] b;
    public int d;
    
    public abo() {
        this(null);
    }
    
    public abo(final int n) {
        int[] a;
        if (n == 0) {
            a = abq.a;
        }
        else {
            a = new int[n];
        }
        this.a = a;
        Object[] c;
        if (n == 0) {
            c = abq.c;
        }
        else {
            c = new Object[n + n];
        }
        this.b = c;
    }
    
    public abo(final byte[] array) {
        this(0);
    }
    
    private final int i(final Object o, final int n) {
        final int d = this.d;
        if (d == 0) {
            return -1;
        }
        final int a = abq.a(this.a, d, n);
        if (a < 0) {
            return a;
        }
        if (atoc.c(o, this.b[a + a])) {
            return a;
        }
        int n2;
        for (n2 = a + 1; n2 < d && this.a[n2] == n; ++n2) {
            if (atoc.c(o, this.b[n2 + n2])) {
                return n2;
            }
        }
        for (int n3 = a - 1; n3 >= 0 && this.a[n3] == n; --n3) {
            if (atoc.c(o, this.b[n3 + n3])) {
                return n3;
            }
        }
        return ~n2;
    }
    
    private final int j() {
        final int d = this.d;
        if (d == 0) {
            return -1;
        }
        final int a = abq.a(this.a, d, 0);
        if (a < 0) {
            return a;
        }
        if (this.b[a + a] == null) {
            return a;
        }
        int n;
        for (n = a + 1; n < d && this.a[n] == 0; ++n) {
            if (this.b[n + n] == null) {
                return n;
            }
        }
        for (int n2 = a - 1; n2 >= 0 && this.a[n2] == 0; --n2) {
            if (this.b[n2 + n2] == null) {
                return n2;
            }
        }
        return ~n;
    }
    
    public final int a(final Object o) {
        final int d = this.d;
        final int n = d + d;
        final Object[] b = this.b;
        if (o == null) {
            for (int i = 1; i < n; i += 2) {
                if (b[i] == null) {
                    return i >> 1;
                }
            }
        }
        else {
            for (int j = 1; j < n; j += 2) {
                if (atoc.c(o, b[j])) {
                    return j >> 1;
                }
            }
        }
        return -1;
    }
    
    public final int b(final Object o) {
        int n;
        if (o == null) {
            n = this.j();
        }
        else {
            n = this.i(o, o.hashCode());
        }
        return n;
    }
    
    public final Object c(final int n) {
        if (n >= 0 && n < this.d) {
            return this.b[n + n];
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void clear() {
        if (this.d > 0) {
            this.a = abq.a;
            this.b = abq.c;
            this.d = 0;
        }
    }
    
    public final boolean containsKey(final Object o) {
        return this.b(o) >= 0;
    }
    
    public final boolean containsValue(final Object o) {
        return this.a(o) >= 0;
    }
    
    public Object d(int n) {
        if (n >= 0) {
            final int d = this.d;
            if (n < d) {
                final Object[] b = this.b;
                final int n2 = n + n;
                final Object o = b[n2 + 1];
                if (d <= 1) {
                    this.clear();
                }
                else {
                    final int d2 = d - 1;
                    final int[] a = this.a;
                    final int length = a.length;
                    int n3 = 8;
                    if (length > 8 && d < length / 3) {
                        if (d > 8) {
                            n3 = d + (d >> 1);
                        }
                        final int[] copy = Arrays.copyOf(a, n3);
                        copy.getClass();
                        this.a = copy;
                        final Object[] copy2 = Arrays.copyOf(this.b, n3 + n3);
                        copy2.getClass();
                        this.b = copy2;
                        if (d != this.d) {
                            throw new ConcurrentModificationException();
                        }
                        if (n > 0) {
                            atum.i(a, this.a, 0, 0, n);
                            atum.j(b, this.b, 0, 0, n2);
                        }
                        if (n < d2) {
                            final int[] a2 = this.a;
                            final int n4 = n + 1;
                            final int n5 = d2 + 1;
                            atum.i(a, a2, n, n4, n5);
                            atum.j(b, this.b, n2, n4 + n4, n5 + n5);
                        }
                    }
                    else {
                        if (n < d2) {
                            final int n6 = n + 1;
                            final int n7 = d2 + 1;
                            atum.i(a, a, n, n6, n7);
                            final Object[] b2 = this.b;
                            atum.j(b2, b2, n2, n6 + n6, n7 + n7);
                        }
                        final Object[] b3 = this.b;
                        n = d2 + d2;
                        b3[n + 1] = (b3[n] = null);
                    }
                    if (d != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    this.d = d2;
                }
                return o;
            }
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public Object e(int n, final Object o) {
        if (n >= 0 && n < this.d) {
            final Object[] b = this.b;
            n = n + n + 1;
            final Object o2 = b[n];
            b[n] = o;
            return o2;
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final boolean equals(Object f) {
        if (this == f) {
            return true;
        }
        try {
            if (f instanceof abo) {
                final int d = this.d;
                final abo abo = (abo)f;
                if (d == abo.d) {
                    for (int i = 0; i < d; ++i) {
                        final Object c = this.c(i);
                        f = this.f(i);
                        final Object value = abo.get(c);
                        if (f == null) {
                            if (value != null || !abo.containsKey(c)) {
                                return false;
                            }
                        }
                        else if (!atoc.c(f, value)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            else {
                if (!(f instanceof Map)) {
                    return false;
                }
                if (this.d != ((Map)f).size()) {
                    return false;
                }
                for (int d2 = this.d, j = 0; j < d2; ++j) {
                    final Object c2 = this.c(j);
                    final Object f2 = this.f(j);
                    final Map map = (Map)f;
                    final Object value2 = map.get(c2);
                    if (f2 == null) {
                        if (value2 != null || !map.containsKey(c2)) {
                            return false;
                        }
                    }
                    else if (!atoc.c(f2, value2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public final Object f(final int n) {
        if (n >= 0 && n < this.d) {
            return this.b[n + n + 1];
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void g(final int n) {
        final int d = this.d;
        final int[] a = this.a;
        if (a.length < n) {
            final int[] copy = Arrays.copyOf(a, n);
            copy.getClass();
            this.a = copy;
            final Object[] copy2 = Arrays.copyOf(this.b, n + n);
            copy2.getClass();
            this.b = copy2;
        }
        if (this.d == d) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public final Object get(final Object o) {
        final int b = this.b(o);
        if (b >= 0) {
            return this.b[b + b + 1];
        }
        return null;
    }
    
    public final Object getOrDefault(final Object o, final Object o2) {
        final int b = this.b(o);
        if (b >= 0) {
            return this.b[b + b + 1];
        }
        return o2;
    }
    
    public void h(final abo abo) {
        final int d = abo.d;
        this.g(this.d + d);
        final int d2 = this.d;
        int i = 0;
        if (d2 == 0) {
            if (d > 0) {
                atum.i(abo.a, this.a, 0, 0, d);
                atum.j(abo.b, this.b, 0, 0, d + d);
                this.d = d;
            }
        }
        else {
            while (i < d) {
                this.put(abo.c(i), abo.f(i));
                ++i;
            }
        }
    }
    
    @Override
    public int hashCode() {
        final int[] a = this.a;
        final Object[] b = this.b;
        final int d = this.d;
        int n = 1;
        int i = 0;
        int n2 = 0;
        while (i < d) {
            final Object o = b[n];
            final int n3 = a[i];
            int hashCode;
            if (o != null) {
                hashCode = o.hashCode();
            }
            else {
                hashCode = 0;
            }
            n2 += (hashCode ^ n3);
            ++i;
            n += 2;
        }
        return n2;
    }
    
    public final boolean isEmpty() {
        return this.d <= 0;
    }
    
    public Object put(Object o, final Object o2) {
        final int d = this.d;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        int n;
        if (o != null) {
            n = this.i(o, hashCode);
        }
        else {
            n = this.j();
        }
        if (n >= 0) {
            final int n2 = n + n + 1;
            final Object[] b = this.b;
            o = b[n2];
            b[n2] = o2;
            return o;
        }
        final int n3 = ~n;
        final int[] a = this.a;
        if (d >= a.length) {
            int n4 = 8;
            if (d >= 8) {
                n4 = (d >> 1) + d;
            }
            else if (d < 4) {
                n4 = 4;
            }
            final int[] copy = Arrays.copyOf(a, n4);
            copy.getClass();
            this.a = copy;
            final Object[] copy2 = Arrays.copyOf(this.b, n4 + n4);
            copy2.getClass();
            this.b = copy2;
            if (d != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        if (n3 < d) {
            final int[] a2 = this.a;
            final int n5 = n3 + 1;
            atum.i(a2, a2, n5, n3, d);
            final Object[] b2 = this.b;
            final int d2 = this.d;
            atum.j(b2, b2, n5 + n5, n3 + n3, d2 + d2);
        }
        final int d3 = this.d;
        if (d == d3) {
            final int[] a3 = this.a;
            if (n3 < a3.length) {
                a3[n3] = hashCode;
                final Object[] b3 = this.b;
                final int n6 = n3 + n3;
                b3[n6] = o;
                b3[n6 + 1] = o2;
                this.d = d3 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    public final Object putIfAbsent(final Object o, final Object o2) {
        final Object value = this.get(o);
        if (value == null) {
            return this.put(o, o2);
        }
        return value;
    }
    
    public final Object remove(final Object o) {
        final int b = this.b(o);
        if (b >= 0) {
            return this.d(b);
        }
        return null;
    }
    
    public final boolean remove(final Object o, final Object o2) {
        final int b = this.b(o);
        if (b >= 0 && atoc.c(o2, this.f(b))) {
            this.d(b);
            return true;
        }
        return false;
    }
    
    public final Object replace(final Object o, final Object o2) {
        final int b = this.b(o);
        if (b >= 0) {
            return this.e(b, o2);
        }
        return null;
    }
    
    public final boolean replace(final Object o, final Object o2, final Object o3) {
        final int b = this.b(o);
        if (b >= 0 && atoc.c(o2, this.f(b))) {
            this.e(b, o3);
            return true;
        }
        return false;
    }
    
    public final int size() {
        return this.d;
    }
    
    @Override
    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int d = this.d, i = 0; i < d; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object c = this.c(i);
            if (c != sb) {
                sb.append(c);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final Object f = this.f(i);
            if (f != sb) {
                sb.append(f);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
