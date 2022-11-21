import java.nio.Buffer;
import java.util.Arrays;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpk
{
    public ByteBuffer a;
    public int b;
    int c;
    int[] d;
    int e;
    boolean f;
    boolean g;
    int h;
    int[] i;
    int j;
    int k;
    agpi l;
    final agpn m;
    
    public agpk() {
        this(1024);
    }
    
    public agpk(final int n) {
        final agpj a = agpj.a;
        final agpn d = agpn.d();
        this.c = 1;
        this.d = null;
        this.e = 0;
        this.f = false;
        this.g = false;
        this.i = new int[16];
        this.j = 0;
        this.k = 0;
        this.l = (agpi)a;
        int n2 = n;
        if (n <= 0) {
            n2 = 1024;
        }
        final ByteBuffer a2 = ((agpi)a).a(n2);
        this.a = a2;
        this.m = d;
        this.b = a2.capacity();
    }
    
    public static boolean s(final agpm agpm, final int n) {
        return agpm.b(n) != 0;
    }
    
    public final int a(final byte[] array) {
        final int length = array.length;
        this.r(1, length, 1);
        final ByteBuffer a = this.a;
        final int b = this.b - length;
        this.b = b;
        final ByteBuffer byteBuffer = (ByteBuffer)a.position(b);
        this.a.put(array);
        return this.d();
    }
    
    public final int b(final CharSequence charSequence) {
        final int a = this.m.a(charSequence);
        this.n(1, 0);
        this.a.put(--this.b, (byte)0);
        this.r(1, a, 1);
        final ByteBuffer a2 = this.a;
        final int b = this.b - a;
        this.b = b;
        final ByteBuffer byteBuffer = (ByteBuffer)a2.position(b);
        this.m.c(charSequence, this.a);
        return this.d();
    }
    
    public final int c() {
        if (this.d != null && this.f) {
            this.h(0);
            final int e = this.e();
            int e2 = this.e;
            while (--e2 >= 0 && this.d[e2] == 0) {}
            for (int i = e2; i >= 0; --i) {
                final int n = this.d[i];
                int n2;
                if (n != 0) {
                    n2 = e - n;
                }
                else {
                    n2 = 0;
                }
                this.j((short)n2);
            }
            this.j((short)(e - this.h));
            e2 += 3;
            this.j((short)(e2 + e2));
            while (true) {
            Label_0217:
                for (int j = 0; j < this.j; ++j) {
                    final int n3 = this.a.capacity() - this.i[j];
                    final int b = this.b;
                    final short short1 = this.a.getShort(n3);
                    if (short1 == this.a.getShort(b)) {
                        for (short n4 = 2; n4 < short1; n4 += 2) {
                            if (this.a.getShort(n3 + n4) != this.a.getShort(b + n4)) {
                                continue Label_0217;
                            }
                        }
                        final int n5 = this.i[j];
                        if (n5 != 0) {
                            final int b2 = this.a.capacity() - e;
                            this.b = b2;
                            this.a.putInt(b2, n5 - e);
                        }
                        else {
                            final int k = this.j;
                            final int[] l = this.i;
                            if (k == l.length) {
                                this.i = Arrays.copyOf(l, k + k);
                            }
                            this.i[this.j++] = this.e();
                            final ByteBuffer a = this.a;
                            a.putInt(a.capacity() - e, this.e() - e);
                        }
                        this.f = false;
                        return e;
                    }
                }
                final int n5 = 0;
                continue;
            }
        }
        throw new AssertionError((Object)"FlatBuffers: endTable called without startTable");
    }
    
    public final int d() {
        if (this.f) {
            this.f = false;
            this.o(this.k);
            return this.e();
        }
        throw new AssertionError((Object)"FlatBuffers: endVector called without startVector");
    }
    
    public final int e() {
        return this.a.capacity() - this.b;
    }
    
    public final ByteBuffer f() {
        this.l();
        return this.a;
    }
    
    public final void g(final int n, final boolean b, final boolean b2) {
        if (b != b2) {
            this.n(1, 0);
            this.a.put(--this.b, (byte)(b ? 1 : 0));
            this.p(n);
        }
    }
    
    public final void h(final int n) {
        this.n(4, 0);
        this.o(n);
    }
    
    public final void i(final int n) {
        this.n(4, 0);
        this.o(this.e() - n + 4);
    }
    
    public final void j(final short n) {
        this.n(2, 0);
        this.a.putShort(this.b -= 2, n);
    }
    
    public final void k(final int n) {
        this.n(this.c, 4);
        this.i(n);
        final ByteBuffer byteBuffer = (ByteBuffer)this.a.position(this.b);
        this.g = true;
    }
    
    public final void l() {
        if (this.g) {
            return;
        }
        throw new AssertionError((Object)"FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
    }
    
    public final void m() {
        if (!this.f) {
            return;
        }
        throw new AssertionError((Object)"FlatBuffers: object serialization must not be nested.");
    }
    
    public final void n(int i, int b) {
        if (i > this.c) {
            this.c = i;
        }
        final int capacity = this.a.capacity();
        final int b2 = this.b;
        while (true) {
            final int n = ~(capacity - b2 + b) + 1 & i - 1;
            if (this.b >= n + i + b) {
                ByteBuffer a;
                for (i = 0; i < n; ++i) {
                    a = this.a;
                    b = this.b - 1;
                    a.put(this.b = b, (byte)0);
                }
                return;
            }
            final int capacity2 = this.a.capacity();
            final ByteBuffer a2 = this.a;
            final agpi l = this.l;
            final int capacity3 = a2.capacity();
            int n2;
            if (capacity3 == 0) {
                n2 = 1024;
            }
            else {
                n2 = 2147483639;
                if (capacity3 == 2147483639) {
                    throw new AssertionError((Object)"FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
                }
                if ((0xC0000000 & capacity3) == 0x0) {
                    n2 = capacity3 + capacity3;
                }
            }
            final ByteBuffer byteBuffer = (ByteBuffer)a2.position(0);
            final ByteBuffer a3 = l.a(n2);
            final ByteBuffer byteBuffer2 = (ByteBuffer)a3.position(a3.clear().capacity() - capacity3);
            a3.put(a2);
            this.a = a3;
            this.b += a3.capacity() - capacity2;
        }
    }
    
    public final void o(final int n) {
        this.a.putInt(this.b -= 4, n);
    }
    
    public final void p(final int n) {
        this.d[n] = this.e();
    }
    
    public final void q(final int e) {
        this.m();
        final int[] d = this.d;
        if (d == null || d.length < e) {
            this.d = new int[e];
        }
        this.e = e;
        Arrays.fill(this.d, 0, e, 0);
        this.f = true;
        this.h = this.e();
    }
    
    public final void r(int n, final int k, final int n2) {
        this.m();
        this.k = k;
        n *= k;
        this.n(4, n);
        this.n(n2, n);
        this.f = true;
    }
    
    public final void t(final int n, final float n2) {
        if (n2 != 0.0) {
            this.n(4, 0);
            this.a.putFloat(this.b -= 4, n2);
            this.p(n);
        }
    }
    
    public final void u(final int n, final int n2) {
        if (n2 != 0) {
            this.h(n2);
            this.p(n);
        }
    }
    
    public final void v(final int n, final int n2) {
        if (n2 != 0) {
            this.i(n2);
            this.p(n);
        }
    }
}
