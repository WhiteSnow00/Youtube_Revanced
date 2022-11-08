import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfx extends arey
{
    int a;
    int b;
    boolean c;
    int d;
    long e;
    long f;
    int g;
    int h;
    int i;
    int j;
    int k;
    
    public final String a() {
        return "tscl";
    }
    
    public final ByteBuffer b() {
        final ByteBuffer allocate = ByteBuffer.allocate(20);
        clm.n(allocate, this.a);
        final int b = this.b;
        int n;
        if (!this.c) {
            n = 0;
        }
        else {
            n = 32;
        }
        clm.n(allocate, (b << 6) + n + this.d);
        clm.m(allocate, this.e);
        final long f = this.f;
        clm.k(allocate, (int)(f >> 32));
        clm.m(allocate, f & 0xFFFFFFFFL);
        clm.n(allocate, this.g);
        clm.k(allocate, this.h);
        clm.k(allocate, this.i);
        clm.n(allocate, this.j);
        clm.k(allocate, this.k);
        return (ByteBuffer)allocate.rewind();
    }
    
    public final void c(final ByteBuffer byteBuffer) {
        this.a = clm.v(byteBuffer);
        final int v = clm.v(byteBuffer);
        this.b = (v & 0xC0) >> 6;
        this.c = ((v & 0x20) > 0);
        this.d = (v & 0x1F);
        this.e = clm.w(byteBuffer);
        this.f = ((long)clm.t(byteBuffer) << 32) + clm.w(byteBuffer);
        this.g = clm.v(byteBuffer);
        this.h = clm.t(byteBuffer);
        this.i = clm.t(byteBuffer);
        this.j = clm.v(byteBuffer);
        this.k = clm.t(byteBuffer);
    }
    
    public final int d() {
        return 20;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arfx arfx = (arfx)o;
            return this.a == arfx.a && this.i == arfx.i && this.k == arfx.k && this.j == arfx.j && this.h == arfx.h && this.f == arfx.f && this.g == arfx.g && this.e == arfx.e && this.d == arfx.d && this.b == arfx.b && this.c == arfx.c;
        }
        return false;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c ? 1 : 0;
        final int d = this.d;
        final long e = this.e;
        final long f = this.f;
        return (((((((((a * 31 + b) * 31 + c) * 31 + d) * 31 + (int)e) * 31 + (int)(f >>> 32 ^ f)) * 31 + this.g) * 31 + this.h) * 31 + this.i) * 31 + this.j) * 31 + this.k;
    }
    
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final boolean c = this.c;
        final int d = this.d;
        final long e = this.e;
        final long f = this.f;
        final int g = this.g;
        final int h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        final StringBuilder sb = new StringBuilder(369);
        sb.append("TemporalLayerSampleGroup{temporalLayerId=");
        sb.append(a);
        sb.append(", tlprofile_space=");
        sb.append(b);
        sb.append(", tltier_flag=");
        sb.append(c);
        sb.append(", tlprofile_idc=");
        sb.append(d);
        sb.append(", tlprofile_compatibility_flags=");
        sb.append(e);
        sb.append(", tlconstraint_indicator_flags=");
        sb.append(f);
        sb.append(", tllevel_idc=");
        sb.append(g);
        sb.append(", tlMaxBitRate=");
        sb.append(h);
        sb.append(", tlAvgBitRate=");
        sb.append(i);
        sb.append(", tlConstantFrameRate=");
        sb.append(j);
        sb.append(", tlAvgFrameRate=");
        sb.append(k);
        sb.append("}");
        return sb.toString();
    }
}
