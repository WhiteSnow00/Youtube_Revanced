import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aryk
{
    public final List a;
    public final arwo b;
    public final Object c;
    
    public aryk(final List list, final arwo b, final Object c) {
        list.getClass();
        this.a = Collections.unmodifiableList((List<?>)new ArrayList<Object>(list));
        b.getClass();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aryk)) {
            return false;
        }
        final aryk aryk = (aryk)o;
        return aexq.c(this.a, aryk.a) && aexq.c(this.b, aryk.b) && aexq.c(this.c, aryk.c);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    @Override
    public final String toString() {
        final afbg ae = adme.ae(this);
        ae.b("addresses", this.a);
        ae.b("attributes", this.b);
        ae.b("loadBalancingPolicyConfig", this.c);
        return ae.toString();
    }
}
