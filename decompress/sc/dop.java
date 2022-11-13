import java.nio.ByteBuffer;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dop implements ddk
{
    public static final int b = 0;
    private final int c;
    private final ddk d;
    
    public dop(final int c, final ddk d) {
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        this.d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dop) {
            final dop dop = (dop)o;
            if (this.c == dop.c && this.d.equals(dop.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return dph.f((Object)this.d, this.c);
    }
}
