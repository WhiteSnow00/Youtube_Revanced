import java.util.logging.Logger;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arew extends arek
{
    private ByteBuffer a;
    
    static {
        Logger.getLogger(arew.class.getName());
    }
    
    public final void a(final ByteBuffer byteBuffer) {
        this.a = (ByteBuffer)byteBuffer.slice().limit(super.U);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("UnknownDescriptor{tag=");
        sb.append(this.T);
        sb.append(", sizeOfInstance=");
        sb.append(this.U);
        sb.append(", data=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }
}
