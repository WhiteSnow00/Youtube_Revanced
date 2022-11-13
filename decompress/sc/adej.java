// 
// Decompiled by Procyon v0.6.0
// 

public final class adej
{
    public final Object a;
    public final int b;
    
    public adej() {
    }
    
    public adej(final Object a, final int b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null value");
    }
    
    public static adej a(final Object o, final int n) {
        return new adej(o, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof adej) {
            final adej adej = (adej)o;
            if (this.a.equals(adej.a) && this.b == adej.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final int b = this.b;
        String s;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    s = "INVALID";
                }
                else {
                    s = "STALE";
                }
            }
            else {
                s = "VALID";
            }
        }
        else {
            s = "UNKNOWN";
        }
        final StringBuilder sb = new StringBuilder("CacheEntry{value=");
        sb.append(string);
        sb.append(", state=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
}
