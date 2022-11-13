import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arim extends arhn
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
        cln.n(allocate, this.a);
        final int b = this.b;
        int n;
        if (!this.c) {
            n = 0;
        }
        else {
            n = 32;
        }
        cln.n(allocate, (b << 6) + n + this.d);
        cln.m(allocate, this.e);
        final long f = this.f;
        cln.k(allocate, (int)(f >> 32));
        cln.m(allocate, f & 0xFFFFFFFFL);
        cln.n(allocate, this.g);
        cln.k(allocate, this.h);
        cln.k(allocate, this.i);
        cln.n(allocate, this.j);
        cln.k(allocate, this.k);
        return (ByteBuffer)allocate.rewind();
    }
    
    public final void c(final ByteBuffer byteBuffer) {
        this.a = cln.v(byteBuffer);
        final int v = cln.v(byteBuffer);
        this.b = (v & 0xC0) >> 6;
        this.c = ((v & 0x20) > 0);
        this.d = (v & 0x1F);
        this.e = cln.w(byteBuffer);
        this.f = ((long)cln.t(byteBuffer) << 32) + cln.w(byteBuffer);
        this.g = cln.v(byteBuffer);
        this.h = cln.t(byteBuffer);
        this.i = cln.t(byteBuffer);
        this.j = cln.v(byteBuffer);
        this.k = cln.t(byteBuffer);
    }
    
    public final int d() {
        return 20;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arim arim = (arim)o;
            return this.a == arim.a && this.i == arim.i && this.k == arim.k && this.j == arim.j && this.h == arim.h && this.f == arim.f && this.g == arim.g && this.e == arim.e && this.d == arim.d && this.b == arim.b && this.c == arim.c;
        }
        return false;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c ? 1 : 0;
        final int d = this.d;
        final int n = (int)this.e;
        final long f = this.f;
        return (((((((((a * 31 + b) * 31 + c) * 31 + d) * 31 + n) * 31 + (int)(f ^ f >>> 32)) * 31 + this.g) * 31 + this.h) * 31 + this.i) * 31 + this.j) * 31 + this.k;
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
