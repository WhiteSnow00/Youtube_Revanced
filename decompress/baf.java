import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class baf
{
    public static final byte[] a;
    private static final String[] b;
    
    static {
        a = new byte[] { 0, 0, 0, 1 };
        b = new String[] { "", "A", "B", "C" };
    }
    
    public static Pair a(final byte[] array) {
        final bat bat = new bat(array);
        bat.G(9);
        final int i = bat.i();
        bat.G(20);
        return Pair.create((Object)bat.l(), (Object)i);
    }
    
    public static String b(final int n, final int n2, final int n3) {
        return String.format("avc1.%02X%02X%02X", n, n2, n3);
    }
    
    public static String c(int i, final boolean b, int j, final int n, final int[] array, final int n2) {
        final String s = baf.b[i];
        char c;
        if (!b) {
            c = 'L';
        }
        else {
            c = 'H';
        }
        final StringBuilder sb = new StringBuilder(baz.M("hvc1.%s%d.%X.%c%d", s, j, n, c, n2));
        for (i = 6; i > 0; i = j) {
            j = i - 1;
            if (array[j] != 0) {
                break;
            }
        }
        for (j = 0; j < i; ++j) {
            sb.append(String.format(".%02X", array[j]));
        }
        return sb.toString();
    }
}
