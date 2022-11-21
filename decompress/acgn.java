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
public final class acgn
{
    public final Object a;
    
    public acgn(final View c, final int n, final View e, final int f) {
        c.getClass();
        e.getClass();
        final acxt a = new acxt(e.getContext());
        this.a = a;
        final acxt acxt = a;
        a.c = c;
        a.a = new PopupWindow((View)a);
        a.addView(c);
        int d = 0;
        Label_0287: {
            if (i(n)) {
                d = n;
                if (i(n)) {
                    final int[] array = new int[2];
                    e.getLocationInWindow(array);
                    final int k = k((View)a);
                    final int heightPixels = e.getResources().getDisplayMetrics().heightPixels;
                    final int i = k(e);
                    if (n == 1) {
                        if (k < array[1]) {
                            d = n;
                            break Label_0287;
                        }
                    }
                    else if (k < heightPixels - i - array[1]) {
                        d = n;
                        break Label_0287;
                    }
                    if (n == 1) {
                        d = 2;
                    }
                    else {
                        d = 1;
                    }
                }
            }
            else {
                d = n;
                if (!i(n)) {
                    final int c2 = c(n, e);
                    final int[] array2 = new int[2];
                    e.getLocationInWindow(array2);
                    final int l = l((View)a);
                    final int widthPixels = e.getResources().getDisplayMetrics().widthPixels;
                    final int j = l(e);
                    if (c2 == 5) {
                        d = n;
                        if (l < array2[0]) {
                            break Label_0287;
                        }
                    }
                    else if (l < widthPixels - j - array2[0]) {
                        d = n;
                        break Label_0287;
                    }
                    if (n == 3) {
                        d = 4;
                    }
                    else {
                        d = 3;
                    }
                }
            }
        }
        final acxt acxt2 = a;
        a.e = e;
        a.b();
        a.d = d;
        a.f = f;
    }
    
    public acgn(final View view, final int n, final View view2, final int n2, final int n3) {
        this(view, n, view2, n2);
        ((acxt)this.a).a(n3);
    }
    
    public acgn(final ason ason) {
        final AtomicReference a = new AtomicReference();
        this.a = a;
        final AtomicReference atomicReference = a;
        a.set(ason);
    }
    
    public static int c(final int n, final View view) {
        final int f = anc.f(view);
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
    
    public final ason b() {
        final ason ason = ((AtomicReference)this.a).getAndSet(null);
        if (ason != null) {
            return ason;
        }
        throw new ovg("ElementCallback was already consumed");
    }
    
    public final void d() {
        final PopupWindow a = ((acxt)this.a).a;
        if (a != null) {
            a.dismiss();
        }
    }
    
    public final void e(final View$OnClickListener onClickListener) {
        ((acxt)this.a).setOnClickListener(onClickListener);
    }
    
    public final void f() {
        final acxt acxt = (acxt)this.a;
        acxt.a.setClippingEnabled(false);
        acxt.a.setAnimationStyle(16973826);
        acxt.a.setBackgroundDrawable((Drawable)new BitmapDrawable(acxt.e.getResources(), ""));
        acxt.a.setOutsideTouchable(acxt.b);
        acxt.a.showAtLocation(acxt.e, 0, 0, 0);
    }
    
    public final void g() {
        ((acxt)this.a).b();
        ((acxt)this.a).requestLayout();
    }
    
    public final boolean h() {
        return ((acxt)this.a).isShown();
    }
    
    public final void j() {
        ((acxt)this.a).b = true;
    }
}
