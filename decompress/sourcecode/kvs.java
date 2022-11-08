import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvs
{
    public final Optional a;
    public final Optional b;
    
    public kvs() {
    }
    
    public kvs(final Optional a, final Optional b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kvs) {
            final kvs kvs = (kvs)o;
            if (this.a.equals((Object)kvs.a) && this.b.equals((Object)kvs.b)) {
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
        final StringBuilder sb = new StringBuilder("QueueItemChange{hideEnclosingEvent=");
        sb.append(string);
        sb.append(", dragReorderEvent=");
        sb.append(string2);
        sb.append("}");
        return sb.toString();
    }
}
