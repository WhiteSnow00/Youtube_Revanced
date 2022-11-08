import android.graphics.Rect;
import android.view.Gravity;
import android.view.Display;
import android.graphics.Point;
import android.view.WindowManager;
import android.content.Context;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public class ix
{
    public View a;
    public int b;
    public PopupWindow$OnDismissListener c;
    private final Context d;
    private final im e;
    private final boolean f;
    private final int g;
    private boolean h;
    private iy i;
    private iv j;
    private final PopupWindow$OnDismissListener k;
    
    public ix(final Context context, final im im, final View view, final boolean b) {
        this(context, im, view, b, 2130968613);
    }
    
    public ix(final Context d, final im e, final View a, final boolean f, final int g) {
        this.b = 8388611;
        this.k = (PopupWindow$OnDismissListener)new kua(this, 1);
        this.d = d;
        this.e = e;
        this.a = a;
        this.f = f;
        this.g = g;
    }
    
    public final iv a() {
        if (this.j == null) {
            final Display defaultDisplay = ((WindowManager)this.d.getSystemService("window")).getDefaultDisplay();
            final Point point = new Point();
            iw.mP(defaultDisplay, point);
            Object j;
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(2131165207)) {
                j = new ig(this.d, this.a, this.g, this.f);
            }
            else {
                j = new jf(this.d, this.e, this.a, this.g, this.f);
            }
            ((iv)j).l(this.e);
            ((iv)j).s(this.k);
            ((iv)j).o(this.a);
            ((iv)j).e(this.i);
            ((iv)j).p(this.h);
            ((iv)j).q(this.b);
            this.j = (iv)j;
        }
        return this.j;
    }
    
    public final void b() {
        if (this.h()) {
            this.j.m();
        }
    }
    
    public void c() {
        this.j = null;
        final PopupWindow$OnDismissListener c = this.c;
        if (c != null) {
            c.onDismiss();
        }
    }
    
    public final void d(final boolean h) {
        this.h = h;
        final iv j = this.j;
        if (j != null) {
            j.p(h);
        }
    }
    
    public final void e(final iy i) {
        this.i = i;
        final iv j = this.j;
        if (j != null) {
            j.e(i);
        }
    }
    
    public final void f() {
        if (this.i()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
    
    public final void g(int n, final int n2, final boolean b, final boolean b2) {
        final iv a = this.a();
        a.t(b2);
        if (b) {
            int n3 = n;
            if ((Gravity.getAbsoluteGravity(this.b, ana.f(this.a)) & 0x7) == 0x5) {
                n3 = n - this.a.getWidth();
            }
            a.r(n3);
            a.u(n2);
            n = (int)(this.d.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            a.g = new Rect(n3 - n, n2 - n, n3 + n, n2 + n);
        }
        a.v();
    }
    
    public final boolean h() {
        final iv j = this.j;
        return j != null && j.x();
    }
    
    public final boolean i() {
        if (this.h()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        this.g(0, 0, false, false);
        return true;
    }
}
