import java.nio.ByteBuffer;
import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drg extends ardf
{
    public long a;
    public int b;
    public int c;
    public float d;
    public arfo e;
    public double f;
    public double g;
    private Date s;
    private Date t;
    private long u;
    
    public drg() {
        super("tkhd");
        this.e = arfo.a;
    }
    
    protected final long h() {
        long n;
        if (this.s() == 1) {
            n = 36L;
        }
        else {
            n = 24L;
        }
        return n + 60L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        if (this.s() == 1) {
            this.s = aqqm.p(clm.x(byteBuffer));
            this.t = aqqm.p(clm.x(byteBuffer));
            this.a = clm.w(byteBuffer);
            clm.w(byteBuffer);
            final long long1 = byteBuffer.getLong();
            this.u = long1;
            if (long1 < -1L) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        }
        else {
            this.s = aqqm.p(clm.w(byteBuffer));
            this.t = aqqm.p(clm.w(byteBuffer));
            this.a = clm.w(byteBuffer);
            clm.w(byteBuffer);
            this.u = clm.w(byteBuffer);
        }
        clm.w(byteBuffer);
        clm.w(byteBuffer);
        this.b = clm.t(byteBuffer);
        this.c = clm.t(byteBuffer);
        this.d = clm.r(byteBuffer);
        clm.t(byteBuffer);
        this.e = arfo.a(byteBuffer);
        this.f = clm.q(byteBuffer);
        this.g = clm.q(byteBuffer);
    }
    
    public final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        if (this.s() == 1) {
            byteBuffer.putLong(aqqm.o(this.s));
            byteBuffer.putLong(aqqm.o(this.t));
            clm.m(byteBuffer, this.a);
            clm.m(byteBuffer, 0L);
            byteBuffer.putLong(this.u);
        }
        else {
            clm.m(byteBuffer, aqqm.o(this.s));
            clm.m(byteBuffer, aqqm.o(this.t));
            clm.m(byteBuffer, this.a);
            clm.m(byteBuffer, 0L);
            clm.m(byteBuffer, this.u);
        }
        clm.m(byteBuffer, 0L);
        clm.m(byteBuffer, 0L);
        clm.k(byteBuffer, this.b);
        clm.k(byteBuffer, this.c);
        clm.j(byteBuffer, (double)this.d);
        clm.k(byteBuffer, 0);
        this.e.b(byteBuffer);
        clm.i(byteBuffer, this.f);
        clm.i(byteBuffer, this.g);
    }
    
    public final void k(final Date s) {
        this.s = s;
        if (aqqm.o(s) >= 4294967296L) {
            super.q = 1;
        }
    }
    
    public final void l(final long u) {
        this.u = u;
        if (u >= 4294967296L) {
            super.r = 1;
        }
    }
    
    public final void m(final boolean b) {
        if (b) {
            super.r = (this.r() | 0x1);
            return;
        }
        super.r = (this.r() & 0xFFFFFFFE);
    }
    
    public final void n(final boolean b) {
        if (b) {
            super.r = (this.r() | 0x2);
            return;
        }
        super.r = (this.r() & 0xFFFFFFFD);
    }
    
    public final void o(final Date t) {
        this.t = t;
        if (aqqm.o(t) >= 4294967296L) {
            super.q = 1;
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TrackHeaderBox[creationTime=");
        sb.append(this.s);
        sb.append(";modificationTime=");
        sb.append(this.t);
        sb.append(";trackId=");
        sb.append(this.a);
        sb.append(";duration=");
        sb.append(this.u);
        sb.append(";layer=");
        sb.append(this.b);
        sb.append(";alternateGroup=");
        sb.append(this.c);
        sb.append(";volume=");
        sb.append(this.d);
        sb.append(";matrix=");
        sb.append(this.e);
        sb.append(";width=");
        sb.append(this.f);
        sb.append(";height=");
        sb.append(this.g);
        sb.append("]");
        return sb.toString();
    }
}
