import java.nio.ByteBuffer;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class doo implements ddj
{
    private final int c;
    private final ddj d;
    
    public doo(final int c, final ddj d) {
        this.c = c;
        this.d = d;
    }
    
    public final void a(final MessageDigest messageDigest) {
        this.d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof doo) {
            final doo doo = (doo)o;
            if (this.c == doo.c && this.d.equals(doo.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return dpg.g((Object)this.d, this.c);
    }
}
