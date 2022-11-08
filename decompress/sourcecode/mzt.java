// 
// Decompiled by Procyon v0.6.0
// 

public final class mzt
{
    private final String a;
    private final aexq b;
    
    public mzt() {
    }
    
    public mzt(final String a, final aexq b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null appPackage");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mzt) {
            final mzt mzt = (mzt)o;
            if (this.a.equals(mzt.a) && this.b.equals((Object)mzt.b)) {
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
        final StringBuilder sb = new StringBuilder("CallerInfo{appPackage=");
        sb.append(a);
        sb.append(", appVersionCode=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
