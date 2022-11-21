import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.view.Window;
import android.view.View$OnTouchListener;
import android.app.Dialog;
import android.graphics.drawable.InsetDrawable;
import android.content.res.TypedArray;
import android.content.res.Resources$Theme;
import android.util.TypedValue;
import android.os.Build$VERSION;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adwb extends ex
{
    private final Drawable b;
    private final Rect c;
    
    public adwb(Context a) {
        final TypedValue w = adfe.w((Context)a, 2130969828);
        int data;
        if (w == null) {
            data = 0;
        }
        else {
            data = w.data;
        }
        final Object o = a = aecs.a((Context)a, (AttributeSet)null, 2130968645, 2132083317);
        if (data != 0) {
            a = new rr((Context)o, data);
        }
        super((Context)a, 2132084524);
        final Context a2 = this.a();
        final Resources$Theme theme = a2.getTheme();
        final TypedArray a3 = adxy.a(a2, null, adwc.a, 2130968645, 2132083317, new int[0]);
        int dimensionPixelSize = a3.getDimensionPixelSize(2, a2.getResources().getDimensionPixelSize(2131168041));
        final int dimensionPixelSize2 = a3.getDimensionPixelSize(3, a2.getResources().getDimensionPixelSize(2131168042));
        final int dimensionPixelSize3 = a3.getDimensionPixelSize(1, a2.getResources().getDimensionPixelSize(2131168040));
        final int dimensionPixelSize4 = a3.getDimensionPixelSize(0, a2.getResources().getDimensionPixelSize(2131168039));
        a3.recycle();
        final int layoutDirection = a2.getResources().getConfiguration().getLayoutDirection();
        int n;
        if (layoutDirection == 1) {
            n = dimensionPixelSize;
        }
        else {
            n = dimensionPixelSize3;
        }
        if (layoutDirection == 1) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.c = new Rect(dimensionPixelSize, dimensionPixelSize2, n, dimensionPixelSize4);
        final int p = adfe.P(a2, this.getClass().getCanonicalName());
        final adzz b = new adzz(a2, null, 2130968645, 2132083317);
        b.m(a2);
        b.o(ColorStateList.valueOf(p));
        if (Build$VERSION.SDK_INT >= 28) {
            final TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            final float dimension = typedValue.getDimension(this.a().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                b.tm(b.a.a.f(dimension));
            }
        }
        this.b = b;
    }
    
    public final ey b() {
        final ey b = super.b();
        final Window window = b.getWindow();
        final View decorView = window.getDecorView();
        ((adzz)this.b).n(anc.a(decorView));
        final Drawable b2 = this.b;
        final Rect c = this.c;
        window.setBackgroundDrawable((Drawable)new InsetDrawable(b2, c.left, c.top, c.right, c.bottom));
        decorView.setOnTouchListener((View$OnTouchListener)new adwa((Dialog)b, this.c));
        return b;
    }
    
    public final void r(final int n) {
        super.f(n);
    }
    
    public final void s(final int n) {
        super.k(n, (DialogInterface$OnClickListener)null);
    }
}
