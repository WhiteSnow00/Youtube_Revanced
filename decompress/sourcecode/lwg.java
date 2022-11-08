import java.nio.charset.Charset;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwg
{
    public int a;
    public int b;
    public Object c;
    
    public lwg() {
    }
    
    public lwg(final int n) {
        final byte[] c = new byte[n];
        this.c = c;
        this.b = c.length;
    }
    
    public lwg(final byte[] c) {
        this.c = c;
        this.b = c.length;
    }
    
    public lwg(final byte[] c, final byte[] array) {
        this.c = c;
        this.b = 0;
    }
    
    public lwg(final char[] array) {
        jfi.S(true);
        jfi.S(true);
        this.a = 0;
        this.c = new lzi[100];
    }
    
    public final void A(final int n) {
        monitorenter(this);
        try {
            while (this.z() > n) {
                this.wait();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void B() {
        synchronized (this) {
            final int max = Math.max(0, lwj.a(0, 65536) - this.b);
            final int a = this.a;
            if (max >= a) {
                return;
            }
            Arrays.fill((Object[])this.c, max, a, null);
            this.a = max;
        }
    }
    
    public final lzi C() {
        synchronized (this) {
            ++this.b;
            int a = this.a;
            lzi lzi;
            if (a > 0) {
                final Object c = this.c;
                --a;
                this.a = a;
                lzi = ((lzi[])c)[a];
                ((lzi[])c)[a] = null;
            }
            else {
                lzi = new lzi(new byte[65536]);
            }
            return lzi;
        }
    }
    
    public final void D(final lzi lzi) {
        synchronized (this) {
            final Object a = lzi.a;
            jfi.S(true);
            --this.b;
            final int a2 = this.a;
            final Object c = this.c;
            final int length = ((lzi[])c).length;
            if (a2 == length) {
                this.c = Arrays.copyOf((lzi[])c, length + length);
            }
            ((lzi[])this.c)[this.a++] = lzi;
            this.notifyAll();
        }
    }
    
    public final void E(final lzi[] array) {
        monitorenter(this);
        try {
            final int a = this.a;
            final int length = array.length;
            final int n = a + length;
            final Object c = this.c;
            final int length2 = ((lzi[])c).length;
            int i;
            final int n2 = i = 0;
            if (n >= length2) {
                this.c = Arrays.copyOf((lzi[])c, Math.max(length2 + length2, n));
                i = n2;
            }
            while (i < length) {
                final lzi lzi = array[i];
                final Object a2 = lzi.a;
                jfi.S(true);
                ((lzi[])this.c)[this.a++] = lzi;
                ++i;
            }
            this.b -= array.length;
            this.notifyAll();
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final int a() {
        return this.b - this.a;
    }
    
    public final int b() {
        final Object c = this.c;
        if (c == null) {
            return 0;
        }
        return ((byte[])c).length;
    }
    
    public final int c() {
        final Object c = this.c;
        final int a = this.a;
        final int a2 = a + 1;
        this.a = a2;
        final byte[] array = (byte[])c;
        final byte b = array[a];
        final int n = a2 + 1;
        final byte b2 = array[a2];
        final int n2 = n + 1;
        final byte b3 = array[n];
        this.a = n2 + 1;
        return (array[n2] & 0xFF) | ((b & 0xFF) << 24 | (b2 & 0xFF) << 16 | (b3 & 0xFF) << 8);
    }
    
    public final int d() {
        final Object c = this.c;
        final int a = this.a;
        final int a2 = a + 1;
        this.a = a2;
        final byte[] array = (byte[])c;
        final byte b = array[a];
        final int n = a2 + 1;
        final byte b2 = array[a2];
        final int n2 = n + 1;
        final byte b3 = array[n];
        this.a = n2 + 1;
        return (array[n2] & 0xFF) << 24 | ((b & 0xFF) | (b2 & 0xFF) << 8 | (b3 & 0xFF) << 16);
    }
    
    public final int e() {
        final int d = this.d();
        if (d >= 0) {
            return d;
        }
        final StringBuilder sb = new StringBuilder("Top bit not zero: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }
    
    public final int f() {
        final Object c = this.c;
        final int a = this.a;
        final int a2 = a + 1;
        this.a = a2;
        final byte[] array = (byte[])c;
        final byte b = array[a];
        this.a = a2 + 1;
        return (array[a2] & 0xFF) << 8 | (b & 0xFF);
    }
    
    public final int g() {
        return this.h() << 21 | this.h() << 14 | this.h() << 7 | this.h();
    }
    
    public final int h() {
        return ((byte[])this.c)[this.a++] & 0xFF;
    }
    
    public final int i() {
        final Object c = this.c;
        final int a = this.a;
        final int a2 = a + 1;
        this.a = a2;
        final byte[] array = (byte[])c;
        final byte b = array[a];
        final int n = a2 + 1;
        final byte b2 = array[a2];
        this.a = n + 1;
        return (array[n] & 0xFF) | ((b & 0xFF) << 16 | (b2 & 0xFF) << 8);
    }
    
    public final int j() {
        final int c = this.c();
        if (c >= 0) {
            return c;
        }
        final StringBuilder sb = new StringBuilder("Top bit not zero: ");
        sb.append(c);
        throw new IllegalStateException(sb.toString());
    }
    
    public final int k() {
        final Object c = this.c;
        final int a = this.a;
        final int a2 = a + 1;
        this.a = a2;
        final byte[] array = (byte[])c;
        final byte b = array[a];
        this.a = a2 + 1;
        return (array[a2] & 0xFF) | (b & 0xFF) << 8;
    }
    
    public final long l() {
        final Object c = this.c;
        final int a = this.a;
        final int a2 = a + 1;
        this.a = a2;
        final byte[] array = (byte[])c;
        final byte b = array[a];
        final int n = a2 + 1;
        final byte b2 = array[a2];
        final int n2 = n + 1;
        final byte b3 = array[n];
        this.a = n2 + 1;
        return ((long)b2 & 0xFFL) << 8 | ((long)b & 0xFFL) | ((long)b3 & 0xFFL) << 16 | ((long)array[n2] & 0xFFL) << 24;
    }
    
    public final long m() {
        final Object c = this.c;
        final int a = this.a;
        final int a2 = a + 1;
        this.a = a2;
        final byte[] array = (byte[])c;
        final byte b = array[a];
        final int n = a2 + 1;
        final byte b2 = array[a2];
        final int n2 = n + 1;
        final byte b3 = array[n];
        final int n3 = n2 + 1;
        final byte b4 = array[n2];
        final int n4 = n3 + 1;
        final byte b5 = array[n3];
        final int n5 = n4 + 1;
        final byte b6 = array[n4];
        final int n6 = n5 + 1;
        final byte b7 = array[n5];
        this.a = n6 + 1;
        return ((long)b2 & 0xFFL) << 48 | ((long)b & 0xFFL) << 56 | ((long)b3 & 0xFFL) << 40 | ((long)b4 & 0xFFL) << 32 | ((long)b5 & 0xFFL) << 24 | ((long)b6 & 0xFFL) << 16 | ((long)b7 & 0xFFL) << 8 | ((long)array[n6] & 0xFFL);
    }
    
    public final long n() {
        final Object c = this.c;
        final int a = this.a;
        final int a2 = a + 1;
        this.a = a2;
        final byte[] array = (byte[])c;
        final byte b = array[a];
        final int n = a2 + 1;
        final byte b2 = array[a2];
        final int n2 = n + 1;
        final byte b3 = array[n];
        this.a = n2 + 1;
        return ((long)b2 & 0xFFL) << 16 | ((long)b & 0xFFL) << 24 | ((long)b3 & 0xFFL) << 8 | ((long)array[n2] & 0xFFL);
    }
    
    public final long o() {
        final long m = this.m();
        if (m >= 0L) {
            return m;
        }
        final StringBuilder sb = new StringBuilder("Top bit not zero: ");
        sb.append(m);
        throw new IllegalStateException(sb.toString());
    }
    
    public final String p(final int n) {
        return this.q(n, Charset.defaultCharset());
    }
    
    public final String q(final int n, final Charset charset) {
        final Object c = this.c;
        final int a = this.a;
        final String s = new String((byte[])c, a, n, charset);
        this.a = a + n;
        return s;
    }
    
    public final void r(final lwf lwf, final int n) {
        this.s((byte[])lwf.d, 0, n);
        lwf.d(0);
    }
    
    public final void s(final byte[] array, final int n, final int n2) {
        System.arraycopy(this.c, this.a, array, n, n2);
        this.a += n2;
    }
    
    public final void t() {
        this.a = 0;
        this.b = 0;
    }
    
    public final void u(final int n) {
        Object c;
        if (this.b() < n) {
            c = new byte[n];
        }
        else {
            c = this.c;
        }
        this.v((byte[])c, n);
    }
    
    public final void v(final byte[] c, final int b) {
        this.c = c;
        this.b = b;
        this.a = 0;
    }
    
    public final void w(final int b) {
        boolean b2 = false;
        if (b >= 0) {
            b2 = b2;
            if (b <= ((byte[])this.c).length) {
                b2 = true;
            }
        }
        jfi.S(b2);
        this.b = b;
    }
    
    public final void x(final int a) {
        boolean b = false;
        if (a >= 0) {
            b = b;
            if (a <= this.b) {
                b = true;
            }
        }
        jfi.S(b);
        this.a = a;
    }
    
    public final void y(final int n) {
        this.x(this.a + n);
    }
    
    public final int z() {
        synchronized (this) {
            return this.b * 65536;
        }
    }
}
