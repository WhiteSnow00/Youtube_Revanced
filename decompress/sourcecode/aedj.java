import com.google.android.setupcompat.internal.TemplateLayout;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Window;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.setupcompat.view.StatusBarBackgroundLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aedj implements aedi
{
    private final aecp a;
    private StatusBarBackgroundLayout b;
    private LinearLayout c;
    private final View d;
    
    public aedj(final aecp a, final Window window, final AttributeSet set, final int n) {
        this.a = a;
        final View h = ((TemplateLayout)a).h(2131431830);
        if (h != null) {
            if (h instanceof StatusBarBackgroundLayout) {
                this.b = (StatusBarBackgroundLayout)h;
            }
            else {
                this.c = (LinearLayout)h;
            }
            final View decorView = window.getDecorView();
            this.d = decorView;
            window.setStatusBarColor(0);
            final TypedArray obtainStyledAttributes = a.getContext().obtainStyledAttributes(set, aecq.d, n, 0);
            boolean b = obtainStyledAttributes.getBoolean(0, (decorView.getSystemUiVisibility() & 0x2000) == 0x2000);
            if (a.f()) {
                final Context context = a.getContext();
                b = aedd.f(context).j(context, aedb.b, false);
            }
            if (b) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 0x2000);
            }
            else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & 0xFFFFDFFF);
            }
            this.a(obtainStyledAttributes.getDrawable(1));
            obtainStyledAttributes.recycle();
            return;
        }
        throw new NullPointerException("sucLayoutStatus cannot be null in StatusBarMixin");
    }
    
    public final void a(final Drawable drawable) {
        Drawable d = drawable;
        if (this.a.f()) {
            d = drawable;
            if (!this.a.g()) {
                final Context context = this.a.getContext();
                d = aedd.f(context).d(context, aedb.a);
            }
        }
        final StatusBarBackgroundLayout b = this.b;
        if (b == null) {
            this.c.setBackgroundDrawable(d);
            return;
        }
        b.a = d;
        final boolean b2 = true;
        b.setWillNotDraw(d == null);
        b.setFitsSystemWindows(d != null && b2);
        b.invalidate();
    }
}
