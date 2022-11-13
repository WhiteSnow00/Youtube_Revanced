import android.os.SystemClock;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bqf implements bqw
{
    protected final azn a;
    protected final int b;
    public final int[] c;
    private final ayg[] d;
    private final long[] e;
    private int f;
    
    public bqf(final azn azn, final int... array) {
        this(azn, array, null);
    }
    
    public bqf(final azn a, final int[] array, final byte[] array2) {
        final int length = array.length;
        dk.h(length > 0);
        dk.d((Object)a);
        this.a = a;
        this.b = length;
        this.d = new ayg[length];
        for (int i = 0; i < array.length; ++i) {
            this.d[i] = a.a(array[i]);
        }
        Arrays.sort(this.d, aar.d);
        this.c = new int[this.b];
        int n = 0;
        int b;
        while (true) {
            b = this.b;
            if (n >= b) {
                break;
            }
            final int[] c = this.c;
            final ayg ayg = this.d[n];
            int n2 = 0;
            while (true) {
                final ayg[] d = a.d;
                if (n2 >= d.length) {
                    n2 = -1;
                    break;
                }
                if (ayg == d[n2]) {
                    break;
                }
                ++n2;
            }
            c[n] = n2;
            ++n;
        }
        this.e = new long[b];
    }
    
    public int a(final long n, final List list) {
        return list.size();
    }
    
    public final int b(final int n) {
        return this.c[n];
    }
    
    public final int e(final int n) {
        for (int i = 0; i < this.b; ++i) {
            if (this.c[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bqf bqf = (bqf)o;
                if (this.a == bqf.a && Arrays.equals(this.c, bqf.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int f(final ayg ayg) {
        for (int i = 0; i < this.b; ++i) {
            if (this.d[i] == ayg) {
                return i;
            }
        }
        return -1;
    }
    
    public final int g() {
        return this.c.length;
    }
    
    public final ayg h(final int n) {
        return this.d[n];
    }
    
    @Override
    public final int hashCode() {
        int f;
        if ((f = this.f) == 0) {
            f = System.identityHashCode(this.a) * 31 + Arrays.hashCode(this.c);
            this.f = f;
        }
        return f;
    }
    
    public final ayg i() {
        return this.d[this.c()];
    }
    
    public final azn j() {
        return this.a;
    }
    
    public void l() {
    }
    
    public void m() {
    }
    
    public void n(final float n) {
    }
    
    public boolean p(final int n, final long n2) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        int q = this.q(n, elapsedRealtime) ? 1 : 0;
        while (true) {
            for (int i = 0; i < this.b; ++i) {
                if (q != 0) {
                    final long[] e = this.e;
                    e[n] = Math.max(e[n], bax.as(elapsedRealtime, n2));
                    return true;
                }
                if (i != n && !this.q(i, elapsedRealtime)) {
                    q = 1;
                }
                else {
                    q = 0;
                }
            }
            if (q == 0) {
                return false;
            }
            continue;
        }
    }
    
    public boolean q(final int n, final long n2) {
        return this.e[n] > n2;
    }
    
    public final void r() {
    }
}
