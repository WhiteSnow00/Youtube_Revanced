// 
// Decompiled by Procyon v0.6.0
// 

public final class hwd
{
    public final vns a;
    public final aiqj b;
    public final boolean c;
    
    protected hwd() {
    }
    
    public hwd(final vns a, final aiqj b, final boolean c) {
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null navigationEndpoint");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hwd) {
            final hwd hwd = (hwd)o;
            if (this.a.equals(hwd.a) && ((ahbh)this.b).equals((Object)hwd.b) && this.c == hwd.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = ((ahbh)this.b).hashCode();
        int n;
        if (!this.c) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String string = this.b.toString();
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder("BrowseFragmentBrowseServiceRequest{request=");
        sb.append(value);
        sb.append(", navigationEndpoint=");
        sb.append(string);
        sb.append(", shouldLogEarlyNewScreen=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
