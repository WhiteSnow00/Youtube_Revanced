import java.util.Locale;
import java.util.Arrays;
import j$.util.Objects;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzy
{
    public final long a;
    public final MessageDigest b;
    private final long c;
    private final boolean d;
    
    public aqzy(final arlz arlz, final byte[] array) {
        this.a = arlz.a;
        this.c = 0L;
        this.b = (MessageDigest)arlz.b;
        this.d = false;
    }
    
    public static arlz a() {
        return new arlz((byte[])null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aqzy)) {
            return false;
        }
        final aqzy aqzy = (aqzy)o;
        if (this.a == aqzy.a) {
            final long c = aqzy.c;
            if (Objects.equals((Object)this.b, (Object)aqzy.b)) {
                final boolean d = aqzy.d;
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
