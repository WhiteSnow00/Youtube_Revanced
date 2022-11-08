import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class asaq
{
    final int a;
    final long b;
    final Set c;
    
    public asaq(final int a, final long b, final Set set) {
        this.a = a;
        this.b = b;
        this.c = (Set)afdu.p((Collection)set);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final asaq asaq = (asaq)o;
                if (this.a == asaq.a && this.b == asaq.b && aeda.v((Object)this.c, (Object)asaq.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.f("maxAttempts", this.a);
        o.g("hedgingDelayNanos", this.b);
        o.b("nonFatalStatusCodes", this.c);
        return o.toString();
    }
}
