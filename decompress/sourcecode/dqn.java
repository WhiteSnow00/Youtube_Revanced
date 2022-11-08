import java.nio.ByteBuffer;
import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqn extends ardf
{
    public Date a;
    public Date b;
    public long c;
    public arfo d;
    public long e;
    private long f;
    private double g;
    private float s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    
    public dqn() {
        super("mvhd");
        this.g = 1.0;
        this.s = 1.0f;
        this.d = arfo.a;
    }
    
    protected final long h() {
        long n;
        if (this.s() == 1) {
            n = 32L;
        }
        else {
            n = 20L;
        }
        return n + 80L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        if (this.s() == 1) {
            this.a = aqqm.p(clm.x(byteBuffer));
            this.b = aqqm.p(clm.x(byteBuffer));
            this.c = clm.w(byteBuffer);
            this.f = clm.x(byteBuffer);
        }
        else {
            this.a = aqqm.p(clm.w(byteBuffer));
            this.b = aqqm.p(clm.w(byteBuffer));
            this.c = clm.w(byteBuffer);
            this.f = clm.w(byteBuffer);
        }
        this.g = clm.q(byteBuffer);
        this.s = clm.r(byteBuffer);
        clm.t(byteBuffer);
        clm.w(byteBuffer);
        clm.w(byteBuffer);
        this.d = arfo.a(byteBuffer);
        this.t = byteBuffer.getInt();
        this.u = byteBuffer.getInt();
        this.v = byteBuffer.getInt();
        this.w = byteBuffer.getInt();
        this.x = byteBuffer.getInt();
        this.y = byteBuffer.getInt();
        this.e = clm.w(byteBuffer);
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        if (this.s() == 1) {
            byteBuffer.putLong(aqqm.o(this.a));
            byteBuffer.putLong(aqqm.o(this.b));
            clm.m(byteBuffer, this.c);
            byteBuffer.putLong(this.f);
        }
        else {
            clm.m(byteBuffer, aqqm.o(this.a));
            clm.m(byteBuffer, aqqm.o(this.b));
            clm.m(byteBuffer, this.c);
            clm.m(byteBuffer, this.f);
        }
        clm.i(byteBuffer, this.g);
        clm.j(byteBuffer, (double)this.s);
        clm.k(byteBuffer, 0);
        clm.m(byteBuffer, 0L);
        clm.m(byteBuffer, 0L);
        this.d.b(byteBuffer);
        byteBuffer.putInt(this.t);
        byteBuffer.putInt(this.u);
        byteBuffer.putInt(this.v);
        byteBuffer.putInt(this.w);
        byteBuffer.putInt(this.x);
        byteBuffer.putInt(this.y);
        clm.m(byteBuffer, this.e);
    }
    
    public final void k(final Date a) {
        this.a = a;
        if (aqqm.o(a) >= 4294967296L) {
            super.q = 1;
        }
    }
    
    public final void l(final long f) {
        this.f = f;
        if (f >= 4294967296L) {
            super.q = 1;
        }
    }
    
    public final void m(final Date b) {
        this.b = b;
        if (aqqm.o(b) >= 4294967296L) {
            super.q = 1;
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        sb.append(this.a);
        sb.append(";modificationTime=");
        sb.append(this.b);
        sb.append(";timescale=");
        sb.append(this.c);
        sb.append(";duration=");
        sb.append(this.f);
        sb.append(";rate=");
        sb.append(this.g);
        sb.append(";volume=");
        sb.append(this.s);
        sb.append(";matrix=");
        sb.append(this.d);
        sb.append(";nextTrackId=");
        sb.append(this.e);
        sb.append("]");
        return sb.toString();
    }
}
