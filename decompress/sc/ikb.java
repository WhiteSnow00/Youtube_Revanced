// 
// Decompiled by Procyon v0.6.0
// 

public final class ikb
{
    public final Object a;
    public final long b;
    public final long c;
    public final long d;
    
    public ikb() {
    }
    
    public ikb(final Object a, final long b, final long c, final long d) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            return;
        }
        throw new NullPointerException("Null offlineStoreData");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ikb) {
            final ikb ikb = (ikb)o;
            if (this.a.equals(ikb.a) && this.b == ikb.b && this.c == ikb.c && this.d == ikb.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        return (((hashCode ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32)) * 1000003 ^ (int)(c ^ c >>> 32)) * 1000003 ^ (int)(d ^ d >>> 32);
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final StringBuilder sb = new StringBuilder("OfflineStoreDataAndLatenciesAndLatencyDiffUsec{offlineStoreData=");
        sb.append(string);
        sb.append(", latencyDiffUsec=");
        sb.append(b);
        sb.append(", offlineStoreLatencyUsec=");
        sb.append(c);
        sb.append(", entityStoreLatencyUsec=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
