// 
// Decompiled by Procyon v0.6.0
// 

public final class addv
{
    public final amqs a;
    public final int b;
    
    public addv() {
    }
    
    public addv(final amqs a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof addv) {
            final addv addv = (addv)o;
            if (this.a.equals((Object)addv.a)) {
                final int b = this.b;
                final int b2 = addv.b;
                if (b == 0) {
                    throw null;
                }
                if (b == b2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        if (b != 0) {
            return (hashCode ^ 0xF4243) * 1000003 ^ b;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        String s;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    s = "null";
                }
                else {
                    s = "WIFI";
                }
            }
            else {
                s = "CELLULAR";
            }
        }
        else {
            s = "OTHER";
        }
        final StringBuilder sb = new StringBuilder("NetworkSignalsResult{effectiveConnectionType=");
        sb.append(value);
        sb.append(", networkTransportType=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
}
