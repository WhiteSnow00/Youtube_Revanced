import android.util.DisplayMetrics;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebo extends oj
{
    public ebo(final Context context) {
        super(context);
    }
    
    protected final float a(final DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
    
    public final int g(final int n, int n2, final int n3, final int n4, final int n5) {
        n2 = (n2 - n) / 2;
        return n3 + (n4 - n3) / 2 - (n + n2);
    }
}
