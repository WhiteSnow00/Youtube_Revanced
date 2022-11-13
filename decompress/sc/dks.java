import java.security.MessageDigest;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class dks implements ddn
{
    private final ByteBuffer a;
    private final int b;
    
    public dks(final int b) {
        this.b = b;
        this.a = ByteBuffer.allocate(4);
    }
    
    public dks(final int b, final byte[] array) {
        this.b = b;
        this.a = ByteBuffer.allocate(8);
    }
    
    @Override
    public final void a(final byte[] array, final Object o, final MessageDigest messageDigest) {
        if (this.b != 0) {
            final Long n = (Long)o;
            messageDigest.update(array);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(n).array());
                return;
            }
        }
        final Integer n2 = (Integer)o;
        if (n2 == null) {
            return;
        }
        messageDigest.update(array);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putInt(n2).array());
        }
    }
}
