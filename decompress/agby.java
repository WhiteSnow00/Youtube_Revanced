import java.security.GeneralSecurityException;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agby implements agbq
{
    private final agpb a;
    
    public agby(final agpb a, final byte[] array, final byte[] array2) {
        this.a = a;
    }
    
    public final byte[] a() {
        if (Arrays.equals(this.a.B(), agbw.f)) {
            return agbw.b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
    
    public final agnv b(byte[] k) {
        final byte[] i = aexq.k();
        final byte[] j = aexq.j(i, k);
        final byte[] l = aexq.l(i);
        k = aexq.K(new byte[][] { l, k });
        final byte[] d = agbw.d(agbw.b);
        final agpb a = this.a;
        return new agnv(a.E(j, k, d, a.A()), l);
    }
}
