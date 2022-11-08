import java.io.OutputStream;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class agxm implements ahbb
{
    public final ahbb a() {
        throw null;
    }
    
    public final ahaw newBuilderForType() {
        throw null;
    }
    
    public final ahaw toBuilder() {
        throw null;
    }
    
    public final byte[] toByteArray() {
        try {
            agym.ak(new byte[this.getSerializedSize()]);
            throw null;
        }
        catch (final IOException ex) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ex);
        }
    }
    
    public final agyc toByteString() {
        throw null;
    }
    
    public final void writeDelimitedTo(final OutputStream outputStream) {
        throw null;
    }
    
    public final void writeTo(final agym agym) {
        throw null;
    }
    
    public final void writeTo(final OutputStream outputStream) {
        throw null;
    }
}
