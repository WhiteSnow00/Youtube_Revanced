// 
// Decompiled by Procyon v0.6.0
// 

public final class aeky
{
    private final String a;
    private final String b;
    
    public aeky() {
    }
    
    public aeky(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aeky) {
            final aeky aeky = (aeky)o;
            if (this.a.equals(aeky.a) && this.b.equals(aeky.b)) {
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
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("TypeAndUserId{type=");
        sb.append(a);
        sb.append(", userId=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
