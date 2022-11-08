import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bij implements azu
{
    public int b;
    public float c;
    public float d;
    public azs e;
    public azs f;
    public boolean g;
    public bii h;
    public long i;
    public long j;
    private azs k;
    private azs l;
    private ByteBuffer m;
    private ShortBuffer n;
    private ByteBuffer o;
    private boolean p;
    
    public bij() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.k = azs.a;
        final azs a = azs.a;
        this.l = a;
        this.e = a;
        this.f = a;
        final ByteBuffer a2 = bij.a;
        this.m = a2;
        this.n = a2.asShortBuffer();
        this.o = bij.a;
        this.b = -1;
    }
    
    public final azs a(final azs k) {
        if (k.d == 2) {
            int n;
            if ((n = this.b) == -1) {
                n = k.b;
            }
            this.k = k;
            final azs l = new azs(n, k.c, 2);
            this.l = l;
            this.g = true;
            return l;
        }
        throw new azt(k);
    }
    
    public final ByteBuffer b() {
        final bii h = this.h;
        if (h != null) {
            final int a = h.a();
            if (a > 0) {
                if (this.m.capacity() < a) {
                    final ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                    this.m = order;
                    this.n = order.asShortBuffer();
                }
                else {
                    this.m.clear();
                    this.n.clear();
                }
                final ShortBuffer n = this.n;
                final int min = Math.min(n.remaining() / h.a, h.i);
                n.put(h.h, 0, h.a * min);
                final int i = h.i - min;
                h.i = i;
                final short[] h2 = h.h;
                final int a2 = h.a;
                System.arraycopy(h2, min * a2, h2, 0, i * a2);
                this.j += a;
                this.m.limit(a);
                this.o = this.m;
            }
        }
        final ByteBuffer o = this.o;
        this.o = bij.a;
        return o;
    }
    
    public final void c() {
        if (this.g()) {
            this.e = this.k;
            this.f = this.l;
            if (this.g) {
                final azs e = this.e;
                this.h = new bii(e.b, e.c, this.c, this.d, this.f.b);
            }
            else {
                final bii h = this.h;
                if (h != null) {
                    h.g = 0;
                    h.i = 0;
                    h.j = 0;
                    h.k = 0;
                    h.l = 0;
                    h.m = 0;
                    h.n = 0;
                    h.o = 0;
                    h.p = 0;
                    h.q = 0;
                }
            }
        }
        this.o = bij.a;
        this.i = 0L;
        this.j = 0L;
        this.p = false;
    }
    
    public final void d() {
        final bii h = this.h;
        if (h != null) {
            final int g = h.g;
            final float b = h.b;
            final float c = h.c;
            final int i = h.i + (int)((g / (b / c) + h.j) / (h.d * c) + 0.5f);
            final short[] f = h.f;
            final int e = h.e;
            h.f = h.c(f, g, e + e + g);
            int n = 0;
            int n2;
            while (true) {
                final int e2 = h.e;
                n2 = e2 + e2;
                final int a = h.a;
                if (n >= n2 * a) {
                    break;
                }
                h.f[a * g + n] = 0;
                ++n;
            }
            h.g += n2;
            h.b();
            if (h.i > i) {
                h.i = i;
            }
            h.g = 0;
            h.m = 0;
            h.j = 0;
        }
        this.p = true;
    }
    
    public final void e(final ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        final bii h = this.h;
        dk.d((Object)h);
        final ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
        final int remaining = byteBuffer.remaining();
        this.i += remaining;
        final int remaining2 = shortBuffer.remaining();
        final int a = h.a;
        final int n = remaining2 / a;
        final int n2 = a * n;
        shortBuffer.get(h.f = h.c(h.f, h.g, n), h.g * h.a, (n2 + n2) / 2);
        h.g += n;
        h.b();
        byteBuffer.position(byteBuffer.position() + remaining);
    }
    
    public final void f() {
        this.c = 1.0f;
        this.d = 1.0f;
        this.k = azs.a;
        final azs a = azs.a;
        this.l = a;
        this.e = a;
        this.f = a;
        final ByteBuffer a2 = bij.a;
        this.m = a2;
        this.n = a2.asShortBuffer();
        this.o = bij.a;
        this.b = -1;
        this.g = false;
        this.h = null;
        this.i = 0L;
        this.j = 0L;
        this.p = false;
    }
    
    public final boolean g() {
        final int b = this.l.b;
        boolean b2 = false;
        if (b != -1) {
            if (Math.abs(this.c - 1.0f) < 1.0E-4f && Math.abs(this.d - 1.0f) < 1.0E-4f) {
                if (this.l.b != this.k.b) {
                    return true;
                }
                b2 = b2;
            }
            else {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean h() {
        final boolean p = this.p;
        boolean b = false;
        if (p) {
            final bii h = this.h;
            if (h != null) {
                if (h.a() == 0) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final void i(final float c) {
        if (this.c != c) {
            this.c = c;
            this.g = true;
        }
    }
}
