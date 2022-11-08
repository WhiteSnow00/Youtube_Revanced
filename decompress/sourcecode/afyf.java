import java.security.KeyPair;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.ECPrivateKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afyf implements afxy
{
    private final int a;
    private final agli b;
    
    private afyf(final agli b, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public static afyf c(int n) {
        if (--n == 0) {
            return new afyf(new agli("HmacSha256"), 1, null, null, null);
        }
        if (n != 1) {
            return new afyf(new agli("HmacSha512"), 3, null, null, null);
        }
        return new afyf(new agli("HmacSha384"), 2, null, null, null);
    }
    
    public final byte[] a() {
        final int n = this.a - 1;
        if (n == 0) {
            return afye.c;
        }
        if (n != 1) {
            return afye.e;
        }
        return afye.d;
    }
    
    public final aseo b(byte[] s) {
        final KeyPair k = aety.K(this.a);
        final byte[] i = aety.I((ECPrivateKey)k.getPrivate(), aety.P(this.a, s));
        final byte[] q = aety.Q(this.a, ((ECPublicKey)k.getPublic()).getW());
        s = aety.S(new byte[][] { q, s });
        final byte[] d = afye.d(this.a());
        final agli b = this.b;
        return new aseo(b.I(i, s, d, b.E()), q);
    }
}
