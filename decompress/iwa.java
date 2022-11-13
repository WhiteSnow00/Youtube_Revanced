import android.view.MotionEvent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwa extends try implements fol
{
    public final aaux a;
    
    public iwa(final aaux a) {
        this.a = a;
    }
    
    public final void c() {
    }
    
    public final boolean d(final View view, final MotionEvent motionEvent) {
        return this.a.onTouch(view, motionEvent);
    }
}
