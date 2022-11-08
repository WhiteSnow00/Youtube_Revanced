import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class artm
{
    public final List a;
    public final arrg b;
    public final Object c;
    
    public artm(final List list, final arrg b, final Object c) {
        list.getClass();
        this.a = Collections.unmodifiableList((List<?>)new ArrayList<Object>(list));
        b.getClass();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof artm)) {
            return false;
        }
        final artm artm = (artm)o;
        return aeda.v(this.a, artm.a) && aeda.v(this.b, artm.b) && aeda.v(this.c, artm.c);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("addresses", (Object)this.a);
        o.b("attributes", (Object)this.b);
        o.b("loadBalancingPolicyConfig", this.c);
        return o.toString();
    }
}
