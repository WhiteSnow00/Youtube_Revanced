import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.view.inputmethod.InputConnectionWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asu extends InputConnectionWrapper
{
    private final TextView a;
    
    public asu(final TextView a, final InputConnection inputConnection) {
        super(inputConnection, false);
        this.a = a;
        final asp a2 = asp.a;
    }
    
    private final Editable a() {
        return this.a.getEditableText();
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        return apr.c((InputConnection)this, this.a(), n, n2, false) || super.deleteSurroundingText(n, n2);
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        return apr.c((InputConnection)this, this.a(), n, n2, true) || super.deleteSurroundingTextInCodePoints(n, n2);
    }
}
