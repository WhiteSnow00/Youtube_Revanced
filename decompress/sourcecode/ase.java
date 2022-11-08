import android.text.Spanned;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import android.text.InputFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ase implements InputFilter
{
    private final TextView a;
    private apk b;
    
    public ase(final TextView a) {
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
    
    public final CharSequence filter(CharSequence subSequence, final int n, final int n2, final Spanned spanned, int n3, final int n4) {
        if (this.a.isInEditMode()) {
            return subSequence;
        }
        final int a = ars.b().a();
        if (a != 0) {
            if (a == 1) {
                CharSequence d;
                if ((n4 != 0 || n3 != 0 || spanned.length() != 0 || (d = subSequence) != this.a.getText()) && (d = subSequence) != null) {
                    Label_0113: {
                        if ((n3 = n) == 0) {
                            if (n2 == subSequence.length()) {
                                break Label_0113;
                            }
                            n3 = 0;
                        }
                        subSequence = subSequence.subSequence(n3, n2);
                    }
                    d = ars.b().d(subSequence, 0, subSequence.length());
                }
                return d;
            }
            if (a != 3) {
                return subSequence;
            }
        }
        final ars b = ars.b();
        if (this.b == null) {
            this.b = (apk)new asd(this.a);
        }
        b.i(this.b);
        return subSequence;
    }
}
