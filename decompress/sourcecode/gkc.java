import android.view.MotionEvent;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

final class gkc implements oa
{
    final /* synthetic */ gkh a;
    
    public gkc(final gkh a) {
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
