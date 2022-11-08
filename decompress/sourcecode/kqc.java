import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqc
{
    public final acir a;
    public final LinearLayout b;
    public final achg c;
    public WeakReference d;
    public int e;
    private final int f;
    private achx g;
    
    public kqc(final Context context, final acir a, final LinearLayout b, final achg c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = context.getResources().getDimensionPixelSize(2131169774);
        this.d(false);
    }
    
    public final void a(final acij acij) {
        if (this.g == null) {
            this.g = new achx();
        }
        this.b(this.c.c(acij, (Object)this.g), true);
    }
    
    public final void b(final View view, final boolean b) {
        Object layoutParams;
        if (view.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
            layoutParams = view.getLayoutParams();
        }
        else {
            layoutParams = new LinearLayout$LayoutParams(-1, -2);
        }
        int f;
        if (b) {
            f = this.f;
        }
        else {
            f = 0;
        }
        if (b) {
            ((ViewGroup$MarginLayoutParams)layoutParams).topMargin = f;
            ((ViewGroup$MarginLayoutParams)layoutParams).bottomMargin = f;
        }
        view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.b.addView(view);
    }
    
    public final void c(final boolean b) {
        int i = 0;
        boolean b2 = false;
        while (i < this.b.getChildCount()) {
            int n2;
            final int n = n2 = 1;
            if (b) {
                if (i < this.e) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
            }
            tmy.v(this.b.getChildAt(i), (boolean)(n2 != 0));
            b2 |= (n2 != 0);
            ++i;
        }
        this.d(b2);
    }
    
    public final void d(final boolean b) {
        tmy.v((View)this.b, b);
    }
}
