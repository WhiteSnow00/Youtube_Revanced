import j$.util.Objects;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lxg
{
    public final byte[] a;
    public final int b;
    public final int c;
    
    public lxg(final byte[] a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof lxg)) {
            return false;
        }
        final lxg lxg = (lxg)o;
        return Arrays.equals(this.a, lxg.a) && this.b == lxg.b && this.c == lxg.c;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { Arrays.hashCode(this.a), this.b, this.c });
    }
}
