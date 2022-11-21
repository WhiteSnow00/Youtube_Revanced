import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abku
{
    public final Optional a;
    public final Optional b;
    public final Optional c;
    
    public abku() {
    }
    
    public abku(final Optional a, final Optional b, final Optional c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof abku) {
            final abku abku = (abku)o;
            if (this.a.equals((Object)abku.a) && this.b.equals((Object)abku.b) && this.c.equals((Object)abku.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder("ClientDrivenWatchNextParameters{formData=");
        sb.append(value);
        sb.append(", priority=");
        sb.append(value2);
        sb.append(", watchNextType=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
