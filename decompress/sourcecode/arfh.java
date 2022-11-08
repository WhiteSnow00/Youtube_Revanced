import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfh extends arey
{
    private boolean a;
    private short b;
    
    public final String a() {
        return "rap ";
    }
    
    public final ByteBuffer b() {
        final ByteBuffer allocate = ByteBuffer.allocate(1);
        short n;
        if (!this.a) {
            n = 0;
        }
        else {
            n = 128;
        }
        allocate.put((byte)(n | this.b));
        allocate.rewind();
        return allocate;
    }
    
    public final void c(final ByteBuffer byteBuffer) {
        final byte value = byteBuffer.get();
        this.a = ((value & 0x80) == 0x80);
        this.b = (short)(value & 0x7F);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arfh arfh = (arfh)o;
            return this.b == arfh.b && this.a == arfh.a;
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a ? 1 : 0) * 31 + this.b;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("VisualRandomAccessEntry{numLeadingSamplesKnown=");
        sb.append(this.a);
        sb.append(", numLeadingSamples=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
