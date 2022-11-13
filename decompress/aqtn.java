// 
// Decompiled by Procyon v0.6.0
// 

final class aqtn
{
    static final int[] a;
    
    static {
        a = new int[0];
    }
    
    static int a(final int n) {
        if (n >= 48 && n <= 57) {
            return n - 48;
        }
        if (n >= 97 && n <= 102) {
            return n - 87;
        }
        if (n >= 65 && n <= 70) {
            return n - 55;
        }
        return -1;
    }
    
    static void b(final StringBuilder sb, final int n) {
        Label_0258: {
            if (n <= 255) {
                if (n >= 32 && n < 127) {
                    break Label_0258;
                }
                if (n >= 161 && n != 173) {
                    break Label_0258;
                }
            }
            else {
                if (aqsx.d(aqtm.I, n) || aqsx.d(aqtm.J, n) || aqsx.d(aqtm.K, n) || aqsx.d(aqtm.E, n)) {
                    break Label_0258;
                }
                if (aqsx.d(aqtm.F, n)) {
                    break Label_0258;
                }
            }
            if (n == 12) {
                sb.append("\\f");
                return;
            }
            if (n == 13) {
                sb.append("\\r");
                return;
            }
            if (n == 34) {
                sb.append("\\\"");
                return;
            }
            if (n == 92) {
                sb.append("\\\\");
                return;
            }
            switch (n) {
                default: {
                    final String hexString = Integer.toHexString(n);
                    if (n < 256) {
                        sb.append("\\x");
                        if (hexString.length() == 1) {
                            sb.append('0');
                        }
                        sb.append(hexString);
                        return;
                    }
                    sb.append("\\x{");
                    sb.append(hexString);
                    sb.append('}');
                    return;
                }
                case 10: {
                    sb.append("\\n");
                    return;
                }
                case 9: {
                    sb.append("\\t");
                    return;
                }
                case 8: {
                    sb.append("\\b");
                    return;
                }
            }
        }
        if ("\\.+*?()|[]{}^$".indexOf((char)n) >= 0) {
            sb.append('\\');
        }
        sb.appendCodePoint(n);
    }
    
    static boolean c(final int n) {
        final boolean b = true;
        if (n >= 48) {
            final boolean b2 = b;
            if (n <= 57) {
                return b2;
            }
        }
        if (n >= 65) {
            final boolean b2 = b;
            if (n <= 90) {
                return b2;
            }
        }
        boolean b2;
        if (n >= 97) {
            if (n > 122) {
                return false;
            }
            b2 = b;
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    static int[] d(final int[] array, final int n, final int n2) {
        final int[] array2 = new int[n2 - n];
        for (int i = n; i < n2; ++i) {
            array2[i - n] = array[i];
        }
        return array2;
    }
}
