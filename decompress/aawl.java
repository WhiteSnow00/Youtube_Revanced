import android.graphics.Canvas;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class aawl extends abek
{
    private final aatv a;
    
    public aawl(final Context context, final aatv a) {
        super(context);
        this.a = a;
    }
    
    public final void dispatchDraw(Canvas t) {
        t = this.a.t();
        if (t != null) {
            super.dispatchDraw(t);
            this.a.x();
        }
    }
}
