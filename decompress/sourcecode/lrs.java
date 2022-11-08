import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager$DisplayListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class lrs implements DisplayManager$DisplayListener
{
    public final DisplayManager a;
    final /* synthetic */ lru b;
    
    public lrs(final lru b, final DisplayManager a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onDisplayAdded(final int n) {
    }
    
    public final void onDisplayChanged(final int n) {
        if (n == 0) {
            this.b.a();
        }
    }
    
    public final void onDisplayRemoved(final int n) {
    }
}
