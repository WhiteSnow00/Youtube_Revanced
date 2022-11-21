import java.security.KeyPair;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.ECPrivateKey;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbx implements agbq
{
    private final int a;
    private final agpb b;
    
    private agbx(final agpb b, final int a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public static agbx c(int n) {
        if (--n == 0) {
            return new agbx(new agpb("HmacSha256"), 1, null, null);
        }
        if (n != 1) {
            return new agbx(new agpb("HmacSha512"), 3, null, null);
        }
        return new agbx(new agpb("HmacSha384"), 2, null, null);
    }
    
    public final byte[] a() {
        final int n = this.a - 1;
        if (n == 0) {
            return agbw.c;
        }
        if (n != 1) {
            return agbw.e;
        }
        return agbw.d;
    }
    
    public final agnv b(final byte[] array) {
        final KeyPair c = aexq.C(this.a);
        final byte[] a = aexq.A((ECPrivateKey)c.getPrivate(), aexq.H(this.a, array));
        final byte[] i = aexq.I(this.a, ((ECPublicKey)c.getPublic()).getW());
        final byte[] k = aexq.K(new byte[][] { i, array });
        final byte[] d = agbw.d(this.a());
        final agpb b = this.b;
        return new agnv(b.E(a, k, d, b.A()), i);
    }
}
