// 
// Decompiled by Procyon v0.6.0
// 

final class gdn extends gdj
{
    private final gdk a;
    private final gdk b;
    
    public gdn(final gdk a, final gdk b) {
        if (a == null) {
            throw new NullPointerException("Null currentState");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null toState");
    }
    
    @Override
    public gdk b() {
        return this.a;
    }
    
    @Override
    public gdk c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gdj) {
            final gdj gdj = (gdj)o;
            if (this.a.equals(gdj.b()) && this.b.equals(gdj.c())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder("ActiveStateChangedEvent{currentState=");
        sb.append(value);
        sb.append(", toState=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
