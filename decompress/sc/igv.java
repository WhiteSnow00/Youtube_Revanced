import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igv
{
    public final Optional a;
    public final Optional b;
    public final Optional c;
    
    public igv() {
    }
    
    public igv(final Optional a, final Optional b, final Optional c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof igv) {
            final igv igv = (igv)o;
            if (this.a.equals((Object)igv.a) && this.b.equals((Object)igv.b) && this.c.equals((Object)igv.c)) {
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
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final String string3 = this.c.toString();
        final StringBuilder sb = new StringBuilder("MainVideoAssociatedEntities{playbackData=");
        sb.append(string);
        sb.append(", offlineVideoPolicy=");
        sb.append(string2);
        sb.append(", downloadState=");
        sb.append(string3);
        sb.append("}");
        return sb.toString();
    }
}
