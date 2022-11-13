import java.util.Arrays;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfl
{
    public final String a;
    public final Map b;
    
    public asfl(final String a, final Map b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof asfl) {
            final asfl asfl = (asfl)o;
            if (this.a.equals(asfl.a) && this.b.equals(asfl.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final aezo ab = adkp.ab((Object)this);
        ab.b("policyName", (Object)this.a);
        ab.b("rawConfigValue", (Object)this.b);
        return ab.toString();
    }
}
