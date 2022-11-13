import android.view.MotionEvent;
import android.view.KeyEvent;
import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

final class ft extends ContentFrameLayout
{
    final fw a;
    
    public ft(final fw a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.a.W(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            if (n < -5 || n2 < -5 || n > this.getWidth() + 5 || n2 > this.getHeight() + 5) {
                final fw a = this.a;
                a.R(a.ad(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
    
    public final void setBackgroundResource(final int n) {
        this.setBackgroundDrawable(fc.b(this.getContext(), n));
    }
}
