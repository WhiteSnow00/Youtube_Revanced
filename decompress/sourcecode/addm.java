// 
// Decompiled by Procyon v0.6.0
// 

public final class addm
{
    public final String a;
    public final aiap b;
    
    public addm() {
    }
    
    public addm(final String a, final aiap b) {
        if (a == null) {
            throw new NullPointerException("Null filterChipBarId");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null browseFormData");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof addm) {
            final addm addm = (addm)o;
            if (this.a.equals(addm.a) && this.b.equals((Object)addm.b)) {
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
        final String a = this.a;
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("FilterState{filterChipBarId=");
        sb.append(a);
        sb.append(", browseFormData=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
