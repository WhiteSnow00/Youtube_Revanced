// 
// Decompiled by Procyon v0.6.0
// 

public final class jwj
{
    public final aexq a;
    public final ajbr b;
    
    public jwj() {
    }
    
    public jwj(final aexq a, final ajbr b) {
        if (a == null) {
            throw new NullPointerException("Null entity");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null renderer");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof jwj) {
            final jwj jwj = (jwj)o;
            if (this.a.equals((Object)jwj.a) && this.b.equals(jwj.b)) {
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
        final StringBuilder sb = new StringBuilder("LogoDataWrapper{entity=");
        sb.append(string);
        sb.append(", renderer=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
