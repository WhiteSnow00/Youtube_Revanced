import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View$OnClickListener;
import android.view.View$MeasureSpec;
import java.util.concurrent.atomic.AtomicReference;
import android.widget.PopupWindow;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class accz
{
    public final Object a;
    
    public accz(final View c, int d, final View e, final int f) {
        c.getClass();
        e.getClass();
        final acuc a = new acuc(e.getContext());
        this.a = a;
        final acuc acuc = a;
        a.c = c;
        a.a = new PopupWindow((View)a);
        a.addView(c);
        Label_0271: {
            if (i(d)) {
                if (i(d)) {
                    final int[] array = new int[2];
                    e.getLocationInWindow(array);
                    final int k = k((View)a);
                    final int heightPixels = e.getResources().getDisplayMetrics().heightPixels;
                    final int i = k(e);
                    if (d == 1) {
                        if (k < array[1]) {
                            break Label_0271;
                        }
                    }
                    else if (k < heightPixels - i - array[1]) {
                        break Label_0271;
                    }
                    if (d == 1) {
                        d = 2;
                    }
                    else {
                        d = 1;
                    }
                }
            }
            else if (!i(d)) {
                final int c2 = c(d, e);
                final int[] array2 = new int[2];
                e.getLocationInWindow(array2);
                final int l = l((View)a);
                final int widthPixels = e.getResources().getDisplayMetrics().widthPixels;
                final int j = l(e);
                if (c2 == 5) {
                    if (l < array2[0]) {
                        break Label_0271;
                    }
                }
                else if (l < widthPixels - j - array2[0]) {
                    break Label_0271;
                }
                if (d == 3) {
                    d = 4;
                }
                else {
                    d = 3;
                }
            }
        }
        final acuc acuc2 = a;
        a.e = e;
        a.b();
        a.d = d;
        a.f = f;
    }
    
    public accz(final View view, final int n, final View view2, final int n2, final int n3) {
        this(view, n, view2, n2);
        ((acuc)this.a).a(n3);
    }
    
    public accz(final aslc aslc) {
        final AtomicReference a = new AtomicReference();
        this.a = a;
        final AtomicReference atomicReference = a;
        a.set(aslc);
    }
    
    public static int c(final int n, final View view) {
        final int f = ana.f(view);
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n != 3) {
            if (n != 4) {
                throw new IllegalArgumentException();
            }
            if (f != 1) {
                return 6;
            }
            return 5;
        }
        else {
            if (f != 1) {
                return 5;
            }
            return 6;
        }
    }
    
    public static boolean i(final int n) {
        return n == 1 || n == 2;
    }
    
    private static int k(final View view) {
        final int height = view.getHeight();
        if (height == 0) {
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(measureSpec, measureSpec);
            return view.getMeasuredHeight();
        }
        return height;
    }
    
    private static int l(final View view) {
        final int width = view.getWidth();
        if (width == 0) {
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(measureSpec, measureSpec);
            return view.getMeasuredWidth();
        }
        return width;
    }
    
    public final boolean a() {
        return ((AtomicReference)this.a).get() == null;
    }
    
    public final aslc b() {
        final aslc aslc = ((AtomicReference)this.a).getAndSet(null);
        if (aslc != null) {
            return aslc;
        }
        throw new otf("ElementCallback was already consumed");
    }
    
    public final void d() {
        final PopupWindow a = ((acuc)this.a).a;
        if (a != null) {
            a.dismiss();
        }
    }
    
    public final void e(final View$OnClickListener onClickListener) {
        ((acuc)this.a).setOnClickListener(onClickListener);
    }
    
    public final void f() {
        final acuc acuc = (acuc)this.a;
        acuc.a.setClippingEnabled(false);
        acuc.a.setAnimationStyle(16973826);
        acuc.a.setBackgroundDrawable((Drawable)new BitmapDrawable(acuc.e.getResources(), ""));
        acuc.a.setOutsideTouchable(acuc.b);
        acuc.a.showAtLocation(acuc.e, 0, 0, 0);
    }
    
    public final void g() {
        ((acuc)this.a).b();
        ((acuc)this.a).requestLayout();
    }
    
    public final boolean h() {
        return ((acuc)this.a).isShown();
    }
    
    public final void j() {
        ((acuc)this.a).b = true;
    }
}
