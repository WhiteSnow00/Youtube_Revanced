import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aruo
{
    public final List a;
    public final arrg b;
    public final arum c;
    
    public aruo(final List list, final arrg b, final arum c) {
        this.a = Collections.unmodifiableList((List<?>)new ArrayList<Object>(list));
        b.getClass();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aruo)) {
            return false;
        }
        final aruo aruo = (aruo)o;
        return aeda.v(this.a, aruo.a) && aeda.v(this.b, aruo.b) && aeda.v(this.c, aruo.c);
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
        o.b("serviceConfig", (Object)this.c);
        return o.toString();
    }
}
