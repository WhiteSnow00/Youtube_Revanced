import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flm
{
    public final int a;
    public final afeq b;
    
    public flm() {
    }
    
    public flm(final int a, final afeq b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null downloadedEntities");
    }
    
    public static flm a(final int n, final afeq afeq) {
        return new flm(n, afeq);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof flm) {
            final flm flm = (flm)o;
            if (this.a == flm.a && agpi.V((List)this.b, (Object)flm.b)) {
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
