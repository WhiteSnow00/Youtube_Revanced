// 
// Decompiled by Procyon v0.6.0
// 

public final class fjn
{
    public final asie a;
    public final ashn b;
    
    public fjn() {
    }
    
    public fjn(final asie a, final ashn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fjn) {
            final fjn fjn = (fjn)o;
            if (this.a.equals(fjn.a) && this.b.equals(fjn.b)) {
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
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder("MultipleResponses{networkResponse=");
        sb.append(string);
        sb.append(", initialResponse=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
