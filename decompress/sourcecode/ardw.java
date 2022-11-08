import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Iterator;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardw extends AbstractList
{
    dpz a;
    drf b;
    SoftReference[] c;
    int[] d;
    long[] e;
    long[] f;
    long[][] g;
    dqs h;
    int i;
    
    public ardw(long n, final dpz a) {
        final dqv dqv = null;
        this.b = null;
        this.c = null;
        final int n2 = 0;
        this.i = 0;
        this.a = a;
        for (final drf b : ((ardh)a.j(dqm.class).get(0)).j(drf.class)) {
            if (b.n().a == n) {
                this.b = b;
            }
        }
        final drf b2 = this.b;
        if (b2 == null) {
            final StringBuilder sb = new StringBuilder(52);
            sb.append("This MP4 does not contain track ");
            sb.append(n);
            throw new RuntimeException(sb.toString());
        }
        if (b2.m() != null && this.b.m().l() != null) {
            final long[] k = this.b.m().l().k();
            this.e = k;
            final int length = k.length;
            this.f = new long[length];
            this.c = new SoftReference[length];
            this.g = new long[this.e.length][];
            this.h = this.b.m().p();
            final dqt m = this.b.m();
            dqv dqv2 = m.a;
            Label_0275: {
                if (dqv2 == null) {
                    final Iterator iterator2 = ((ardh)m).i().iterator();
                    dpu dpu;
                    do {
                        dqv2 = dqv;
                        if (!iterator2.hasNext()) {
                            break Label_0275;
                        }
                        dpu = (dpu)iterator2.next();
                    } while (!(dpu instanceof dqv));
                    m.a = (dqv)dpu;
                    dqv2 = m.a;
                }
            }
            final List a2 = dqv2.a;
            final dqu[] array = a2.toArray(new dqu[a2.size()]);
            final dqu dqu = array[0];
            long a3 = dqu.a;
            int q = aqqm.q(dqu.b);
            final int size = this.size();
            final int n3 = 1;
            int n4 = 0;
            int n5 = 0;
            int n6 = 1;
            int n7 = 1;
            int n8;
            int n9;
            do {
                n9 = n4 + 1;
                int q2 = q;
                n = a3;
                int n10 = n6;
                if (n9 == a3) {
                    if (array.length > n6) {
                        final dqu dqu2 = array[n6];
                        q2 = aqqm.q(dqu2.b);
                        n = dqu2.a;
                        n10 = n6 + 1;
                        n5 = q;
                    }
                    else {
                        q2 = -1;
                        n = Long.MAX_VALUE;
                        n10 = n6;
                        n5 = q;
                    }
                }
                this.g[n9 - 1] = new long[n5];
                n8 = n7 + n5;
                q = q2;
                n4 = n9;
                a3 = n;
                n6 = n10;
            } while ((n7 = n8) <= size);
            this.d = new int[n9 + 1];
            final dqu dqu3 = array[0];
            long a4 = dqu3.a;
            int q3 = aqqm.q(dqu3.b);
            int n11 = 0;
            int n12 = 1;
            int n13 = 0;
            int n14 = 1;
            int n15;
            while (true) {
                n15 = n11 + 1;
                this.d[n11] = n12;
                int q4 = q3;
                n = a4;
                int n16 = n14;
                if (n15 == a4) {
                    if (array.length > n14) {
                        final dqu dqu4 = array[n14];
                        q4 = aqqm.q(dqu4.b);
                        n = dqu4.a;
                        n16 = n14 + 1;
                        n13 = q3;
                    }
                    else {
                        q4 = -1;
                        n = Long.MAX_VALUE;
                        n16 = n14;
                        n13 = q3;
                    }
                }
                n12 += n13;
                if (n12 > size) {
                    break;
                }
                final int n17 = n15;
                q3 = q4;
                n11 = n17;
                a4 = n;
                n14 = n16;
            }
            this.d[n15] = Integer.MAX_VALUE;
            n = 0L;
            int n18 = n3;
            int n19 = n2;
            while (n18 <= this.h.k()) {
                int n20 = n19;
                if (n18 == this.d[n19]) {
                    n20 = n19 + 1;
                    n = 0L;
                }
                final long[] f = this.f;
                final int n21 = n20 - 1;
                final int n22 = n18 - 1;
                f[n21] += this.h.l(n22);
                this.g[n21][n18 - this.d[n21]] = n;
                n += this.h.l(n22);
                ++n18;
                n19 = n20;
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder(74);
        sb2.append("MP4 track ");
        sb2.append(n);
        sb2.append(" is missing SampleTableBox or ChunkOffsetBox");
        throw new IOException(sb2.toString());
    }
    
    final int a(int n) {
        monitorenter(this);
        ++n;
        try {
            final int[] d = this.d;
            final int i = this.i;
            final int n2 = d[i];
            if (n >= n2 && n < d[i + 1]) {
                monitorexit(this);
                return i;
            }
            if (n < n2) {
                this.i = 0;
                int j;
                while (true) {
                    final int[] d2 = this.d;
                    j = this.i;
                    final int k = j + 1;
                    if (d2[k] > n) {
                        break;
                    }
                    this.i = k;
                }
                monitorexit(this);
                return j;
            }
            this.i = i + 1;
            int l;
            while (true) {
                final int[] d3 = this.d;
                l = this.i;
                final int m = l + 1;
                if (d3[m] > n) {
                    break;
                }
                this.i = m;
            }
            monitorexit(this);
            return l;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final int size() {
        return aqqm.q(this.b.m().p().k());
    }
}
