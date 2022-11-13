import android.graphics.Canvas;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aasr extends TextView
{
    private final aask a;
    
    public aasr(final Context context, final aask a) {
        super(context);
        this.a = a;
    }
    
    public final void onDraw(Canvas t) {
        t = this.a.t();
        if (t != null) {
            super.onDraw(t);
            this.a.x();
        }
    }
}
