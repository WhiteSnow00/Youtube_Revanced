import android.text.Spanned;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import android.text.InputFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asf implements InputFilter
{
    private final TextView a;
    private apl b;
    
    public asf(final TextView a) {
        this.a = a;
    }
    
    static void a(final Spannable spannable, final int n, final int n2) {
        if (n >= 0 && n2 >= 0) {
            Selection.setSelection(spannable, n, n2);
            return;
        }
        if (n >= 0) {
            Selection.setSelection(spannable, n);
            return;
        }
        if (n2 >= 0) {
            Selection.setSelection(spannable, n2);
        }
    }
    
    public final CharSequence filter(final CharSequence charSequence, final int n, final int n2, final Spanned spanned, int n3, final int n4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        final int a = art.b().a();
        if (a != 0) {
            if (a == 1) {
                CharSequence d;
                if ((n4 != 0 || n3 != 0 || spanned.length() != 0 || (d = charSequence) != this.a.getText()) && (d = charSequence) != null) {
                    CharSequence subSequence = null;
                    Label_0114: {
                        if ((n3 = n) == 0) {
                            subSequence = charSequence;
                            if (n2 == charSequence.length()) {
                                break Label_0114;
                            }
                            n3 = 0;
                        }
                        subSequence = charSequence.subSequence(n3, n2);
                    }
                    d = art.b().d(subSequence, 0, subSequence.length());
                }
                return d;
            }
            if (a != 3) {
                return charSequence;
            }
        }
        final art b = art.b();
        if (this.b == null) {
            this.b = (apl)new ase(this.a);
        }
        b.i(this.b);
        return charSequence;
    }
}
