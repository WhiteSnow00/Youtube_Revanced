import android.graphics.Canvas;
import android.content.Context;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaub extends TextView
{
    private final aatv a;
    
    public aaub(final Context context, final aatv a) {
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
