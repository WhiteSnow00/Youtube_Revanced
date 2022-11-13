// 
// Decompiled by Procyon v0.6.0
// 

public final class ghn
{
    public final ajel a;
    public final ajel b;
    
    public ghn() {
    }
    
    public ghn(final ajel a, final ajel b) {
        if (a == null) {
            throw new NullPointerException("Null interfaceOrientation");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null deviceOrientation");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ghn) {
            final ghn ghn = (ghn)o;
            if (this.a.equals(ghn.a) && this.b.equals(ghn.b)) {
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
        final StringBuilder sb = new StringBuilder("OrientationInfo{interfaceOrientation=");
        sb.append(string);
        sb.append(", deviceOrientation=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
