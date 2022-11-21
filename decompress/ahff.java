import java.nio.charset.Charset;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahff extends ahbt
{
    public static final int[] a;
    private static final long serialVersionUID = 1L;
    public final int d;
    public final ahbt e;
    public final ahbt f;
    public final int g;
    private final int h;
    
    static {
        a = new int[] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE };
    }
    
    public ahff(final ahbt e, final ahbt f) {
        this.e = e;
        this.f = f;
        final int d = e.d();
        this.h = d;
        this.d = d + f.d();
        this.g = Math.max(e.f(), f.f()) + 1;
    }
    
    public static int c(final int n) {
        final int[] a = ahff.a;
        final int length = a.length;
        if (n >= 47) {
            return Integer.MAX_VALUE;
        }
        return a[n];
    }
    
    public static ahbt g(final ahbt ahbt, final ahbt ahbt2) {
        final int d = ahbt.d();
        final int d2 = ahbt2.d();
        final byte[] array = new byte[d + d2];
        ahbt.G(array, 0, 0, d);
        ahbt2.G(array, 0, d, d2);
        return ahbt.C(array);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }
    
    public final byte a(final int n) {
        F(n, this.d);
        return this.b(n);
    }
    
    public final byte b(final int n) {
        final int h = this.h;
        if (n < h) {
            return this.e.b(n);
        }
        return this.f.b(n - h);
    }
    
    public final int d() {
        return this.d;
    }
    
    protected final void e(final byte[] array, final int n, final int n2, final int n3) {
        final int h = this.h;
        if (n + n3 <= h) {
            this.e.e(array, n, n2, n3);
            return;
        }
        if (n >= h) {
            this.f.e(array, n - h, n2, n3);
            return;
        }
        final ahbt e = this.e;
        final int n4 = h - n;
        e.e(array, n, n2, n4);
        this.f.e(array, 0, n2 + n4, n3 - n4);
    }
    
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof ahbt)) {
            return false;
        }
        final ahbt ahbt = (ahbt)o;
        if (this.d != ahbt.d()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        final int c = super.c;
        final int c2 = ahbt.c;
        if (c != 0 && c2 != 0 && c != c2) {
            return false;
        }
        final ahfd ahfd = new ahfd((ahbt)this);
        ahbq ahbq = ahfd.a();
        final ahfd ahfd2 = new ahfd(ahbt);
        ahbq ahbq2 = ahfd2.a();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        boolean b3;
        while (true) {
            final int n4 = ahbq.d() - n;
            final int n5 = ahbq2.d() - n2;
            final int min = Math.min(n4, n5);
            boolean b2;
            if (n == 0) {
                b2 = ahbq.g((ahbt)ahbq2, n2, min);
            }
            else {
                b2 = ahbq2.g((ahbt)ahbq, n, min);
            }
            if (!b2) {
                b3 = false;
                break;
            }
            n3 += min;
            final int d = this.d;
            if (n3 >= d) {
                if (n3 == d) {
                    b3 = b;
                    break;
                }
                throw new IllegalStateException();
            }
            else {
                if (min == n4) {
                    ahbq = ahfd.a();
                    n = 0;
                }
                else {
                    n += min;
                }
                if (min == n5) {
                    ahbq2 = ahfd2.a();
                    n2 = 0;
                }
                else {
                    n2 += min;
                }
            }
        }
        return b3;
    }
    
    protected final int f() {
        return this.g;
    }
    
    public final boolean h() {
        return this.d >= c(this.g);
    }
    
    protected final int i(int i, final int n, final int n2) {
        final int h = this.h;
        if (n + n2 <= h) {
            return this.e.i(i, n, n2);
        }
        if (n >= h) {
            return this.f.i(i, n - h, n2);
        }
        final ahbt e = this.e;
        final int n3 = h - n;
        i = e.i(i, n, n3);
        return this.f.i(i, 0, n2 - n3);
    }
    
    public final /* bridge */ Iterator iterator() {
        return (Iterator)this.s();
    }
    
    protected final int j(int j, final int n, final int n2) {
        final int h = this.h;
        if (n + n2 <= h) {
            return this.e.j(j, n, n2);
        }
        if (n >= h) {
            return this.f.j(j, n - h, n2);
        }
        final ahbt e = this.e;
        final int n3 = h - n;
        j = e.j(j, n, n3);
        return this.f.j(j, 0, n2 - n3);
    }
    
    public final ahbt k(final int n, final int n2) {
        final int r = r(n, n2, this.d);
        if (r == 0) {
            return ahbt.b;
        }
        if (r == this.d) {
            return this;
        }
        final int h = this.h;
        if (n2 <= h) {
            return this.e.k(n, n2);
        }
        if (n >= h) {
            return this.f.k(n - h, n2 - h);
        }
        final ahbt e = this.e;
        return new ahff(e.k(n, e.d()), this.f.k(0, n2 - this.h));
    }
    
    public final ahby l() {
        final ArrayList list = new ArrayList();
        final ahfd ahfd = new ahfd((ahbt)this);
        while (ahfd.hasNext()) {
            list.add(ahfd.a().o());
        }
        final int e = ahby.e;
        final Iterator iterator = list.iterator();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            final ByteBuffer byteBuffer = (ByteBuffer)iterator.next();
            n2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                n |= 0x1;
            }
            else if (byteBuffer.isDirect()) {
                n |= 0x2;
            }
            else {
                n |= 0x4;
            }
        }
        ahby m;
        if (n == 2) {
            m = new ahbv(list, n2);
        }
        else {
            m = ahby.M((InputStream)new ahdt((Iterable)list));
        }
        return m;
    }
    
    public final InputStream m() {
        return (InputStream)new ahfe(this);
    }
    
    protected final String n(final Charset charset) {
        return new String(this.I(), charset);
    }
    
    public final ByteBuffer o() {
        return ByteBuffer.wrap(this.I()).asReadOnlyBuffer();
    }
    
    public final void p(final ahbl ahbl) {
        this.e.p(ahbl);
        this.f.p(ahbl);
    }
    
    public final boolean q() {
        final int j = this.e.j(0, 0, this.h);
        final ahbt f = this.f;
        return f.j(j, 0, f.d()) == 0;
    }
    
    public final ahbp s() {
        return (ahbp)new ahfc(this);
    }
    
    Object writeReplace() {
        return ahbt.C(this.I());
    }
}
