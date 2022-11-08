import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arth
{
    public final List a;
    public final arrg b;
    private final Object[][] c;
    
    public arth(final List a, final arrg b, final Object[][] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = array;
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("addrs", (Object)this.a);
        o.b("attrs", (Object)this.b);
        o.b("customOptions", (Object)Arrays.deepToString(this.c));
        return o.toString();
    }
}
