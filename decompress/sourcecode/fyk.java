import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.content.Context;
import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyk extends oj
{
    final /* synthetic */ ScrollToTopLinearLayoutManager a;
    private final boolean n;
    private final int o;
    private float p;
    
    public fyk(final ScrollToTopLinearLayoutManager a, final Context context, final boolean n, final int n2) {
        this.a = a;
        super(context);
        this.n = n;
        this.o = (int)TypedValue.applyDimension(1, (float)n2, context.getResources().getDisplayMetrics());
    }
    
    protected final float a(final DisplayMetrics displayMetrics) {
        if (this.p == 0.0f) {
            final int a = this.a.a;
            if (a != 0) {
                this.p = 300.0f / Math.abs(a);
            }
        }
        final float a2 = super.a(displayMetrics);
        final float p = this.p;
        if (p != 0.0f && (this.n || p <= a2)) {
            return p;
        }
        return a2;
    }
    
    public final PointF d(final int n) {
        return ((LinearLayoutManager)this.a).P(n);
    }
    
    public final int i(final View view, final int n) {
        return super.i(view, n) - this.o;
    }
    
    protected final int l() {
        return -1;
    }
}
