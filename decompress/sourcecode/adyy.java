import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyy
{
    private static final int[] a;
    private static final int[] b;
    
    static {
        a = new int[] { 16842752, 2130970639 };
        b = new int[] { 2130969866 };
    }
    
    public static Context a(final Context context, final AttributeSet set, int resourceId, int n) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, adyy.b, resourceId, n);
        n = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (context instanceof rq && ((rq)context).a == n) {
            resourceId = 1;
        }
        else {
            resourceId = 0;
        }
        if (n != 0 && resourceId == 0) {
            final rq rq = new rq(context, n);
            final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, adyy.a);
            n = obtainStyledAttributes2.getResourceId(0, 0);
            resourceId = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (n != 0) {
                resourceId = n;
            }
            if (resourceId != 0) {
                ((Context)rq).getTheme().applyStyle(resourceId, true);
            }
            return (Context)rq;
        }
        return context;
    }
}
