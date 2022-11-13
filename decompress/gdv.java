// 
// Decompiled by Procyon v0.6.0
// 

final class gdv extends gdr
{
    private final gds a;
    private final gds b;
    
    public gdv(final gds a, final gds b) {
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
    
    public gds b() {
        return this.a;
    }
    
    public gds c() {
        return this.b;
    }
    
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gdr) {
            final gdr gdr = (gdr)o;
            if (this.a.equals((Object)gdr.b()) && this.b.equals((Object)gdr.c())) {
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
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
