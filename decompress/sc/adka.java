import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adka
{
    public final Optional a;
    public final Optional b;
    
    public adka() {
    }
    
    public adka(final Optional a, final Optional b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adka) {
            final adka adka = (adka)o;
            if (this.a.equals((Object)adka.a) && this.b.equals((Object)adka.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ThumbnailMetadata{frameTimestampUs=");
        sb.append(value);
        sb.append(", isVertical=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
