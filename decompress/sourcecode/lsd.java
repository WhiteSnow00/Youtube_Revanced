import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsd
{
    public final String a;
    public final byte[] b;
    
    public lsd(final String a, final byte[] array) {
        this.a = a;
        this.b = (byte[])jfi.R((Object)array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof lsd)) {
            return false;
        }
        if (o == this) {
            return true;
        }
        final lsd lsd = (lsd)o;
        return this.a.equals(lsd.a) && Arrays.equals(this.b, lsd.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + Arrays.hashCode(this.b) * 31;
    }
}
