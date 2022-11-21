import android.text.TextUtils;
import java.util.List;
import android.text.style.StyleSpan;
import android.text.SpannableStringBuilder;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczy
{
    public Object a;
    public Object b;
    
    public aczy() {
    }
    
    public aczy(final byte[] array) {
        this.b = Optional.empty();
        this.a = Optional.empty();
    }
    
    public static final void c(final SpannableStringBuilder spannableStringBuilder, final String s, final boolean b) {
        if (s.isEmpty()) {
            return;
        }
        final int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence)s);
        if (b) {
            spannableStringBuilder.setSpan((Object)new StyleSpan(1), length, spannableStringBuilder.length(), 33);
        }
    }
    
    public final List a(final String s) {
        if (!TextUtils.isEmpty((CharSequence)this.a) && s.equals(this.a)) {
            final Object b = this.b;
            if (b != null && !((List)b).isEmpty()) {
                return (List)this.b;
            }
        }
        return null;
    }
    
    public final void b() {
        this.a = null;
        this.b = null;
    }
    
    public final acua d() {
        return new acua((Optional)this.b, (Optional)this.a);
    }
    
    public final void e(final aisc aisc) {
        this.a = Optional.of((Object)aisc);
    }
}
