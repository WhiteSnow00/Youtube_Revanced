import android.os.SystemClock;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqe extends bqf
{
    private final bre d;
    private final afeq e;
    private float f;
    private int g;
    private int h;
    private long i;
    private bpu j;
    
    protected bqe(final azn azn, final int[] array, final bre d, final List list) {
        super(azn, array, (byte[])null);
        this.d = d;
        this.e = afeq.o((Collection)list);
        this.f = 1.0f;
        this.h = 0;
        this.i = -9223372036854775807L;
    }
    
    public static void s(final List list, final long[] array) {
        final int n = 0;
        long n2 = 0L;
        int n3 = 0;
        int i;
        while (true) {
            i = n;
            if (n3 >= array.length) {
                break;
            }
            n2 += array[n3];
            ++n3;
        }
        while (i < list.size()) {
            final afel afel = list.get(i);
            if (afel != null) {
                afel.h((Object)new bqd(n2, array[i]));
            }
            ++i;
        }
    }
    
    private final int t(final long n) {
        final float n2 = (long)(this.d.e() * 0.7f) / this.f;
        final boolean empty = this.e.isEmpty();
        long n3 = (long)n2;
        if (!empty) {
            int n4;
            for (n4 = 1; n4 < this.e.size() - 1 && ((bqd)this.e.get(n4)).a < n3; ++n4) {}
            final bqd bqd = (bqd)this.e.get(n4 - 1);
            final bqd bqd2 = (bqd)this.e.get(n4);
            final long a = bqd.a;
            final long a2 = bqd2.a;
            final long b = bqd.b;
            n3 = b + (long)((n3 - a) / (float)(a2 - a) * (bqd2.b - b));
        }
        int i = 0;
        int n5 = 0;
        while (i < this.b) {
            if (n == Long.MIN_VALUE || !this.q(i, n)) {
                if (this.h(i).j <= n3) {
                    return i;
                }
                n5 = i;
            }
            ++i;
        }
        return n5;
    }
    
    private static final long u(final List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        final bpu bpu = (bpu)agpc.V((Iterable)list);
        final long k = bpu.k;
        if (k != -9223372036854775807L) {
            final long l = bpu.l;
            if (l != -9223372036854775807L) {
                return l - k;
            }
        }
        return -9223372036854775807L;
    }
    
    public final int a(final long n, final List list) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long i = this.i;
        if (i != -9223372036854775807L && elapsedRealtime - i < 1000L && (list.isEmpty() || agpc.V((Iterable)list).equals(this.j))) {
            return list.size();
        }
        this.i = elapsedRealtime;
        bpu j;
        if (list.isEmpty()) {
            j = null;
        }
        else {
            j = (bpu)agpc.V((Iterable)list);
        }
        this.j = j;
        final boolean empty = list.isEmpty();
        int k = 0;
        if (empty) {
            return 0;
        }
        final int size = list.size();
        if (bax.u(((bpu)list.get(size - 1)).k - n, this.f) < 25000000L) {
            return size;
        }
        u(list);
        final ayg h = this.h(this.t(elapsedRealtime));
        while (k < size) {
            final bpu bpu = list.get(k);
            final ayg h2 = bpu.h;
            if (bax.u(bpu.k - n, this.f) >= 25000000L && h2.j < h.j) {
                final int t = h2.t;
                if (t != -1 && t <= 719) {
                    final int s = h2.s;
                    if (s != -1 && s <= 1279) {
                        if (t < h.t) {
                            return k;
                        }
                    }
                }
            }
            ++k;
        }
        return size;
    }
    
    public final int c() {
        return this.g;
    }
    
    public final int d() {
        return this.h;
    }
    
    public final Object k() {
        return null;
    }
    
    public final void l() {
        this.j = null;
    }
    
    public final void m() {
        this.i = -9223372036854775807L;
        this.j = null;
    }
    
    public final void n(final float f) {
        this.f = f;
    }
    
    public final void o(long n, final long n2, long n3, final List list, final bpw[] array) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final int g = this.g;
        final int length = array.length;
        int i;
        final int n4 = i = 0;
        Label_0130: {
            if (g < length) {
                i = n4;
                if (array[g].d()) {
                    final bpw bpw = array[this.g];
                    n = bpw.a() - bpw.b();
                    break Label_0130;
                }
            }
            while (i < length) {
                final bpw bpw2 = array[i];
                if (bpw2.d()) {
                    n = bpw2.a() - bpw2.b();
                    break Label_0130;
                }
                ++i;
            }
            n = u(list);
        }
        int h = this.h;
        if (h == 0) {
            this.h = 1;
            this.g = this.t(elapsedRealtime);
            return;
        }
        int g2 = this.g;
        int f;
        if (list.isEmpty()) {
            f = -1;
        }
        else {
            f = this.f(((bpu)agpc.V((Iterable)list)).h);
        }
        if (f != -1) {
            h = ((bpu)agpc.V((Iterable)list)).i;
            g2 = f;
        }
        int t;
        final int n5 = t = this.t(elapsedRealtime);
        Label_0366: {
            if (!this.q(g2, elapsedRealtime)) {
                final ayg h2 = this.h(g2);
                final ayg h3 = this.h(n5);
                final long n6 = 10000000L;
                if (n3 == -9223372036854775807L) {
                    n = n6;
                }
                else {
                    if (n != -9223372036854775807L) {
                        n3 -= n;
                    }
                    n = Math.min((long)(n3 * 0.75f), 10000000L);
                }
                final int j = h3.j;
                final int k = h2.j;
                if (j <= k || n2 >= n) {
                    t = n5;
                    if (j >= k) {
                        break Label_0366;
                    }
                    t = n5;
                    if (n2 < 25000000L) {
                        break Label_0366;
                    }
                }
                t = g2;
            }
        }
        if (t != g2) {
            h = 3;
        }
        this.h = h;
        this.g = t;
    }
}
