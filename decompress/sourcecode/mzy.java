// 
// Decompiled by Procyon v0.6.0
// 

public final class mzy
{
    private final String a;
    private final String b;
    private final Integer c;
    
    public mzy() {
    }
    
    public mzy(final String a, final String b, final Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mzy) {
            final mzy mzy = (mzy)o;
            if (this.a.equals(mzy.a) && this.b.equals(mzy.b) && this.c.equals(mzy.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final Integer c = this.c;
        final StringBuilder sb = new StringBuilder("SystemPropertiesInfo{vendorBuildFingerprint=");
        sb.append(a);
        sb.append(", bootVerifiedBootState=");
        sb.append(b);
        sb.append(", bootFlashLocked=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
