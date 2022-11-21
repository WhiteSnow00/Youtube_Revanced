import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chv
{
    public int a;
    public Object b;
    private int c;
    private int d;
    
    public chv() {
        if (ceu.a == null) {
            ceu.a = new ceu();
        }
    }
    
    public chv(final byte[] b, final int c, final int d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = 0;
        this.l();
    }
    
    private final void l() {
        final int c = this.c;
        boolean b2;
        final boolean b = b2 = false;
        Label_0045: {
            if (c >= 0) {
                final int d = this.d;
                if (c >= d) {
                    b2 = b;
                    if (c != d) {
                        break Label_0045;
                    }
                    b2 = b;
                    if (this.a != 0) {
                        break Label_0045;
                    }
                }
                b2 = true;
            }
        }
        bad.f(b2);
    }
    
    private final boolean m(final int n) {
        if (n >= 2 && n < this.d) {
            final byte[] array = (byte[])this.b;
            if (array[n] == 3 && array[n - 2] == 0 && array[n - 1] == 0) {
                return true;
            }
        }
        return false;
    }
    
    public final int a(final int n) {
        if (n < this.d) {
            return ((ByteBuffer)this.b).getShort(this.c + n);
        }
        return 0;
    }
    
    public final int b(int n) {
        n += this.a;
        return n + ((ByteBuffer)this.b).getInt(n) + 4;
    }
    
    public final int c(int int1) {
        final int n = int1 + this.a;
        int1 = ((ByteBuffer)this.b).getInt(n);
        return ((ByteBuffer)this.b).getInt(n + int1);
    }
    
    public final void d(int short1, final ByteBuffer b) {
        this.b = b;
        if (b != null) {
            this.a = short1;
            final ByteBuffer byteBuffer = b;
            short1 -= b.getInt(short1);
            this.c = short1;
            short1 = ((ByteBuffer)this.b).getShort(short1);
        }
        else {
            short1 = 0;
            this.a = 0;
            this.c = 0;
        }
        this.d = short1;
    }
    
    public final int e() {
        final int a = this.a(6);
        if (a != 0) {
            return this.c(a);
        }
        return 0;
    }
    
    public final int f(final int n) {
        this.a += n;
        int n2 = 0;
        int a;
        int n3;
        while (true) {
            a = this.a;
            n3 = 2;
            if (a <= 8) {
                break;
            }
            final int a2 = a - 8;
            this.a = a2;
            final Object b = this.b;
            final int c = this.c;
            n2 |= (((byte[])b)[c] & 0xFF) << a2;
            if (!this.m(c + 1)) {
                n3 = 1;
            }
            this.c = c + n3;
        }
        final Object b2 = this.b;
        final int c2 = this.c;
        final byte b3 = ((byte[])b2)[c2];
        if (a == 8) {
            this.a = 0;
            if (!this.m(c2 + 1)) {
                n3 = 1;
            }
            this.c = c2 + n3;
        }
        this.l();
        return -1 >>> 32 - n & (n2 | (b3 & 0xFF) >> 8 - a);
    }
    
    public final int g() {
        int f = 0;
        int n = 0;
        while (!this.k()) {
            ++n;
        }
        if (n > 0) {
            f = this.f(n);
        }
        return (1 << n) - 1 + f;
    }
    
    public final int h() {
        final int g = this.g();
        int n = 1;
        if (g % 2 == 0) {
            n = -1;
        }
        return n * ((g + 1) / 2);
    }
    
    public final void i() {
        int a = this.a;
        int n = 1;
        ++a;
        this.a = a;
        if (a == 8) {
            this.a = 0;
            final int c = this.c;
            if (this.m(c + 1)) {
                n = 2;
            }
            this.c = c + n;
        }
        this.l();
    }
    
    public final void j(int n) {
        final int c = this.c;
        final int n2 = n / 8;
        final int c2 = c + n2;
        this.c = c2;
        final int a = this.a + (n - n2 * 8);
        this.a = a;
        n = c;
        if (a > 7) {
            this.c = c2 + 1;
            this.a = a - 8;
            n = c;
        }
        while (true) {
            final int n3 = n + 1;
            if (n3 > this.c) {
                break;
            }
            n = n3;
            if (!this.m(n3)) {
                continue;
            }
            ++this.c;
            n = n3 + 2;
        }
        this.l();
    }
    
    public final boolean k() {
        final byte b = ((byte[])this.b)[this.c];
        final int a = this.a;
        this.i();
        return (b & 128 >> a) != 0x0;
    }
}
