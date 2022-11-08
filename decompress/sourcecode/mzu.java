// 
// Decompiled by Procyon v0.6.0
// 

public final class mzu
{
    public final aexq a;
    public final aexq b;
    
    public mzu() {
    }
    
    public mzu(final aexq a, final aexq b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mzu) {
            final mzu mzu = (mzu)o;
            if (this.a.equals((Object)mzu.a) && this.b.equals((Object)mzu.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ 0x79A31AAC;
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final StringBuilder sb = new StringBuilder("Identifiers{androidId=");
        sb.append(string);
        sb.append(", ssaidDerivative=Optional.absent()}");
        return sb.toString();
    }
}
