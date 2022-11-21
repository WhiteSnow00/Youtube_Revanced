import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arlf extends arkh
{
    int a;
    int b;
    
    @Override
    public final String a() {
        return "sync";
    }
    
    @Override
    public final ByteBuffer b() {
        final ByteBuffer allocate = ByteBuffer.allocate(1);
        cop.l(allocate, this.b + (this.a << 6));
        return (ByteBuffer)allocate.rewind();
    }
    
    @Override
    public final void c(final ByteBuffer byteBuffer) {
        final int i = coh.i(byteBuffer);
        this.a = (i & 0xC0) >> 6;
        this.b = (i & 0x3F);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arlf arlf = (arlf)o;
            return this.b == arlf.b && this.a == arlf.a;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(62);
        sb.append("SyncSampleEntry{reserved=");
        sb.append(a);
        sb.append(", nalUnitType=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
