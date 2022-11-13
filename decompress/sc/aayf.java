// 
// Decompiled by Procyon v0.6.0
// 

public final class aayf
{
    public final String a;
    public final xab b;
    
    public aayf() {
    }
    
    public aayf(final String a, final xab b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof aayf) {
            final aayf aayf = (aayf)o;
            final String a = this.a;
            if (a == null) {
                if (aayf.a != null) {
                    return false;
                }
            }
            else if (!a.equals(aayf.a)) {
                return false;
            }
            if (this.b.equals((Object)aayf.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ this.b.a;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("WatchScreenParentInfo{parentCsn=");
        sb.append(a);
        sb.append(", parentVeType=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
