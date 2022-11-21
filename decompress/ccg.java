import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ccg
{
    public final Bundle a;
    private ccn b;
    
    public ccg(final ccn b, final boolean b2) {
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
        if (this.b == null && (this.b = ccn.a(this.a.getBundle("selector"))) == null) {
            this.b = ccn.a;
        }
    }
    
    public final ccn a() {
        this.d();
        return this.b;
    }
    
    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }
    
    public final boolean c() {
        this.d();
        final ccn b = this.b;
        b.c();
        return !b.c.contains(null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ccg) {
            final ccg ccg = (ccg)o;
            if (this.a().equals(ccg.a()) && this.b() == ccg.b()) {
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
