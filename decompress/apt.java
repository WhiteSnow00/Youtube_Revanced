import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apt
{
    public static int a(final TextView textView) {
        return textView.getMaxLines();
    }
    
    static int b(final TextView textView) {
        return textView.getMinLines();
    }
    
    static boolean c(final TextView textView) {
        return textView.getIncludeFontPadding();
    }
    
    public static boolean d(final byte[] array, final byte[] array2) {
        if (array2 == null) {
            return false;
        }
        if (array.length >= array2.length) {
            for (int i = 0; i < array2.length; ++i) {
                if (array[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static long[] e(final Object o) {
        if (o instanceof int[]) {
            final int[] array = (int[])o;
            final long[] array2 = new long[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        if (o instanceof long[]) {
            return (long[])o;
        }
        return null;
    }
}
