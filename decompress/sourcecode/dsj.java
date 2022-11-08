import java.util.Arrays;
import android.graphics.PathEffect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsj implements dui
{
    public final float[] a;
    public final int[] b;
    public final int[] c;
    public PathEffect d;
    
    public dsj() {
        this.a = new float[4];
        this.b = new int[4];
        this.c = new int[4];
    }
    
    static int b(final int[] array, final int n) {
        if (array.length == 4) {
            return array[d(n)];
        }
        throw new IllegalArgumentException("Given wrongly sized array");
    }
    
    public static void c(final int[] array, int i, final int n) {
        for (i = 0; i < 4; ++i) {
            array[i] = n;
        }
    }
    
    private static int d(final int n) {
        final int n2 = n - 1;
        if (n2 != 0) {
            int n3 = 1;
            if (n2 != 1) {
                n3 = 2;
                if (n2 != 2) {
                    if (n2 == 3) {
                        return 3;
                    }
                    if (n2 == 4) {
                        return 0;
                    }
                    if (n2 != 5) {
                        throw new IllegalArgumentException("Given unsupported edge ".concat(egx.a(n)));
                    }
                    n3 = n3;
                }
            }
            return n3;
        }
        return 0;
    }
}
