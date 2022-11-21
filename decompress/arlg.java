import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arlg extends arkh
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
    
    @Override
    public final String a() {
        return "tscl";
    }
    
    @Override
    public final ByteBuffer b() {
        final ByteBuffer allocate = ByteBuffer.allocate(20);
        cop.l(allocate, this.a);
        final int b = this.b;
        int n;
        if (!this.c) {
            n = 0;
        }
        else {
            n = 32;
        }
        cop.l(allocate, (b << 6) + n + this.d);
        cop.k(allocate, this.e);
        final long f = this.f;
        cop.i(allocate, (int)(f >> 32));
        cop.k(allocate, f & 0xFFFFFFFFL);
        cop.l(allocate, this.g);
        cop.i(allocate, this.h);
        cop.i(allocate, this.i);
        cop.l(allocate, this.j);
        cop.i(allocate, this.k);
        return (ByteBuffer)allocate.rewind();
    }
    
    @Override
    public final void c(final ByteBuffer byteBuffer) {
        this.a = coh.i(byteBuffer);
        final int i = coh.i(byteBuffer);
        this.b = (i & 0xC0) >> 6;
        this.c = ((i & 0x20) > 0);
        this.d = (i & 0x1F);
        this.e = coh.j(byteBuffer);
        this.f = ((long)coh.g(byteBuffer) << 32) + coh.j(byteBuffer);
        this.g = coh.i(byteBuffer);
        this.h = coh.g(byteBuffer);
        this.i = coh.g(byteBuffer);
        this.j = coh.i(byteBuffer);
        this.k = coh.g(byteBuffer);
    }
    
    @Override
    public final int d() {
        return 20;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arlg arlg = (arlg)o;
            return this.a == arlg.a && this.i == arlg.i && this.k == arlg.k && this.j == arlg.j && this.h == arlg.h && this.f == arlg.f && this.g == arlg.g && this.e == arlg.e && this.d == arlg.d && this.b == arlg.b && this.c == arlg.c;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c ? 1 : 0;
        final int d = this.d;
        final int n = (int)this.e;
        final long f = this.f;
        return (((((((((a * 31 + b) * 31 + c) * 31 + d) * 31 + n) * 31 + (int)(f ^ f >>> 32)) * 31 + this.g) * 31 + this.h) * 31 + this.i) * 31 + this.j) * 31 + this.k;
    }
    
    @Override
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
