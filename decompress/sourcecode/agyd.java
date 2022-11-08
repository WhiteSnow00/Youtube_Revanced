import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agyd extends agyh
{
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private final int j;
    private int k;
    private int l;
    
    public agyd(final byte[] f, final int n, final int n2) {
        this.l = Integer.MAX_VALUE;
        this.f = f;
        this.g = n2 + n;
        this.i = n;
        this.j = n;
    }
    
    private final void S() {
        final int g = this.g + this.h;
        this.g = g;
        final int n = g - this.j;
        final int l = this.l;
        if (n > l) {
            final int h = n - l;
            this.h = h;
            this.g = g - h;
            return;
        }
        this.h = 0;
    }
    
    public final String A() {
        final int k = this.k();
        if (k > 0) {
            final int g = this.g;
            final int i = this.i;
            if (k <= g - i) {
                final String g2 = ahcl.g(this.f, i, k);
                this.i += k;
                return g2;
            }
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
        if (this.k == n) {
            return;
        }
        throw ahab.b();
    }
    
    public final void C(final int l) {
        this.l = l;
        this.S();
    }
    
    public final void D(final int n) {
        if (n >= 0) {
            final int g = this.g;
            final int i = this.i;
            if (n <= g - i) {
                this.i = i + n;
                return;
            }
        }
        if (n < 0) {
            throw ahab.f();
        }
        throw ahab.j();
    }
    
    public final boolean E() {
        return this.i == this.g;
    }
    
    public final boolean F() {
        return this.s() != 0L;
    }
    
    public final boolean G(int i) {
        final int b = ahco.b(i);
        final int n = 0;
        final int n2 = 0;
        if (b == 0) {
            i = n;
            if (this.g - this.i >= 10) {
                for (i = n2; i < 10; ++i) {
                    if (this.f[this.i++] >= 0) {
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
            this.D(8);
            return true;
        }
        if (b == 2) {
            this.D(this.k());
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
            this.D(4);
            return true;
        }
        throw ahab.a();
    }
    
    public final byte[] H() {
        return this.I(this.k());
    }
    
    public final byte[] I(int i) {
        if (i > 0) {
            final int g = this.g;
            final int j = this.i;
            if (i <= g - j) {
                i += j;
                this.i = i;
                return Arrays.copyOfRange(this.f, j, i);
            }
        }
        if (i > 0) {
            throw ahab.j();
        }
        if (i == 0) {
            return agzz.b;
        }
        throw ahab.f();
    }
    
    public final byte a() {
        final int i = this.i;
        if (i != this.g) {
            final byte[] f = this.f;
            this.i = i + 1;
            return f[i];
        }
        throw ahab.j();
    }
    
    public final double b() {
        return Double.longBitsToDouble(this.r());
    }
    
    public final float c() {
        return Float.intBitsToFloat(this.j());
    }
    
    public final int d() {
        final int l = this.l;
        if (l == Integer.MAX_VALUE) {
            return -1;
        }
        return l - this.e();
    }
    
    public final int e() {
        return this.i - this.j;
    }
    
    public final int f(int l) {
        if (l < 0) {
            throw ahab.f();
        }
        l += this.e();
        if (l < 0) {
            throw ahab.g();
        }
        final int i = this.l;
        if (l <= i) {
            this.l = l;
            this.S();
            return i;
        }
        throw ahab.j();
    }
    
    public final int g() {
        return this.k();
    }
    
    public final int h() {
        return this.j();
    }
    
    public final int i() {
        return this.k();
    }
    
    public final int j() {
        final int i = this.i;
        if (this.g - i >= 4) {
            final byte[] f = this.f;
            this.i = i + 4;
            return (f[i + 3] & 0xFF) << 24 | ((f[i] & 0xFF) | (f[i + 1] & 0xFF) << 8 | (f[i + 2] & 0xFF) << 16);
        }
        throw ahab.j();
    }
    
    public final int k() {
        final int i = this.i;
        final int g = this.g;
        if (g != i) {
            final byte[] f = this.f;
            final int j = i + 1;
            final byte b = f[i];
            if (b >= 0) {
                this.i = j;
                return b;
            }
            if (g - j >= 9) {
                int k = j + 1;
                final int n = b ^ f[j] << 7;
                int n2;
                if (n < 0) {
                    n2 = (n ^ 0xFFFFFF80);
                }
                else {
                    final int n3 = k + 1;
                    final int n4 = n ^ f[k] << 14;
                    if (n4 >= 0) {
                        final int n5 = n4 ^ 0x3F80;
                        k = n3;
                        n2 = n5;
                    }
                    else {
                        k = n3 + 1;
                        final int n6 = n4 ^ f[n3] << 21;
                        if (n6 < 0) {
                            n2 = (n6 ^ 0xFFE03F80);
                        }
                        else {
                            final int n7 = k + 1;
                            final byte b2 = f[k];
                            final int n8 = n2 = (n6 ^ b2 << 28 ^ 0xFE03F80);
                            k = n7;
                            if (b2 < 0) {
                                final int n9 = n7 + 1;
                                n2 = n8;
                                k = n9;
                                if (f[n7] < 0) {
                                    final int n10 = n9 + 1;
                                    n2 = n8;
                                    k = n10;
                                    if (f[n9] < 0) {
                                        final int n11 = n10 + 1;
                                        n2 = n8;
                                        k = n11;
                                        if (f[n10] < 0) {
                                            final int n12 = n11 + 1;
                                            n2 = n8;
                                            k = n12;
                                            if (f[n11] < 0) {
                                                k = n12 + 1;
                                                if (f[n12] < 0) {
                                                    return (int)this.t();
                                                }
                                                n2 = n8;
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
        return (int)this.t();
    }
    
    public final int l() {
        return this.j();
    }
    
    public final int m() {
        return J(this.k());
    }
    
    public final int n() {
        if (this.E()) {
            return this.k = 0;
        }
        final int k = this.k();
        this.k = k;
        if (ahco.a(k) != 0) {
            return k;
        }
        throw ahab.c();
    }
    
    public final int o() {
        return this.k();
    }
    
    public final long p() {
        return this.r();
    }
    
    public final long q() {
        return this.s();
    }
    
    public final long r() {
        final int i = this.i;
        if (this.g - i >= 8) {
            final byte[] f = this.f;
            this.i = i + 8;
            return ((long)f[i + 7] & 0xFFL) << 56 | (((long)f[i] & 0xFFL) | ((long)f[i + 1] & 0xFFL) << 8 | ((long)f[i + 2] & 0xFFL) << 16 | ((long)f[i + 3] & 0xFFL) << 24 | ((long)f[i + 4] & 0xFFL) << 32 | ((long)f[i + 5] & 0xFFL) << 40 | ((long)f[i + 6] & 0xFFL) << 48);
        }
        throw ahab.j();
    }
    
    public final long s() {
        final int i = this.i;
        final int g = this.g;
        if (g != i) {
            final byte[] f = this.f;
            final int j = i + 1;
            final byte b = f[i];
            if (b >= 0) {
                this.i = j;
                return b;
            }
            if (g - j >= 9) {
                int k = j + 1;
                final int n = b ^ f[j] << 7;
                long n4 = 0L;
                Label_0358: {
                    int n6 = 0;
                    Label_0079: {
                        if (n >= 0) {
                            final int n2 = k + 1;
                            final int n3 = n ^ f[k] << 14;
                            Label_0116: {
                                if (n3 >= 0) {
                                    n4 = (n3 ^ 0x3F80);
                                    k = n2;
                                }
                                else {
                                    k = n2 + 1;
                                    final int n5 = n3 ^ f[n2] << 21;
                                    if (n5 < 0) {
                                        n6 = (n5 ^ 0xFFE03F80);
                                        break Label_0079;
                                    }
                                    final int n7 = k + 1;
                                    long n8 = (long)f[k] << 28 ^ (long)n5;
                                    long n12 = 0L;
                                    Label_0183: {
                                        if (n8 < 0L) {
                                            k = n7 + 1;
                                            long n9 = n8 ^ (long)f[n7] << 35;
                                            Label_0230: {
                                                long n10;
                                                if (n9 < 0L) {
                                                    n10 = -34093383808L;
                                                }
                                                else {
                                                    final int n11 = k + 1;
                                                    n8 = (n9 ^ (long)f[k] << 42);
                                                    if (n8 >= 0L) {
                                                        n12 = 4363953127296L;
                                                        k = n11;
                                                        break Label_0183;
                                                    }
                                                    k = n11 + 1;
                                                    n9 = (n8 ^ (long)f[n11] << 49);
                                                    if (n9 < 0L) {
                                                        n10 = -558586000294016L;
                                                    }
                                                    else {
                                                        final int n13 = k + 1;
                                                        final long n14 = n4 = (n9 ^ (long)f[k] << 56 ^ 0xFE03F80FE03F80L);
                                                        k = n13;
                                                        if (n14 >= 0L) {
                                                            break Label_0116;
                                                        }
                                                        k = n13 + 1;
                                                        if (f[n13] >= 0L) {
                                                            n4 = n14;
                                                            break Label_0230;
                                                        }
                                                        return this.t();
                                                    }
                                                }
                                                n4 = (n10 ^ n9);
                                            }
                                            break Label_0358;
                                        }
                                        n12 = 266354560L;
                                        k = n7;
                                    }
                                    n4 = (n8 ^ n12);
                                }
                            }
                            break Label_0358;
                        }
                        n6 = (n ^ 0xFFFFFF80);
                    }
                    n4 = n6;
                }
                this.i = k;
                return n4;
            }
        }
        return this.t();
    }
    
    final long t() {
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
    
    public final long u() {
        return this.r();
    }
    
    public final long v() {
        return L(this.s());
    }
    
    public final long w() {
        return this.s();
    }
    
    public final agyc x() {
        final int k = this.k();
        if (k > 0) {
            final int g = this.g;
            final int i = this.i;
            if (k <= g - i) {
                final agyc z = agyc.z(this.f, i, k);
                this.i += k;
                return z;
            }
        }
        if (k == 0) {
            return agyc.b;
        }
        return agyc.C(this.I(k));
    }
    
    public final MessageLite y(final ahbe ahbe, final ExtensionRegistryLite extensionRegistryLite) {
        final int k = this.k();
        this.Q();
        final int f = this.f(k);
        ++this.a;
        final Object n = ahbe.n((agyh)this, extensionRegistryLite);
        this.B(0);
        --this.a;
        if (this.d() == 0) {
            this.C(f);
            return (MessageLite)n;
        }
        throw ahab.j();
    }
    
    public final String z() {
        final int k = this.k();
        if (k > 0) {
            final int g = this.g;
            final int i = this.i;
            if (k <= g - i) {
                final String s = new String(this.f, i, k, agzz.a);
                this.i += k;
                return s;
            }
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
