import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class glk
{
    private final Class a;
    private final byte[] b;
    
    public glk(final Class a, final byte[] array) {
        this.a = a;
        this.b = array.clone();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof glk)) {
            return false;
        }
        final glk glk = (glk)o;
        return this.a.equals(glk.a) && Arrays.equals(this.b, glk.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + Arrays.hashCode(this.b);
    }
}
