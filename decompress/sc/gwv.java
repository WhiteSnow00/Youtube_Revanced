import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

final class gwv extends View$AccessibilityDelegate implements Runnable
{
    public final View a;
    final gww b;
    private boolean c;
    
    public gwv(final gww b, final View a) {
        this.b = b;
        this.c = false;
        this.a = a;
    }
    
    public final boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        if (!this.c && accessibilityEvent != null && accessibilityEvent.getEventType() == 32768) {
            this.c = true;
            this.a.setAccessibilityDelegate((View$AccessibilityDelegate)null);
            this.run();
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public final void run() {
        final View ab = this.b.aB;
        if (ab != null) {
            ab.sendAccessibilityEvent(8);
        }
        this.b.o();
    }
}
