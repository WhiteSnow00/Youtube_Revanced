import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfm
{
    final arvv a;
    final Object b;
    
    public asfm(final arvv a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final asfm asfm = (asfm)o;
                if (adkp.ae((Object)this.a, (Object)asfm.a) && adkp.ae(this.b, asfm.b)) {
                    return true;
                }
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
        ab.b("provider", (Object)this.a);
        ab.b("config", this.b);
        return ab.toString();
    }
}
