import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class agbp implements afyk
{
    private static final byte[] a;
    private final agfa b;
    private final agbq c;
    private final agbm d;
    private final agpb e;
    
    static {
        a = new byte[0];
    }
    
    public agbp(final agfa b, final agbq c, final agpb e, final agbm d, final byte[] array, final byte[] array2) {
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
        final agfa b = this.b;
        final agbq c2 = this.c;
        final agpb e = this.e;
        final agbm d = this.d;
        final agnv b2 = c2.b(b.d.I());
        final Object a = b2.a;
        final Object b3 = b2.b;
        final byte[] b4 = agbw.b(c2.a(), e.B(), d.b());
        final byte[] d2 = e.D(agbw.l, agbn.a, "psk_id_hash", b4);
        array = e.D(agbw.l, array, "info_hash", b4);
        array = aexq.K(new byte[][] { agbw.a, d2, array });
        final byte[] d3 = e.D((byte[])b3, agbn.a, "secret", b4);
        final byte[] c3 = e.C(d3, array, "key", b4, d.a());
        array = e.C(d3, array, "base_nonce", b4, 12);
        final agbn agbn = new agbn((byte[])a, c3, array, BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), d);
        c = agbn.b.c(agbn.c, agbn.a(), c, agbp.a);
        return aexq.K(new byte[][] { agbn.d, c });
    }
}
