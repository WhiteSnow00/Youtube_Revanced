import android.view.MotionEvent;
import android.content.Context;
import android.widget.ListView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acqo extends ListView
{
    public acqo(final Context context) {
        super(context);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.getChildCount() != 0 && (this.getFirstVisiblePosition() != 0 || this.getChildAt(0).getTop() != 0)) {
            this.requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
