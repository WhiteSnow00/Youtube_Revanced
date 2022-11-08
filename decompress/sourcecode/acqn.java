import java.util.Iterator;
import android.view.WindowManager$LayoutParams;
import android.view.WindowManager;
import android.util.Size;
import android.view.View$MeasureSpec;
import android.os.Build$VERSION;
import android.graphics.Point;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import android.content.Context;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.PopupWindow;
import j$.util.Optional;
import android.view.View;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqn
{
    public static final List a;
    public final View b;
    public final List c;
    public Optional d;
    public Optional e;
    public Optional f;
    public boolean g;
    PopupWindow h;
    public acqm i;
    public PopupWindow$OnDismissListener j;
    private final Context k;
    
    static {
        a = new ArrayList();
    }
    
    public acqn(final Context k, View b, final Optional d, final Optional e, final Optional f) {
        this.c = new ArrayList();
        this.g = false;
        b.getClass();
        this.k = k;
        final List a = acqn.a;
        if (!a.isEmpty()) {
            b = ((acqn)adwd.aK((Iterable)a)).b;
        }
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static void d() {
        while (true) {
            final List a = acqn.a;
            if (a.isEmpty()) {
                break;
            }
            ((acqn)adwd.aK((Iterable)a)).c();
        }
    }
    
    public static boolean g(final Context context, final Optional optional) {
        if (optional.isPresent()) {
            if (((uyi)optional.get()).aL()) {
                final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int n;
                if ((n = (int)((uyi)optional.get()).h(45364698L)) == 0) {
                    n = 528;
                }
                if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > tmy.aZ(displayMetrics, n)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final LinearLayout a() {
        final LinearLayout linearLayout = new LinearLayout(this.k);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
        if (!this.e.isPresent() && !this.d.isPresent() && !this.f.isPresent()) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, this.k.getResources().getDimensionPixelSize(2131166164));
            final RelativeLayout relativeLayout = new RelativeLayout(this.k);
            final ProgressBar progressBar = new ProgressBar(this.k);
            final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-2, -2);
            relativeLayout$LayoutParams.addRule(13);
            relativeLayout.addView((View)progressBar, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
            linearLayout.addView((View)relativeLayout, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
            return linearLayout;
        }
        if (this.e.isPresent()) {
            linearLayout.addView((View)this.e.get(), (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
        }
        if (this.d.isPresent()) {
            linearLayout.addView((View)this.d.get(), (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2, 1.0f));
        }
        if (this.f.isPresent()) {
            linearLayout.addView((View)this.f.get(), (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
        }
        return linearLayout;
    }
    
    public final void b(final acqp acqp) {
        this.c.add(acqp);
    }
    
    public final void c() {
        final PopupWindow h = this.h;
        if (h != null && h.isShowing()) {
            this.h.dismiss();
        }
    }
    
    public final void e() {
        if (this.h == null) {
            this.h = new PopupWindow(this.k);
            final acqm acqm = new acqm(this.k);
            this.i = acqm;
            final View b = this.b;
            final PopupWindow h = this.h;
            final LinearLayout a = this.a();
            acqm.b = b;
            acqm.c = h;
            acqm.a((View)a);
            h.setContentView((View)acqm);
            final Point b2 = actc.b(acqm.a);
            final int[] array = new int[2];
            b.getLocationInWindow(array);
            final int n = array[0] + b.getWidth() / 2;
            final int n2 = array[1] + b.getHeight() / 2;
            final int n3 = b2.y / 2;
            final int n4 = b2.x / 2;
            int j;
            if (n == b2.x / 2) {
                if (n2 <= n3) {
                    j = 2;
                }
                else {
                    j = 5;
                }
            }
            else if (n2 <= n3) {
                if (n <= n4) {
                    j = 1;
                }
                else {
                    j = 3;
                }
            }
            else if (n <= n4) {
                j = 4;
            }
            else {
                j = 6;
            }
            acqm.j = j;
            acqm.k = false;
            acqm.d = acqm.a.getResources().getDimensionPixelSize(2131166160);
            acqm.e = acqm.a.getResources().getDimensionPixelSize(2131166165);
            acqm.f = acqm.a.getResources().getDimensionPixelSize(2131166157);
            acqm.g = acqm.a.getResources().getDimensionPixelSize(2131166163);
            acqm.h = acqm.a.getResources().getDimensionPixelSize(2131166162);
            acqm.i = acqm.a.getResources().getDimensionPixelSize(2131166161);
            this.h.setFocusable(true);
            this.h.setClippingEnabled(false);
            if (this.g) {
                this.h.setElevation((float)this.k.getResources().getDimensionPixelSize(2131166159));
            }
            this.h.setBackgroundDrawable(fc.b(this.k, 2131231252));
        }
        Point c = new Point(0, 0);
        if (Build$VERSION.SDK_INT >= 29) {
            final int dimensionPixelSize = this.k.getResources().getDimensionPixelSize(2131166160);
            final int dimensionPixelSize2 = this.k.getResources().getDimensionPixelSize(2131166165);
            final int dimensionPixelSize3 = this.k.getResources().getDimensionPixelSize(2131166157);
            final int dimensionPixelSize4 = this.k.getResources().getDimensionPixelSize(2131166163);
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            this.i.measure(measureSpec, measureSpec);
            final int n5 = dimensionPixelSize4 + dimensionPixelSize4;
            final Size size = new Size(this.i.getMeasuredWidth() + n5, this.i.getMeasuredHeight() + n5);
            final Context k = this.k;
            final View b3 = this.b;
            final acqm i = this.i;
            if (!i.k) {
                final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
                i.measure(measureSpec2, measureSpec2);
            }
            c = actc.c(k, b3, i.j, size.getWidth(), size.getHeight(), dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3);
        }
        this.h.showAtLocation(this.b, 0, c.x, c.y);
        if (this.f()) {
            final acqm l = this.i;
            if (l != null) {
                if (l.getParent() != null) {
                    final View rootView = this.i.getRootView();
                    if (rootView != null) {
                        final WindowManager windowManager = (WindowManager)this.k.getSystemService("window");
                        final WindowManager$LayoutParams windowManager$LayoutParams = (WindowManager$LayoutParams)rootView.getLayoutParams();
                        windowManager$LayoutParams.flags |= 0x2;
                        windowManager$LayoutParams.dimAmount = 0.1f;
                        windowManager.updateViewLayout(rootView, (ViewGroup$LayoutParams)windowManager$LayoutParams);
                    }
                }
            }
        }
        final PopupWindow h2 = this.h;
        if (h2 != null && h2.isShowing()) {
            acqn.a.add(this);
            final Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                ((acqp)iterator.next()).c();
            }
            this.h.setOnDismissListener((PopupWindow$OnDismissListener)new kua(this, 4));
        }
    }
    
    public final boolean f() {
        final PopupWindow h = this.h;
        return h != null && h.isShowing();
    }
}
