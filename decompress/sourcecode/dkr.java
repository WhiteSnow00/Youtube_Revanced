import java.security.MessageDigest;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class dkr implements ddm
{
    private final ByteBuffer a;
    private final /* synthetic */ int b;
    
    public dkr(final int b) {
        this.b = b;
        this.a = ByteBuffer.allocate(4);
    }
    
    public dkr(final int b, final byte[] array) {
        this.b = b;
        this.a = ByteBuffer.allocate(8);
    }
}
