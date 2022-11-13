import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

final class dey implements ddk
{
    private final ddk b;
    private final ddk c;
    
    public dey(final ddk b, final ddk c) {
        this.b = b;
        this.c = c;
    }
    
    public final void a(final MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dey) {
            final dey dey = (dey)o;
            if (this.b.equals(dey.b) && this.c.equals(dey.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("DataCacheKey{sourceKey=");
        sb.append(value);
        sb.append(", signature=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
