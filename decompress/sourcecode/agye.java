import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class agye extends agyh
{
    private final Iterable f;
    private final Iterator g;
    private ByteBuffer h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private long n;
    private long o;
    private long p;
    
    public agye(final Iterable f, final int i) {
        this.k = Integer.MAX_VALUE;
        this.i = i;
        this.f = f;
        this.g = f.iterator();
        this.m = 0;
        if (i == 0) {
            this.h = agzz.c;
            this.n = 0L;
            this.o = 0L;
            this.p = 0L;
            return;
        }
        this.U();
    }
    
    private final int D() {
        return (int)(this.i - this.m - this.n + this.o);
    }
    
    private final long I() {
        return this.p - this.n;
    }
    
    private final void S() {
        if (this.g.hasNext()) {
            this.U();
            return;
        }
        throw ahab.j();
    }
    
    private final void T() {
        final int i = this.i + this.j;
        this.i = i;
        final int k = this.k;
        if (i > k) {
            final int j = i - k;
            this.j = j;
            this.i = i - j;
            return;
        }
        this.j = 0;
    }
    
    private final void U() {
        final ByteBuffer h = this.g.next();
        this.h = h;
        this.m += (int)(this.n - this.o);
        final long n = h.position();
        this.n = n;
        this.o = n;
        this.p = this.h.limit();
        final long e = ahcj.e(this.h);
        this.n += e;
        this.o += e;
        this.p += e;
    }
    
    private final void V(final byte[] array, final int n) {
        if (n <= this.D()) {
            int min;
            long n2;
            for (int i = n; i > 0; i -= min, this.n += n2) {
                if (this.I() == 0L) {
                    this.S();
                }
                min = Math.min(i, (int)this.I());
                n2 = min;
                ahcj.l(this.n, array, (long)(n - i), n2);
            }
            return;
        }
        if (n <= 0) {
            return;
        }
        throw ahab.j();
    }
    
    public final String A() {
        final int k = this.k();
        if (k > 0) {
            final long n = k;
            final long p = this.p;
            final long n2 = this.n;
            if (n <= p - n2) {
                final String f = ahcl.f(this.h, (int)(n2 - this.o), k);
                this.n += n;
                return f;
            }
        }
        if (k >= 0 && k <= this.D()) {
            final byte[] array = new byte[k];
            this.V(array, k);
            return ahcl.g(array, 0, k);
        }
        if (k == 0) {
            return "";
        }
        if (k <= 0) {
            throw ahab.f();
        }
        throw ahab.j();
    }
    
    public final void B(final int n) {
        if (this.l == n) {
            return;
        }
        throw ahab.b();
    }
    
    public final void C(final int k) {
        this.k = k;
        this.T();
    }
    
    public final boolean E() {
        return this.m + this.n - this.o == this.i;
    }
    
    public final boolean F() {
        return this.r() != 0L;
    }
    
    public final boolean G(final int n) {
        final int b = ahco.b(n);
        int i = 0;
        if (b == 0) {
            while (i < 10) {
                if (this.a() >= 0) {
                    return true;
                }
                ++i;
            }
            throw ahab.e();
        }
        if (b == 1) {
            this.t(8);
            return true;
        }
        if (b == 2) {
            this.t(this.k());
            return true;
        }
        if (b == 3) {
            int n2;
            do {
                n2 = this.n();
            } while (n2 != 0 && this.G(n2));
            this.B(ahco.c(ahco.a(n), 4));
            return true;
        }
        if (b == 4) {
            return false;
        }
        if (b == 5) {
            this.t(4);
            return true;
        }
        throw ahab.a();
    }
    
    public final byte[] H() {
        final int k = this.k();
        if (k >= 0) {
            final long n = k;
            if (n <= this.I()) {
                final byte[] b = new byte[k];
                ahcj.l(this.n, b, 0L, n);
                this.n += n;
                return b;
            }
        }
        byte[] b;
        if (k >= 0 && k <= this.D()) {
            b = new byte[k];
            this.V(b, k);
        }
        else {
            if (k > 0) {
                throw ahab.j();
            }
            if (k != 0) {
                throw ahab.f();
            }
            b = agzz.b;
        }
        return b;
    }
    
    public final byte a() {
        if (this.I() == 0L) {
            this.S();
        }
        final long n = this.n;
        this.n = 1L + n;
        return ahcj.a(n);
    }
    
    public final double b() {
        return Double.longBitsToDouble(this.j());
    }
    
    public final float c() {
        return Float.intBitsToFloat(this.d());
    }
    
    public final int d() {
        if (this.I() >= 4L) {
            final long n = this.n;
            this.n = 4L + n;
            return (ahcj.a(n + 3L) & 0xFF) << 24 | ((ahcj.a(n) & 0xFF) | (ahcj.a(1L + n) & 0xFF) << 8 | (ahcj.a(2L + n) & 0xFF) << 16);
        }
        return (this.a() & 0xFF) | (this.a() & 0xFF) << 8 | (this.a() & 0xFF) << 16 | (this.a() & 0xFF) << 24;
    }
    
    public final int e() {
        return (int)(this.m + this.n - this.o);
    }
    
    public final int f(int k) {
        if (k < 0) {
            throw ahab.f();
        }
        k += this.e();
        final int i = this.k;
        if (k <= i) {
            this.k = k;
            this.T();
            return i;
        }
        throw ahab.j();
    }
    
    public final int g() {
        return this.k();
    }
    
    public final int h() {
        return this.d();
    }
    
    public final int i() {
        return this.k();
    }
    
    public final long j() {
        if (this.I() >= 8L) {
            final long n = this.n;
            this.n = 8L + n;
            return ((long)ahcj.a(n + 7L) & 0xFFL) << 56 | (((long)ahcj.a(6L + n) & 0xFFL) << 48 | (((long)ahcj.a(4L + n) & 0xFFL) << 32 | (((long)ahcj.a(2L + n) & 0xFFL) << 16 | (((long)ahcj.a(n) & 0xFFL) | ((long)ahcj.a(1L + n) & 0xFFL) << 8) | ((long)ahcj.a(3L + n) & 0xFFL) << 24) | ((long)ahcj.a(5L + n) & 0xFFL) << 40));
        }
        return ((long)this.a() & 0xFFL) | ((long)this.a() & 0xFFL) << 8 | ((long)this.a() & 0xFFL) << 16 | ((long)this.a() & 0xFFL) << 24 | ((long)this.a() & 0xFFL) << 32 | ((long)this.a() & 0xFFL) << 40 | ((long)this.a() & 0xFFL) << 48 | ((long)this.a() & 0xFFL) << 56;
    }
    
    public final int k() {
        final long n = this.n;
        if (this.p != n) {
            final long n2 = n + 1L;
            final byte a = ahcj.a(n);
            if (a >= 0) {
                ++this.n;
                return a;
            }
            if (this.p - this.n >= 10L) {
                long n3 = n2 + 1L;
                final int n4 = a ^ ahcj.a(n2) << 7;
                int n5;
                if (n4 < 0) {
                    n5 = (n4 ^ 0xFFFFFF80);
                }
                else {
                    final long n6 = n3 + 1L;
                    final int n7 = n4 ^ ahcj.a(n3) << 14;
                    if (n7 >= 0) {
                        n5 = (n7 ^ 0x3F80);
                        n3 = n6;
                    }
                    else {
                        n3 = n6 + 1L;
                        final int n8 = n7 ^ ahcj.a(n6) << 21;
                        if (n8 < 0) {
                            n5 = (n8 ^ 0xFFE03F80);
                        }
                        else {
                            final long n9 = n3 + 1L;
                            final byte a2 = ahcj.a(n3);
                            final int n10 = n5 = (n8 ^ a2 << 28 ^ 0xFE03F80);
                            n3 = n9;
                            if (a2 < 0) {
                                final long n11 = n9 + 1L;
                                n5 = n10;
                                n3 = n11;
                                if (ahcj.a(n9) < 0) {
                                    final long n12 = n11 + 1L;
                                    n5 = n10;
                                    n3 = n12;
                                    if (ahcj.a(n11) < 0) {
                                        final long n13 = n12 + 1L;
                                        n5 = n10;
                                        n3 = n13;
                                        if (ahcj.a(n12) < 0) {
                                            final long n14 = n13 + 1L;
                                            n5 = n10;
                                            n3 = n14;
                                            if (ahcj.a(n13) < 0) {
                                                n3 = n14 + 1L;
                                                if (ahcj.a(n14) < 0) {
                                                    return (int)this.s();
                                                }
                                                n5 = n10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.n = n3;
                return n5;
            }
        }
        return (int)this.s();
    }
    
    public final int l() {
        return this.d();
    }
    
    public final int m() {
        return J(this.k());
    }
    
    public final int n() {
        if (this.E()) {
            return this.l = 0;
        }
        final int k = this.k();
        this.l = k;
        if (ahco.a(k) != 0) {
            return k;
        }
        throw ahab.c();
    }
    
    public final int o() {
        return this.k();
    }
    
    public final long p() {
        return this.j();
    }
    
    public final long q() {
        return this.r();
    }
    
    public final long r() {
        final long n = this.n;
        if (this.p != n) {
            final long n2 = n + 1L;
            final byte a = ahcj.a(n);
            if (a >= 0) {
                ++this.n;
                return a;
            }
            if (this.p - this.n >= 10L) {
                final long n3 = n2 + 1L;
                final int n4 = a ^ ahcj.a(n2) << 7;
                long n5 = 0L;
                long n7 = 0L;
                Label_0371: {
                    int n10 = 0;
                    Label_0092: {
                        if (n4 >= 0) {
                            n5 = n3 + 1L;
                            final int n6 = n4 ^ ahcj.a(n3) << 14;
                            Label_0128: {
                                if (n6 >= 0) {
                                    n7 = (n6 ^ 0x3F80);
                                }
                                else {
                                    final long n8 = n5 + 1L;
                                    final int n9 = n6 ^ ahcj.a(n5) << 21;
                                    if (n9 < 0) {
                                        n10 = (n9 ^ 0xFFE03F80);
                                        n5 = n8;
                                        break Label_0092;
                                    }
                                    n5 = n8 + 1L;
                                    long n11 = (long)n9 ^ (long)ahcj.a(n8) << 28;
                                    long n19 = 0L;
                                    Label_0192: {
                                        if (n11 < 0L) {
                                            final long n12 = n5 + 1L;
                                            final long n13 = n11 ^ (long)ahcj.a(n5) << 35;
                                            long n15;
                                            long n16;
                                            long n17;
                                            if (n13 < 0L) {
                                                final long n14 = -34093383808L;
                                                n15 = n12;
                                                n16 = n14;
                                                n17 = n13;
                                            }
                                            else {
                                                n5 = n12 + 1L;
                                                final long n18 = n13 ^ (long)ahcj.a(n12) << 42;
                                                if (n18 >= 0L) {
                                                    n19 = 4363953127296L;
                                                    n11 = n18;
                                                    break Label_0192;
                                                }
                                                n15 = n5 + 1L;
                                                n17 = (n18 ^ (long)ahcj.a(n5) << 49);
                                                if (n17 < 0L) {
                                                    n16 = -558586000294016L;
                                                }
                                                else {
                                                    final long n20 = n15 + 1L;
                                                    final long n21 = n7 = (n17 ^ (long)ahcj.a(n15) << 56 ^ 0xFE03F80FE03F80L);
                                                    n5 = n20;
                                                    if (n21 >= 0L) {
                                                        break Label_0128;
                                                    }
                                                    if (ahcj.a(n20) >= 0L) {
                                                        n5 = 1L + n20;
                                                        n7 = n21;
                                                        break Label_0371;
                                                    }
                                                    return this.s();
                                                }
                                            }
                                            final long n22 = n17 ^ n16;
                                            n5 = n15;
                                            n7 = n22;
                                            break Label_0371;
                                        }
                                        n19 = 266354560L;
                                    }
                                    n7 = (n11 ^ n19);
                                }
                            }
                            break Label_0371;
                        }
                        n10 = (n4 ^ 0xFFFFFF80);
                        n5 = n3;
                    }
                    n7 = n10;
                }
                this.n = n5;
                return n7;
            }
        }
        return this.s();
    }
    
    final long s() {
        long n = 0L;
        for (int i = 0; i < 64; i += 7) {
            final byte a = this.a();
            n |= (long)(a & 0x7F) << i;
            if ((a & 0x80) == 0x0) {
                return n;
            }
        }
        throw ahab.e();
    }
    
    public final void t(int i) {
        if (i >= 0 && i <= this.i - this.m - this.n + this.o) {
            while (i > 0) {
                if (this.I() == 0L) {
                    this.S();
                }
                final int min = Math.min(i, (int)this.I());
                i -= min;
                this.n += min;
            }
            return;
        }
        if (i < 0) {
            throw ahab.f();
        }
        throw ahab.j();
    }
    
    public final long u() {
        return this.j();
    }
    
    public final long v() {
        return L(this.r());
    }
    
    public final long w() {
        return this.r();
    }
    
    public final agyc x() {
        final int k = this.k();
        if (k > 0) {
            final long n = k;
            final long p = this.p;
            final long n2 = this.n;
            if (n <= p - n2) {
                final byte[] array = new byte[k];
                ahcj.l(n2, array, 0L, n);
                this.n += n;
                return agyc.C(array);
            }
        }
        if (k > 0 && k <= this.D()) {
            final byte[] array2 = new byte[k];
            this.V(array2, k);
            return agyc.C(array2);
        }
        if (k == 0) {
            return agyc.b;
        }
        if (k < 0) {
            throw ahab.f();
        }
        throw ahab.j();
    }
    
    public final MessageLite y(final ahbe ahbe, final ExtensionRegistryLite extensionRegistryLite) {
        throw null;
    }
    
    public final String z() {
        final int k = this.k();
        if (k > 0) {
            final long n = k;
            final long p = this.p;
            final long n2 = this.n;
            if (n <= p - n2) {
                final byte[] array = new byte[k];
                ahcj.l(n2, array, 0L, n);
                final String s = new String(array, agzz.a);
                this.n += n;
                return s;
            }
        }
        if (k > 0 && k <= this.D()) {
            final byte[] array2 = new byte[k];
            this.V(array2, k);
            return new String(array2, agzz.a);
        }
        if (k == 0) {
            return "";
        }
        if (k < 0) {
            throw ahab.f();
        }
        throw ahab.j();
    }
}
