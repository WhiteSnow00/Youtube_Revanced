// 
// Decompiled by Procyon v0.6.0
// 

public final class iov
{
    public final int a;
    public final int b;
    
    public iov() {
    }
    
    public iov(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iov) {
            final iov iov = (iov)o;
            if (this.a == iov.a && this.b == iov.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String string = Integer.toString(this.b - 1);
        final StringBuilder sb = new StringBuilder("DownloadsPageDisclaimerSectionData{expiryDays=");
        sb.append(a);
        sb.append(", backgroundColor=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
