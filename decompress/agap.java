import java.util.Arrays;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class agap
{
    private final agan a;
    private final agan b;
    
    public agap(final byte[] array) {
        if (aewr.C(1)) {
            this.a = this.a(array, 1);
            this.b = this.a(array, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }
    
    public abstract agan a(final byte[] p0, final int p1);
    
    public final void b(final ByteBuffer byteBuffer, byte[] array, byte[] array2, byte[] array3) {
        final int remaining = byteBuffer.remaining();
        final int length = array2.length;
        if (remaining < length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        final int position = byteBuffer.position();
        final agan a = this.a;
        if (byteBuffer.remaining() < length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        final ByteBuffer wrap = ByteBuffer.wrap(array2);
        if (array.length == a.a()) {
            final int remaining2 = wrap.remaining();
            final int n = remaining2 / 64;
            int n2 = 0;
            while (true) {
                final int n3 = n + 1;
                if (n2 >= n3) {
                    break;
                }
                final ByteBuffer c = a.c(array, a.b + n2);
                if (n2 == n3 - 1) {
                    aexq.J(byteBuffer, wrap, c, remaining2 % 64);
                }
                else {
                    aexq.J(byteBuffer, wrap, c, 64);
                }
                ++n2;
            }
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            final ByteBuffer c2 = this.b.c(array, 0);
            array = new byte[32];
            c2.get(array);
            final int remaining3 = byteBuffer.remaining();
            final int n4 = remaining3 % 16;
            int n5;
            if (n4 == 0) {
                n5 = remaining3;
            }
            else {
                n5 = remaining3 + 16 - n4;
            }
            final ByteBuffer order = ByteBuffer.allocate(n5 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(array3);
            order.position(0);
            order.put(byteBuffer);
            order.position(n5);
            order.putLong(0L);
            order.putLong(remaining3);
            array3 = order.array();
            final long d = aewr.D(array, 0, 0);
            final long n6 = aewr.D(array, 3, 2) & 0x3FFFF03L;
            final long n7 = aewr.D(array, 6, 4) & 0x3FFC0FFL;
            final long n8 = aewr.D(array, 9, 6) & 0x3F03FFFL;
            final long n9 = aewr.D(array, 12, 8) & 0xFFFFFL;
            array2 = new byte[17];
            int n10 = 0;
            long n11 = 0L;
            long n12 = 0L;
            long n13 = 0L;
            long n14 = 0L;
            long n15 = 0L;
            while (true) {
                final int length2 = array3.length;
                if (n10 >= length2) {
                    break;
                }
                final int min = Math.min(16, length2 - n10);
                System.arraycopy(array3, n10, array2, 0, min);
                array2[min] = 1;
                if (min != 16) {
                    Arrays.fill(array2, min + 1, 17, (byte)0);
                }
                final long n16 = n9 * 5L;
                final long n17 = n8 * 5L;
                final long n18 = n7 * 5L;
                final long n19 = n15 + aewr.D(array2, 0, 0);
                final long n20 = n12 + aewr.D(array2, 3, 2);
                final long n21 = n11 + aewr.D(array2, 6, 4);
                final long n22 = n13 + aewr.D(array2, 9, 6);
                final long n23 = n14 + (aewr.D(array2, 12, 8) | (long)(array2[16] << 24));
                final long n24 = n19 * d + n20 * n16 + n21 * n17 + n22 * n18 + n6 * 5L * n23;
                final long n25 = n19 * n6 + n20 * d + n21 * n16 + n22 * n17 + n18 * n23 + (n24 >> 26);
                final long n26 = n19 * n7 + n20 * n6 + n21 * d + n22 * n16 + n17 * n23 + (n25 >> 26);
                final long n27 = n19 * n8 + n20 * n7 + n21 * n6 + n22 * d + n23 * n16 + (n26 >> 26);
                final long n28 = n19 * n9 + n20 * n8 + n21 * n7 + n22 * n6 + n23 * d + (n27 >> 26);
                final long n29 = (n24 & 0x3FFFFFFL) + (n28 >> 26) * 5L;
                n12 = (n25 & 0x3FFFFFFL) + (n29 >> 26);
                n10 += 16;
                n11 = (n26 & 0x3FFFFFFL);
                n13 = (n27 & 0x3FFFFFFL);
                n14 = (n28 & 0x3FFFFFFL);
                n15 = (n29 & 0x3FFFFFFL);
            }
            final long n30 = n11 + (n12 >> 26);
            final long n31 = n30 & 0x3FFFFFFL;
            final long n32 = n13 + (n30 >> 26);
            final long n33 = n32 & 0x3FFFFFFL;
            final long n34 = n14 + (n32 >> 26);
            final long n35 = n34 & 0x3FFFFFFL;
            final long n36 = n15 + (n34 >> 26) * 5L;
            final long n37 = n36 & 0x3FFFFFFL;
            final long n38 = n37 + 5L;
            final long n39 = (n12 & 0x3FFFFFFL) + (n36 >> 26);
            final long n40 = n39 + (n38 >> 26);
            final long n41 = (n40 >> 26) + n31;
            final long n42 = n33 + (n41 >> 26);
            final long n43 = n35 + (n42 >> 26) - 67108864L;
            final long n44 = n43 >> 63;
            final long n45 = ~n44;
            final long n46 = (n39 & n44) | (n40 & 0x3FFFFFFL & n45);
            final long n47 = (n41 & 0x3FFFFFFL & n45) | (n31 & n44);
            final long n48 = (n33 & n44) | (n42 & 0x3FFFFFFL & n45);
            final long n49 = (((n37 & n44) | (n38 & 0x3FFFFFFL & n45) | n46 << 26) & 0xFFFFFFFFL) + aewr.E(array, 16);
            final long e = aewr.E(array, 20);
            final long e2 = aewr.E(array, 24);
            final long e3 = aewr.E(array, 28);
            array = new byte[16];
            aewr.F(array, n49 & 0xFFFFFFFFL, 0);
            final long n50 = ((n47 << 20 | n46 >> 6) & 0xFFFFFFFFL) + e + (n49 >> 32);
            aewr.F(array, n50 & 0xFFFFFFFFL, 4);
            final long n51 = ((n47 >> 12 | n48 << 14) & 0xFFFFFFFFL) + e2 + (n50 >> 32);
            aewr.F(array, n51 & 0xFFFFFFFFL, 8);
            aewr.F(array, ((n48 >> 18 | ((n35 & n44) | (n43 & n45)) << 8) & 0xFFFFFFFFL) + e3 + (n51 >> 32) & 0xFFFFFFFFL, 12);
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(array);
            return;
        }
        final int a2 = a.a();
        final StringBuilder sb = new StringBuilder("The nonce length (in bytes) must be ");
        sb.append(a2);
        throw new GeneralSecurityException(sb.toString());
    }
}
