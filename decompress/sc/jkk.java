import android.graphics.Rect;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkk implements fyl
{
    public final Object a;
    private final int b;
    
    public jkk(final View a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jkk(final jko a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jkk(final kfr a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Rect rect) {
        final int b = this.b;
        if (b == 0) {
            final Object a = this.a;
            final int left = rect.left;
            final jko jko = (jko)a;
            rect.left = left - jko.b.getPaddingLeft();
            rect.right -= jko.b.getPaddingRight();
            rect.top -= jko.b.getPaddingTop();
            return;
        }
        if (b != 1) {
            final Object a2 = this.a;
            final int left2 = rect.left;
            final kfr kfr = (kfr)a2;
            rect.left = left2 - kfr.a.getPaddingLeft();
            rect.top -= kfr.a.getPaddingTop();
            rect.right -= kfr.a.getPaddingRight();
            rect.bottom -= kfr.a.getPaddingBottom();
            return;
        }
        final Object a3 = this.a;
        final int p = jju.p;
        final int left3 = rect.left;
        final View view = (View)a3;
        rect.left = left3 - view.getPaddingLeft();
        rect.right -= view.getPaddingRight();
        rect.top -= view.getPaddingTop();
    }
}
