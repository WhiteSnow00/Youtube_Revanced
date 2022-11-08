import java.security.GeneralSecurityException;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afyg implements afxy
{
    private final agli a;
    
    public afyg(final agli a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
    }
    
    public final byte[] a() {
        if (Arrays.equals(this.a.F(), afye.f)) {
            return afye.b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
    
    public final aseo b(byte[] d) {
        final byte[] q = aety.q();
        final byte[] p = aety.p(q, d);
        final byte[] r = aety.r(q);
        final byte[] s = aety.S(new byte[][] { r, d });
        d = afye.d(afye.b);
        final agli a = this.a;
        return new aseo(a.I(p, s, d, a.E()), r);
    }
}
