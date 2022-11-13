import java.nio.ByteBuffer;
import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drh extends arfu
{
    public long a;
    public int b;
    public int c;
    public float d;
    public arid e;
    public double f;
    public double g;
    private Date s;
    private Date t;
    private long u;
    
    public drh() {
        super("tkhd");
        this.e = arid.a;
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
            this.s = aqsy.p(cln.x(byteBuffer));
            this.t = aqsy.p(cln.x(byteBuffer));
            this.a = cln.w(byteBuffer);
            cln.w(byteBuffer);
            final long long1 = byteBuffer.getLong();
            this.u = long1;
            if (long1 < -1L) {
                throw new RuntimeException("The tracks duration is bigger than Long.MAX_VALUE");
            }
        }
        else {
            this.s = aqsy.p(cln.w(byteBuffer));
            this.t = aqsy.p(cln.w(byteBuffer));
            this.a = cln.w(byteBuffer);
            cln.w(byteBuffer);
            this.u = cln.w(byteBuffer);
        }
        cln.w(byteBuffer);
        cln.w(byteBuffer);
        this.b = cln.t(byteBuffer);
        this.c = cln.t(byteBuffer);
        this.d = cln.r(byteBuffer);
        cln.t(byteBuffer);
        this.e = arid.a(byteBuffer);
        this.f = cln.q(byteBuffer);
        this.g = cln.q(byteBuffer);
    }
    
    public final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        if (this.s() == 1) {
            byteBuffer.putLong(aqsy.o(this.s));
            byteBuffer.putLong(aqsy.o(this.t));
            cln.m(byteBuffer, this.a);
            cln.m(byteBuffer, 0L);
            byteBuffer.putLong(this.u);
        }
        else {
            cln.m(byteBuffer, aqsy.o(this.s));
            cln.m(byteBuffer, aqsy.o(this.t));
            cln.m(byteBuffer, this.a);
            cln.m(byteBuffer, 0L);
            cln.m(byteBuffer, this.u);
        }
        cln.m(byteBuffer, 0L);
        cln.m(byteBuffer, 0L);
        cln.k(byteBuffer, this.b);
        cln.k(byteBuffer, this.c);
        cln.j(byteBuffer, (double)this.d);
        cln.k(byteBuffer, 0);
        this.e.b(byteBuffer);
        cln.i(byteBuffer, this.f);
        cln.i(byteBuffer, this.g);
    }
    
    public final void k(final Date s) {
        this.s = s;
        if (aqsy.o(s) >= 4294967296L) {
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
        if (aqsy.o(t) >= 4294967296L) {
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
