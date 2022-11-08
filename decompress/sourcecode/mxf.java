// 
// Decompiled by Procyon v0.6.0
// 

public final class mxf
{
    public final String a;
    public final boolean b;
    public final boolean c;
    
    public mxf() {
    }
    
    public mxf(final String a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mxf) {
            final mxf mxf = (mxf)o;
            if (this.a.equals(mxf.a) && this.b == mxf.b && this.c == mxf.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final boolean b = this.b;
        int n = 1237;
        int n2;
        if (!b) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.c) {
            n = 1231;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder("AdShield2Options{clientVersion=");
        sb.append(a);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(b);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
