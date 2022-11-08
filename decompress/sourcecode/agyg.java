import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class agyg extends agyh
{
    private final ByteBuffer f;
    private final long g;
    private long h;
    private long i;
    private final long j;
    private int k;
    private int l;
    private int m;
    
    public agyg(final ByteBuffer f) {
        this.m = Integer.MAX_VALUE;
        this.f = f;
        final long e = ahcj.e(f);
        this.g = e;
        this.h = f.limit() + e;
        final long n = e + f.position();
        this.i = n;
        this.j = n;
    }
    
    private final int D(final long n) {
        return (int)(n - this.g);
    }
    
    private final int I() {
        return (int)(this.h - this.i);
    }
    
    private final void S() {
        final long h = this.h + this.k;
        this.h = h;
        final int n = (int)(h - this.j);
        final int m = this.m;
        if (n > m) {
            final int k = n - m;
            this.k = k;
            this.h = h - k;
            return;
        }
        this.k = 0;
    }
    
    public final String A() {
        final int k = this.k();
        if (k > 0 && k <= this.I()) {
            final String f = ahcl.f(this.f, this.D(this.i), k);
            this.i += k;
            return f;
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
    
    public final void C(final int m) {
        this.m = m;
        this.S();
    }
    
    public final boolean E() {
        return this.i == this.h;
    }
    
    public final boolean F() {
        return this.r() != 0L;
    }
    
    public final boolean G(int i) {
        final int b = ahco.b(i);
        final int n = 0;
        final int n2 = 0;
        if (b == 0) {
            i = n;
            if (this.I() >= 10) {
                long j;
                for (i = n2; i < 10; ++i) {
                    j = this.i;
                    this.i = 1L + j;
                    if (ahcj.a(j) >= 0) {
                        return true;
                    }
                }
                throw ahab.e();
            }
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
            int n3;
            do {
                n3 = this.n();
            } while (n3 != 0 && this.G(n3));
            this.B(ahco.c(ahco.a(i), 4));
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
        byte[] b = null;
        if (k >= 0 && k <= this.I()) {
            final byte[] array = new byte[k];
            final long i = this.i;
            final long n = k;
            final int position = this.f.position();
            final int limit = this.f.limit();
            final ByteBuffer f = this.f;
            try {
                try {
                    f.position(this.D(i));
                    f.limit(this.D(i + n));
                    final ByteBuffer slice = this.f.slice();
                    f.position(position);
                    f.limit(limit);
                    slice.get(array);
                    this.i += n;
                }
                finally {}
            }
            catch (final IllegalArgumentException ex) {
                final ahab j = ahab.j();
                j.initCause((Throwable)ex);
                throw j;
            }
            f.position(position);
            f.limit(limit);
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
        final long i = this.i;
        if (i != this.h) {
            this.i = 1L + i;
            return ahcj.a(i);
        }
        throw ahab.j();
    }
    
    public final double b() {
        return Double.longBitsToDouble(this.j());
    }
    
    public final float c() {
        return Float.intBitsToFloat(this.d());
    }
    
    public final int d() {
        final long i = this.i;
        if (this.h - i >= 4L) {
            this.i = 4L + i;
            return (ahcj.a(i + 3L) & 0xFF) << 24 | ((ahcj.a(i) & 0xFF) | (ahcj.a(1L + i) & 0xFF) << 8 | (ahcj.a(2L + i) & 0xFF) << 16);
        }
        throw ahab.j();
    }
    
    public final int e() {
        return (int)(this.i - this.j);
    }
    
    public final int f(int m) {
        if (m < 0) {
            throw ahab.f();
        }
        final int i = m + this.e();
        m = this.m;
        if (i <= m) {
            this.m = i;
            this.S();
            return m;
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
        final long i = this.i;
        if (this.h - i >= 8L) {
            this.i = 8L + i;
            return ((long)ahcj.a(i + 7L) & 0xFFL) << 56 | (((long)ahcj.a(i) & 0xFFL) | ((long)ahcj.a(1L + i) & 0xFFL) << 8 | ((long)ahcj.a(2L + i) & 0xFFL) << 16 | ((long)ahcj.a(3L + i) & 0xFFL) << 24 | ((long)ahcj.a(4L + i) & 0xFFL) << 32 | ((long)ahcj.a(5L + i) & 0xFFL) << 40 | ((long)ahcj.a(6L + i) & 0xFFL) << 48);
        }
        throw ahab.j();
    }
    
    public final int k() {
        final long i = this.i;
        if (this.h != i) {
            final long j = i + 1L;
            final byte a = ahcj.a(i);
            if (a >= 0) {
                this.i = j;
                return a;
            }
            if (this.h - j >= 9L) {
                long k = j + 1L;
                final int n = a ^ ahcj.a(j) << 7;
                int n2;
                if (n < 0) {
                    n2 = (n ^ 0xFFFFFF80);
                }
                else {
                    final long n3 = k + 1L;
                    final int n4 = n ^ ahcj.a(k) << 14;
                    if (n4 >= 0) {
                        n2 = (n4 ^ 0x3F80);
                        k = n3;
                    }
                    else {
                        k = n3 + 1L;
                        final int n5 = n4 ^ ahcj.a(n3) << 21;
                        if (n5 < 0) {
                            n2 = (n5 ^ 0xFFE03F80);
                        }
                        else {
                            final long n6 = k + 1L;
                            final byte a2 = ahcj.a(k);
                            final int n7 = n2 = (n5 ^ a2 << 28 ^ 0xFE03F80);
                            k = n6;
                            if (a2 < 0) {
                                final long n8 = n6 + 1L;
                                n2 = n7;
                                k = n8;
                                if (ahcj.a(n6) < 0) {
                                    final long n9 = n8 + 1L;
                                    n2 = n7;
                                    k = n9;
                                    if (ahcj.a(n8) < 0) {
                                        final long n10 = n9 + 1L;
                                        n2 = n7;
                                        k = n10;
                                        if (ahcj.a(n9) < 0) {
                                            final long n11 = n10 + 1L;
                                            n2 = n7;
                                            k = n11;
                                            if (ahcj.a(n10) < 0) {
                                                k = n11 + 1L;
                                                if (ahcj.a(n11) < 0) {
                                                    return (int)this.s();
                                                }
                                                n2 = n7;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.i = k;
                return n2;
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
        final long i = this.i;
        if (this.h != i) {
            final long j = i + 1L;
            final byte a = ahcj.a(i);
            if (a >= 0) {
                this.i = j;
                return a;
            }
            if (this.h - j >= 9L) {
                final long n = j + 1L;
                final int n2 = a ^ ahcj.a(j) << 7;
                long k = 0L;
                long n4 = 0L;
                Label_0351: {
                    int n7 = 0;
                    Label_0084: {
                        if (n2 >= 0) {
                            k = n + 1L;
                            final int n3 = n2 ^ ahcj.a(n) << 14;
                            Label_0120: {
                                if (n3 >= 0) {
                                    n4 = (n3 ^ 0x3F80);
                                }
                                else {
                                    final long n5 = k + 1L;
                                    final int n6 = n3 ^ ahcj.a(k) << 21;
                                    if (n6 < 0) {
                                        n7 = (n6 ^ 0xFFE03F80);
                                        k = n5;
                                        break Label_0084;
                                    }
                                    k = n5 + 1L;
                                    long n8 = (long)n6 ^ (long)ahcj.a(n5) << 28;
                                    long n12 = 0L;
                                    Label_0185: {
                                        if (n8 < 0L) {
                                            long n9 = k + 1L;
                                            long n10 = n8 ^ (long)ahcj.a(k) << 35;
                                            long n11;
                                            if (n10 < 0L) {
                                                n11 = -34093383808L;
                                            }
                                            else {
                                                k = n9 + 1L;
                                                n8 = (n10 ^ (long)ahcj.a(n9) << 42);
                                                if (n8 >= 0L) {
                                                    n12 = 4363953127296L;
                                                    break Label_0185;
                                                }
                                                n9 = k + 1L;
                                                n10 = (n8 ^ (long)ahcj.a(k) << 49);
                                                if (n10 < 0L) {
                                                    n11 = -558586000294016L;
                                                }
                                                else {
                                                    final long n13 = n9 + 1L;
                                                    final long n14 = n4 = (n10 ^ (long)ahcj.a(n9) << 56 ^ 0xFE03F80FE03F80L);
                                                    k = n13;
                                                    if (n14 >= 0L) {
                                                        break Label_0120;
                                                    }
                                                    if (ahcj.a(n13) >= 0L) {
                                                        k = 1L + n13;
                                                        n4 = n14;
                                                        break Label_0351;
                                                    }
                                                    return this.s();
                                                }
                                            }
                                            final long n15 = n10 ^ n11;
                                            k = n9;
                                            n4 = n15;
                                            break Label_0351;
                                        }
                                        n12 = 266354560L;
                                    }
                                    n4 = (n8 ^ n12);
                                }
                            }
                            break Label_0351;
                        }
                        n7 = (n2 ^ 0xFFFFFF80);
                        k = n;
                    }
                    n4 = n7;
                }
                this.i = k;
                return n4;
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
    
    public final void t(final int n) {
        if (n >= 0 && n <= this.I()) {
            this.i += n;
            return;
        }
        if (n < 0) {
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
        if (k > 0 && k <= this.I()) {
            final byte[] array = new byte[k];
            final long n = k;
            ahcj.l(this.i, array, 0L, n);
            this.i += n;
            return agyc.C(array);
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
        if (k > 0 && k <= this.I()) {
            final byte[] array = new byte[k];
            final long n = k;
            ahcj.l(this.i, array, 0L, n);
            final String s = new String(array, agzz.a);
            this.i += n;
            return s;
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
