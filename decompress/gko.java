import android.view.View;
import android.util.DisplayMetrics;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class gko extends oj
{
    public int a;
    
    public gko(final Context context) {
        super(context);
    }
    
    protected final float a(final DisplayMetrics displayMetrics) {
        return 250.0f / displayMetrics.densityDpi;
    }
    
    public final int i(final View view, final int n) {
        return super.i(view, n) + this.a;
    }
    
    protected final int l() {
        return -1;
    }
}
