import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aryf
{
    public final List a;
    public final arwo b;
    private final Object[][] c;
    
    public aryf(final List a, final arwo b, final Object[][] c) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final afbg ae = adme.ae(this);
        ae.b("addrs", this.a);
        ae.b("attrs", this.b);
        ae.b("customOptions", Arrays.deepToString(this.c));
        return ae.toString();
    }
}
