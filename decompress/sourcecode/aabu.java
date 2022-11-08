import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabu
{
    public final String a;
    public final long b;
    public final String[] c;
    public final long d;
    public final long e;
    
    public aabu(final String a, final long b, final String[] array, final long d) {
        a.getClass();
        this.a = a;
        this.b = b;
        array.getClass();
        this.c = array;
        this.d = d;
        this.e = 0L;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aabu)) {
            return false;
        }
        final aabu aabu = (aabu)o;
        if (aeda.v(this.a, aabu.a) && this.b == aabu.b && this.d == aabu.d && Arrays.equals(this.c, aabu.c)) {
            final long e = aabu.e;
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.d, 0L });
    }
}
