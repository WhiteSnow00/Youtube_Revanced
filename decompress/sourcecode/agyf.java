import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class agyf extends agyh
{
    private final InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    
    public agyf(final InputStream f, final int n) {
        this.m = Integer.MAX_VALUE;
        agzz.i((Object)f, "input");
        this.f = f;
        this.g = new byte[n];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }
    
    private static int D(final InputStream inputStream, final byte[] array, int read, final int n) {
        try {
            read = inputStream.read(array, read, n);
            return read;
        }
        catch (final ahab ahab) {
            ahab.k();
            throw ahab;
        }
    }
    
    private final List I(int i) {
        final ArrayList list = new ArrayList();
        while (i > 0) {
            final int min = Math.min(i, 4096);
            final byte[] array = new byte[min];
            int read;
            for (int j = 0; j < min; j += read) {
                read = this.f.read(array, j, min - j);
                if (read == -1) {
                    throw ahab.j();
                }
                this.l += read;
            }
            i -= min;
            list.add(array);
        }
        return list;
    }
    
    private final void S() {
        final int h = this.h + this.i;
        this.h = h;
        final int n = this.l + h;
        final int m = this.m;
        if (n > m) {
            final int i = n - m;
            this.i = i;
            this.h = h - i;
            return;
        }
        this.i = 0;
    }
    
    private final void T(final int n) {
        if (this.U(n)) {
            return;
        }
        if (n > this.c - this.l - this.j) {
            throw ahab.i();
        }
        throw ahab.j();
    }
    
    private final boolean U(final int n) {
        final int j = this.j;
        final int h = this.h;
        if (j + n <= h) {
            final StringBuilder sb = new StringBuilder("refillBuffer() called when ");
            sb.append(n);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        final int c = this.c;
        int l = this.l;
        if (n > c - l - j) {
            return false;
        }
        if (l + j + n > this.m) {
            return false;
        }
        int h2 = h;
        if (j > 0) {
            if (h > j) {
                final byte[] g = this.g;
                System.arraycopy(g, j, g, 0, h - j);
            }
            l = this.l + j;
            this.l = l;
            h2 = this.h - j;
            this.h = h2;
            this.j = 0;
        }
        final InputStream f = this.f;
        final byte[] g2 = this.g;
        final int d = D(f, g2, h2, Math.min(g2.length - h2, this.c - l - h2));
        if (d == 0 || d < -1 || d > this.g.length) {
            final String value = String.valueOf(this.f.getClass());
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(value);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(d);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        }
        if (d > 0) {
            this.h += d;
            this.S();
            return this.h >= n || this.U(n);
        }
        return false;
    }
    
    private final byte[] V(final int n) {
        if (n == 0) {
            return agzz.b;
        }
        if (n < 0) {
            throw ahab.f();
        }
        final int l = this.l;
        final int j = this.j;
        final int n2 = l + j + n;
        if (n2 - this.c > 0) {
            throw ahab.i();
        }
        final int m = this.m;
        if (n2 <= m) {
            int i = this.h - j;
            final int n3 = n - i;
            if (n3 >= 4096) {
                final InputStream f = this.f;
                try {
                    if (n3 > f.available()) {
                        return null;
                    }
                }
                catch (final ahab ahab) {
                    ahab.k();
                    throw ahab;
                }
            }
            final byte[] array = new byte[n];
            System.arraycopy(this.g, this.j, array, 0, i);
            this.l += this.h;
            this.j = 0;
            this.h = 0;
            while (i < n) {
                final int d = D(this.f, array, i, n - i);
                if (d == -1) {
                    throw ahab.j();
                }
                this.l += d;
                i += d;
            }
            return array;
        }
        this.t(m - l - j);
        throw ahab.j();
    }
    
    private final byte[] W(int n) {
        final byte[] v = this.V(n);
        if (v != null) {
            return v;
        }
        final int j = this.j;
        final int h = this.h;
        final int n2 = h - j;
        this.l += h;
        this.j = 0;
        this.h = 0;
        final List i = this.I(n - n2);
        final byte[] array = new byte[n];
        System.arraycopy(this.g, j, array, 0, n2);
        final Iterator iterator = i.iterator();
        n = n2;
        while (iterator.hasNext()) {
            final byte[] array2 = (byte[])iterator.next();
            final int length = array2.length;
            System.arraycopy(array2, 0, array, n, length);
            n += length;
        }
        return array;
    }
    
    public final String A() {
        final int k = this.k();
        int j = this.j;
        final int h = this.h;
        byte[] array;
        if (k <= h - j && k > 0) {
            array = this.g;
            this.j = j + k;
        }
        else {
            if (k == 0) {
                return "";
            }
            j = 0;
            if (k <= h) {
                this.T(k);
                array = this.g;
                this.j = k;
            }
            else {
                array = this.W(k);
            }
        }
        return ahcl.g(array, j, k);
    }
    
    public final void B(final int n) {
        if (this.k == n) {
            return;
        }
        throw ahab.b();
    }
    
    public final void C(final int m) {
        this.m = m;
        this.S();
    }
    
    public final boolean E() {
        return this.j == this.h && !this.U(1);
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
            if (this.h - this.j >= 10) {
                for (i = n2; i < 10; ++i) {
                    if (this.g[this.j++] >= 0) {
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
        final int h = this.h;
        final int j = this.j;
        if (k <= h - j && k > 0) {
            final byte[] copyOfRange = Arrays.copyOfRange(this.g, j, j + k);
            this.j += k;
            return copyOfRange;
        }
        return this.W(k);
    }
    
    public final byte a() {
        if (this.j == this.h) {
            this.T(1);
        }
        return this.g[this.j++];
    }
    
    public final double b() {
        return Double.longBitsToDouble(this.j());
    }
    
    public final float c() {
        return Float.intBitsToFloat(this.d());
    }
    
    public final int d() {
        int n;
        if (this.h - (n = this.j) < 4) {
            this.T(4);
            n = this.j;
        }
        final byte[] g = this.g;
        this.j = n + 4;
        return (g[n + 3] & 0xFF) << 24 | ((g[n] & 0xFF) | (g[n + 1] & 0xFF) << 8 | (g[n + 2] & 0xFF) << 16);
    }
    
    public final int e() {
        return this.l + this.j;
    }
    
    public final int f(int m) {
        if (m < 0) {
            throw ahab.f();
        }
        m += this.l + this.j;
        final int i = this.m;
        if (m <= i) {
            this.m = m;
            this.S();
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
        int n;
        if (this.h - (n = this.j) < 8) {
            this.T(8);
            n = this.j;
        }
        final byte[] g = this.g;
        this.j = n + 8;
        return ((long)g[n + 7] & 0xFFL) << 56 | (((long)g[n] & 0xFFL) | ((long)g[n + 1] & 0xFFL) << 8 | ((long)g[n + 2] & 0xFFL) << 16 | ((long)g[n + 3] & 0xFFL) << 24 | ((long)g[n + 4] & 0xFFL) << 32 | ((long)g[n + 5] & 0xFFL) << 40 | ((long)g[n + 6] & 0xFFL) << 48);
    }
    
    public final int k() {
        final int j = this.j;
        final int h = this.h;
        if (h != j) {
            final byte[] g = this.g;
            final int i = j + 1;
            final byte b = g[j];
            if (b >= 0) {
                this.j = i;
                return b;
            }
            if (h - i >= 9) {
                int k = i + 1;
                final int n = b ^ g[i] << 7;
                int n2;
                if (n < 0) {
                    n2 = (n ^ 0xFFFFFF80);
                }
                else {
                    final int n3 = k + 1;
                    final int n4 = n ^ g[k] << 14;
                    if (n4 >= 0) {
                        final int n5 = n4 ^ 0x3F80;
                        k = n3;
                        n2 = n5;
                    }
                    else {
                        k = n3 + 1;
                        final int n6 = n4 ^ g[n3] << 21;
                        if (n6 < 0) {
                            n2 = (n6 ^ 0xFFE03F80);
                        }
                        else {
                            final int n7 = k + 1;
                            final byte b2 = g[k];
                            final int n8 = n2 = (n6 ^ b2 << 28 ^ 0xFE03F80);
                            k = n7;
                            if (b2 < 0) {
                                final int n9 = n7 + 1;
                                n2 = n8;
                                k = n9;
                                if (g[n7] < 0) {
                                    final int n10 = n9 + 1;
                                    n2 = n8;
                                    k = n10;
                                    if (g[n9] < 0) {
                                        final int n11 = n10 + 1;
                                        n2 = n8;
                                        k = n11;
                                        if (g[n10] < 0) {
                                            final int n12 = n11 + 1;
                                            n2 = n8;
                                            k = n12;
                                            if (g[n11] < 0) {
                                                k = n12 + 1;
                                                if (g[n12] < 0) {
                                                    return (int)this.s();
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
                this.j = k;
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
        return this.j();
    }
    
    public final long q() {
        return this.r();
    }
    
    public final long r() {
        final int j = this.j;
        final int h = this.h;
        if (h != j) {
            final byte[] g = this.g;
            final int i = j + 1;
            final byte b = g[j];
            if (b >= 0) {
                this.j = i;
                return b;
            }
            if (h - i >= 9) {
                int k = i + 1;
                final int n = b ^ g[i] << 7;
                long n4 = 0L;
                Label_0358: {
                    int n6 = 0;
                    Label_0079: {
                        if (n >= 0) {
                            final int n2 = k + 1;
                            final int n3 = n ^ g[k] << 14;
                            Label_0116: {
                                if (n3 >= 0) {
                                    n4 = (n3 ^ 0x3F80);
                                    k = n2;
                                }
                                else {
                                    k = n2 + 1;
                                    final int n5 = n3 ^ g[n2] << 21;
                                    if (n5 < 0) {
                                        n6 = (n5 ^ 0xFFE03F80);
                                        break Label_0079;
                                    }
                                    final int n7 = k + 1;
                                    long n8 = (long)g[k] << 28 ^ (long)n5;
                                    long n12 = 0L;
                                    Label_0183: {
                                        if (n8 < 0L) {
                                            k = n7 + 1;
                                            long n9 = n8 ^ (long)g[n7] << 35;
                                            Label_0230: {
                                                long n10;
                                                if (n9 < 0L) {
                                                    n10 = -34093383808L;
                                                }
                                                else {
                                                    final int n11 = k + 1;
                                                    n8 = (n9 ^ (long)g[k] << 42);
                                                    if (n8 >= 0L) {
                                                        n12 = 4363953127296L;
                                                        k = n11;
                                                        break Label_0183;
                                                    }
                                                    k = n11 + 1;
                                                    n9 = (n8 ^ (long)g[n11] << 49);
                                                    if (n9 < 0L) {
                                                        n10 = -558586000294016L;
                                                    }
                                                    else {
                                                        final int n13 = k + 1;
                                                        final long n14 = n4 = (n9 ^ (long)g[k] << 56 ^ 0xFE03F80FE03F80L);
                                                        k = n13;
                                                        if (n14 >= 0L) {
                                                            break Label_0116;
                                                        }
                                                        k = n13 + 1;
                                                        if (g[n13] >= 0L) {
                                                            n4 = n14;
                                                            break Label_0230;
                                                        }
                                                        return this.s();
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
                this.j = k;
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
        final int h = this.h;
        final int j = this.j;
        int i = h - j;
        if (n <= i && n >= 0) {
            this.j = j + n;
            return;
        }
        if (n < 0) {
            throw ahab.f();
        }
        final int l = this.l;
        final int k = l + j;
        final int m = this.m;
        if (k + n <= m) {
            this.l = k;
            this.h = 0;
            this.j = 0;
            while (i < n) {
                try {
                    final InputStream f = this.f;
                    final long n2 = n - i;
                    try {
                        final long skip = f.skip(n2);
                        if (skip < 0L || skip > n2) {
                            final String value = String.valueOf(this.f.getClass());
                            final StringBuilder sb = new StringBuilder();
                            sb.append(value);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                        if (skip == 0L) {
                            break;
                        }
                        i += (int)skip;
                        continue;
                    }
                    catch (final ahab ahab) {
                        ahab.k();
                        throw ahab;
                    }
                }
                finally {
                    this.l += i;
                    this.S();
                }
                break;
            }
            this.l += i;
            this.S();
            if (i < n) {
                final int h2 = this.h;
                int n3 = h2 - this.j;
                this.j = h2;
                this.T(1);
                int j2;
                while (true) {
                    j2 = n - n3;
                    final int h3 = this.h;
                    if (j2 <= h3) {
                        break;
                    }
                    n3 += h3;
                    this.j = h3;
                    this.T(1);
                }
                this.j = j2;
            }
            return;
        }
        this.t(m - l - j);
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
        final int h = this.h;
        final int j = this.j;
        if (k <= h - j && k > 0) {
            final agyc z = agyc.z(this.g, j, k);
            this.j += k;
            return z;
        }
        if (k != 0) {
            final byte[] v = this.V(k);
            agyc agyc;
            if (v != null) {
                agyc = agyc.x(v);
            }
            else {
                final int i = this.j;
                final int h2 = this.h;
                int n = h2 - i;
                this.l += h2;
                this.j = 0;
                this.h = 0;
                final List l = this.I(k - n);
                final byte[] array = new byte[k];
                System.arraycopy(this.g, i, array, 0, n);
                for (final byte[] array2 : l) {
                    final int length = array2.length;
                    System.arraycopy(array2, 0, array, n, length);
                    n += length;
                }
                agyc = agyc.C(array);
            }
            return agyc;
        }
        return agyc.b;
    }
    
    public final MessageLite y(final ahbe ahbe, final ExtensionRegistryLite extensionRegistryLite) {
        throw null;
    }
    
    public final String z() {
        final int k = this.k();
        if (k > 0) {
            final int h = this.h;
            final int j = this.j;
            if (k <= h - j) {
                final String s = new String(this.g, j, k, agzz.a);
                this.j += k;
                return s;
            }
        }
        if (k == 0) {
            return "";
        }
        if (k <= this.h) {
            this.T(k);
            final String s2 = new String(this.g, this.j, k, agzz.a);
            this.j += k;
            return s2;
        }
        return new String(this.W(k), agzz.a);
    }
}
