import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afue
{
    private static final byte[] a;
    
    static {
        final byte[] a2 = new byte[128];
        Arrays.fill(a2, (byte)(-1));
        final int n = 0;
        int n2 = 0;
        int i;
        while (true) {
            i = n;
            if (n2 >= 10) {
                break;
            }
            a2[n2 + 48] = (byte)n2;
            ++n2;
        }
        while (i < 26) {
            a2[i + 97] = (a2[i + 65] = (byte)(i + 10));
            ++i;
        }
        a = a2;
    }
    
    public static int a(final char c) {
        if (c < '\u0080') {
            return afue.a[c];
        }
        return -1;
    }
}
