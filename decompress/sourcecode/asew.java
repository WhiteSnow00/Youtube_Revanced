import java.util.Arrays;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asew
{
    public final String a;
    public final Map b;
    
    public asew(final String a, final Map b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof asew) {
            final asew asew = (asew)o;
            if (this.a.equals(asew.a) && this.b.equals(asew.b)) {
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
        final aexp o = agot.O((Object)this);
        o.b("policyName", (Object)this.a);
        o.b("rawConfigValue", (Object)this.b);
        return o.toString();
    }
}
