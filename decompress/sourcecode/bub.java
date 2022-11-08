import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bub
{
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;
    
    public bub(final int a, final byte[] b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final bub bub = (bub)o;
                if (this.a == bub.a && this.c == bub.c && this.d == bub.d && Arrays.equals(this.b, bub.b)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + Arrays.hashCode(this.b)) * 31 + this.c) * 31 + this.d;
    }
}
