import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.text.Editable;
import android.view.View;
import android.text.method.KeyListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asv implements KeyListener
{
    private final KeyListener a;
    
    public asv(final KeyListener a) {
        this.a = a;
    }
    
    public final void clearMetaKeyState(final View view, final Editable editable, final int n) {
        this.a.clearMetaKeyState(view, editable, n);
    }
    
    public final int getInputType() {
        return this.a.getInputType();
    }
    
    public final boolean onKeyDown(final View view, final Editable editable, final int n, final KeyEvent keyEvent) {
        Label_0048: {
            boolean b;
            if (n != 67) {
                if (n != 112) {
                    break Label_0048;
                }
                b = apr.b(editable, keyEvent, true);
            }
            else {
                b = apr.b(editable, keyEvent, false);
            }
            if (b) {
                MetaKeyKeyListener.adjustMetaAfterKeypress((Spannable)editable);
                return true;
            }
        }
        if (!this.a.onKeyDown(view, editable, n, keyEvent)) {
            return false;
        }
        return true;
    }
    
    public final boolean onKeyOther(final View view, final Editable editable, final KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }
    
    public final boolean onKeyUp(final View view, final Editable editable, final int n, final KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, n, keyEvent);
    }
}
