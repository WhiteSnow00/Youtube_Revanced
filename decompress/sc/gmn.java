import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmn implements View$OnTouchListener
{
    public static final gmn a;
    public static final gmn b;
    public static final gmn c;
    public static final gmn d;
    public static final gmn e;
    public static final gmn f;
    private final int g;
    
    static {
        f = new gmn(8);
        e = new gmn(7);
        d = new gmn(5);
        c = new gmn(3);
        b = new gmn(2);
        a = new gmn(0);
    }
    
    public gmn(final int g) {
        this.g = g;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final int g = this.g;
        if (g == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            view.onTouchEvent(motionEvent);
            return true;
        }
        if (g == 2) {
            final long a = gww.a;
            return true;
        }
        if (g == 3) {
            final int m = haj.m;
            return false;
        }
        if (g == 5) {
            view.performClick();
            return true;
        }
        if (g == 6) {
            final int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            else {
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }
            view.onTouchEvent(motionEvent);
            return true;
        }
        if (g == 7) {
            final String ae = pwz.ae;
            return true;
        }
        if (g != 8) {
            return true;
        }
        view.performClick();
        return true;
    }
}
