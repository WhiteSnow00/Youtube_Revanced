// 
// Decompiled by Procyon v0.6.0
// 

public final class aekg
{
    public final String a;
    public final aekf b;
    
    public aekg() {
    }
    
    public aekg(final String a, final aekf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aekg) {
            final aekg aekg = (aekg)o;
            if (this.a.equals(aekg.a) && this.b.equals(aekg.b)) {
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
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("AccountProviderConfig{type=");
        sb.append(a);
        sb.append(", provider=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
