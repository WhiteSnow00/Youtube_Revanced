import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amt implements View$OnUnhandledKeyEventListener
{
    public final amz a;
    
    public amt(final amz a) {
        this.a = a;
    }
    
    public final boolean onUnhandledKeyEvent(final View view, final KeyEvent keyEvent) {
        return this.a.a();
    }
}
