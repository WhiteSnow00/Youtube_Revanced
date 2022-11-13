import android.text.method.KeyListener;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class efe extends efd
{
    private boolean f;
    private avu g;
    
    public efe(final Context context) {
        super(context);
    }
    
    final void a() {
        if (!this.f) {
            this.f = true;
            this.setKeyListener(super.getKeyListener());
        }
    }
    
    final avu b() {
        if (this.g == null) {
            this.g = new avu((EditText)this, (byte[])null);
        }
        return this.g;
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f) {
            return this.b().d(onCreateInputConnection, editorInfo);
        }
        return onCreateInputConnection;
    }
    
    public final void setKeyListener(final KeyListener keyListener) {
        KeyListener e = keyListener;
        if (this.f && (e = keyListener) != null) {
            this.b();
            e = avu.e(keyListener);
        }
        super.setKeyListener(e);
    }
}
