import java.util.Iterator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drt extends arfu
{
    public int a;
    public drn b;
    public final List c;
    
    public drt() {
        super("trun");
        this.c = new ArrayList();
    }
    
    protected final long h() {
        final int r = this.r();
        long n;
        if (0x1 != (r & 0x1)) {
            n = 8L;
        }
        else {
            n = 12L;
        }
        long n2 = n;
        if ((r & 0x4) == 0x4) {
            n2 = n + 4L;
        }
        long n3;
        if ((r & 0x100) == 0x100) {
            n3 = 4L;
        }
        else {
            n3 = 0L;
        }
        long n4 = n3;
        if ((r & 0x200) == 0x200) {
            n4 = n3 + 4L;
        }
        long n5 = n4;
        if ((r & 0x400) == 0x400) {
            n5 = n4 + 4L;
        }
        long n6 = n5;
        if ((r & 0x800) == 0x800) {
            n6 = n5 + 4L;
        }
        return n2 + n6 * this.c.size();
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        final long w = cln.w(byteBuffer);
        if ((this.r() & 0x1) == 0x1) {
            this.a = aqsy.q(cln.w(byteBuffer));
        }
        else {
            this.a = -1;
        }
        final int r = this.r();
        int n2;
        final int n = n2 = 0;
        if ((r & 0x4) == 0x4) {
            this.b = new drn(byteBuffer);
            n2 = n;
        }
        while (n2 < w) {
            final drs drs = new drs();
            if ((this.r() & 0x100) == 0x100) {
                drs.a = cln.w(byteBuffer);
            }
            if ((this.r() & 0x200) == 0x200) {
                drs.b = cln.w(byteBuffer);
            }
            if ((this.r() & 0x400) == 0x400) {
                drs.c = new drn(byteBuffer);
            }
            if ((this.r() & 0x800) == 0x800) {
                if (this.s() == 0) {
                    drs.d = cln.w(byteBuffer);
                }
                else {
                    drs.d = byteBuffer.getInt();
                }
            }
            this.c.add(drs);
            ++n2;
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        cln.m(byteBuffer, (long)this.c.size());
        final int r = this.r();
        if ((r & 0x1) == 0x1) {
            cln.m(byteBuffer, (long)this.a);
        }
        if ((r & 0x4) == 0x4) {
            this.b.a(byteBuffer);
        }
        for (final drs drs : this.c) {
            if ((r & 0x100) == 0x100) {
                cln.m(byteBuffer, drs.a);
            }
            if ((r & 0x200) == 0x200) {
                cln.m(byteBuffer, drs.b);
            }
            if ((r & 0x400) == 0x400) {
                drs.c.a(byteBuffer);
            }
            if ((r & 0x800) == 0x800) {
                if (this.s() == 0) {
                    cln.m(byteBuffer, drs.d);
                }
                else {
                    byteBuffer.putInt((int)drs.d);
                }
            }
        }
    }
    
    public final long k() {
        return this.c.size();
    }
    
    public final boolean l() {
        return (this.r() & 0x1) == 0x1;
    }
    
    public final boolean m() {
        return (this.r() & 0x800) == 0x800;
    }
    
    public final boolean n() {
        return (this.r() & 0x100) == 0x100;
    }
    
    public final boolean o() {
        return (this.r() & 0x400) == 0x400;
    }
    
    public final boolean p() {
        return (this.r() & 0x200) == 0x200;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TrackRunBox{sampleCount=");
        sb.append(this.c.size());
        sb.append(", dataOffset=");
        sb.append(this.a);
        sb.append(", dataOffsetPresent=");
        sb.append(this.l());
        sb.append(", sampleSizePresent=");
        sb.append(this.p());
        sb.append(", sampleDurationPresent=");
        sb.append(this.n());
        sb.append(", sampleFlagsPresentPresent=");
        sb.append(this.o());
        sb.append(", sampleCompositionTimeOffsetPresent=");
        sb.append(this.m());
        sb.append(", firstSampleFlags=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
