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

final class ahbo extends agyc
{
    static final int[] a;
    private static final long serialVersionUID = 1L;
    public final int d;
    public final agyc e;
    public final agyc f;
    public final int g;
    private final int i;
    
    static {
        a = new int[] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE };
    }
    
    public ahbo(final agyc e, final agyc f) {
        this.e = e;
        this.f = f;
        final int d = e.d();
        this.i = d;
        this.d = d + f.d();
        this.g = Math.max(e.f(), f.f()) + 1;
    }
    
    static int c(final int n) {
        final int[] a = ahbo.a;
        final int length = a.length;
        if (n >= 47) {
            return Integer.MAX_VALUE;
        }
        return a[n];
    }
    
    public static agyc g(final agyc agyc, final agyc agyc2) {
        final int d = agyc.d();
        final int d2 = agyc2.d();
        final byte[] array = new byte[d + d2];
        agyc.G(array, 0, 0, d);
        agyc2.G(array, 0, d, d2);
        return agyc.C(array);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }
    
    public final byte a(final int n) {
        F(n, this.d);
        return this.b(n);
    }
    
    public final byte b(final int n) {
        final int i = this.i;
        if (n < i) {
            return this.e.b(n);
        }
        return this.f.b(n - i);
    }
    
    public final int d() {
        return this.d;
    }
    
    protected final void e(final byte[] array, final int n, final int n2, final int n3) {
        final int i = this.i;
        if (n + n3 <= i) {
            this.e.e(array, n, n2, n3);
            return;
        }
        if (n >= i) {
            this.f.e(array, n - i, n2, n3);
            return;
        }
        final int n4 = i - n;
        this.e.e(array, n, n2, n4);
        this.f.e(array, 0, n2 + n4, n3 - n4);
    }
    
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof agyc)) {
            return false;
        }
        final agyc agyc = (agyc)o;
        if (this.d != agyc.d()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        final int c = super.c;
        final int c2 = agyc.c;
        if (c != 0 && c2 != 0 && c != c2) {
            return false;
        }
        final ahbm ahbm = new ahbm((agyc)this);
        agxz agxz = ahbm.a();
        final ahbm ahbm2 = new ahbm(agyc);
        agxz agxz2 = ahbm2.a();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        boolean b3;
        while (true) {
            final int n4 = agxz.d() - n;
            final int n5 = agxz2.d() - n2;
            final int min = Math.min(n4, n5);
            boolean b2;
            if (n == 0) {
                b2 = agxz.g(agxz2, n2, min);
            }
            else {
                b2 = agxz2.g(agxz, n, min);
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
                    agxz = ahbm.a();
                    n = 0;
                }
                else {
                    n += min;
                }
                if (min == n5) {
                    agxz2 = ahbm2.a();
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
    
    protected final boolean h() {
        return this.d >= c(this.g);
    }
    
    protected final int i(int i, final int n, final int n2) {
        final int j = this.i;
        if (n + n2 <= j) {
            return this.e.i(i, n, n2);
        }
        if (n >= j) {
            return this.f.i(i, n - j, n2);
        }
        final int n3 = j - n;
        i = this.e.i(i, n, n3);
        return this.f.i(i, 0, n2 - n3);
    }
    
    protected final int j(int j, final int n, final int n2) {
        final int i = this.i;
        if (n + n2 <= i) {
            return this.e.j(j, n, n2);
        }
        if (n >= i) {
            return this.f.j(j, n - i, n2);
        }
        final int n3 = i - n;
        j = this.e.j(j, n, n3);
        return this.f.j(j, 0, n2 - n3);
    }
    
    public final agyc k(final int n, final int n2) {
        final int r = r(n, n2, this.d);
        if (r == 0) {
            return agyc.b;
        }
        if (r == this.d) {
            return this;
        }
        final int i = this.i;
        if (n2 <= i) {
            return this.e.k(n, n2);
        }
        if (n >= i) {
            return this.f.k(n - i, n2 - i);
        }
        final agyc e = this.e;
        return new ahbo(e.k(n, e.d()), this.f.k(0, n2 - this.i));
    }
    
    public final agyh l() {
        final ArrayList list = new ArrayList();
        final ahbm ahbm = new ahbm((agyc)this);
        while (ahbm.hasNext()) {
            list.add(ahbm.a().o());
        }
        final int e = agyh.e;
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
        agyh m;
        if (n == 2) {
            m = new agye(list, n2);
        }
        else {
            m = agyh.M((InputStream)new ahac((Iterable)list));
        }
        return m;
    }
    
    public final InputStream m() {
        return (InputStream)new ahbn(this);
    }
    
    protected final String n(final Charset charset) {
        return new String(this.I(), charset);
    }
    
    public final ByteBuffer o() {
        return ByteBuffer.wrap(this.I()).asReadOnlyBuffer();
    }
    
    public final void p(final agxu agxu) {
        this.e.p(agxu);
        this.f.p(agxu);
    }
    
    public final boolean q() {
        final int j = this.e.j(0, 0, this.i);
        final agyc f = this.f;
        return f.j(j, 0, f.d()) == 0;
    }
    
    public final agxy s() {
        return (agxy)new ahbl(this);
    }
    
    Object writeReplace() {
        return agyc.C(this.I());
    }
}
