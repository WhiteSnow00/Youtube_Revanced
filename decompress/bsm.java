import android.view.Display;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager$DisplayListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class bsm implements DisplayManager$DisplayListener, bsk
{
    public static final int a = 0;
    private final DisplayManager b;
    private oqz c;
    
    public bsm(final DisplayManager b) {
        this.b = b;
    }
    
    private final Display c() {
        return this.b.getDisplay(0);
    }
    
    public final void a() {
        this.b.unregisterDisplayListener((DisplayManager$DisplayListener)this);
        this.c = null;
    }
    
    public final void b(final oqz c) {
        this.c = c;
        this.b.registerDisplayListener((DisplayManager$DisplayListener)this, baz.E());
        c.V(this.c());
    }
    
    public final void onDisplayAdded(final int n) {
    }
    
    public final void onDisplayChanged(final int n) {
        final oqz c = this.c;
        if (c != null && n == 0) {
            c.V(this.c());
        }
    }
    
    public final void onDisplayRemoved(final int n) {
    }
}
