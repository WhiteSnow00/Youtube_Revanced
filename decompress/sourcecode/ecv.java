import android.view.MotionEvent;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecv extends RecyclerView
{
    public elw aa;
    public qpt ab;
    
    public ecv(final Context context) {
        super(context, (AttributeSet)null, 0);
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        super.dispatchDraw(canvas);
        final qpt ab = this.ab;
        if (ab != null) {
            ((eea)ab.a).B();
        }
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final elw aa = this.aa;
        if (aa == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (aa.a == null) {
            aa.a = new oic((RecyclerView)this, true);
        }
        ((og)aa.a).k((RecyclerView)this, motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
