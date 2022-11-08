import java.security.GeneralSecurityException;
import j$.nio.charset.StandardCharsets;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afye
{
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    
    static {
        a = c(1, 0);
        b = c(2, 32);
        c = c(2, 16);
        d = c(2, 17);
        e = c(2, 18);
        f = c(2, 1);
        g = c(2, 2);
        h = c(2, 3);
        i = c(2, 1);
        j = c(2, 2);
        k = c(2, 3);
        l = new byte[0];
        m = "KEM".getBytes(StandardCharsets.UTF_8);
        n = "HPKE".getBytes(StandardCharsets.UTF_8);
        o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);
    }
    
    static void a(final agbf agbf) {
        final int b = agbf.b;
        final int ad = aety.ad(b);
        int n = 1;
        Label_0276: {
            if (ad != 0) {
                if (ad == 2) {
                    break Label_0276;
                }
            }
            final int ad2 = aety.ad(b);
            if (ad2 != 0) {
                if (ad2 != 1) {
                    final int c = agbf.c;
                    final int w = aesy.W(c);
                    final String s = "UNRECOGNIZED";
                    Label_0200: {
                        if (w != 0) {
                            if (w == 2) {
                                break Label_0200;
                            }
                        }
                        final int w2 = aesy.W(c);
                        if (w2 != 0) {
                            if (w2 != 1) {
                                final int d = agbf.d;
                                final int x = aesy.X(d);
                                Label_0124: {
                                    if (x != 0) {
                                        if (x == 2) {
                                            break Label_0124;
                                        }
                                    }
                                    final int x2 = aesy.X(d);
                                    if (x2 != 0) {
                                        if (x2 != 1) {
                                            return;
                                        }
                                    }
                                }
                                final int x3 = aesy.X(agbf.d);
                                String s2 = s;
                                if (x3 != 0) {
                                    if (x3 != 2) {
                                        if (x3 != 3) {
                                            if (x3 != 4) {
                                                if (x3 != 5) {
                                                    s2 = s;
                                                }
                                                else {
                                                    s2 = "CHACHA20_POLY1305";
                                                }
                                            }
                                            else {
                                                s2 = "AES_256_GCM";
                                            }
                                        }
                                        else {
                                            s2 = "AES_128_GCM";
                                        }
                                    }
                                    else {
                                        s2 = "AEAD_UNKNOWN";
                                    }
                                }
                                throw new GeneralSecurityException("Invalid AEAD param: ".concat(s2));
                            }
                        }
                    }
                    final int w3 = aesy.W(agbf.c);
                    String s3 = s;
                    if (w3 != 0) {
                        if (w3 != 2) {
                            if (w3 != 3) {
                                if (w3 != 4) {
                                    if (w3 != 5) {
                                        s3 = s;
                                    }
                                    else {
                                        s3 = "HKDF_SHA512";
                                    }
                                }
                                else {
                                    s3 = "HKDF_SHA384";
                                }
                            }
                            else {
                                s3 = "HKDF_SHA256";
                            }
                        }
                        else {
                            s3 = "KDF_UNKNOWN";
                        }
                    }
                    throw new GeneralSecurityException("Invalid KDF param: ".concat(s3));
                }
            }
        }
        final int ad3 = aety.ad(agbf.b);
        if (ad3 != 0) {
            n = ad3;
        }
        throw new GeneralSecurityException("Invalid KEM param: ".concat(aety.ac(n)));
    }
    
    static byte[] b(final byte[] array, final byte[] array2, final byte[] array3) {
        return aety.S(new byte[][] { afye.n, array, array2, array3 });
    }
    
    public static byte[] c(final int n, final int n2) {
        final byte[] array = new byte[n];
        for (int i = 0; i < n; ++i) {
            array[i] = (byte)(n2 >> (n - i - 1) * 8 & 0xFF);
        }
        return array;
    }
    
    static byte[] d(final byte[] array) {
        return aety.S(new byte[][] { afye.m, array });
    }
    
    public static byte[] e(final String s, final byte[] array, final byte[] array2) {
        return aety.S(new byte[][] { afye.o, array2, s.getBytes(StandardCharsets.UTF_8), array });
    }
    
    public static byte[] f(final String s, final byte[] array, final byte[] array2, final int n) {
        return aety.S(new byte[][] { c(2, n), afye.o, array2, s.getBytes(StandardCharsets.UTF_8), array });
    }
    
    static int g(int n) {
        n -= 2;
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        if (n == 4) {
            return 3;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}
