import android.text.Spanned;
import android.widget.TextView;
import android.text.InputFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acox implements InputFilter
{
    private final TextView a;
    private final float b;
    private final int c;
    
    public acox(final TextView a, final float b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final CharSequence filter(final CharSequence charSequence, final int n, final int n2, final Spanned spanned, int n3, final int n4) {
        if (this.a.isInEditMode()) {
            return null;
        }
        if (charSequence != null && n != n2) {
            if ((n3 = n) == 0) {
                final CharSequence subSequence = charSequence;
                if (n2 == charSequence.length()) {
                    return acpb.a(subSequence, 0, subSequence.length(), this.b, this.c);
                }
                n3 = 0;
            }
            final CharSequence subSequence = charSequence.subSequence(n3, n2);
            return acpb.a(subSequence, 0, subSequence.length(), this.b, this.c);
        }
        return null;
    }
}
