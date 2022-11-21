import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahbv extends ahby
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
    
    public ahbv(final Iterable f, final int i) {
        this.k = Integer.MAX_VALUE;
        this.i = i;
        this.f = f;
        this.g = f.iterator();
        this.m = 0;
        if (i == 0) {
            this.h = ahdq.c;
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
        throw ahds.j();
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
        final long e = ahfz.e(this.h);
        this.n += e;
        this.o += e;
        this.p += e;
    }
    
    private final void V(final byte[] array, final int n) {
        if (n <= this.D()) {
            int min;
            long n3;
            for (int i = n; i > 0; i -= min, this.n += n3) {
                if (this.I() == 0L) {
                    this.S();
                }
                min = Math.min(i, (int)this.I());
                final long n2 = this.n;
                n3 = min;
                ahfz.l(n2, array, (long)(n - i), n3);
            }
            return;
        }
        if (n <= 0) {
            return;
        }
        throw ahds.j();
    }
    
    public final String A() {
        final int k = this.k();
        if (k > 0) {
            final long p = this.p;
            final long n = this.n;
            final long n2 = k;
            if (n2 <= p - n) {
                final String f = ahgb.f(this.h, (int)(n - this.o), k);
                this.n += n2;
                return f;
            }
        }
        if (k >= 0 && k <= this.D()) {
            final byte[] array = new byte[k];
            this.V(array, k);
            return ahgb.g(array, 0, k);
        }
        if (k == 0) {
            return "";
        }
        if (k <= 0) {
            throw ahds.f();
        }
        throw ahds.j();
    }
    
    public final void B(final int n) {
        if (this.l == n) {
            return;
        }
        throw ahds.b();
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
        final int b = ahge.b(n);
        int i = 0;
        if (b == 0) {
            while (i < 10) {
                if (this.a() >= 0) {
                    return true;
                }
                ++i;
            }
            throw ahds.e();
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
            this.B(ahge.c(ahge.a(n), 4));
            return true;
        }
        if (b == 4) {
            return false;
        }
        if (b == 5) {
            this.t(4);
            return true;
        }
        throw ahds.a();
    }
    
    public final byte[] H() {
        final int k = this.k();
        if (k >= 0) {
            final long i = this.I();
            final long n = k;
            if (n <= i) {
                final byte[] b = new byte[k];
                ahfz.l(this.n, b, 0L, n);
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
                throw ahds.j();
            }
            if (k != 0) {
                throw ahds.f();
            }
            b = ahdq.b;
        }
        return b;
    }
    
    public final byte a() {
        if (this.I() == 0L) {
            this.S();
        }
        final long n = this.n;
        this.n = 1L + n;
        return ahfz.a(n);
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
            return (ahfz.a(n + 3L) & 0xFF) << 24 | ((ahfz.a(n) & 0xFF) | (ahfz.a(1L + n) & 0xFF) << 8 | (ahfz.a(2L + n) & 0xFF) << 16);
        }
        return (this.a() & 0xFF) | (this.a() & 0xFF) << 8 | (this.a() & 0xFF) << 16 | (this.a() & 0xFF) << 24;
    }
    
    public final int e() {
        return (int)(this.m + this.n - this.o);
    }
    
    public final int f(int k) {
        if (k < 0) {
            throw ahds.f();
        }
        final int i = k + this.e();
        k = this.k;
        if (i <= k) {
            this.k = i;
            this.T();
            return k;
        }
        throw ahds.j();
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
            return ((long)ahfz.a(n + 7L) & 0xFFL) << 56 | (((long)ahfz.a(n + 2L) & 0xFFL) << 16 | (((long)ahfz.a(n) & 0xFFL) | ((long)ahfz.a(1L + n) & 0xFFL) << 8) | ((long)ahfz.a(3L + n) & 0xFFL) << 24 | ((long)ahfz.a(n + 4L) & 0xFFL) << 32 | ((long)ahfz.a(5L + n) & 0xFFL) << 40 | ((long)ahfz.a(n + 6L) & 0xFFL) << 48);
        }
        return ((long)this.a() & 0xFFL) | ((long)this.a() & 0xFFL) << 8 | ((long)this.a() & 0xFFL) << 16 | ((long)this.a() & 0xFFL) << 24 | ((long)this.a() & 0xFFL) << 32 | ((long)this.a() & 0xFFL) << 40 | ((long)this.a() & 0xFFL) << 48 | (0xFFL & (long)this.a()) << 56;
    }
    
    public final int k() {
        final long n = this.n;
        if (this.p != n) {
            final long n2 = n + 1L;
            final byte a = ahfz.a(n);
            if (a >= 0) {
                ++this.n;
                return a;
            }
            if (this.p - this.n >= 10L) {
                final long n3 = n2 + 1L;
                final int n4 = a ^ ahfz.a(n2) << 7;
                int n5;
                long n6;
                if (n4 < 0) {
                    n5 = (n4 ^ 0xFFFFFF80);
                    n6 = n3;
                }
                else {
                    n6 = n3 + 1L;
                    final int n7 = n4 ^ ahfz.a(n3) << 14;
                    if (n7 >= 0) {
                        n5 = (n7 ^ 0x3F80);
                    }
                    else {
                        final long n8 = n6 + 1L;
                        final int n9 = n7 ^ ahfz.a(n6) << 21;
                        if (n9 < 0) {
                            n5 = (n9 ^ 0xFFE03F80);
                            n6 = n8;
                        }
                        else {
                            final long n10 = n8 + 1L;
                            final byte a2 = ahfz.a(n8);
                            final int n11 = n5 = (n9 ^ a2 << 28 ^ 0xFE03F80);
                            n6 = n10;
                            if (a2 < 0) {
                                final long n12 = n10 + 1L;
                                n5 = n11;
                                n6 = n12;
                                if (ahfz.a(n10) < 0) {
                                    final long n13 = n12 + 1L;
                                    n5 = n11;
                                    n6 = n13;
                                    if (ahfz.a(n12) < 0) {
                                        final long n14 = n13 + 1L;
                                        n5 = n11;
                                        n6 = n14;
                                        if (ahfz.a(n13) < 0) {
                                            final long n15 = n14 + 1L;
                                            n5 = n11;
                                            n6 = n15;
                                            if (ahfz.a(n14) < 0) {
                                                n6 = n15 + 1L;
                                                if (ahfz.a(n15) < 0) {
                                                    return (int)this.s();
                                                }
                                                n5 = n11;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.n = n6;
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
        if (ahge.a(k) != 0) {
            return k;
        }
        throw ahds.c();
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
            final byte a = ahfz.a(n);
            if (a >= 0) {
                ++this.n;
                return a;
            }
            if (this.p - this.n >= 10L) {
                final long n3 = n2 + 1L;
                final int n4 = a ^ ahfz.a(n2) << 7;
                long n5 = 0L;
                long n7 = 0L;
                Label_0382: {
                    int n10 = 0;
                    Label_0088: {
                        if (n4 >= 0) {
                            n5 = n3 + 1L;
                            final int n6 = n4 ^ ahfz.a(n3) << 14;
                            Label_0120: {
                                if (n6 >= 0) {
                                    n7 = (n6 ^ 0x3F80);
                                }
                                else {
                                    final long n8 = n5 + 1L;
                                    final int n9 = n6 ^ ahfz.a(n5) << 21;
                                    if (n9 < 0) {
                                        n10 = (n9 ^ 0xFFE03F80);
                                        n5 = n8;
                                        break Label_0088;
                                    }
                                    n5 = n8 + 1L;
                                    long n11 = (long)n9 ^ (long)ahfz.a(n8) << 28;
                                    long n20 = 0L;
                                    Label_0184: {
                                        if (n11 < 0L) {
                                            final long n12 = n5 + 1L;
                                            final long n13 = n11 ^ (long)ahfz.a(n5) << 35;
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
                                                final long n18 = n13 ^ (long)ahfz.a(n12) << 42;
                                                if (n18 >= 0L) {
                                                    final long n19 = 4363953127296L;
                                                    n11 = n18;
                                                    n20 = n19;
                                                    break Label_0184;
                                                }
                                                n15 = n5 + 1L;
                                                n17 = (n18 ^ (long)ahfz.a(n5) << 49);
                                                if (n17 < 0L) {
                                                    n16 = -558586000294016L;
                                                }
                                                else {
                                                    final long n21 = n15 + 1L;
                                                    final long n22 = n7 = (n17 ^ (long)ahfz.a(n15) << 56 ^ 0xFE03F80FE03F80L);
                                                    n5 = n21;
                                                    if (n22 >= 0L) {
                                                        break Label_0120;
                                                    }
                                                    if (ahfz.a(n21) >= 0L) {
                                                        n5 = 1L + n21;
                                                        n7 = n22;
                                                        break Label_0382;
                                                    }
                                                    return this.s();
                                                }
                                            }
                                            final long n23 = n17 ^ n16;
                                            n5 = n15;
                                            n7 = n23;
                                            break Label_0382;
                                        }
                                        n20 = 266354560L;
                                    }
                                    n7 = (n11 ^ n20);
                                }
                            }
                            break Label_0382;
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
        int i = 0;
        long n = 0L;
        while (i < 64) {
            final byte a = this.a();
            n |= (long)(a & 0x7F) << i;
            if ((a & 0x80) == 0x0) {
                return n;
            }
            i += 7;
        }
        throw ahds.e();
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
            throw ahds.f();
        }
        throw ahds.j();
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
    
    public final ahbt x() {
        final int k = this.k();
        if (k > 0) {
            final long p = this.p;
            final long n = this.n;
            final long n2 = k;
            if (n2 <= p - n) {
                final byte[] array = new byte[k];
                ahfz.l(n, array, 0L, n2);
                this.n += n2;
                return ahbt.C(array);
            }
        }
        if (k > 0 && k <= this.D()) {
            final byte[] array2 = new byte[k];
            this.V(array2, k);
            return ahbt.C(array2);
        }
        if (k == 0) {
            return ahbt.b;
        }
        if (k < 0) {
            throw ahds.f();
        }
        throw ahds.j();
    }
    
    public final MessageLite y(final ahev ahev, final ExtensionRegistryLite extensionRegistryLite) {
        throw null;
    }
    
    public final String z() {
        final int k = this.k();
        if (k > 0) {
            final long p = this.p;
            final long n = this.n;
            final long n2 = k;
            if (n2 <= p - n) {
                final byte[] array = new byte[k];
                ahfz.l(n, array, 0L, n2);
                final String s = new String(array, ahdq.a);
                this.n += n2;
                return s;
            }
        }
        if (k > 0 && k <= this.D()) {
            final byte[] array2 = new byte[k];
            this.V(array2, k);
            return new String(array2, ahdq.a);
        }
        if (k == 0) {
            return "";
        }
        if (k < 0) {
            throw ahds.f();
        }
        throw ahds.j();
    }
}
