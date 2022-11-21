import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzm
{
    public final List a;
    public final arwo b;
    public final arzk c;
    
    public arzm(final List list, final arwo b, final arzk c) {
        this.a = Collections.unmodifiableList((List<?>)new ArrayList<Object>(list));
        b.getClass();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof arzm)) {
            return false;
        }
        final arzm arzm = (arzm)o;
        return aexq.c(this.a, arzm.a) && aexq.c(this.b, arzm.b) && aexq.c(this.c, arzm.c);
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
        ae.b("serviceConfig", this.c);
        return ae.toString();
    }
}
