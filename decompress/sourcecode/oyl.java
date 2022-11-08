import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import android.hardware.display.DisplayManager;
import java.util.HashMap;
import android.hardware.display.DisplayManager$DisplayListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oyl implements DisplayManager$DisplayListener
{
    public final HashMap a;
    public DisplayManager b;
    public final Set c;
    
    public oyl() {
        this.a = new HashMap();
        this.c = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final DisplayMetrics a(final Display display) {
        if (display == null) {
            return null;
        }
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (this.b != null) {
            this.a.put(display.getDisplayId(), displayMetrics);
        }
        return displayMetrics;
    }
    
    public final void onDisplayAdded(final int n) {
        this.onDisplayChanged(n);
    }
    
    public final void onDisplayChanged(final int n) {
        if (this.c.isEmpty()) {
            this.a.remove(n);
            return;
        }
        this.a(this.b.getDisplay(n));
    }
    
    public final void onDisplayRemoved(final int n) {
        this.a.remove(n);
    }
}
