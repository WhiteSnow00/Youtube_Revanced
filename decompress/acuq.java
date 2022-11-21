import android.text.Editable;
import android.text.style.ImageSpan;
import android.support.v7.widget.AppCompatEditText;
import android.text.SpannableStringBuilder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acuq implements acov
{
    final Object a;
    private final int b;
    
    public acuq(final acus a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acuq(final zfx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final SpannableStringBuilder spannableStringBuilder, int i) {
        final int b = this.b;
        i = 0;
        final int n = 0;
        if (b != 0) {
            final String string = spannableStringBuilder.toString();
            String string2;
            int index;
            for (string2 = ((AppCompatEditText)this.a).getText().toString(), i = n; i < string2.length(); i = index + 1) {
                index = string2.indexOf(string, i);
                if (index < 0) {
                    break;
                }
                i = string.length() + index;
                if (((ImageSpan[])((zfx)this.a).getEditableText().getSpans(index, i, (Class)ImageSpan.class)).length == 0) {
                    ((zfx)this.a).getEditableText().replace(index, i, (CharSequence)spannableStringBuilder);
                }
            }
            return;
        }
        if (((acus)this.a).f != null) {
            final String string3 = spannableStringBuilder.toString();
            final String string4 = ((acus)this.a).f.getText().toString();
            final Editable editableText = ((acus)this.a).f.getEditableText();
            while (i < string4.length()) {
                i = string4.indexOf(string3, i);
                if (i < 0) {
                    break;
                }
                final int n2 = string3.length() + i;
                if (((ImageSpan[])editableText.getSpans(i, n2, (Class)ImageSpan.class)).length == 0) {
                    editableText.replace(i, n2, (CharSequence)spannableStringBuilder);
                }
                ++i;
            }
        }
    }
}
