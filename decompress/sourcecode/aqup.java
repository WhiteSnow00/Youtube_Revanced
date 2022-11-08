import java.util.Locale;
import java.util.Arrays;
import j$.util.Objects;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqup
{
    public final long a;
    public final MessageDigest b;
    private final long c;
    private final boolean d;
    
    public aqup(final argq argq, final byte[] array) {
        this.a = argq.a;
        this.c = 0L;
        this.b = (MessageDigest)argq.b;
        this.d = false;
    }
    
    public static argq a() {
        return new argq((byte[])null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aqup)) {
            return false;
        }
        final aqup aqup = (aqup)o;
        if (this.a == aqup.a) {
            final long c = aqup.c;
            if (Objects.equals((Object)this.b, (Object)aqup.b)) {
                final boolean d = aqup.d;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, 0L, this.b, false });
    }
    
    @Override
    public final String toString() {
        return String.format(Locale.US, "TransferOptions[idleTimeout %d sec, resumableTransferThreshold=%d, digest=%s, forceMultipart=%s]", this.a, 0L, this.b, false);
    }
}
