// 
// Decompiled by Procyon v0.6.0
// 

public final class aeea
{
    public final int a;
    public final String b;
    
    public aeea() {
    }
    
    public aeea(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static aedz a() {
        final aedz aedz = new aedz();
        aedz.b(8150);
        return aedz;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aeea) {
            final aeea aeea = (aeea)o;
            if (this.a == aeea.a) {
                final String b = this.b;
                final String b2 = aeea.b;
                if (b == null) {
                    if (b2 != null) {
                        return false;
                    }
                }
                else if (!b.equals(b2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final String b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return (a ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(a);
        sb.append(", sessionToken=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
