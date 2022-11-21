import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acgg implements View$OnTouchListener
{
    final ajlp a;
    final ots b;
    final acgi c;
    
    public acgg(final acgi c, final ajlp a, final ots b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && this.c.b.hasMessages(1)) {
            this.c.b.removeMessages(1);
            this.c.c(this.a, this.b);
        }
        return false;
    }
}
