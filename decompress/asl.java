import android.text.Spannable;
import android.text.Editable;
import android.widget.EditText;
import android.text.TextWatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asl implements TextWatcher
{
    public int a;
    private final EditText b;
    private apl c;
    
    public asl(final EditText b) {
        this.a = Integer.MAX_VALUE;
        this.b = b;
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, int a, final int n2) {
        if (this.b.isInEditMode()) {
            return;
        }
        if (a <= n2 && charSequence instanceof Spannable) {
            a = aru.b().a();
            if (a != 0) {
                if (a == 1) {
                    aru.b().g(charSequence, n, n2 + n, this.a);
                    return;
                }
                if (a != 3) {
                    return;
                }
            }
            final aru b = aru.b();
            if (this.c == null) {
                this.c = new ask(this.b);
            }
            b.i(this.c);
        }
    }
}
