import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agds
{
    static final byte[] a;
    private static final agdq b;
    private static final ahbd c;
    
    static {
        b = new agdq(new long[] { 1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L }, new long[] { 1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L }, new long[] { 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L });
        c = new ahbd(new auip(new long[] { 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L }, new long[] { 1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L }, new long[] { 1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L }), new long[] { 1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L }, (byte[])null, (byte[])null);
        a = new byte[] { -19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16 };
    }
    
    public static int a(final long[] array) {
        return agec.k(array)[0] & 0x1;
    }
    
    public static void b(final long[] array, final long[] array2) {
        for (int i = 0; i < array2.length; ++i) {
            array[i] = -array2[i];
        }
    }
    
    public static boolean c(final long[] array) {
        final long[] array2 = new long[11];
        System.arraycopy(array, 0, array2, 0, 10);
        agec.e(array2);
        final byte[] k = agec.k(array2);
        for (int i = 0; i < 32; ++i) {
            if (k[i] != 0) {
                return true;
            }
        }
        return false;
    }
    
    static boolean d(byte[] array, final byte[] array2, final byte[] array3) {
        if (array2.length != 64) {
            return false;
        }
        final byte[] copyOfRange = Arrays.copyOfRange(array2, 32, 64);
        int i = 31;
        while (i >= 0) {
            final int n = copyOfRange[i] & 0xFF;
            final int n2 = agds.a[i] & 0xFF;
            if (n != n2) {
                if (n >= n2) {
                    break;
                }
                final MessageDigest messageDigest = (MessageDigest)agdz.d.a("SHA-512");
                messageDigest.update(array2, 0, 32);
                messageDigest.update(array3);
                messageDigest.update(array);
                array = messageDigest.digest();
                final long h = h(array, 0);
                final long j = i(array, 2);
                final long h2 = h(array, 5);
                final long k = i(array, 7);
                final long l = i(array, 10);
                final long h3 = h(array, 13);
                final long m = i(array, 15);
                final long h4 = h(array, 18);
                final long h5 = h(array, 21);
                final long i2 = i(array, 23);
                final long h6 = h(array, 26);
                final long i3 = i(array, 28);
                final long i4 = i(array, 31);
                final long h7 = h(array, 34);
                final long i5 = i(array, 36);
                final long h8 = h(array, 39);
                final long h9 = h(array, 42);
                final long i6 = i(array, 44);
                final long n3 = h(array, 47) >> 2 & 0x1FFFFFL;
                final long n4 = i(array, 49) >> 7 & 0x1FFFFFL;
                final long n5 = i(array, 52) >> 4 & 0x1FFFFFL;
                final long n6 = h(array, 55) >> 1 & 0x1FFFFFL;
                final long n7 = i(array, 57) >> 6 & 0x1FFFFFL;
                final long n8 = i(array, 60) >> 3;
                final long n9 = (h9 & 0x1FFFFFL) - n8 * 683901L;
                final long n10 = (i5 >> 6 & 0x1FFFFFL) - n8 * 997805L + n7 * 136657L - n6 * 683901L;
                final long n11 = (i4 >> 4 & 0x1FFFFFL) + n8 * 470296L + n7 * 654183L - n6 * 997805L + n5 * 136657L - n4 * 683901L;
                final long n12 = (m >> 6 & 0x1FFFFFL) + n3 * 666643L;
                final long n13 = (h5 & 0x1FFFFFL) + n5 * 666643L + n4 * 470296L + n3 * 654183L;
                final long n14 = (h6 >> 2 & 0x1FFFFFL) + n7 * 666643L + n6 * 470296L + n5 * 654183L - n4 * 997805L + n3 * 136657L;
                final long n15 = n12 + 1048576L >> 21;
                final long n16 = (h4 >> 3) + n4 * 666643L + n3 * 470296L + n15;
                final long n17 = n13 + 1048576L >> 21;
                final long n18 = (i2 >> 5 & 0x1FFFFFL) + n6 * 666643L + n5 * 470296L + n4 * 654183L - n3 * 997805L + n17;
                final long n19 = n14 + 1048576L >> 21;
                final long n20 = (i3 >> 7 & 0x1FFFFFL) + n8 * 666643L + n7 * 470296L + n6 * 654183L - n5 * 997805L + n4 * 136657L - n3 * 683901L + n19;
                final long n21 = n11 + 1048576L >> 21;
                final long n22 = (h7 >> 1 & 0x1FFFFFL) + n8 * 654183L - n7 * 997805L + n6 * 136657L - n5 * 683901L + n21;
                final long n23 = n10 + 1048576L >> 21;
                final long n24 = (h8 >> 3) + n8 * 136657L - n7 * 683901L + n23;
                final long n25 = n9 + 1048576L >> 21;
                final long n26 = (i6 >> 5 & 0x1FFFFFL) + n25;
                final long n27 = n16 + 1048576L >> 21;
                final long n28 = n18 + 1048576L >> 21;
                final long n29 = n20 + 1048576L >> 21;
                final long n30 = n11 - (n21 << 21) + n29;
                final long n31 = n22 + 1048576L >> 21;
                final long n32 = n10 - (n23 << 21) + n31;
                final long n33 = n22 - (n31 << 21);
                final long n34 = n24 + 1048576L >> 21;
                final long n35 = n9 - (n25 << 21) + n34;
                final long n36 = n24 - (n34 << 21);
                final long n37 = n14 - (n19 << 21) + n28 - n26 * 683901L;
                final long n38 = n13 - (n17 << 21) + n27 - n26 * 997805L + n35 * 136657L - n36 * 683901L;
                final long n39 = n12 - (n15 << 21) + n26 * 470296L + n35 * 654183L - n36 * 997805L + n32 * 136657L - n33 * 683901L;
                final long n40 = (h & 0x1FFFFFL) + n30 * 666643L;
                final long n41 = (h2 >> 2 & 0x1FFFFFL) + n32 * 666643L + n33 * 470296L + n30 * 654183L;
                final long n42 = (l >> 4 & 0x1FFFFFL) + n35 * 666643L + n36 * 470296L + n32 * 654183L - n33 * 997805L + n30 * 136657L;
                final long n43 = n40 + 1048576L >> 21;
                final long n44 = (j >> 5 & 0x1FFFFFL) + n33 * 666643L + n30 * 470296L + n43;
                final long n45 = n41 + 1048576L >> 21;
                final long n46 = (k >> 7 & 0x1FFFFFL) + n36 * 666643L + n32 * 470296L + n33 * 654183L - n30 * 997805L + n45;
                final long n47 = n42 + 1048576L >> 21;
                final long n48 = (h3 >> 1 & 0x1FFFFFL) + n26 * 666643L + n35 * 470296L + n36 * 654183L - n32 * 997805L + n33 * 136657L - n30 * 683901L + n47;
                final long n49 = n39 + 1048576L >> 21;
                final long n50 = n16 - (n27 << 21) + n26 * 654183L - n35 * 997805L + n36 * 136657L - n32 * 683901L + n49;
                final long n51 = n38 + 1048576L >> 21;
                final long n52 = n18 - (n28 << 21) + n26 * 136657L - n35 * 683901L + n51;
                final long n53 = n37 + 1048576L >> 21;
                final long n54 = n20 - (n29 << 21) + n53;
                final long n55 = n44 + 1048576L >> 21;
                final long n56 = n46 + 1048576L >> 21;
                final long n57 = n48 + 1048576L >> 21;
                final long n58 = n50 + 1048576L >> 21;
                final long n59 = n52 + 1048576L >> 21;
                final long n60 = n54 + 1048576L >> 21;
                final long n61 = n40 - (n43 << 21) + n60 * 666643L;
                final long n62 = n61 >> 21;
                final long n63 = n44 - (n55 << 21) + n60 * 470296L + n62;
                final long n64 = n63 >> 21;
                final long n65 = n41 - (n45 << 21) + n55 + n60 * 654183L + n64;
                final long n66 = n65 >> 21;
                final long n67 = n46 - (n56 << 21) - n60 * 997805L + n66;
                final long n68 = n67 >> 21;
                final long n69 = n42 - (n47 << 21) + n56 + n60 * 136657L + n68;
                final long n70 = n69 >> 21;
                final long n71 = n48 - (n57 << 21) - n60 * 683901L + n70;
                final long n72 = n71 >> 21;
                final long n73 = n39 - (n49 << 21) + n57 + n72;
                final long n74 = n73 >> 21;
                final long n75 = n50 - (n58 << 21) + n74;
                final long n76 = n75 >> 21;
                final long n77 = n38 - (n51 << 21) + n58 + n76;
                final long n78 = n77 >> 21;
                final long n79 = n52 - (n59 << 21) + n78;
                final long n80 = n79 >> 21;
                final long n81 = n37 - (n53 << 21) + n59 + n80;
                final long n82 = n81 >> 21;
                final long n83 = n54 - (n60 << 21) + n82;
                final long n84 = n83 >> 21;
                final long n85 = n61 - (n62 << 21) + 666643L * n84;
                final long n86 = n85 >> 21;
                final long n87 = n63 - (n64 << 21) + 470296L * n84 + n86;
                final long n88 = n85 - (n86 << 21);
                final long n89 = n87 >> 21;
                final long n90 = n65 - (n66 << 21) + 654183L * n84 + n89;
                final long n91 = n87 - (n89 << 21);
                final long n92 = n90 >> 21;
                final long n93 = n67 - (n68 << 21) - 997805L * n84 + n92;
                final long n94 = n90 - (n92 << 21);
                final long n95 = n93 >> 21;
                final long n96 = n69 - (n70 << 21) + 136657L * n84 + n95;
                final long n97 = n93 - (n95 << 21);
                final long n98 = n96 >> 21;
                final long n99 = n71 - (n72 << 21) - 683901L * n84 + n98;
                final long n100 = n96 - (n98 << 21);
                final long n101 = n99 >> 21;
                final long n102 = n73 - (n74 << 21) + n101;
                final long n103 = n99 - (n101 << 21);
                final long n104 = n102 >> 21;
                final long n105 = n75 - (n76 << 21) + n104;
                final long n106 = n102 - (n104 << 21);
                final long n107 = n105 >> 21;
                final long n108 = n77 - (n78 << 21) + n107;
                final long n109 = n105 - (n107 << 21);
                final long n110 = n108 >> 21;
                final long n111 = n79 - (n80 << 21) + n110;
                final long n112 = n108 - (n110 << 21);
                final long n113 = n111 >> 21;
                final long n114 = n81 - (n82 << 21) + n113;
                final long n115 = n111 - (n113 << 21);
                final long n116 = n114 >> 21;
                final long n117 = n83 - (n84 << 21) + n116;
                final long n118 = n114 - (n116 << 21);
                array[0] = (byte)n88;
                array[1] = (byte)(n88 >> 8);
                array[2] = (byte)(n88 >> 16 | n91 << 5);
                array[3] = (byte)(n91 >> 3);
                array[4] = (byte)(n91 >> 11);
                array[5] = (byte)(n91 >> 19 | n94 << 2);
                array[6] = (byte)(n94 >> 6);
                array[7] = (byte)(n94 >> 14 | n97 << 7);
                array[8] = (byte)(n97 >> 1);
                array[9] = (byte)(n97 >> 9);
                array[10] = (byte)(n97 >> 17 | n100 << 4);
                array[11] = (byte)(n100 >> 4);
                array[12] = (byte)(n100 >> 12);
                array[13] = (byte)(n100 >> 20 | n103 + n103);
                array[14] = (byte)(n103 >> 7);
                array[15] = (byte)(n103 >> 15 | n106 << 6);
                array[16] = (byte)(n106 >> 2);
                array[17] = (byte)(n106 >> 10);
                array[18] = (byte)(n106 >> 18 | n109 << 3);
                array[19] = (byte)(n109 >> 5);
                array[20] = (byte)(n109 >> 13);
                array[21] = (byte)n112;
                array[22] = (byte)(n112 >> 8);
                array[23] = (byte)(n112 >> 16 | n115 << 5);
                array[24] = (byte)(n115 >> 3);
                array[25] = (byte)(n115 >> 11);
                array[26] = (byte)(n115 >> 19 | n118 << 2);
                array[27] = (byte)(n118 >> 6);
                array[28] = (byte)(n118 >> 14 | n117 << 7);
                array[29] = (byte)(n117 >> 1);
                array[30] = (byte)(n117 >> 9);
                array[31] = (byte)(n117 >> 17);
                final long[] array4 = new long[10];
                final long[] l2 = agec.l(array3);
                final long[] array5 = new long[10];
                array5[0] = 1L;
                final long[] array6 = new long[10];
                final long[] array7 = new long[10];
                final long[] array8 = new long[10];
                final long[] array9 = new long[10];
                final long[] array10 = new long[10];
                agec.h(array7, l2);
                agec.b(array8, array7, agdt.a);
                agec.i(array7, array7, array5);
                agec.j(array8, array8, array5);
                final long[] array11 = new long[10];
                agec.h(array11, array8);
                agec.b(array11, array11, array8);
                agec.h(array4, array11);
                agec.b(array4, array4, array8);
                agec.b(array4, array4, array7);
                final long[] array12 = new long[10];
                final long[] array13 = new long[10];
                final long[] array14 = new long[10];
                agec.h(array12, array4);
                agec.h(array13, array12);
                agec.h(array13, array13);
                agec.b(array13, array4, array13);
                agec.b(array12, array12, array13);
                agec.h(array12, array12);
                agec.b(array12, array13, array12);
                agec.h(array13, array12);
                for (int n119 = 1; n119 < 5; ++n119) {
                    agec.h(array13, array13);
                }
                agec.b(array12, array13, array12);
                agec.h(array13, array12);
                for (int n120 = 1; n120 < 10; ++n120) {
                    agec.h(array13, array13);
                }
                agec.b(array13, array13, array12);
                agec.h(array14, array13);
                for (int n121 = 1; n121 < 20; ++n121) {
                    agec.h(array14, array14);
                }
                agec.b(array13, array14, array13);
                agec.h(array13, array13);
                for (int n122 = 1; n122 < 10; ++n122) {
                    agec.h(array13, array13);
                }
                agec.b(array12, array13, array12);
                agec.h(array13, array12);
                for (int n123 = 1; n123 < 50; ++n123) {
                    agec.h(array13, array13);
                }
                agec.b(array13, array13, array12);
                agec.h(array14, array13);
                for (int n124 = 1; n124 < 100; ++n124) {
                    agec.h(array14, array14);
                }
                agec.b(array13, array14, array13);
                agec.h(array13, array13);
                for (int n125 = 1; n125 < 50; ++n125) {
                    agec.h(array13, array13);
                }
                agec.b(array12, array13, array12);
                agec.h(array12, array12);
                agec.h(array12, array12);
                agec.b(array4, array12, array4);
                agec.b(array4, array4, array11);
                agec.b(array4, array4, array7);
                agec.h(array9, array4);
                agec.b(array9, array9, array8);
                agec.i(array10, array9, array7);
                if (c(array10)) {
                    agec.j(array10, array9, array7);
                    if (c(array10)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    agec.b(array4, array4, agdt.c);
                }
                if (!c(array4) && (array3[31] & 0xFF) >> 7 != 0) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                }
                if (a(array4) == (array3[31] & 0xFF) >> 7) {
                    b(array4, array4);
                }
                agec.b(array6, array4, l2);
                final aseo aseo = new aseo(new auip(array4, l2, array5), array6, null, null);
                final agdr[] array15 = new agdr[8];
                array15[0] = new agdr(aseo, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                final ahbd ahbd = new ahbd(new auip((byte[])null), new long[10], (byte[])null, (byte[])null);
                n(ahbd, (auip)aseo.b);
                final aseo aseo2 = new aseo(ahbd, null);
                for (int n126 = 1; n126 < 8; ++n126) {
                    l(ahbd, aseo2, (agdq)array15[n126 - 1]);
                    array15[n126] = new agdr(new aseo(ahbd, null), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                }
                array = k(array);
                final byte[] k2 = k(copyOfRange);
                final ahbd ahbd2 = new ahbd(agds.c, (byte[])null);
                final aseo aseo3 = new aseo((byte[])null);
                int n127 = 255;
                int n128;
                while (true) {
                    n128 = n127;
                    if (n127 < 0) {
                        break;
                    }
                    n128 = n127;
                    if (array[n127] != 0) {
                        break;
                    }
                    n128 = n127;
                    if (k2[n127] != 0) {
                        break;
                    }
                    --n127;
                }
                while (n128 >= 0) {
                    n(ahbd2, new auip(ahbd2, (byte[])null));
                    final byte b = array[n128];
                    if (b > 0) {
                        aseo.i(aseo3, ahbd2);
                        l(ahbd2, aseo3, (agdq)array15[array[n128] / 2]);
                    }
                    else if (b < 0) {
                        aseo.i(aseo3, ahbd2);
                        m(ahbd2, aseo3, (agdq)array15[-array[n128] / 2]);
                    }
                    final byte b2 = k2[n128];
                    if (b2 > 0) {
                        aseo.i(aseo3, ahbd2);
                        l(ahbd2, aseo3, agdt.e[k2[n128] / 2]);
                    }
                    else if (b2 < 0) {
                        aseo.i(aseo3, ahbd2);
                        m(ahbd2, aseo3, agdt.e[-k2[n128] / 2]);
                    }
                    --n128;
                }
                array = new auip(ahbd2, (byte[])null).j();
                for (int n129 = 0; n129 < 32; ++n129) {
                    if (array[n129] != array2[n129]) {
                        return false;
                    }
                }
                return true;
            }
            else {
                --i;
            }
        }
        return false;
    }
    
    public static byte[] e(byte[] digest) {
        final MessageDigest messageDigest = (MessageDigest)agdz.d.a("SHA-512");
        messageDigest.update(digest, 0, 32);
        digest = messageDigest.digest();
        digest[0] &= (byte)248;
        final int n = digest[31] & 0x7F;
        digest[31] = (byte)n;
        digest[31] = (byte)(n | 0x40);
        return digest;
    }
    
    public static byte[] f(final byte[] array) {
        final byte[] array2 = new byte[64];
        final int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = 1;
            if (n2 >= 32) {
                break;
            }
            final int n4 = n2 + n2;
            array2[n4] = (byte)(array[n2] & 0xF);
            array2[n4 + 1] = (byte)((array[n2] & 0xFF) >> 4);
            ++n2;
        }
        int i = 0;
        int n5 = 0;
        while (i < 63) {
            final byte b = (byte)(array2[i] + n5);
            array2[i] = b;
            n5 = b + 8 >> 4;
            array2[i] = (byte)(b - (n5 << 4));
            ++i;
        }
        array2[63] += (byte)n5;
        final ahbd ahbd = new ahbd(agds.c, (byte[])null);
        final aseo aseo = new aseo((byte[])null);
        for (int j = n3; j < 64; j += 2) {
            final agdq agdq = new agdq(agds.b);
            j(agdq, j / 2, array2[j]);
            aseo.i(aseo, ahbd);
            l(ahbd, aseo, agdq);
        }
        final auip auip = new auip((byte[])null);
        auip.Q(auip, ahbd);
        n(ahbd, auip);
        auip.Q(auip, ahbd);
        n(ahbd, auip);
        auip.Q(auip, ahbd);
        n(ahbd, auip);
        auip.Q(auip, ahbd);
        n(ahbd, auip);
        for (int k = n; k < 64; k += 2) {
            final agdq agdq2 = new agdq(agds.b);
            j(agdq2, k / 2, array2[k]);
            aseo.i(aseo, ahbd);
            l(ahbd, aseo, agdq2);
        }
        final auip auip2 = new auip(ahbd, (byte[])null);
        final long[] array3 = new long[10];
        agec.h(array3, (long[])auip2.c);
        final long[] array4 = new long[10];
        agec.h(array4, (long[])auip2.b);
        final long[] array5 = new long[10];
        agec.h(array5, (long[])auip2.a);
        final long[] array6 = new long[10];
        agec.h(array6, array5);
        final long[] array7 = new long[10];
        agec.i(array7, array4, array3);
        agec.b(array7, array7, array5);
        final long[] array8 = new long[10];
        agec.b(array8, array3, array4);
        agec.b(array8, array8, agdt.a);
        agec.j(array8, array8, array6);
        agec.d(array8, array8);
        if (MessageDigest.isEqual(agec.k(array7), agec.k(array8))) {
            return auip2.j();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }
    
    private static int g(int n, final int n2) {
        n = (~(n ^ n2) & 0xFF);
        n &= n << 4;
        n &= n << 2;
        return (n & n + n) >> 7;
    }
    
    private static long h(final byte[] array, final int n) {
        return (long)(array[n + 2] & 0xFF) << 16 | (((long)array[n] & 0xFFL) | (long)(array[n + 1] & 0xFF) << 8);
    }
    
    private static long i(final byte[] array, final int n) {
        return (long)(array[n + 3] & 0xFF) << 24 | h(array, n);
    }
    
    private static void j(final agdq agdq, final int n, final byte b) {
        final int n2 = (b & 0xFF) >> 7;
        final int n3 = -n2 & b;
        final int n4 = b - (n3 + n3);
        agdq.a(agdt.d[n][0], g(n4, 1));
        agdq.a(agdt.d[n][1], g(n4, 2));
        agdq.a(agdt.d[n][2], g(n4, 3));
        agdq.a(agdt.d[n][3], g(n4, 4));
        agdq.a(agdt.d[n][4], g(n4, 5));
        agdq.a(agdt.d[n][5], g(n4, 6));
        agdq.a(agdt.d[n][6], g(n4, 7));
        agdq.a(agdt.d[n][7], g(n4, 8));
        final long[] copy = Arrays.copyOf(agdq.b, 10);
        final long[] copy2 = Arrays.copyOf(agdq.a, 10);
        final long[] copy3 = Arrays.copyOf(agdq.c, 10);
        b(copy3, copy3);
        agdq.a(new agdq(copy, copy2, copy3), n2);
    }
    
    private static byte[] k(final byte[] array) {
        final byte[] array2 = new byte[256];
        for (int i = 0; i < 256; ++i) {
            array2[i] = (byte)(0x1 & (array[i >> 3] & 0xFF) >> (i & 0x7));
        }
        for (int j = 0; j < 256; ++j) {
            if (array2[j] != 0) {
                for (int k = 1; k <= 6; ++k) {
                    int l = j + k;
                    if (l >= 256) {
                        break;
                    }
                    final byte b = array2[l];
                    if (b != 0) {
                        final byte b2 = array2[j];
                        final int n = b << k;
                        final int n2 = b2 + n;
                        if (n2 <= 15) {
                            array2[j] = (byte)n2;
                            array2[l] = 0;
                        }
                        else {
                            final int n3 = b2 - n;
                            if (n3 < -15) {
                                break;
                            }
                            array2[j] = (byte)n3;
                            while (l < 256) {
                                if (array2[l] == 0) {
                                    array2[l] = 1;
                                    break;
                                }
                                array2[l] = 0;
                                ++l;
                            }
                        }
                    }
                }
            }
        }
        return array2;
    }
    
    private static void l(final ahbd ahbd, final aseo aseo, final agdq agdq) {
        final long[] array = new long[10];
        final Object c = ((auip)ahbd.b).c;
        final auip auip = (auip)aseo.b;
        agec.j((long[])c, (long[])auip.b, (long[])auip.c);
        final Object b = ((auip)ahbd.b).b;
        final auip auip2 = (auip)aseo.b;
        agec.i((long[])b, (long[])auip2.b, (long[])auip2.c);
        final Object b2 = ((auip)ahbd.b).b;
        final long[] b3 = agdq.b;
        final long[] array2 = (long[])b2;
        agec.b(array2, array2, b3);
        final auip auip3 = (auip)ahbd.b;
        agec.b((long[])auip3.a, (long[])auip3.c, agdq.a);
        agec.b((long[])ahbd.a, (long[])aseo.a, agdq.c);
        agdq.b((long[])((auip)ahbd.b).c, (long[])((auip)aseo.b).a);
        final long[] array3 = (long[])((auip)ahbd.b).c;
        agec.j(array, array3, array3);
        final auip auip4 = (auip)ahbd.b;
        agec.i((long[])auip4.c, (long[])auip4.a, (long[])auip4.b);
        final auip auip5 = (auip)ahbd.b;
        final Object b4 = auip5.b;
        final long[] array4 = (long[])auip5.a;
        final long[] array5 = (long[])b4;
        agec.j(array5, array4, array5);
        agec.j((long[])((auip)ahbd.b).a, array, (long[])ahbd.a);
        final long[] array6 = (long[])ahbd.a;
        agec.i(array6, array, array6);
    }
    
    private static void m(final ahbd ahbd, final aseo aseo, final agdq agdq) {
        final long[] array = new long[10];
        final Object c = ((auip)ahbd.b).c;
        final auip auip = (auip)aseo.b;
        agec.j((long[])c, (long[])auip.b, (long[])auip.c);
        final Object b = ((auip)ahbd.b).b;
        final auip auip2 = (auip)aseo.b;
        agec.i((long[])b, (long[])auip2.b, (long[])auip2.c);
        final Object b2 = ((auip)ahbd.b).b;
        final long[] a = agdq.a;
        final long[] array2 = (long[])b2;
        agec.b(array2, array2, a);
        final auip auip3 = (auip)ahbd.b;
        agec.b((long[])auip3.a, (long[])auip3.c, agdq.b);
        agec.b((long[])ahbd.a, (long[])aseo.a, agdq.c);
        agdq.b((long[])((auip)ahbd.b).c, (long[])((auip)aseo.b).a);
        final long[] array3 = (long[])((auip)ahbd.b).c;
        agec.j(array, array3, array3);
        final auip auip4 = (auip)ahbd.b;
        agec.i((long[])auip4.c, (long[])auip4.a, (long[])auip4.b);
        final auip auip5 = (auip)ahbd.b;
        final Object b3 = auip5.b;
        final long[] array4 = (long[])auip5.a;
        final long[] array5 = (long[])b3;
        agec.j(array5, array4, array5);
        agec.i((long[])((auip)ahbd.b).a, array, (long[])ahbd.a);
        final long[] array6 = (long[])ahbd.a;
        agec.j(array6, array, array6);
    }
    
    private static void n(final ahbd ahbd, final auip auip) {
        final long[] array = new long[10];
        agec.h((long[])((auip)ahbd.b).c, (long[])auip.c);
        agec.h((long[])((auip)ahbd.b).a, (long[])auip.b);
        agec.h((long[])ahbd.a, (long[])auip.a);
        final long[] array2 = (long[])ahbd.a;
        agec.j(array2, array2, array2);
        agec.j((long[])((auip)ahbd.b).b, (long[])auip.c, (long[])auip.b);
        agec.h(array, (long[])((auip)ahbd.b).b);
        final auip auip2 = (auip)ahbd.b;
        agec.j((long[])auip2.b, (long[])auip2.a, (long[])auip2.c);
        final auip auip3 = (auip)ahbd.b;
        final Object a = auip3.a;
        final long[] array3 = (long[])auip3.c;
        final long[] array4 = (long[])a;
        agec.i(array4, array4, array3);
        final auip auip4 = (auip)ahbd.b;
        agec.i((long[])auip4.c, array, (long[])auip4.b);
        final Object a2 = ahbd.a;
        final long[] array5 = (long[])((auip)ahbd.b).a;
        final long[] array6 = (long[])a2;
        agec.i(array6, array6, array5);
    }
}
