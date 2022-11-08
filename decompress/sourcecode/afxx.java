import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class afxx implements afur
{
    private static final byte[] a;
    private final agbh b;
    private final afxy c;
    private final afxu d;
    private final agli e;
    
    static {
        a = new byte[0];
    }
    
    public afxx(final agbh b, final afxy c, final agli e, final afxu d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    @Override
    public final byte[] a(byte[] c, byte[] array) {
        if (array == null) {
            array = new byte[0];
        }
        final agbh b = this.b;
        final afxy c2 = this.c;
        final agli e = this.e;
        final afxu d = this.d;
        final aseo b2 = c2.b(b.d.I());
        final Object a = b2.a;
        final Object b3 = b2.b;
        final byte[] b4 = afye.b(c2.a(), e.F(), d.b());
        final byte[] h = e.H(afye.l, afxv.a, "psk_id_hash", b4);
        array = e.H(afye.l, array, "info_hash", b4);
        array = aety.S(new byte[][] { afye.a, h, array });
        final byte[] h2 = e.H((byte[])b3, afxv.a, "secret", b4);
        final byte[] g = e.G(h2, array, "key", b4, d.a());
        array = e.G(h2, array, "base_nonce", b4, 12);
        final afxv afxv = new afxv((byte[])a, g, array, BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), d);
        c = afxv.b.c(afxv.c, afxv.a(), c, afxx.a);
        return aety.S(new byte[][] { afxv.d, c });
    }
}
