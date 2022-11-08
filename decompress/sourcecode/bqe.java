import android.os.SystemClock;
import java.util.List;
import java.util.Comparator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bqe implements bqv
{
    protected final azm a;
    protected final int b;
    public final int[] c;
    private final ayf[] d;
    private final long[] e;
    private int f;
    
    public bqe(final azm azm, final int... array) {
        this(azm, array, null);
    }
    
    public bqe(final azm a, int[] c, final byte[] array) {
        final int length = c.length;
        dk.h(length > 0);
        dk.d((Object)a);
        this.a = a;
        this.b = length;
        this.d = new ayf[length];
        for (int i = 0; i < c.length; ++i) {
            this.d[i] = a.a(c[i]);
        }
        Arrays.sort(this.d, (Comparator<? super ayf>)aaq.d);
        this.c = new int[this.b];
        int n = 0;
        int b;
        while (true) {
            b = this.b;
            if (n >= b) {
                break;
            }
            c = this.c;
            final ayf ayf = this.d[n];
            int n2 = 0;
            while (true) {
                final ayf[] d = a.d;
                if (n2 >= d.length) {
                    n2 = -1;
                    break;
                }
                if (ayf == d[n2]) {
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
                final bqe bqe = (bqe)o;
                if (this.a == bqe.a && Arrays.equals(this.c, bqe.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int f(final ayf ayf) {
        for (int i = 0; i < this.b; ++i) {
            if (this.d[i] == ayf) {
                return i;
            }
        }
        return -1;
    }
    
    public final int g() {
        return this.c.length;
    }
    
    public final ayf h(final int n) {
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
    
    public final ayf i() {
        return this.d[this.c()];
    }
    
    public final azm j() {
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
                    e[n] = Math.max(e[n], baw.as(elapsedRealtime, n2));
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
}
