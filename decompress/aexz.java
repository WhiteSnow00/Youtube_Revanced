import j$.util.Objects;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexz implements Serializable
{
    private static final long serialVersionUID = -8514239465808977353L;
    public final String a;
    public final Long b;
    
    public aexz(final String a) {
        this.a = a;
        this.b = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aexz)) {
            return false;
        }
        final aexz aexz = (aexz)o;
        if (Objects.equals((Object)this.a, (Object)aexz.a)) {
            final Long b = aexz.b;
            if (Objects.equals((Object)null, (Object)null)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, null });
    }
    
    @Override
    public final String toString() {
        final afbg ae = adme.ae(this);
        ae.b("tokenValue", this.a);
        ae.b("expirationTimeMillis", null);
        return ae.toString();
    }
}
