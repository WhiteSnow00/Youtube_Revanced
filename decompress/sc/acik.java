import android.view.DragEvent;
import android.view.View;
import android.view.View$OnDragListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class acik implements View$OnDragListener
{
    final acil a;
    
    public acik(final acil a) {
        this.a = a;
    }
    
    public final boolean onDrag(final View view, final DragEvent dragEvent) {
        final int action = dragEvent.getAction();
        if (action != 3) {
            if (action == 4) {
                int n = (int)dragEvent.getY();
                final acil a = this.a;
                if (a.e) {
                    n -= 30;
                }
                else {
                    n -= 60;
                }
                int n2 = n;
                if (n < 36) {
                    n2 = 36;
                }
                a.b.setPadding(0, n2, 0, 0);
            }
        }
        else {
            dragEvent.getY();
        }
        return true;
    }
}
