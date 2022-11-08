import java.security.GeneralSecurityException;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class afxv
{
    public static final byte[] a;
    public final afxu b;
    public final byte[] c;
    public final byte[] d;
    private final BigInteger e;
    private final byte[] f;
    private BigInteger g;
    
    static {
        a = new byte[0];
    }
    
    public afxv(final byte[] d, final byte[] c, final byte[] f, final BigInteger e, final afxu b) {
        this.d = d;
        this.c = c;
        this.f = f;
        this.g = BigInteger.ZERO;
        this.e = e;
        this.b = b;
    }
    
    public final byte[] a() {
        synchronized (this) {
            final byte[] t = aety.T(this.f, aety.u(this.g, 12));
            if (this.g.compareTo(this.e) < 0) {
                this.g = this.g.add(BigInteger.ONE);
                return t;
            }
            throw new GeneralSecurityException("message limit reached");
        }
    }
}
