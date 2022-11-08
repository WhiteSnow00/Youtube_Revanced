import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flf
{
    public final int a;
    public final afcr b;
    
    public flf() {
    }
    
    public flf(final int a, final afcr b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null downloadedEntities");
    }
    
    public static flf a(final int n, final afcr afcr) {
        return new flf(n, afcr);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof flf) {
            final flf flf = (flf)o;
            if (this.a == flf.a && adwd.ar((List)this.b, flf.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String string = this.b.toString();
        final StringBuilder sb = new StringBuilder("DownloadsDataResponse{downloadsCount=");
        sb.append(a);
        sb.append(", downloadedEntities=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
