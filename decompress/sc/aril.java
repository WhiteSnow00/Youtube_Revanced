import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aril extends arhn
{
    int a;
    int b;
    
    public final String a() {
        return "sync";
    }
    
    public final ByteBuffer b() {
        final ByteBuffer allocate = ByteBuffer.allocate(1);
        cln.n(allocate, this.b + (this.a << 6));
        return (ByteBuffer)allocate.rewind();
    }
    
    public final void c(final ByteBuffer byteBuffer) {
        final int v = cln.v(byteBuffer);
        this.a = (v & 0xC0) >> 6;
        this.b = (v & 0x3F);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final aril aril = (aril)o;
            return this.b == aril.b && this.a == aril.a;
        }
        return false;
    }
    
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
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