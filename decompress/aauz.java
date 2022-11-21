import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aauz
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    public aauz(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof aauz)) {
            return false;
        }
        final aauz aauz = (aauz)o;
        return this.a == aauz.a && this.c == aauz.c && this.d == aauz.d && this.b == aauz.b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d });
    }
}
