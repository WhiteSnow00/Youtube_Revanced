// 
// Decompiled by Procyon v0.6.0
// 

public final class aeec
{
    public final String a;
    public final String b;
    
    public aeec() {
    }
    
    public aeec(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aeec) {
            final aeec aeec = (aeec)o;
            final String a = this.a;
            if (a == null) {
                if (aeec.a != null) {
                    return false;
                }
            }
            else if (!a.equals(aeec.a)) {
                return false;
            }
            final String b = this.b;
            final String b2 = aeec.b;
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
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(a);
        sb.append(", appId=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
