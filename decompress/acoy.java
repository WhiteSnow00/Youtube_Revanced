import android.text.Spannable;
import android.text.Editable;
import android.widget.EditText;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acoy implements TextWatcher
{
    private final EditText a;
    private final float b;
    private final int c;
    
    public acoy(final EditText a, final float b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        if (this.a.isInEditMode()) {
            return;
        }
        if (n3 > 0 && charSequence instanceof Spannable) {
            acpb.a(charSequence, n, n3 + n, this.b, this.c);
        }
    }
}
