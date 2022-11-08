import android.view.MotionEvent;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqp extends FrameLayout
{
    public int a;
    public int b;
    private final int c;
    private final int d;
    
    public hqp(final Context context) {
        super(context);
        this.setLayoutDirection(0);
        this.c = context.getResources().getDimensionPixelSize(2131170263);
        this.d = context.getResources().getDimensionPixelSize(2131170264);
    }
    
    private final boolean a(final MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return false;
        }
        if (motionEvent.getX() >= this.c) {
            if (motionEvent.getX() <= this.getMeasuredWidth() - this.c) {
                if (motionEvent.getY() >= this.d) {
                    if (motionEvent.getY() <= this.getMeasuredHeight() - this.d) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        this.a = (int)motionEvent.getRawX();
        this.b = (int)motionEvent.getRawY();
        return this.a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.a(motionEvent) && super.onTouchEvent(motionEvent);
    }
}
