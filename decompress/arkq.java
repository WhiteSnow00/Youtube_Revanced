import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkq extends arkh
{
    private boolean a;
    private short b;
    
    @Override
    public final String a() {
        return "rap ";
    }
    
    @Override
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
    
    @Override
    public final void c(final ByteBuffer byteBuffer) {
        final byte value = byteBuffer.get();
        this.a = ((value & 0x80) == 0x80);
        this.b = (short)(value & 0x7F);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final arkq arkq = (arkq)o;
            return this.b == arkq.b && this.a == arkq.a;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ? 1 : 0) * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("VisualRandomAccessEntry{numLeadingSamplesKnown=");
        sb.append(this.a);
        sb.append(", numLeadingSamples=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
