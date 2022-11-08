import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class izy implements View$OnTouchListener
{
    final /* synthetic */ jaa a;
    private final int b;
    
    public izy(final jaa a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.a.f.d();
                    }
                }
                else {
                    this.a.f.b(motionEvent, 0L);
                }
            }
            else {
                if (!this.a.f.c(motionEvent)) {
                    final jaa a = this.a;
                    final int b = this.b;
                    if (b < a.e.size()) {
                        final RecyclerView l = a.l;
                        if (l != null) {
                            final nw n = l.n;
                            if (n != null) {
                                a.m = b;
                                final izw g = a.g;
                                g.b = b;
                                n.bf((oj)g);
                            }
                        }
                    }
                }
                view.performClick();
            }
        }
        else {
            this.a.f.a(motionEvent, false);
        }
        return true;
    }
}
