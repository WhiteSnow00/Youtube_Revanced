// 
// Decompiled by Procyon v0.6.0
// 

public final class aadz
{
    public aexq a;
    public aexq b;
    public aexq c;
    public zyq d;
    public int e;
    private aexq f;
    private long g;
    private long h;
    private double i;
    private boolean j;
    private aexq k;
    private aexq l;
    private int m;
    private byte n;
    
    public aadz() {
    }
    
    public aadz(final byte[] array) {
        final aewp a = aewp.a;
        this.a = a;
        this.f = a;
        this.k = a;
        this.l = a;
        this.b = a;
        this.c = a;
    }
    
    public final aaea a() {
        if (this.n == 31) {
            final int e = this.e;
            if (e != 0) {
                return new aaea(e, this.a, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.b, this.c, this.d);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" type");
        }
        if ((this.n & 0x1) == 0x0) {
            sb.append(" transferSize");
        }
        if ((this.n & 0x2) == 0x0) {
            sb.append(" bytesTransferred");
        }
        if ((this.n & 0x4) == 0x0) {
            sb.append(" transferSpeedBytesPerSecond");
        }
        if ((this.n & 0x8) == 0x0) {
            sb.append(" usingDataToDownloadStreams");
        }
        if ((this.n & 0x10) == 0x0) {
            sb.append(" statusReason");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final long h) {
        this.h = h;
        this.n |= 0x2;
    }
    
    public final void c(final amtj amtj) {
        this.l = aexq.k((Object)amtj);
    }
    
    public final void d(final zyw zyw) {
        this.k = aexq.k((Object)zyw);
    }
    
    public final void e(final int m) {
        this.m = m;
        this.n |= 0x10;
    }
    
    public final void f(final String s) {
        this.f = aexq.k((Object)s);
    }
    
    public final void g(final long g) {
        this.g = g;
        this.n |= 0x1;
    }
    
    public final void h(final double i) {
        this.i = i;
        this.n |= 0x4;
    }
    
    public final void i(final boolean j) {
        this.j = j;
        this.n |= 0x8;
    }
}
