import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhq extends arhn
{
    private short a;
    
    public final String a() {
        return "roll";
    }
    
    public final ByteBuffer b() {
        final ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.a);
        allocate.rewind();
        return allocate;
    }
    
    public final void c(final ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a == ((arhq)o).a);
    }
    
    public final int hashCode() {
        return this.a;
    }
}
