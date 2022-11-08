import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drm
{
    public boolean a;
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;
    private byte g;
    private int h;
    
    public drm() {
    }
    
    public drm(final ByteBuffer byteBuffer) {
        final long w = clm.w(byteBuffer);
        this.b = (byte)((0xFFFFFFFFF0000000L & w) >> 28);
        this.c = (byte)((0xC000000L & w) >> 26);
        this.d = (byte)((0x3000000L & w) >> 24);
        this.e = (byte)((0xC00000L & w) >> 22);
        this.f = (byte)((0x300000L & w) >> 20);
        this.g = (byte)((0xE0000L & w) >> 17);
        this.a = ((0x10000L & w) >> 16 > 0L);
        this.h = (int)(w & 0xFFFFL);
    }
    
    public final void a(final ByteBuffer byteBuffer) {
        clm.m(byteBuffer, (long)(this.b << 28) | (long)(this.c << 26) | (long)(this.d << 24) | (long)(this.e << 22) | (long)(this.f << 20) | (long)(this.g << 17) | (long)((this.a ? 1 : 0) << 16) | (long)this.h);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final drm drm = (drm)o;
            return this.c == drm.c && this.b == drm.b && this.h == drm.h && this.d == drm.d && this.f == drm.f && this.e == drm.e && this.a == drm.a && this.g == drm.g;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((((this.b * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + (this.a ? 1 : 0)) * 31 + this.h;
    }
    
    @Override
    public final String toString() {
        final byte b = this.b;
        final byte c = this.c;
        final byte d = this.d;
        final byte e = this.e;
        final byte f = this.f;
        final byte g = this.g;
        final boolean a = this.a;
        final int h = this.h;
        final StringBuilder sb = new StringBuilder(147);
        sb.append("SampleFlags{reserved=");
        sb.append(b);
        sb.append(", isLeading=");
        sb.append(c);
        sb.append(", depOn=");
        sb.append(d);
        sb.append(", isDepOn=");
        sb.append(e);
        sb.append(", hasRedundancy=");
        sb.append(f);
        sb.append(", padValue=");
        sb.append(g);
        sb.append(", isDiffSample=");
        sb.append(a);
        sb.append(", degradPrio=");
        sb.append(h);
        sb.append("}");
        return sb.toString();
    }
}
