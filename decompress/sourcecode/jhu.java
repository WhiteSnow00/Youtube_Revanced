import android.text.TextUtils;
import android.text.SpannableString;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jhu implements acil
{
    public final Context a;
    private final vax b;
    
    public jhu(final Context a, final vax b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    protected final CharSequence b(final CharSequence charSequence, final CharSequence charSequence2, final aioe aioe, final String s) {
        if (charSequence2 == null) {
            return charSequence;
        }
        final SpannableString spannableString = new SpannableString(charSequence2);
        spannableString.setSpan((Object)new jht(this, this.b, aioe, s), 0, charSequence2.length(), 33);
        if (charSequence == null) {
            return (CharSequence)spannableString;
        }
        return TextUtils.concat(new CharSequence[] { charSequence, " ", (CharSequence)spannableString });
    }
    
    public final void c(final acir acir) {
    }
}
