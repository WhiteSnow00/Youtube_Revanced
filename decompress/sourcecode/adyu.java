import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyu implements TextWatcher
{
    final /* synthetic */ TextInputLayout a;
    
    public adyu(final TextInputLayout a) {
        this.a = a;
    }
    
    public final void afterTextChanged(final Editable editable) {
        final TextInputLayout a = this.a;
        a.G(a.q ^ true);
        final TextInputLayout a2 = this.a;
        if (a2.e) {
            a2.D(editable);
        }
        final TextInputLayout a3 = this.a;
        if (a3.j) {
            a3.H(editable);
        }
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
