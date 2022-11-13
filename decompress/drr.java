import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drr extends arfu
{
    public long a;
    public long b;
    public long c;
    public long d;
    public drn e;
    private long f;
    private boolean g;
    private boolean s;
    
    public drr() {
        super("tfhd");
        this.b = -1L;
        this.c = -1L;
        this.d = -1L;
    }
    
    protected final long h() {
        final int r = this.r();
        long n;
        if (0x1 != (r & 0x1)) {
            n = 8L;
        }
        else {
            n = 16L;
        }
        long n2 = n;
        if ((r & 0x2) == 0x2) {
            n2 = n + 4L;
        }
        long n3 = n2;
        if ((r & 0x8) == 0x8) {
            n3 = n2 + 4L;
        }
        long n4 = n3;
        if ((r & 0x10) == 0x10) {
            n4 = n3 + 4L;
        }
        long n5 = n4;
        if ((r & 0x20) == 0x20) {
            n5 = n4 + 4L;
        }
        return n5;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        this.a = cln.w(byteBuffer);
        if ((this.r() & 0x1) == 0x1) {
            this.b = cln.x(byteBuffer);
        }
        if ((this.r() & 0x2) == 0x2) {
            this.f = cln.w(byteBuffer);
        }
        if ((this.r() & 0x8) == 0x8) {
            this.c = cln.w(byteBuffer);
        }
        if ((this.r() & 0x10) == 0x10) {
            this.d = cln.w(byteBuffer);
        }
        if ((this.r() & 0x20) == 0x20) {
            this.e = new drn(byteBuffer);
        }
        if ((this.r() & 0x10000) == 0x10000) {
            this.g = true;
        }
        if ((this.r() & 0x20000) == 0x20000) {
            this.s = true;
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        cln.m(byteBuffer, this.a);
        if ((this.r() & 0x1) == 0x1) {
            byteBuffer.putLong(this.b);
        }
        if ((this.r() & 0x2) == 0x2) {
            cln.m(byteBuffer, this.f);
        }
        if ((this.r() & 0x8) == 0x8) {
            cln.m(byteBuffer, this.c);
        }
        if ((this.r() & 0x10) == 0x10) {
            cln.m(byteBuffer, this.d);
        }
        if ((this.r() & 0x20) == 0x20) {
            this.e.a(byteBuffer);
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TrackFragmentHeaderBox{trackId=");
        sb.append(this.a);
        sb.append(", baseDataOffset=");
        sb.append(this.b);
        sb.append(", sampleDescriptionIndex=");
        sb.append(this.f);
        sb.append(", defaultSampleDuration=");
        sb.append(this.c);
        sb.append(", defaultSampleSize=");
        sb.append(this.d);
        sb.append(", defaultSampleFlags=");
        sb.append(this.e);
        sb.append(", durationIsEmpty=");
        sb.append(this.g);
        sb.append(", defaultBaseIsMoof=");
        sb.append(this.s);
        sb.append('}');
        return sb.toString();
    }
}
