import android.text.Editable;
import android.widget.EditText;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asy implements TextWatcher
{
    public boolean a;
    private final EditText b;
    
    public asy(final EditText b) {
        this.b = b;
        this.a = true;
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        if (!this.b.isInEditMode() && this.a) {
            final asp a = asp.a;
        }
    }
}
