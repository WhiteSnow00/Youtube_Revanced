import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class dhp implements dhn
{
    private final int a;
    
    public dhp(final int a) {
        this.a = a;
    }
    
    @Override
    public final Class a() {
        if (this.a != 0) {
            return ByteBuffer.class;
        }
        return InputStream.class;
    }
    
    @Override
    public final Object b(final byte[] array) {
        if (this.a != 0) {
            return ByteBuffer.wrap(array);
        }
        return new ByteArrayInputStream(array);
    }
}
