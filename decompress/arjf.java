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

public final class arjf extends AbstractList
{
    dqd a;
    drj b;
    SoftReference[] c;
    int[] d;
    long[] e;
    long[] f;
    long[][] g;
    dqw h;
    int i;
    
    public arjf(long n, final dqd a) {
        final dqz dqz = null;
        this.b = null;
        this.c = null;
        final int n2 = 0;
        this.i = 0;
        this.a = a;
        for (final drj b : ((ariq)a.j((Class)dqq.class).get(0)).j(drj.class)) {
            if (b.n().a == n) {
                this.b = b;
            }
        }
        final drj b2 = this.b;
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
            final dqx m = this.b.m();
            dqz dqz2 = m.a;
            Label_0275: {
                if (dqz2 == null) {
                    final Iterator iterator2 = ((ariq)m).i().iterator();
                    dpy dpy;
                    do {
                        dqz2 = dqz;
                        if (!iterator2.hasNext()) {
                            break Label_0275;
                        }
                        dpy = (dpy)iterator2.next();
                    } while (!(dpy instanceof dqz));
                    m.a = (dqz)dpy;
                    dqz2 = m.a;
                }
            }
            final List a2 = dqz2.a;
            final dqy[] array = a2.toArray(new dqy[a2.size()]);
            final dqy dqy = array[0];
            long a3 = dqy.a;
            int o = aqvs.o(dqy.b);
            final int size = this.size();
            final int n3 = 1;
            int n4 = 0;
            int n5 = 1;
            int n6 = 0;
            int n7 = 1;
            int n8;
            int n9;
            do {
                n9 = n4 + 1;
                int o2 = o;
                n = a3;
                int n10 = n5;
                if (n9 == a3) {
                    if (array.length > n5) {
                        final dqy dqy2 = array[n5];
                        o2 = aqvs.o(dqy2.b);
                        n = dqy2.a;
                        n10 = n5 + 1;
                        n6 = o;
                    }
                    else {
                        o2 = -1;
                        n = Long.MAX_VALUE;
                        n6 = o;
                        n10 = n5;
                    }
                }
                this.g[n9 - 1] = new long[n6];
                n8 = n7 + n6;
                o = o2;
                n4 = n9;
                a3 = n;
                n5 = n10;
            } while ((n7 = n8) <= size);
            this.d = new int[n9 + 1];
            final dqy dqy3 = array[0];
            long a4 = dqy3.a;
            int o3 = aqvs.o(dqy3.b);
            int n11 = 0;
            int n12 = 1;
            int n13 = 1;
            int n14 = 0;
            int n15;
            while (true) {
                final int[] d = this.d;
                n15 = n11 + 1;
                d[n11] = n12;
                int o4 = o3;
                n = a4;
                int n16 = n13;
                if (n15 == a4) {
                    if (array.length > n13) {
                        final dqy dqy4 = array[n13];
                        o4 = aqvs.o(dqy4.b);
                        n = dqy4.a;
                        n16 = n13 + 1;
                        n14 = o3;
                    }
                    else {
                        o4 = -1;
                        n = Long.MAX_VALUE;
                        n14 = o3;
                        n16 = n13;
                    }
                }
                final int n17 = n12 + n14;
                if (n17 > size) {
                    break;
                }
                final int n18 = n15;
                o3 = o4;
                n11 = n18;
                a4 = n;
                n12 = n17;
                n13 = n16;
            }
            this.d[n15] = Integer.MAX_VALUE;
            n = 0L;
            int n19 = n3;
            int n20 = n2;
            while (n19 <= this.h.k()) {
                int n21 = n20;
                if (n19 == this.d[n20]) {
                    n21 = n20 + 1;
                    n = 0L;
                }
                final long[] f = this.f;
                final int n22 = n21 - 1;
                final long n23 = f[n22];
                final dqw h = this.h;
                final int n24 = n19 - 1;
                f[n22] = n23 + h.l(n24);
                this.g[n22][n19 - this.d[n22]] = n;
                n += this.h.l(n24);
                ++n19;
                n20 = n21;
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
        try {
            final int[] d = this.d;
            final int i = this.i;
            final int n2 = d[i];
            if (++n >= n2 && n < d[i + 1]) {
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
    public final /* bridge */ Object get(final int n) {
        if (n < this.h.k()) {
            final int a = this.a(n);
            final int n2 = this.d[a] - 1;
            final long[] e = this.e;
            final long n3 = a;
            final long n4 = e[aqvs.o(n3)];
            final long[] array = this.g[aqvs.o(n3)];
            long n5 = array[n - n2];
            ByteBuffer[] array2;
            if (this.c[aqvs.o(n3)] != null) {
                array2 = this.c[aqvs.o(n3)].get();
            }
            else {
                array2 = null;
            }
            if (array2 == null) {
                final ArrayList list = new ArrayList();
                long n6 = 0L;
                int n7 = 0;
                try {
                    int length;
                    while (true) {
                        length = array.length;
                        if (n7 >= length) {
                            break;
                        }
                        if (array[n7] + this.h.l(n7 + n2) - n6 > 268435456L) {
                            list.add(this.a.h(n4 + n6, array[n7] - n6));
                            n6 = array[n7];
                        }
                        ++n7;
                    }
                    list.add(this.a.h(n4 + n6, -n6 + array[length - 1] + this.h.l(n2 + length - 1)));
                    array2 = (ByteBuffer[])list.toArray(new ByteBuffer[list.size()]);
                    this.c[aqvs.o(n3)] = new SoftReference(array2);
                }
                catch (final IOException ex) {
                    throw new IndexOutOfBoundsException(ex.getMessage());
                }
            }
            for (final ByteBuffer byteBuffer : array2) {
                if (n5 < byteBuffer.limit()) {
                    final ByteBuffer byteBuffer2 = byteBuffer;
                    return new arje(this.h.l(n), byteBuffer2, n5);
                }
                n5 -= byteBuffer.limit();
            }
            final ByteBuffer byteBuffer2 = null;
            return new arje(this.h.l(n), byteBuffer2, n5);
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public final int size() {
        return aqvs.o(this.b.m().p().k());
    }
}
