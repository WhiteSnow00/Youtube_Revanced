// 
// Decompiled by Procyon v0.6.0
// 

public final class adci
{
    public final aepj a;
    private final aahc b;
    private final zvr c;
    
    public adci() {
    }
    
    public adci(final aepj a, final zvr c, final aahc b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adci) {
            final adci adci = (adci)o;
            if (this.a.equals((Object)adci.a) && this.c.equals((Object)adci.c) && this.b.equals((Object)adci.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.b.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("CachePolicy{expiryGenerator=");
        sb.append(value);
        sb.append(", keyConverter=");
        sb.append(value2);
        sb.append(", costGenerator=");
        sb.append(value3);
        sb.append(", cacheMissFetcher=null}");
        return sb.toString();
    }
}
