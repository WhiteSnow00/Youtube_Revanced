import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amu implements View$OnUnhandledKeyEventListener
{
    public final ana a;
    
    public amu(final ana a) {
        this.a = a;
    }
    
    public final boolean onUnhandledKeyEvent(final View view, final KeyEvent keyEvent) {
        return this.a.a();
    }
}
