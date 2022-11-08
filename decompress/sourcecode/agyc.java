import java.util.Locale;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class agyc implements Iterable, Serializable
{
    public static final agyc b;
    private static final long serialVersionUID = 1L;
    public int c;
    
    static {
        b = (agyc)new agya(agzz.b);
    }
    
    public agyc() {
        this.c = 0;
    }
    
    public static agyc A(final String s) {
        return (agyc)new agya(s.getBytes(agzz.a));
    }
    
    public static agyc B(final InputStream inputStream) {
        final ArrayList list = new ArrayList();
        int min = 256;
        while (true) {
            final byte[] array = new byte[min];
            int i;
            int read;
            for (i = 0; i < min; i += read) {
                read = inputStream.read(array, i, min - i);
                if (read == -1) {
                    break;
                }
            }
            Object z;
            if (i == 0) {
                z = null;
            }
            else {
                z = z(array, 0, i);
            }
            if (z == null) {
                break;
            }
            list.add(z);
            min = Math.min(min + min, 8192);
        }
        return v(list);
    }
    
    static agyc C(final byte[] array) {
        return (agyc)new agya(array);
    }
    
    static void F(final int n, final int n2) {
        if ((n2 - (n + 1) | n) >= 0) {
            return;
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder("Index < 0: ");
            sb.append(n);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder("Index > length: ");
        sb2.append(n);
        sb2.append(", ");
        sb2.append(n2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
    
    private static agyc c(final Iterator iterator, int n) {
        if (n > 0) {
            Object g;
            if (n == 1) {
                g = iterator.next();
            }
            else {
                final int n2 = n >>> 1;
                final agyc c = c(iterator, n2);
                final agyc c2 = c(iterator, n - n2);
                if (Integer.MAX_VALUE - c.d() < c2.d()) {
                    n = c.d();
                    final int d = c2.d();
                    final StringBuilder sb = new StringBuilder("ByteString would be too long: ");
                    sb.append(n);
                    sb.append("+");
                    sb.append(d);
                    throw new IllegalArgumentException(sb.toString());
                }
                n = ahbo.h;
                if (c2.d() == 0) {
                    g = c;
                }
                else {
                    g = c2;
                    if (c.d() != 0) {
                        n = c.d() + c2.d();
                        if (n < 128) {
                            g = ahbo.g(c, c2);
                        }
                        else {
                            if (c instanceof ahbo) {
                                final ahbo ahbo = (ahbo)c;
                                if (ahbo.f.d() + c2.d() < 128) {
                                    g = new ahbo(ahbo.e, ahbo.g(ahbo.f, c2));
                                    return (agyc)g;
                                }
                                if (ahbo.e.f() > ahbo.f.f() && ahbo.g > c2.f()) {
                                    g = new ahbo(ahbo.e, (agyc)new ahbo(ahbo.f, c2));
                                    return (agyc)g;
                                }
                            }
                            if (n >= ahbo.c(Math.max(c.f(), c2.f()) + 1)) {
                                g = new ahbo(c, c2);
                            }
                            else {
                                final ArrayDeque arrayDeque = new ArrayDeque();
                                ahbz.b(c, arrayDeque);
                                ahbz.b(c2, arrayDeque);
                                Object o = arrayDeque.pop();
                                while (true) {
                                    g = o;
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                    }
                                    o = new ahbo((agyc)arrayDeque.pop(), (agyc)o);
                                }
                            }
                        }
                    }
                }
            }
            return (agyc)g;
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", n));
    }
    
    static int r(final int n, final int n2, final int n3) {
        final int n4 = n2 - n;
        if ((n | n2 | n4 | n3 - n2) >= 0) {
            return n4;
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder("Beginning index: ");
            sb.append(n);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (n2 < n) {
            final StringBuilder sb2 = new StringBuilder("Beginning index larger than ending index: ");
            sb2.append(n);
            sb2.append(", ");
            sb2.append(n2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        final StringBuilder sb3 = new StringBuilder("End index: ");
        sb3.append(n2);
        sb3.append(" >= ");
        sb3.append(n3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
    
    public static agyb t() {
        return new agyb(128);
    }
    
    public static agyb u(final int n) {
        return new agyb(n);
    }
    
    public static agyc v(final Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            final Iterator iterator = iterable.iterator();
            int n = 0;
            while (true) {
                size = n;
                if (!iterator.hasNext()) {
                    break;
                }
                iterator.next();
                ++n;
            }
        }
        else {
            size = ((Collection)iterable).size();
        }
        if (size == 0) {
            return agyc.b;
        }
        return c(iterable.iterator(), size);
    }
    
    public static agyc w(final ByteBuffer byteBuffer) {
        return y(byteBuffer, byteBuffer.remaining());
    }
    
    public static agyc x(final byte[] array) {
        return z(array, 0, array.length);
    }
    
    public static agyc y(final ByteBuffer byteBuffer, final int n) {
        r(0, n, byteBuffer.remaining());
        final byte[] array = new byte[n];
        byteBuffer.get(array);
        return (agyc)new agya(array);
    }
    
    public static agyc z(final byte[] array, final int n, final int n2) {
        r(n, n + n2, array.length);
        final byte[] array2 = new byte[n2];
        System.arraycopy(array, n, array2, 0, n2);
        return (agyc)new agya(array2);
    }
    
    public final String D(final Charset charset) {
        String n;
        if (this.d() == 0) {
            n = "";
        }
        else {
            n = this.n(charset);
        }
        return n;
    }
    
    public final String E() {
        return this.D(agzz.a);
    }
    
    @Deprecated
    public final void G(final byte[] array, final int n, final int n2, final int n3) {
        r(n, n + n3, this.d());
        r(n2, n2 + n3, array.length);
        if (n3 > 0) {
            this.e(array, n, n2, n3);
        }
    }
    
    public final boolean H() {
        return this.d() == 0;
    }
    
    public final byte[] I() {
        final int d = this.d();
        if (d == 0) {
            return agzz.b;
        }
        final byte[] array = new byte[d];
        this.e(array, 0, 0, d);
        return array;
    }
    
    public abstract byte a(final int p0);
    
    public abstract byte b(final int p0);
    
    public abstract int d();
    
    protected abstract void e(final byte[] p0, final int p1, final int p2, final int p3);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    protected abstract int f();
    
    protected abstract boolean h();
    
    @Override
    public final int hashCode() {
        int c;
        if ((c = this.c) == 0) {
            final int d = this.d();
            if ((c = this.i(d, 0, d)) == 0) {
                c = 1;
            }
            this.c = c;
        }
        return c;
    }
    
    protected abstract int i(final int p0, final int p1, final int p2);
    
    protected abstract int j(final int p0, final int p1, final int p2);
    
    public abstract agyc k(final int p0, final int p1);
    
    public abstract agyh l();
    
    public abstract InputStream m();
    
    protected abstract String n(final Charset p0);
    
    public abstract ByteBuffer o();
    
    public abstract void p(final agxu p0);
    
    public abstract boolean q();
    
    public agxy s() {
        return (agxy)new agxv(this);
    }
    
    @Override
    public final String toString() {
        final Locale root = Locale.ROOT;
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final int d = this.d();
        String s;
        if (this.d() <= 50) {
            s = ahbz.a(this);
        }
        else {
            s = ahbz.a(this.k(0, 47)).concat("...");
        }
        return String.format(root, "<ByteString@%s size=%d contents=\"%s\">", hexString, d, s);
    }
}
