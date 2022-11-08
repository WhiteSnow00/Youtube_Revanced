import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class dho implements dhm
{
    private final /* synthetic */ int a;
    
    public dho(final int a) {
        this.a = a;
    }
    
    public final Class a() {
        if (this.a != 0) {
            return ByteBuffer.class;
        }
        return InputStream.class;
    }
}
