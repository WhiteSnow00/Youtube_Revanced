import android.view.TouchDelegate;
import android.graphics.Rect;
import android.view.View;
import android.view.View$OnLayoutChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acpq implements View$OnLayoutChangeListener
{
    private final View a;
    private final View b;
    private final int[] c;
    private final Rect d;
    private final int e;
    
    public acpq(final View a, final View b) {
        this.a = a;
        this.b = b;
        this.c = new int[2];
        this.d = new Rect();
        this.e = a.getResources().getDimensionPixelSize(2131166970);
        if (a.getWidth() > 0) {
            this.a();
        }
        a.addOnLayoutChangeListener((View$OnLayoutChangeListener)this);
    }
    
    private final void a() {
        if (this.b.getVisibility() == 0) {
            this.a.getLocationOnScreen(this.c);
            final int[] c = this.c;
            final int left = c[0];
            final int n = c[1];
            final int width = this.a.getWidth();
            this.b.getLocationOnScreen(this.c);
            final int[] c2 = this.c;
            final int n2 = c2[0];
            final int n3 = c2[1];
            final int n4 = this.b.getWidth() / 2;
            final int n5 = this.b.getHeight() / 2;
            final int n6 = this.e / 2;
            this.d.top = Math.max(0, n3 + n5 - n - n6);
            final Rect d = this.d;
            d.bottom = d.top + this.e;
            if (anb.f(this.a) == 1) {
                this.d.left = left;
                this.d.right = left + this.e;
            }
            else {
                this.d.left = Math.min(width - this.e, n2 + n4 - left - n6);
                this.d.right = width;
            }
            tsx.b(this.a, this.b, (TouchDelegate)new acpp(this.d, this.b));
            return;
        }
        final TouchDelegate touchDelegate = this.a.getTouchDelegate();
        if (touchDelegate instanceof tsx) {
            ((tsx)touchDelegate).a(this.b);
            return;
        }
        this.a.setTouchDelegate((TouchDelegate)null);
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        this.a();
    }
}
