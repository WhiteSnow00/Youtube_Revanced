import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class agdt
{
    static final long[] a;
    static final long[] b;
    static final long[] c;
    static final agdq[][] d;
    static final agdq[] e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;
    
    static {
        final BigInteger bigInteger = f = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        final BigInteger bigInteger2 = g = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigInteger)).mod(bigInteger);
        final BigInteger bigInteger3 = h = BigInteger.valueOf(2L).multiply(bigInteger2).mod(bigInteger);
        final BigInteger bigInteger4 = i = BigInteger.valueOf(2L).modPow(bigInteger.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigInteger);
        agjc c2 = new agjc((byte[])null);
        c2.a = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigInteger)).mod(bigInteger);
        final BigInteger bigInteger5 = (BigInteger)c2.a;
        final BigInteger multiply = bigInteger5.pow(2).subtract(BigInteger.ONE).multiply(bigInteger2.multiply(bigInteger5.pow(2)).add(BigInteger.ONE).modInverse(bigInteger));
        BigInteger bigInteger7;
        final BigInteger bigInteger6 = bigInteger7 = multiply.modPow(bigInteger.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger);
        if (!bigInteger6.pow(2).subtract(multiply).mod(bigInteger).equals(BigInteger.ZERO)) {
            bigInteger7 = bigInteger6.multiply(bigInteger4).mod(bigInteger);
        }
        final int n = 0;
        BigInteger subtract = bigInteger7;
        if (bigInteger7.testBit(0)) {
            subtract = bigInteger.subtract(bigInteger7);
        }
        c2.b = subtract;
        a = agec.l(a(bigInteger2));
        b = agec.l(a(bigInteger3));
        c = agec.l(a(bigInteger4));
        d = new agdq[32][8];
        agjc c3 = c2;
        for (int j = 0; j < 32; ++j) {
            agjc c4 = c3;
            for (int k = 0; k < 8; ++k) {
                agdt.d[j][k] = b(c4);
                c4 = c(c4, c3);
            }
            for (int l = 0; l < 8; ++l) {
                c3 = c(c3, c3);
            }
        }
        final agjc c5 = c(c2, c2);
        e = new agdq[8];
        for (int n2 = n; n2 < 8; ++n2) {
            agdt.e[n2] = b(c2);
            c2 = c(c2, c5);
        }
    }
    
    private static byte[] a(final BigInteger bigInteger) {
        final byte[] array = new byte[32];
        final byte[] byteArray = bigInteger.toByteArray();
        final int length = byteArray.length;
        int i = 0;
        System.arraycopy(byteArray, 0, array, 32 - length, length);
        while (i < 16) {
            final byte b = array[i];
            final int n = 32 - i - 1;
            array[i] = array[n];
            array[n] = b;
            ++i;
        }
        return array;
    }
    
    private static agdq b(final agjc agjc) {
        final BigInteger add = ((BigInteger)agjc.a).add((BigInteger)agjc.b);
        final BigInteger f = agdt.f;
        return new agdq(agec.l(a(add.mod(f))), agec.l(a(((BigInteger)agjc.a).subtract((BigInteger)agjc.b).mod(f))), agec.l(a(agdt.h.multiply((BigInteger)agjc.b).multiply((BigInteger)agjc.a).mod(f))));
    }
    
    private static agjc c(final agjc agjc, final agjc agjc2) {
        final agjc agjc3 = new agjc((byte[])null);
        final BigInteger multiply = agdt.g.multiply(((BigInteger)agjc.b).multiply((BigInteger)agjc2.b).multiply((BigInteger)agjc.a).multiply((BigInteger)agjc2.a));
        final BigInteger f = agdt.f;
        final BigInteger mod = multiply.mod(f);
        agjc3.b = ((BigInteger)agjc.b).multiply((BigInteger)agjc2.a).add(((BigInteger)agjc2.b).multiply((BigInteger)agjc.a)).multiply(BigInteger.ONE.add(mod).modInverse(f)).mod(f);
        agjc3.a = ((BigInteger)agjc.a).multiply((BigInteger)agjc2.a).add(((BigInteger)agjc.b).multiply((BigInteger)agjc2.b)).multiply(BigInteger.ONE.subtract(mod).modInverse(f)).mod(f);
        return agjc3;
    }
}
