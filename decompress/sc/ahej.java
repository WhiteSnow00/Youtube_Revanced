import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahej
{
    public static final adyf a;
    
    static {
        final boolean a2 = aheh.a;
        a = new adyf();
    }
    
    static int a(final CharSequence charSequence, final byte[] array, int codePoint, int n) {
        final int length = charSequence.length();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = codePoint + n;
            if (n2 >= length) {
                break;
            }
            final int n4 = n2 + codePoint;
            if (n4 >= n3) {
                break;
            }
            final char char1 = charSequence.charAt(n2);
            if (char1 >= '\u0080') {
                break;
            }
            array[n4] = (byte)char1;
            ++n2;
        }
        if (n2 != length) {
            n = codePoint + n2;
            codePoint = n2;
            while (true) {
                final int n5 = n;
                if (codePoint >= length) {
                    return n5;
                }
                final char char2 = charSequence.charAt(codePoint);
                if (char2 < '\u0080' && n < n3) {
                    final int n6 = n + 1;
                    array[n] = (byte)char2;
                    n = n6;
                }
                else if (char2 < '\u0800' && n <= n3 - 2) {
                    final int n7 = n + 1;
                    array[n] = (byte)(char2 >>> 6 | 0x3C0);
                    n = n7 + 1;
                    array[n7] = (byte)((char2 & '?') | 0x80);
                }
                else if ((char2 < '\ud800' || char2 > '\udfff') && n <= n3 - 3) {
                    final int n8 = n + 1;
                    array[n] = (byte)(char2 >>> 12 | 0x1E0);
                    final int n9 = n8 + 1;
                    array[n8] = (byte)((char2 >>> 6 & 0x3F) | 0x80);
                    n = n9 + 1;
                    array[n9] = (byte)((char2 & '?') | 0x80);
                }
                else {
                    if (n > n3 - 4) {
                        if (char2 >= '\ud800' && char2 <= '\udfff') {
                            final int n10 = codePoint + 1;
                            if (n10 == charSequence.length() || !Character.isSurrogatePair(char2, charSequence.charAt(n10))) {
                                throw new ahei(codePoint, length);
                            }
                        }
                        final StringBuilder sb = new StringBuilder("Failed writing ");
                        sb.append(char2);
                        sb.append(" at index ");
                        sb.append(n);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    final int n11 = codePoint + 1;
                    if (n11 == charSequence.length()) {
                        break;
                    }
                    final char char3 = charSequence.charAt(n11);
                    if (!Character.isSurrogatePair(char2, char3)) {
                        codePoint = n11;
                        break;
                    }
                    codePoint = Character.toCodePoint(char2, char3);
                    final int n12 = n + 1;
                    array[n] = (byte)(codePoint >>> 18 | 0xF0);
                    n = n12 + 1;
                    array[n12] = (byte)((codePoint >>> 12 & 0x3F) | 0x80);
                    final int n13 = n + 1;
                    array[n] = (byte)((codePoint >>> 6 & 0x3F) | 0x80);
                    n = n13 + 1;
                    array[n13] = (byte)((codePoint & 0x3F) | 0x80);
                    codePoint = n11;
                }
                ++codePoint;
            }
            throw new ahei(codePoint - 1, length);
        }
        return codePoint + length;
    }
    
    static int b(final CharSequence charSequence) {
        final int length = charSequence.length();
        final int n = 0;
        int i;
        for (i = 0; i < length && charSequence.charAt(i) < '\u0080'; ++i) {}
        int n2 = length;
        int n3;
        while (true) {
            n3 = n2;
            if (i >= length) {
                break;
            }
            final char char1 = charSequence.charAt(i);
            if (char1 >= '\u0800') {
                final int length2 = charSequence.length();
                int n4 = n;
                while (i < length2) {
                    final char char2 = charSequence.charAt(i);
                    int n5;
                    if (char2 < '\u0800') {
                        n4 += '\u007f' - char2 >>> 31;
                        n5 = i;
                    }
                    else {
                        final int n6 = n4 += 2;
                        n5 = i;
                        if (char2 >= '\ud800') {
                            n4 = n6;
                            n5 = i;
                            if (char2 <= '\udfff') {
                                if (Character.codePointAt(charSequence, i) < 65536) {
                                    throw new ahei(i, length2);
                                }
                                n5 = i + 1;
                                n4 = n6;
                            }
                        }
                    }
                    i = n5 + 1;
                }
                n3 = n2 + n4;
                break;
            }
            n2 += '\u007f' - char1 >>> 31;
            ++i;
        }
        if (n3 >= length) {
            return n3;
        }
        final long n7 = n3;
        final StringBuilder sb = new StringBuilder("UTF-8 length does not fit in int: ");
        sb.append(n7 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static int c(final int n, final int n2) {
        if (n <= -12 && n2 <= -65) {
            return n ^ n2 << 8;
        }
        return -1;
    }
    
    public static int d(final int n, final int n2, final int n3) {
        if (n <= -12 && n2 <= -65 && n3 <= -65) {
            return n ^ n2 << 8 ^ n3 << 16;
        }
        return -1;
    }
    
    public static int e(final byte[] array, final int n, int n2) {
        n2 -= n;
        final byte b = array[n - 1];
        if (n2 != 0) {
            if (n2 == 1) {
                return c(b, array[n]);
            }
            if (n2 == 2) {
                return d(b, array[n], array[n + 1]);
            }
            throw new AssertionError();
        }
        else {
            if (b > -12) {
                return -1;
            }
            return b;
        }
    }
    
    static String f(final ByteBuffer byteBuffer, final int n, final int n2) {
        String s;
        if (byteBuffer.hasArray()) {
            s = adyf.aD(byteBuffer.array(), byteBuffer.arrayOffset() + n, n2);
        }
        else if (byteBuffer.isDirect()) {
            s = adyf.aC(byteBuffer, n, n2);
        }
        else {
            s = adyf.aC(byteBuffer, n, n2);
        }
        return s;
    }
    
    public static String g(final byte[] array, final int n, final int n2) {
        return adyf.aD(array, n, n2);
    }
    
    static boolean h(final byte[] array, final int n, final int n2) {
        return adyf.aF(array, n, n2);
    }
}
