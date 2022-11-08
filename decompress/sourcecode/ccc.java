import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccc
{
    public final Bundle a;
    private ccj b;
    
    public ccc(final ccj b, final boolean b2) {
        if (b != null) {
            final Bundle a = new Bundle();
            this.a = a;
            this.b = b;
            a.putBundle("selector", b.b);
            a.putBoolean("activeScan", b2);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }
    
    private final void d() {
        if (this.b == null && (this.b = ccj.a(this.a.getBundle("selector"))) == null) {
            this.b = ccj.a;
        }
    }
    
    public final ccj a() {
        this.d();
        return this.b;
    }
    
    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }
    
    public final boolean c() {
        this.d();
        final ccj b = this.b;
        b.c();
        return !b.c.contains(null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ccc) {
            final ccc ccc = (ccc)o;
            if (this.a().equals(ccc.a()) && this.b() == ccc.b()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode() ^ (this.b() ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        sb.append(this.a());
        sb.append(", activeScan=");
        sb.append(this.b());
        sb.append(", isValid=");
        sb.append(this.c());
        sb.append(" }");
        return sb.toString();
    }
}
