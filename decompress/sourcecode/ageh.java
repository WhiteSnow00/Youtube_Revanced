import java.security.InvalidAlgorithmParameterException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ageh implements afve
{
    private final afzu a;
    private final int b;
    
    public ageh(final afzu a, final int b) {
        this.a = a;
        this.b = b;
        if (b >= 10) {
            a.a(new byte[0], b);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
    
    public final byte[] a(final byte[] array) {
        return this.a.a(array, this.b);
    }
}
