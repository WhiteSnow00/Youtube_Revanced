import android.util.DisplayMetrics;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmo
{
    public final bu a;
    public final hma b;
    public final Context c;
    public ct d;
    public View e;
    public TextView f;
    public final int g;
    public final int h;
    public int i;
    public CharSequence j;
    public CoordinatorLayout k;
    public hmn l;
    
    public hmo(final Context c, final bu a) {
        this.a = a;
        this.c = c;
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        final double n = displayMetrics.heightPixels;
        Double.isNaN(n);
        final int n2 = (int)(n * 0.75);
        this.g = n2;
        this.h = displayMetrics.widthPixels;
        this.i = n2;
        this.b = hma.aM(n2);
    }
    
    public final void a() {
        final hma b = this.b;
        if (b.ar()) {
            b.dismiss();
        }
    }
}
