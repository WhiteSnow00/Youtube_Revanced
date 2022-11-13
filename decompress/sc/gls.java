import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class gls
{
    private final Class a;
    private final byte[] b;
    
    public gls(final Class a, final byte[] array) {
        this.a = a;
        this.b = array.clone();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof gls)) {
            return false;
        }
        final gls gls = (gls)o;
        return this.a.equals(gls.a) && Arrays.equals(this.b, gls.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + Arrays.hashCode(this.b);
    }
}
