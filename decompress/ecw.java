import android.view.MotionEvent;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecw extends RecyclerView
{
    public elx aa;
    public pvh ab;
    
    public ecw(final Context context) {
        super(context, (AttributeSet)null, 0);
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        super.dispatchDraw(canvas);
        final pvh ab = this.ab;
        if (ab != null) {
            ((eeb)ab.a).B();
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final elx aa = this.aa;
        if (aa == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (aa.a == null) {
            aa.a = new oji((RecyclerView)this, true);
        }
        ((og)aa.a).k((RecyclerView)this, motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
