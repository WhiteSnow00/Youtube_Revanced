import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aapk extends ProgressBar
{
    private final aask a;
    
    public aapk(final Context context, final aask a, final int n, final boolean indeterminate, final int n2) {
        super(context, (AttributeSet)null, n2);
        this.a = a;
        this.setIndeterminate(indeterminate);
        this.setLayoutParams(new ViewGroup$LayoutParams(n, n));
        if (indeterminate) {
            this.getIndeterminateDrawable().setColorFilter(-1, PorterDuff$Mode.SRC_IN);
            return;
        }
        this.setProgressDrawable(context.getResources().getDrawable(2131232511));
    }
    
    public final void onDraw(Canvas t) {
        synchronized (this) {
            t = this.a.t();
            if (t != null) {
                super.onDraw(t);
                this.a.x();
            }
        }
    }
}
