import android.view.View;
import android.graphics.Canvas;
import android.content.Context;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aarl extends LinearLayout
{
    private final aask a;
    
    public aarl(final Context context, final aask a) {
        super(context);
        this.a = a;
    }
    
    protected final void dispatchDraw(Canvas t) {
        t = this.a.t();
        if (t != null) {
            super.dispatchDraw(t);
            this.a.x();
        }
    }
    
    public final void onDescendantInvalidated(final View view, final View view2) {
        super.onDescendantInvalidated(view, view2);
        this.invalidate();
    }
}
