import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iiv implements ijj
{
    private final flv a;
    private final ajhp b;
    
    public iiv(final flv a, final ajhp b) {
        this.a = a;
        this.b = b;
    }
    
    public final asht b() {
        if (this.b.equals(ajhp.d)) {
            return this.a.b();
        }
        return asht.X((Object)afiq.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof iiv) {
            final iiv iiv = (iiv)o;
            if (iiv.a.equals(this.a) && iiv.b.equals(this.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
}
