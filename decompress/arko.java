import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arko extends arkh
{
    private boolean a;
    
    @Override
    public final String a() {
        return "tele";
    }
    
    @Override
    public final ByteBuffer b() {
        final ByteBuffer allocate = ByteBuffer.allocate(1);
        int n;
        if (!this.a) {
            n = 0;
        }
        else {
            n = 128;
        }
        allocate.put((byte)n);
        allocate.rewind();
        return allocate;
    }
    
    @Override
    public final void c(final ByteBuffer byteBuffer) {
        this.a = ((byteBuffer.get() & 0x80) == 0x80);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a == ((arko)o).a);
    }
    
    @Override
    public final int hashCode() {
        return (this.a ? 1 : 0) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TemporalLevelEntry{levelIndependentlyDecodable=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
