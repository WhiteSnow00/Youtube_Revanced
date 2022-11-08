import android.support.v7.widget.RecyclerView;
import java.util.Arrays;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class athu
{
    public int a;
    public int b;
    public int c;
    public Object d;
    
    public athu() {
        this(16, null);
    }
    
    public athu(final int n) {
        this(n, null);
    }
    
    public athu(int j, final byte[] array) {
        j = auet.j(j);
        this.a = j - 1;
        this.c = (int)(j * 0.75f);
        this.d = new Object[j];
    }
    
    public athu(final byte[] array) {
        this.d = baw.e;
    }
    
    public athu(final byte[] d, final int c) {
        this.d = d;
        this.c = c;
    }
    
    public athu(final byte[] array, final byte[] array2) {
        this(array, array.length);
    }
    
    public athu(final char[] array) {
    }
    
    public static int a(int n) {
        n *= -1640531527;
        return n ^ n >>> 16;
    }
    
    public final void b(Object o) {
        final Object d = this.d;
        final int a = this.a;
        int n = a(o.hashCode()) & a;
        final Object[] array = (Object[])d;
        final Object o2 = array[n];
        int n2 = n;
        Label_0083: {
            if (o2 != null) {
                if (!o2.equals(o)) {
                    Object o3;
                    do {
                        n = (n + 1 & a);
                        o3 = array[n];
                        n2 = n;
                        if (o3 != null) {
                            continue;
                        }
                        break Label_0083;
                    } while (!o3.equals(o));
                }
                return;
            }
        }
        array[n2] = o;
        int i = this.b + 1;
        if ((this.b = i) >= this.c) {
            final Object[] array2 = (Object[])this.d;
            int length = array2.length;
            final int n3 = length + length;
            final int a2 = n3 - 1;
            final Object[] d2 = new Object[n3];
            while (i != 0) {
                do {
                    --length;
                    o = array2[length];
                } while (o == null);
                int n5;
                final int n4 = n5 = (a(o.hashCode()) & a2);
                if (d2[n4] != null) {
                    int n6 = n4;
                    int n7;
                    do {
                        n7 = (n6 = (n6 + 1 & a2));
                    } while (d2[n7] != null);
                    n5 = n7;
                }
                d2[n5] = array2[length];
                --i;
            }
            this.a = a2;
            this.c = (int)(n3 * 0.75f);
            this.d = d2;
        }
    }
    
    public final void c(int n, final Object[] array, final int n2) {
        --this.b;
    Block_1:
        while (true) {
            int n3 = n + 1;
            Object o;
            while (true) {
                n3 &= n2;
                o = array[n3];
                if (o == null) {
                    break Block_1;
                }
                final int n4 = a(o.hashCode()) & n2;
                if (n <= n3) {
                    if (n >= n4) {
                        break;
                    }
                    if (n4 > n3) {
                        break;
                    }
                }
                else if (n >= n4 && n4 > n3) {
                    break;
                }
                ++n3;
            }
            array[n] = o;
            n = n3;
        }
        array[n] = null;
    }
    
    public final int d() {
        return (this.c - this.b) * 8 - this.a;
    }
    
    public final int e() {
        dk.h(this.a == 0);
        return this.b;
    }
    
    public final int f() {
        return this.b * 8 + this.a;
    }
    
    public final int g(final int n) {
        if (n == 0) {
            return 0;
        }
        this.a += n;
        int n2 = 0;
        int a;
        while (true) {
            a = this.a;
            if (a <= 8) {
                break;
            }
            a -= 8;
            this.a = a;
            n2 |= (((byte[])this.d)[this.b++] & 0xFF) << a;
        }
        final Object d = this.d;
        final int b = this.b;
        final byte b2 = ((byte[])d)[b];
        if (a == 8) {
            this.a = 0;
            this.b = b + 1;
        }
        this.i();
        return -1 >>> 32 - n & (n2 | (b2 & 0xFF) >> 8 - a);
    }
    
    public final String h(final int n, final Charset charset) {
        final byte[] array = new byte[n];
        this.s(array, n);
        return new String(array, charset);
    }
    
    public final void i() {
        final int b = this.b;
        boolean b3;
        final boolean b2 = b3 = false;
        Label_0044: {
            if (b >= 0) {
                final int c = this.c;
                if (b >= c) {
                    b3 = b2;
                    if (b != c) {
                        break Label_0044;
                    }
                    b3 = b2;
                    if (this.a != 0) {
                        break Label_0044;
                    }
                }
                b3 = true;
            }
        }
        dk.h(b3);
    }
    
    public final void j() {
        if (this.a == 0) {
            return;
        }
        this.a = 0;
        ++this.b;
        this.i();
    }
    
    public final void k(final byte[] array) {
        this.l(array, array.length);
    }
    
    public final void l(final byte[] d, final int c) {
        this.d = d;
        this.b = 0;
        this.a = 0;
        this.c = c;
    }
    
    public final void m(final int n) {
        final int b = n / 8;
        this.b = b;
        this.a = n - b * 8;
        this.i();
    }
    
    public final void n() {
        final int a = this.a + 1;
        this.a = a;
        if (a == 8) {
            this.a = 0;
            ++this.b;
        }
        this.i();
    }
    
    public final void o(int a) {
        final int n = a / 8;
        final int b = this.b + n;
        this.b = b;
        a = this.a + (a - n * 8);
        this.a = a;
        if (a > 7) {
            this.b = b + 1;
            this.a = a - 8;
        }
        this.i();
    }
    
    public final void p(final int n) {
        dk.h(this.a == 0);
        this.b += n;
        this.i();
    }
    
    public final boolean q() {
        final boolean b = (((byte[])this.d)[this.b] & 128 >> this.a) != 0x0;
        this.n();
        return b;
    }
    
    public final void r(final byte[] array, int n) {
        final int n2 = n >> 3;
        for (int i = 0; i < n2; ++i) {
            final Object d = this.d;
            final int b = this.b;
            final int b2 = b + 1;
            this.b = b2;
            final byte[] array2 = (byte[])d;
            final byte b3 = array2[b];
            final int a = this.a;
            final byte b4 = (byte)(b3 << a);
            array[i] = b4;
            array[i] = (byte)((0xFF & array2[b2]) >> 8 - a | b4);
        }
        final int n3 = n & 0x7;
        if (n3 == 0) {
            return;
        }
        final int n4 = (byte)(array[n2] & 255 >> n3);
        array[n2] = (byte)n4;
        final int a2 = this.a;
        n = n4;
        int n5 = a2;
        if (a2 + n3 > 8) {
            final Object d2 = this.d;
            n = this.b++;
            n = (byte)(n4 | (((byte[])d2)[n] & 0xFF) << a2);
            array[n2] = (byte)n;
            n5 = a2 - 8;
        }
        final int a3 = n5 + n3;
        this.a = a3;
        final Object d3 = this.d;
        final int b5 = this.b;
        array[n2] = (byte)((byte)((0xFF & ((byte[])d3)[b5]) >> 8 - a3 << 8 - n3) | n);
        if (a3 == 8) {
            this.a = 0;
            this.b = b5 + 1;
        }
        this.i();
    }
    
    public final void s(final byte[] array, final int n) {
        dk.h(this.a == 0);
        System.arraycopy(this.d, this.b, array, 0, n);
        this.b += n;
        this.i();
    }
    
    public final void t(final int n, final int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (n2 >= 0) {
            final int a = this.a;
            final int n3 = a + a;
            final Object d = this.d;
            if (d == null) {
                final int[] d2 = new int[4];
                this.d = d2;
                Arrays.fill(d2, -1);
            }
            else {
                final int length = ((int[])d).length;
                if (n3 >= length) {
                    System.arraycopy(d, 0, this.d = new int[n3 + n3], 0, length);
                }
            }
            final int[] array = (int[])this.d;
            array[n3] = n;
            array[n3 + 1] = n2;
            ++this.a;
            return;
        }
        throw new IllegalArgumentException("Pixel distance must be non-negative");
    }
    
    public final void u() {
        final Object d = this.d;
        if (d != null) {
            Arrays.fill((int[])d, -1);
        }
        this.a = 0;
    }
    
    public final void v(final RecyclerView recyclerView, final boolean b) {
        this.a = 0;
        final Object d = this.d;
        if (d != null) {
            Arrays.fill((int[])d, -1);
        }
        final nw n = recyclerView.n;
        if (recyclerView.m != null && n != null && n.z) {
            if (b) {
                if (!recyclerView.S.q()) {
                    n.aq(recyclerView.m.a(), this);
                }
            }
            else if (!recyclerView.ar()) {
                n.ap(this.c, this.b, recyclerView.L, this);
            }
            final int a = this.a;
            if (a > n.A) {
                n.A = a;
                n.B = b;
                recyclerView.f.o();
            }
        }
    }
    
    public final boolean w(final int n) {
        if (this.d != null) {
            for (int a = this.a, i = 0; i < a + a; i += 2) {
                if (((int[])this.d)[i] == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
