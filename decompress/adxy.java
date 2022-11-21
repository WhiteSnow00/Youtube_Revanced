import android.util.TypedValue;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxy
{
    private static final int[] a;
    private static final int[] b;
    
    static {
        a = new int[] { 2130969084 };
        b = new int[] { 2130969099 };
    }
    
    public static TypedArray a(final Context context, final AttributeSet set, final int[] array, final int n, final int n2, final int... array2) {
        e(context, set, n, n2);
        f(context, set, array, n, n2, array2);
        return context.obtainStyledAttributes(set, array, n, n2);
    }
    
    public static void b(final Context context) {
        g(context, adxy.a, "Theme.AppCompat");
    }
    
    public static boolean c(final Context context) {
        return adfe.y(context, 2130969593, false);
    }
    
    public static cdr d(final Context context, final AttributeSet set, final int[] array, final int n, final int n2, final int... array2) {
        e(context, set, n, n2);
        f(context, set, array, n, n2, array2);
        return cdr.w(context, set, array, n, n2);
    }
    
    private static void e(final Context context, final AttributeSet set, final int n, final int n2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, adxs.c, n, n2);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (boolean1) {
            final TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130969594, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                g(context, adxy.b, "Theme.MaterialComponents");
            }
        }
        b(context);
    }
    
    private static void f(final Context context, final AttributeSet set, final int[] array, int i, final int n, final int... array2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, adxs.c, i, n);
        final int n2 = 0;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        final int length = array2.length;
        Label_0115: {
            if (length == 0) {
                i = n2;
                if (obtainStyledAttributes.getResourceId(0, -1) == -1) {
                    break Label_0115;
                }
            }
            else {
                final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, array, i, n);
                for (i = 0; i < length; ++i) {
                    if (obtainStyledAttributes2.getResourceId(array2[i], -1) == -1) {
                        obtainStyledAttributes2.recycle();
                        i = n2;
                        break Label_0115;
                    }
                }
                obtainStyledAttributes2.recycle();
            }
            i = 1;
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            return;
        }
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }
    
    private static void g(final Context context, final int[] array, final String s) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(array);
        for (int i = 0; i <= 0; ++i) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                final StringBuilder sb = new StringBuilder("The style on this component requires your app theme to be ");
                sb.append(s);
                sb.append(" (or a descendant).");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        obtainStyledAttributes.recycle();
    }
}
