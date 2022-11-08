import java.util.Arrays;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afwx
{
    private final afwv a;
    private final afwv b;
    
    public afwx(final byte[] array) {
        if (aesy.ao(1)) {
            this.a = this.a(array, 1);
            this.b = this.a(array, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }
    
    public abstract afwv a(final byte[] p0, final int p1);
    
    public final void b(final ByteBuffer byteBuffer, byte[] array, byte[] array2, byte[] array3) {
        final int remaining = byteBuffer.remaining();
        final int length = array2.length;
        if (remaining < length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        final int position = byteBuffer.position();
        final afwv a = this.a;
        if (byteBuffer.remaining() < length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        final ByteBuffer wrap = ByteBuffer.wrap(array2);
        if (array.length == a.a()) {
            final int remaining2 = wrap.remaining();
            for (int n = remaining2 / 64 + 1, i = 0; i < n; ++i) {
                final ByteBuffer c = a.c(array, a.b + i);
                if (i == n - 1) {
                    aety.R(byteBuffer, wrap, c, remaining2 % 64);
                }
                else {
                    aety.R(byteBuffer, wrap, c, 64);
                }
            }
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            final ByteBuffer c2 = this.b.c(array, 0);
            array = new byte[32];
            c2.get(array);
            final int remaining3 = byteBuffer.remaining();
            final int n2 = remaining3 % 16;
            int n3;
            if (n2 == 0) {
                n3 = remaining3;
            }
            else {
                n3 = remaining3 + 16 - n2;
            }
            final ByteBuffer order = ByteBuffer.allocate(n3 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(array3);
            order.position(0);
            order.put(byteBuffer);
            order.position(n3);
            order.putLong(0L);
            order.putLong(remaining3);
            array2 = order.array();
            final long ap = aesy.ap(array, 0, 0);
            final long n4 = aesy.ap(array, 3, 2) & 0x3FFFF03L;
            final long n5 = aesy.ap(array, 6, 4) & 0x3FFC0FFL;
            final long n6 = aesy.ap(array, 9, 6) & 0x3F03FFFL;
            final long n7 = aesy.ap(array, 12, 8) & 0xFFFFFL;
            final long n8 = n5 * 5L;
            final long n9 = n6 * 5L;
            final long n10 = n7 * 5L;
            array3 = new byte[17];
            int n11 = 0;
            long n12 = 0L;
            long n13 = 0L;
            long n14 = 0L;
            long n15 = 0L;
            long n16 = 0L;
            final long n17 = n4;
            while (true) {
                final int length2 = array2.length;
                if (n11 >= length2) {
                    break;
                }
                final int min = Math.min(16, length2 - n11);
                System.arraycopy(array2, n11, array3, 0, min);
                array3[min] = 1;
                if (min != 16) {
                    Arrays.fill(array3, min + 1, 17, (byte)0);
                }
                final long n18 = n16 + aesy.ap(array3, 0, 0);
                final long n19 = n13 + aesy.ap(array3, 3, 2);
                final long n20 = n12 + aesy.ap(array3, 6, 4);
                final long n21 = n14 + aesy.ap(array3, 9, 6);
                final long n22 = n15 + (aesy.ap(array3, 12, 8) | (long)(array3[16] << 24));
                final long n23 = n18 * ap + n19 * n10 + n20 * n9 + n21 * n8 + n22 * (n4 * 5L);
                final long n24 = n18 * n17 + n19 * ap + n20 * n10 + n21 * n9 + n22 * n8 + (n23 >> 26);
                final long n25 = n18 * n5 + n19 * n17 + n20 * ap + n21 * n10 + n22 * n9 + (n24 >> 26);
                final long n26 = n18 * n6 + n19 * n5 + n20 * n17 + n21 * ap + n22 * n10 + (n25 >> 26);
                final long n27 = n18 * n7 + n19 * n6 + n20 * n5 + n21 * n17 + n22 * ap + (n26 >> 26);
                n15 = (n27 & 0x3FFFFFFL);
                final long n28 = (n23 & 0x3FFFFFFL) + (n27 >> 26) * 5L;
                n16 = (n28 & 0x3FFFFFFL);
                n13 = (n24 & 0x3FFFFFFL) + (n28 >> 26);
                n11 += 16;
                n14 = (n26 & 0x3FFFFFFL);
                n12 = (n25 & 0x3FFFFFFL);
            }
            final long n29 = n12 + (n13 >> 26);
            final long n30 = n29 & 0x3FFFFFFL;
            final long n31 = n14 + (n29 >> 26);
            final long n32 = n31 & 0x3FFFFFFL;
            final long n33 = n15 + (n31 >> 26);
            final long n34 = n33 & 0x3FFFFFFL;
            final long n35 = n16 + (n33 >> 26) * 5L;
            final long n36 = n35 & 0x3FFFFFFL;
            final long n37 = (n13 & 0x3FFFFFFL) + (n35 >> 26);
            final long n38 = n36 + 5L;
            final long n39 = n37 + (n38 >> 26);
            final long n40 = n30 + (n39 >> 26);
            final long n41 = n32 + (n40 >> 26);
            final long n42 = n34 + (n41 >> 26) - 67108864L;
            final long n43 = n42 >> 63;
            final long n44 = ~n43;
            final long n45 = (n37 & n43) | (n39 & 0x3FFFFFFL & n44);
            final long n46 = (n30 & n43) | (n40 & 0x3FFFFFFL & n44);
            final long n47 = (n32 & n43) | (n41 & 0x3FFFFFFL & n44);
            final long n48 = (((n36 & n43) | (n38 & 0x3FFFFFFL & n44) | n45 << 26) & 0xFFFFFFFFL) + aesy.aq(array, 16);
            final long n49 = ((n45 >> 6 | n46 << 20) & 0xFFFFFFFFL) + aesy.aq(array, 20) + (n48 >> 32);
            final long n50 = ((n46 >> 12 | n47 << 14) & 0xFFFFFFFFL) + aesy.aq(array, 24) + (n49 >> 32);
            final long aq = aesy.aq(array, 28);
            array = new byte[16];
            aesy.ar(array, n48 & 0xFFFFFFFFL, 0);
            aesy.ar(array, n49 & 0xFFFFFFFFL, 4);
            aesy.ar(array, n50 & 0xFFFFFFFFL, 8);
            aesy.ar(array, ((n47 >> 18 | ((n34 & n43) | (n42 & n44)) << 8) & 0xFFFFFFFFL) + aq + (n50 >> 32) & 0xFFFFFFFFL, 12);
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(array);
            return;
        }
        final StringBuilder sb = new StringBuilder("The nonce length (in bytes) must be ");
        sb.append(a.a());
        throw new GeneralSecurityException(sb.toString());
    }
}
