import android.view.MotionEvent;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class gkk implements oa
{
    final gkp a;
    
    public gkk(final gkp a) {
        this.a = a;
    }
    
    public final void e(final boolean b) {
    }
    
    public final boolean k(final RecyclerView recyclerView, final MotionEvent motionEvent) {
        this.a.m = motionEvent.getY();
        return false;
    }
    
    public final void l(final MotionEvent motionEvent) {
    }
}
