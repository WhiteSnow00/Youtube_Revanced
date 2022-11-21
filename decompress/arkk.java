import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkk extends arkh
{
    private short a;
    
    @Override
    public final String a() {
        return "roll";
    }
    
    @Override
    public final ByteBuffer b() {
        final ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.a);
        allocate.rewind();
        return allocate;
    }
    
    @Override
    public final void c(final ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a == ((arkk)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
}
