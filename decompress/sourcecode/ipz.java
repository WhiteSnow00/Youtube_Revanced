// 
// Decompiled by Procyon v0.6.0
// 

public final class ipz
{
    public final String a;
    public final String b;
    public final Integer c;
    
    public ipz() {
    }
    
    public ipz(final String a, final String b, final Integer c) {
        if (a == null) {
            throw new NullPointerException("Null title");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null subtitle");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ipz) {
            final ipz ipz = (ipz)o;
            if (this.a.equals(ipz.a) && this.b.equals(ipz.b) && this.c.equals(ipz.c)) {
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
        final StringBuilder sb = new StringBuilder("SmartDownloadsErrorMessageData{title=");
        sb.append(a);
        sb.append(", subtitle=");
        sb.append(b);
        sb.append(", uiType=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
